package approx.trident.pdfs;

public class Stats implements Stat_fns {

	private double varValue;
	private double muValue;	
	private double aValue;
	private double bValue;
	private double nValue;
	/*
	 * invoked for continuous distributions
	 * currently implemented only for normal distribution 
	 */
	protected Stats(double[] xValues, double[] yValues,String distName){
		if(distName.equals("nd")){
		this.muValue=this.getMean(xValues);
		this.varValue=Math.sqrt(this.getVariance(yValues));
		}
	}
	/*
	 * invoked for discrete distributions
	 * currently implemented only for uniform distribution
	 * 
	 */
	protected Stats(double a,double b,String distName){
		
		if(distName.equals("ud")){
		this.aValue=a;
		this.bValue=b;
		this.nValue=((bValue-aValue)+1);
		this.muValue=this.getMean(aValue,bValue);
		this.varValue=this.getVariance(nValue);
		}
	}
	/*
	 * Computes the variance for a given set of values
	 * @see approx.trident.pdfs.Stat_fns#getVariance(double[])
	 */
	public double getVariance(double[] values) {
		double mean = getMean(values);
		double temp = 0;
		for(double a :values)
			temp += (mean-a)*(mean-a);
		return temp/values.length;
	}
	/*
	 * Computes the mean for a given set of values
	 * @see approx.trident.pdfs.Stat_fns#getMean(double[])
	 */
	

	public double getMean(double[] values) {
		double[] x_array = values;
		double xSum=0;
		for(int i=0;i<x_array.length;i++){
			xSum+=x_array[i];
		}
		return xSum/x_array.length;
	}
	
	public double getMean(double aValue2, double bValue2) {
		return (aValue2+bValue2)/2;
	}


	public double getVariance(double n) {
		// TODO Auto-generated method stub
		return (Math.pow(n, 2)-1)/12;
	}
	public void printFuncVals(){
		Gaussian nd = new Gaussian(this.muValue,Math.sqrt(this.varValue));
		Uniform ud = new Uniform(this.aValue,this.bValue);
		System.out.println("The PDF of Gaussian Distribution is"+nd.Pd_Function( ));
		System.out.println("The CDF of Gaussian Distribution is "+ nd.cd_Function());
		System.out.println("The inverse CDF of Gaussian Distribution is "+ nd.inv_cd_function());
		System.out.println("The PDF of Uniform Distribution is"+ud.Pd_Function( ));
		System.out.println("The CDF of Uniform Distribution  is "+ ud.cd_Function());
		System.out.println("The inverse of Uniform Distribution CDF is "+ ud.inv_cd_function());
	}
	

}
