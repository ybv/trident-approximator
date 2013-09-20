package approx.trident.pdfs;

public interface Dist {
	public abstract double Pd_Function();
	public abstract double cd_Function();
	public abstract double inv_cd_function();
	public abstract double getMean();
	public abstract double getVariance();
	public abstract double getMean(double[] values);
	public abstract double getVariance(double[] values);
}
