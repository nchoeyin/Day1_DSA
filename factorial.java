import java.util.Scanner;
public class Main
{
    public static int fact(int a)
    {
        int res =1;
        for(int i=2;i<=a;i++)
        {
          res = res*i;
        }
        return res;
    }
   /*public static int fact(int a)
	{
	   if(a==0)
		return 1;
	   else
		return n*fact(a-1);	
	}
    */
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the factorial number:");
	    int no = sc.nextInt();
	    int factNum = fact(no);
	    System.out.println(factNum);
	}
}
/* output 
Enter the factorial number:
1
1

Enter the factorial number:
5
120 */