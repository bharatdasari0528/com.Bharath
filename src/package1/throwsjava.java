package package1;

public class throwsjava {
private throwsjava t;
public void arrays()throws java.lang.ArrayIndexOutOfBoundsException{
	System.out.println("program begin");
	int name;
	String String;
	int age;
	float f;
	int a[]= {1,2,6,87,35,6,58,33,654};
	System.out.println(a[9]);
	}
public static void main(String[] args) {
	throwsjava t=new throwsjava();
try {
	t.arrays();
	System.out.println("name"+"=Bharat");
	System.out.println();
	
}
catch(java.lang.ArrayIndexOutOfBoundsException e)
{
	System.out.println(e.getMessage());
	e.printStackTrace();
}
finally {
	System.out.println("program end");
}
}
}


