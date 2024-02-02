package inheritance;
import inheritance.personaldetails1;
public class ICIC extends personaldetails1{
	public void setfirstname(String fname) {
    	System.out.println("the name of the SBI person: "+fname);
    }
public static void main(String args[]) {
	ICIC I=new ICIC();
	I.setfirstname("lalith");
	I.setlastname("yellapu");
}
}
