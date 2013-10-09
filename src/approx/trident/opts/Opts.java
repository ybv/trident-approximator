package approx.trident.opts;
/*
 * this implementation is not complete
 */
public interface Opts {
	public abstract void addMeans();
	public abstract void addVariances();
	public abstract void addSds();
	public abstract void subVariances();
	public abstract void subMeans();
	public abstract void subSds();
	public abstract void mulMeana();
	public abstract void mulVariances();
	public abstract void mulSds();
	public abstract void divMeans();
	public abstract void divSds();
	public abstract void divVariances();
}
