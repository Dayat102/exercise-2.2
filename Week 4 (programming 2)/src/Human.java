
public class Human {

	String Name;
	int Age;
	String Sex;
	
	void printHuman(String a,int b,String x){
		System.out.println("Name : " + a);
		System.out.println("Age : " + b);
		System.out.println("Sex : " + x);
	}
	
	void printProperties(String a, String b) {
		String Operation = ("1.Walk = " +a + "\n" + "2.Speak = " + b +"\n");
		System.out.print("Operation : \n" + Operation);
	}
	
	void printClothes(String a, String b) {
		System.out.println("Clothes that are always chosen :- "+ "\n"+"1."+a + "\n"+ "2." +b +"\t");
	}
	
	void printBmi(double a,double b) {
		double bmi,c=0;
		c=a/100;
		bmi=b/(c*c);
		double roundoff = Math.round(bmi*100)/100;
		System.out.println("Your Bmi is = " + roundoff);
	}
}