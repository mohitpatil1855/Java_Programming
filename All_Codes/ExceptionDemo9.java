import java.util.*;

class ExceptionDemo9
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[]={10,20,30,40,50};
        int iIndex = 0, iData=0;

        System.out.println("Enter the Index number : ");
        iIndex = sobj.nextInt();

        iData = Arr[iIndex];                                //Exception Prone code

        System.out.println("Element at that Index is : " +iData);

    }
}