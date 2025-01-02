package package1;
import java.util.Scanner;
public class tryandcatchfinally{
		public static void main(String[] args) {
			try {
			int a[]= {13,54,87,45,63,47,25,34,79};
			System.out.println(a[9]);
		}
		catch(java.lang.ArrayIndexOutOfBoundsException e)	
			{
			System.out.println(e.getMessage());
			e.printStackTrace();
			}
			finally {
				System.out.println("ojngbyvchfbdfiuf");
			}
		}
}
	
