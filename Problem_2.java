import java.util.Scanner;
public class Problem_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a Number (x)");
		int x=sc.nextInt();

		System.out.print("Output: ");

		for(int i=1;i<=x;i++)
		{
			System.out.print(2*i-1);
			if(i!=x)
				System.out.print(",");
		}
	}
}

