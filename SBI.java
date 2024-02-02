package inheritance;

public class SBI extends ICIC {
	public void setfirstname(String fname) {
    	System.out.println("the anme of the SBI person: "+fname);
    }
	public static void main(String args[]) {
		ICIC I=new ICIC();
		I.setfirstname("veena");
		I.setlastname("yellapu");
	}
}
