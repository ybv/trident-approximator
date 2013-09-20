package approx.trident.pdfs;

public interface Dist {
	public abstract double Pd_Function();
	public abstract double cd_Function();
	public abstract double inv_cd_function();
	public abstract double getMean();
	public abstract double getMedian();
	public abstract double getVariance();
}
