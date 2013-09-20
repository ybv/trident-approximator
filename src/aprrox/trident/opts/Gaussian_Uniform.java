package aprrox.trident.opts;

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
		double[] x_array = null;
		double xSum=0;
		double ySum=0;
		double xySum=0;
		for(int i=0;i<10;i++){
			double v = rand.nextGaussian();
			x_array[i]=v;
			xSum+=x_array[i];
		}
		double[] y_array = null;
		for(int j=0;j<10;j++){
			double v=rand.nextDouble();
			y_array[j]=v;
			ySum+=y_array[j];
		}
		double[] xy_array = null;
		for(int i=0;i<10;i++){
			double v =x_array[i]*y_array[i]; 
			xy_array[i]=v;
			xySum+=xy_array[i];
		}
		
		double nnumEr = xySum - 10*nd
		return 0;
	}

}
