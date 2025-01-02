package package1;
class Bharath1 {
	int a=100;
	public void m1() {
		System.out.println(4544+8498);
	}
	public void m2() {
		System.out.println(6449+654);
	}
	public void m3() {
		System.out.println("hai this is Bharath");
	}

}
public class methodoveridding extends Bharath1 {
	int b=200;
	public void m4() {
		System.out.println(5489+9899);
	}
	public void m2() {
		System.out.println("hai this is Bharath from visakhapatnam");
	}
	public static void main(String[] args) {
		methodoveridding t=new methodoveridding();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
	}
	
}
