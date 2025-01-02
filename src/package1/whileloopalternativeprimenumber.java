package package1;
public class whileloopalternativeprimenumber {
 public static void main(String[] args) {
	 int m=0;
	int n=1;
	while(n<=100) {
		int i=1,count=0;
		while(i<=n) {
			if(n%i==0) {
				count++;
			}
			i++;
		}
		if(count==2) {
				m++;
			if(m%2==0)
				System.out.println(n);
			}
			n++;
		}
	}
}

