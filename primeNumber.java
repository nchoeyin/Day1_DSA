import java.util.Scanner;
public class Main
{
    public static boolean isPrime(int a)
    {
        if(a==1) return false;
        if(a==2 || a==3) return true;
        if(a%2==0 || a%3==0) return false;
        for(int i=5;i*i<=a;i=i+6)
        {
            if(a%i==0 || a%(i+2)==0)
                return false;
        }
        return true;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked for prime: ");
		int num = sc.nextInt();
		if(isPrime(num)==true)
		 System.out.println("The number is prime");
		else
		 System.out.println("The number is not prime ");
	}
}
/*output
Enter the number to be checked for prime: 
1031
The number is not prime 
Enter the number to be checked for prime: 
17
The number is prime
*/