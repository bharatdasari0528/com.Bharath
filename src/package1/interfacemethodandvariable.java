package package1;
interface B{
		int a=100;
		public void m1();
		public void m2();
	}
	interface A {
		int b=500;
		public void m2();
		public void m3();
	} 
	public class interfacemethodandvariable implements B,A{
			int c=1000;
			public void m4() {
				System.out.println(494+548);
			}
			public static void main(String[] args) {
			  interfacemethodandvariable t=new interfacemethodandvariable();
			  System.out.println(t.a);
			  System.out.println(t.b);
			  t.m1();
			  t.m2();
			  t.m3();
			  t.m4();
			  }

		@Override
		public void m3() {
			System.out.println(4484+446);
		}

		@Override
		public void m1() {
			System.out.println(4484+446);
			
		}

		@Override
		public void m2() {
			System.out.println(4484+446);
			
		}
		
	}
