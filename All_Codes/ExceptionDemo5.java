import java.util.*;

class ExceptionDemo5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1= 0, iNo2 =0, iAns= 0;

        System.out.println("Enter First number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second number : ");
        iNo2 = sobj.nextInt();

       try
       {
        System.out.println("Inside Try Block ");
        iAns = iNo1/iNo2; 
       }

       catch(ArithmeticException aobj)                     //Specific Catch
       {
        System.out.println("Inside Catch Block ");
        System.out.println(aobj);  
       }

       catch(Exception eobj)                             //Generic Catch
       {
        System.out.println("Inside Generic Catch ");
       }


        System.out.println("Division is :" + iAns);
    }
}