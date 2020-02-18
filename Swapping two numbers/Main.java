import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int x, y, t;  
       Scanner sc = new Scanner(System.in);  
       
       x = sc.nextInt();  
       y = sc.nextInt();  
       
       t = x;  
       x = y;  
       y = t;  
       System.out.println(x);  
       System.out.println(y );  
    }
}