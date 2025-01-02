package package1;

class Telugu {
	int a=100;
	public void m1() {
		System.out.println(54*98);
	}
	public void m2() {
		System.out.println(54-98);
	}
}
	public class inheritance extends Telugu{
		int b=500;
		public void m3() {
			System.out.println(54/98);
	}
		public static void main(String[]args) {
			inheritance t = new inheritance();
			t.m1();
			
		}
	}

