package approx.trident.pdfs;

public class Driver {
	public static void main(String[] args){
		double[] x ={1.2,2.4,1.0};
		Stats s = new Stats(x,"nd");
		Stats s2 = new Stats(0.2,3.1,"ud");
		s2.printFuncVals();
	}

}
