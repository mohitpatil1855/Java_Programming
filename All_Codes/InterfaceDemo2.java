
interface arithmetic {

    int iFirst = 11;

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
        iAns = arithmetic.iFirst / iSecond;
        System.out.println("division is:" + iAns);
        return 0;
    }

}


class InterfaceDemo2 {

    public static void main(String A[]) {

        calculator cObj = new calculator();

        cObj.addition(5);
        cObj.subtraction(5);
        cObj.multiplication(5);
        cObj.division(5);

    }
}
