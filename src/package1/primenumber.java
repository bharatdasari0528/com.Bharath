package package1;

public class primenumber {
	public static void main(String[] args) {
   int n=10;
   int count=0;
   for(int i=1;i<=11;i++) {
	   if(n%i==0) {
		   count++;
   }
   }
	if(count==2) {
		System.out.println("prime number:"+n);
	}
	else {
		System.out.println("this not a prime number:"+n);
	}
}
}