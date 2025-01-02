package package1;

public class Test4 {
	public static void printpattern(int n) {
		int i,j;
		for(i=0;i<n;i++) {
			for(j=-n;j<i;j--) {
				System.out.print(" ");
			}
		}
	}

}
