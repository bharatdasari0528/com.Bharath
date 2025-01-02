package package1;
import java.util.Scanner;
public class Testscanner {
	public static void main(String[] args) {
		String name;
		String pwd;
		int age = 22;
		String DB;
		int Year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		sc.next();
		System.out.println("enter your pwd :");
		name=sc.next();
		System.out.println("Enter your Age :");
		pwd=sc.next();	
		System.out.println("Enter your DB :");
		DB=sc.next();
		System.out.println("Enter your Data Birth Year");
		Year=sc.nextInt();
		System.out.println("UserName:"+name);
		System.out.println("password:"+pwd);
		System.out.println("Age:"+age);
		System.out.println("Date Birth :"+DB);
		System.out.println("Data Birth Year:"+Year);
		}
	
	

}
