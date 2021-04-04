import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Faris,height in cm?");
		double height= sc.nextDouble();
		System.out.println("Faris, please enter your weight in kg ");
		double weight= sc.nextDouble();
		System.out.println("Dayana, height in cm?");
		double height1= sc.nextDouble();
		System.out.println("Dayana, please enter your weight in kg");
		double weight1= sc.nextDouble();
		System.out.println();
		
		Human male=new Human(); //create first new object Human
		male.printHuman("Faris",19,"Male");
		male.printProperties("Bridle","Rough");
		male.printClothes("T-shirt", "Baju Melayu");
		male.printBmi(height, weight);
		System.out.println();
		
		Human female=new Human();//create second new object Human
		female.printHuman("Dayana",20,"Female");
		female.printProperties("Catwalk","Soft");
		female.printClothes("Blouse", "Baju Kurung");
		female.printBmi(height1, weight1);
		System.out.println();
				

	}

}
