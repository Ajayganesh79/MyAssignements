package week1.day2;

public class Calculator {
	public int add(int a, int b)
	{
		int c=a+b;
		return c;
		
	}
	int sub(int a, int b) 
	{
		int c=a-b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc=new Calculator();
		float addRes=calc.add(10,20);
		float subRes=calc.sub(20,10);
		System.out.println("The addition of two numbers is:"+addRes+"\n");
		System.out.println("The subtraction of two nubers is:"+subRes+"\n");

	}

}
