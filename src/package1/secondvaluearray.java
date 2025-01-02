package package1;

public class secondvaluearray {
	public static void main(String[] args) {
		int a[]= {85,69,45,25,36,12,14};
		int sl=a[0];
		int hl=a[1];
		for(int i=0;i<a.length;i++) {
			if(hl>a[i]) {
				sl=hl;
				hl=a[i];
			}
			else {
				if(sl>a[i]) {
					sl=a[i];
				}
			}
		}
		System.out.println(sl);
	}
}
