package inheritance;

public class HDFC extends personaldetails1 {
	public void setfirstname(String fname) {
    	System.out.println("the name of the HDFC person: "+fname);
    }
 public static void main(String args[]) {
	HDFC I=new HDFC();
	I.setfirstname("SRINIVAS");
	I.setlastname("yellapu");
}
}