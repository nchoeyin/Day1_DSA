import java.util.Scanner;
public class Main
{
   public static int gcd(int a, int b)
    {
	    if(b==0)
	         return a;
	    else
	         return gcd(b,a%b);
     }
   public static void main(String[] args)
    {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the first number:");
	 int a = sc.nextInt();
	 System.out.println("Enter the second number:");
	 int b = sc.nextInt();
	 int ans = gcd(a,b);
	 System.out.println("The GCD is :");
         System.out.println(ans);
    }
}

//output
//Enter the first number:
//12
//Enter the second number:
//15
//The GCD is :
//3