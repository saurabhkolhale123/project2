package returntyper;

public class r2 {
	
	public String a1(String name)
	{
		 return name;
	}
	public int a2(int a) {   
		return a;
		
	}
public static void main(String[] args) {
	
	     r2 r=new r2();
	     
	     String s1= r.a1("lata");
	     System.out.println(s1);     //string return
	
	 int x= r.a2(10);
	System.out.println(x);         //int return
	
	System.out.println(s1+" "+x); //we can use return valeu  in oprations
}
}
