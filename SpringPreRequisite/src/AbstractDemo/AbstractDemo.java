package AbstractDemo;


abstract class Bank{
	abstract double rateOfInt();
}
class HDFC extends Bank{
	double rateOfInt() {
		return 7.8;
	}
	
}
class Canara extends Bank{
	double rateOfInt() {
		return 6.4;
	}
}
class SBI extends Bank{
	double rateOfInt() {
		return 6;
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HDFC h= new HDFC();
        h.rateOfInt();
        
        Bank obj = new Canara();
        obj.rateOfInt();
	}

}
