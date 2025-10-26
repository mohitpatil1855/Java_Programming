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

    try{
            System.out.println("Inside Try");
            iData = Arr[iIndex];                               //Exception Prone code
    }

    catch(ArrayIndexOutOfBoundsException aobj)                   //Specific Catch
    {
        System.out.println("Inside Catch");
        System.out.println(aobj);
    }
 
    catch(Exception eobj)                                           //Generic catch
    {
        System.out.println("Inside Generic Catch");
         System.out.println(eobj);
    }

    finally                                                         // finally
    {
        System.out.println("Inside Finally");
    }

        System.out.println("Element at that Index is : " +iData);

    }
}