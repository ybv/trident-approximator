package approx.trident.pdfs;

import java.util.Random;
/*
 * @author vaibhavk
 */
public class Gaussian implements Dist{

	private double sigmaValue;
	private double muValue;	
	private double zValue;
	/*
	 * When mu and sigma(SD) values are specified 
	 * this is invoked
	 */
	protected Gaussian(double mu, double sigma){
		this.muValue= mu;
		this.sigmaValue=sigma;
		Random rand = new Random();
		double zRand = rand.nextDouble();
		this.zValue=zRand;
	}
	protected void setMu(double mu){
		this.muValue =mu;
	}
	
	protected void setSigma(double sigma){
		this.sigmaValue=sigma;
	}
	public double phiValue(double x) {
		return Math.exp(-x*x / 2) / Math.sqrt(2 * Math.PI);
	}
	public double Phi(double z) {
		if (z < -8.0) return 0.0;
		if (z >  8.0) return 1.0;
		double sum = 0.0, term = z;
		for (int i = 3; sum + term != sum; i += 2) {
			sum  = sum + term;
			term = term * z * z / i;
		}
		return 0.5 + sum * phiValue(z);
	}
	/*
	 * This method computes the PDF of Normal Distribution for 
	 * a given probability zValue , mean muValue and standard deviation sigmaValue
	 * based on @link http://introcs.cs.princeton.edu/java/22library/Gaussian.java.html
	 * @see approx.trident.pdfs.Dist#Pd_Function()
	 */
	public double Pd_Function() {
		return phiValue((zValue - muValue) / sigmaValue) / sigmaValue;
	}
	/*
	 * This method computes the CDF of Normal Distribution for 
	 * a given probability zValue , mean muValue and standard deviation sigmaValue
	 * @see approx.trident.pdfs.Dist#cd_Function()
	 */
	public double cd_Function() {
		return Phi((zValue - muValue) / sigmaValue);
	}
	/*
	 * 
	 * This method generates random variates from an inverse-Gaussian distribution 
	 * with a mean muValue and standard deviation sigmaValue
	 * based on @link http://en.wikipedia.org/wiki/Inverse_Gaussian_distribution
	 * @see approx.trident.pdfs.Dist#inv_cd_function()
	 */
	public double inv_cd_function() {
		Random rand = new Random();
		double v = rand.nextGaussian();   
		double y = v*v;
		double x = muValue + (muValue*muValue*y)/(2*sigmaValue) - (muValue/(2*sigmaValue)) * Math.sqrt(4*muValue*sigmaValue*y + muValue*muValue*y*y);
		double test = rand.nextDouble();  
		if (test <= (muValue)/(muValue + x))
			return x;
		else
			return (muValue*muValue)/x;
	}


}
