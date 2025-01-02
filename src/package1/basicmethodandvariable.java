package package1;

public class basicmethodandvariable {
	int a=100;
	int b=200;
	int c=300;
	int d=400;
	public void e() {
		System.out.println("first number=100");
	}
	public void f() {
		System.out.println("sceond number=200");
	}
	 public void g() {
		 System.out.println("thrid number=300");
	 }
	 public void h() {
		 System.out.println("fourth number=400");
	 }
		 public void total() {
			 System.out.println(100+200+300+400);
		 }
	 public static void main(String[] arg) {
		 basicmethodandvariable k=new basicmethodandvariable();
		 System.out.println(k.a);
		 System.out.println(k.b);
		 System.out.println(k.c);
		 System.out.println(k.d);
		 k.e();
		 k.f();
		 k.g();
		 k.h();
		 k.total();
	 }
}
		 

