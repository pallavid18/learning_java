public class TestRelationalOp
{
	public static void main(String[]args)
	{
		int a = 10 , b = 20 , c=10; //declare a variable 
		
		System.out.println("Equal to a&b     : " +(a==b));  
		System.out.println("Equal to a&c     : " +(a==c));
		System.out.println("Greater  a&b     : " +(a>b));
		System.out.println("Greater  b&c     : " +(b>c));
		System.out.println("Less Than a&b    : " +(a<b));
		System.out.println("Less Than a&c    : " +(a<c));
		System.out.println("NOt Eql   a&b    : " +(a!=b));
		System.out.println("Greater   a&b    : " +(a>=b));
		System.out.println("Greater   a&c    : " +(a>=c));
		System.out.println("Less      a&b    : " +(a<=b));
		System.out.println("Less Eq   a&a    : " +(a<=a));
	}
}