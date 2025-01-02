package package1;

public class Alternativeprimenumbers {
	public static void main(String[] args) {
		int m=0;
		for(int n=1;n<=100;n++) {
			int count=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				m++;
				if(m%2==1) {
				System.out.println(n);
				
				
			}
			
		}
	}


	}
}
