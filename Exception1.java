import java.util.*;

public class Exception1 
{
   public static void main(String a[])
   {
       Scanner sobj = new Scanner(System.in);

       System.out.println("lease enter first number");
       int no1 = sobj.nextInt();

       System.out.println("lease enter Second number");
       int no2 = sobj.nextInt();

       int ans = no1/no2;

       System.out.println("Division is :"+ans);

       sobj.close();
   }
   
}
