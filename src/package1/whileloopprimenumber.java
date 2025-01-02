package package1;

public class whileloopprimenumber {
	public static void main(String[] args) {
		int n=11;
		int i=1,count=0;
		while(i<=n) {
			if(n%i==0) {
				count++;
			}
			i++;
		}
		if(count==2) {
			System.out.println(n);
		}
	}
	}


