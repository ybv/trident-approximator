package approx.trident.opts;

import approx.trident.pdfs.Stats;

public class Operations implements Opts{

	double mean1, mean2;
	double sd1, sd2;
	double var1, var2;
	double meanSum;
	double sdSum;
	double varSum;

	public void CollectgMeans(double[] x,double[] y) {

		Stats s = new Stats(x,"nd");
		Stats s2 = new Stats(y,"nd");
		double g1Mean = s.getMean(x);
		double g1Var = s.getVariance(x);
		this.mean1= g1Mean;
		this.var1 = g1Var;
		double g2Mean = s2.getMean(y);
		double g2Var = s2.getVariance(y);
		this.mean2 = g2Mean;
		this.var2 = g2Var;
		this.sd1 = Math.sqrt(var1);
		this.sd2 = Math.sqrt(var2);

	}

	@Override
	public void addMeans() {
		this.meanSum = mean1 + mean2;

	}

	@Override
	public void addVariances() {
		this.varSum = var1 +var2;

	}

	@Override
	public void addSds() {
		this.sdSum = Math.sqrt(sd1*sd1 + sd2*sd2);

	}

	public double getMeanSun(){
		return meanSum;

	}
	public double getSdSum(){
		return sdSum;

	}
	public double getVarSum(){
		return varSum;
	}

	@Override
	public void subVariances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subMeans() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subSds() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mulMeana() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mulVariances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mulSds() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divMeans() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divSds() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divVariances() {
		// TODO Auto-generated method stub
		
	}


}
