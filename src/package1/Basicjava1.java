package package1;

class Dasari {
	int a=100;
	public void m1() {
		System.out.println(4584+2455);
	}
	public void m2() {
		System.out.println(25486+5448);
	}
	public void m3() {
		System.out.println(25486+5448);
	}
	
}
  public class Basicjava1 extends Dasari {
	  int b=200;
	  public void m4() {
			System.out.println(4584+2455);
		}
		public void m5() {
			System.out.println(25486+5448);
		}
		public void m6() {
			System.out.println(25486+5448);
		}
   public static void main(String[] arg) {
	   Basicjava1 t=new Basicjava1 ();
			System.out.println(t.a);
			System.out.println(t.b);
			t.m1();
			t.m2();
			t.m3();
			t.m4();
			t.m5();
			t.m6();
		}
		
   }
