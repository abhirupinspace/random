//by Abhirup Banerjee
import java.util.Scanner;
/* 
incomplete code
The program with function 
class Tech_Number
{   Scanner in= new Scanner(System.in);
    Tech_Number()
    {
       // public static int num,count; //something
    }
    static int input()
    {
        System.out.println("Enter the number: ");
        int a=in.nextInt();
        return a;
    }
    static int CountDigit(int n)
    {
        int c = 0;
        while (n != 0) 
        {
            n = n / 10;
            c++;
        }
        return c;
    }
    Check_tech()
    {
        
    }
    public static void main(String[]args)
    {
        Tech_Number ob= new Tech_Number();
        int num = ob.input();
        int count=ob.CountDigit(num);

    }
} 
*/
class Tech_Number{   
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=in.nextInt();
        int n=num, number=num, c=0, f=0, n1=0, n2=0;
        while (n != 0) {
            n = n / 10;
            c++;
        }
        if(c%2==0){
            n1 = num%(int) Math.pow(10, c/ 2);
            num= num/(int) Math.pow(10, c/ 2);
            n2=num;
            int sq= (n1+n2)*(n1+n2);
            if (number==sq)  
            {  
                System.out.println(number +" is a tech number.");      
            }
            else  
            {  
                System.out.println(number+" is not a tech number.");  
            } 
        }
        else{
            System.out.println("Enter a number with even number of digits. ");
        }}}
 