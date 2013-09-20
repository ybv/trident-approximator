package approx.trident.pdfs;

public class Driver {
	public static void main(String[] args){
		double[] x ={1.2,2.4,1.0};
		double[] y ={6.5,7.4,1.5};
		Stats s = new Stats(x,y,"nd");
		Stats s2 = new Stats(2.2,3.1,"ud");
		s.printFuncVals();
	}

}
