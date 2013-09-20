package approx.trident.pdfs;

public class Driver {
	public static void main(String[] args){
		//Gaussian nd = new Gaussian(1019,209);
		Uniform ud= new Uniform(10,20);
		System.out.println(ud.Pd_Function());
		System.out.println(ud.cd_Function());
		System.out.println(ud.inv_cd_function());
	}

}
