package approx.trident.pdfs;

import java.util.Random;
/*
 * @author vaibhavk
 */
public class Uniform {
	private double aValue;
	private double bValue;
	private double nValue;
	/*
	 * Assigns 'a'(lower bound), 'b' (upper bound) values and
	 * computers the length of the range
	 */
	protected Uniform(double a,double b){
		this.aValue=a;
		this.bValue=b;
		this.nValue=(bValue-aValue);
	}
	public void setAB(double a,double b){
		this.aValue=a;
		this.bValue=b;
		this.nValue=(bValue-aValue);
	}
	/*
	 * This method computes the PDF of Uniform Distribution for 
	 * a given range 'a' and 'b'
	 * @see approx.trident.pdfs.Dist#Pd_Function()
	 */
	protected double Pd_Function() {
		return (1/this.nValue);
	}
	/*
	 * This method computes the CDF of Uniform Distribution for 
	 * a random value between range a,b
	 * @see approx.trident.pdfs.Dist#cd_Function()
	 */
	protected double cd_Function() {
		Random r = new Random();
		double val= (r.nextDouble() * nValue) + aValue;
		System.out.println(" The random value is "+ val);
		double numEr = val-aValue;
		double denEr = bValue - aValue;
		return numEr/denEr;
	}

	public double cd_Function(double val) {
		if(val<aValue){
			return 0;
		}
		else if(val>=bValue){
			return 1;
		}
		else{
			double numEr = val-aValue;
			double denEr = bValue - aValue;
			return numEr/denEr;
		}
	}
	/*
	 * 
	 * This method generates random variates from an inverse-Uniform distribution 
	 * with in the range 1/a and 1/b
	 * @see approx.trident.pdfs.Dist#inv_cd_function()
	 */
	protected double inv_cd_function() {
		Random rand = new Random();
		int val= (int) ((int)this.bValue - this.aValue + 1);
		double test = this.aValue + rand.nextInt(val);
		double numEr= (this.bValue - (1/test))/(this.bValue-this.aValue);
		return numEr;
	}


}
