package week1.day2;

public class EvenNumberCheck {
	public void evenNumberCheck(int even)
	{
		if(even%2==0)
		{
			System.out.println("The Given Number "+even+" is " +"a Even Number");
		}
		else 
		{
			System.out.println("The Given Number "+even+" is "+"a Odd Number");
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		EvenNumberCheck check=new EvenNumberCheck();
		int even=71;
		check.evenNumberCheck(even);

	}

}
