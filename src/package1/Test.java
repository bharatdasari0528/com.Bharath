package package1;

public class Test {
	public static void printpattern(int n) {
		int i,j;
		for( i=0;i<n;i++) {
			for(j=n-1;j<i;j--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=5;
		printpattern(n);
	}

}
