package package1;

public class Higthestnumber {
	public static void main(String[] args) {
		int a[]= {54,85,63,34,58,14};
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
