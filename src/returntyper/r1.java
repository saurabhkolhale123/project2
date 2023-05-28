package returntyper;

public class r1 {

	
	public int m1()
	{    int a=10;int b=20;
		int c=a+b;
		return c;
		
	}
	public static void main(String[] args) {
		
		r1 r=new r1();
		
		int num=r.m1();
		System.out.println(num);
		
		System.out.println(r.m1());
	}
	
	
	
}
