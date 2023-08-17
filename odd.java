import java.util.Scanner;
public class odd 
{
    Scanner in=new Scanner(System.in);
    public int input()
    {
        System.out.print("Enter the number");
        int n= in.nextInt();
        return n;
    }
    public void oddprint(int n)
    {
        for(int i=1;i<=n;i++)
        {
           if(i%2 != 0) 
           System.out.print(i+", ");
        }
    } 
    public static void main(String[]args)
    {
        odd obj= new odd();
        int k= obj.input();
        obj.oddprint(k);
    }
}
