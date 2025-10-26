
import java.util.Scanner;

interface arithmetic {

    int iFirst = 10;

    int addition(int iSecond);

    int subtraction(int iSecond);

    int multiplication(int iSecond);

    int division(int iSecond);

}


class calculator implements arithmetic {

    public int addition(int iSecond) {
        int iAns = 0;
        iAns = arithmetic.iFirst + iSecond;
        System.out.println("Addition is:" + iAns);
        return 0;
    }

    public int subtraction(int iSecond) {
        int iAns = 0;
        iAns = arithmetic.iFirst - iSecond;
        System.out.println("subtractoin is:" + iAns);
        return 0;
    }

    public int multiplication(int iSecond) {
        int iAns = 0;
        iAns = arithmetic.iFirst * iSecond;
        System.out.println("multiplication is:" + iAns);
        return 0;
    }

    public int division(int iSecond) {
        int iAns = 0;
        iAns = iSecond / arithmetic.iFirst;
        System.out.println("division is:" + iAns);
        return 0;
    }

}

class InterfaceDemo3 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        calculator cObj = new calculator();

        System.out.println("Enter your second number:");

        int iDigit = 0;
        iDigit = sobj.nextInt();

        cObj.addition(iDigit);
        cObj.subtraction(iDigit);
        cObj.multiplication(iDigit);
        cObj.division(iDigit);

    }
}
