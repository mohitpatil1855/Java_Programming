import java.util.*;

class ExceptionDemo2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1= 0, iNo2 =0;
        float fAns= 0.0f;

        System.out.println("Enter First number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second number : ");
        iNo2 = sobj.nextInt();

        fAns = (float)iNo1/(float)iNo2;                  //Explicit type Casting

        System.out.println("Division is :" + fAns);
    }
}