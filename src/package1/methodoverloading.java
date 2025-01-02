package package1;

public class methodoverloading {
	int a=100;
	public void m1(int a) {
		this.a=a;
		System.out.println(51+61);
	}
	public static void main(String[] args) {
		methodoverloading t=new methodoverloading();
		System.out.println(t.a);
		t.m1(87);
		
	}

}
