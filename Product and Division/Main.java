import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int num1, num2,pro,div,rem;
        Scanner sc = new Scanner(System.in);
       
        num1 = sc.nextInt();
        
        num2 = sc.nextInt();
        
        pro = num1 * num2;
      div=num1/num2;
      rem=num1%num2;
        System.out.println(pro);
      System.out.println(div);
      System.out.println(rem);
    }
}