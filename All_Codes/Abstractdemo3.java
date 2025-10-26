
abstract class Base {

    public int i, j;

    public int Addition(int a, int b) {
        return a + b;
    }

    abstract public int Subtraction(int a, int b);

}

class Derived extends Base {

    public int Subtraction(int a, int b) {
        return a - b;
    }

    public int Multiplication(int a, int b) {
        return a * b;
    }

}

class AbstractDemo3 {

    public static void main(String A[]) {

        Base bp = new Derived();

        int iRet = 0;

        iRet = bp.Addition(11, 10);
        System.out.println("Addition is: \n" + iRet);

        iRet = bp.Subtraction(11, 10);
        System.out.println("Subtraction is: \n" + iRet);

        // iRet =  bp.Multiplication(11,10);       //Error
    }
}
