package approx.trident.opts;

import java.util.Random;

import approx.trident.pdfs.Gaussian;
/*
 * @author : vaibhavk
 * This class is incomplete
 */

public class Gaussian_Uniform implements Operations  {

	private double noDataPoints;
	private double xValue;
	private double yValue;
	/*
	 * rand.nextGaussian() Returns the next pseudorandom, Gaussian ("normally") distributed double value 
	 * with mean 0.0 and standard deviation 1.0 
	 * rand.nextDouble() Returns the next pseudorandom, Gaussian ("normally") distributed double value 
	 * with mean 0.0 and standard deviation 1.0 
	 * @see aprrox.trident.opts.Operations#corrCoeff()
	 */
	public double corrCoeff() {
		
		return v;   
	}


	public double deterCoeff() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getCov() {
		Random rand = new Random();
		
		double nnumEr = xySum - 10*nd
		return 0;
	}

}
