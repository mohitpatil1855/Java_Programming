import java.util.Scanner;

class SelectionDemo1
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        int iAge=0;
        System.out.println("Enter your age:");
        iAge = sObj.nextInt();

        if(iAge>=18){
            System.out.println("You can vote..!");
        }
        else{
            System.out.println("you can't vote..!");
        }

    }
}