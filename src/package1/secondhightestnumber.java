package package1;

public class secondhightestnumber {
	public static void main(String[]args) {
		int a[]={45,75,36,98,42,10,11};
		int s=0;
		int h=0;
		for(int i=0;i<a.length;i++) {
			if(h<a[i]) {
				s=h;
				h=a[i];
			}
		   }
		System.out.println(s);
		
	}

}
