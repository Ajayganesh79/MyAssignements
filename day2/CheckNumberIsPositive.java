package week1.day2;

public class CheckNumberIsPositive {
	public void result(int a)
	{
		if (a>0)
		{
			System.out.println("The Given Number "+a +" is Positive");
		}
		else
		{
			System.out.println("The Given Number "+"("+a+")" +" is Negative");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckNumberIsPositive check=new CheckNumberIsPositive();
		int a= -30;
		
		check.result(a);
		
		

	}

}
