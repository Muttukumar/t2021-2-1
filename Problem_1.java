import java.util.Scanner;
public class Problem_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("HI! Welcome to the Calculator,\nPlease enter first value");
		double a=scan.nextDouble();
		System.out.println("Please enter second value");
		double b=scan.nextDouble();
		scan.nextLine();
		System.out.println("type of operation");
		String n=scan.nextLine();
		double answer=0;
		switch (n)
		{
		case "+":
			answer=add(a, b);break;
		case "-":
			answer=sub(a,b);break;
		case "*":
			answer=mul(a,b);break;
		case "/":
			answer=div(a,b);break;
		}
		System.out.println("answer: "+answer);			
	}

	public static double add(double a,double b)
	{
		return a+b;

	}
	public static double sub(double a,double b)
	{
		return a-b;
	}
	public static double mul(double a,double b)
	{
		return a*b;
	}
	public static double div(double a,double b)
	{
		return a/b;
	}
}

