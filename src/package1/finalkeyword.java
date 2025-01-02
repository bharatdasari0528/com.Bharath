package package1;

class D {
	final int a=100;
	public final void  m1() {
		System.out.println("bharath and bharath123");
	} 
	public final void m2() {
		System.out.println(24+245);	
		}
	
	}
public class finalkeyword extends D {
	public final void m3 () {
		System.out.println("deva and deva123");
		
	}
	public static void main(String[] args) {
		finalkeyword t=new finalkeyword();
		t.m1();
		t.m2();
		t.m3();
		System.out.println(t.a);
	}
	
}

