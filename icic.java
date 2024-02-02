package abstraction;

public class icic extends personaldetails{

	@Override
	public void firstname(String fname) {
		// TODO Auto-generated method stub
		System.out.println("the fname of the person:"+fname);
	}

	@Override
	public void lastname(String lname) {
		// TODO Auto-generated method stub
		System.out.println("the fname of the person:"+lname);
	}
	public static void main(String args[]) {
		icic i= new icic();
		i.firstname("lalith");
		i.lastname("yellapu");
	}

}
