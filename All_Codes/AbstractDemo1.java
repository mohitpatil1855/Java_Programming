
abstract class Base {

    public int i, j;

    public int Addition(int a, int b) {
        return a + b;
    }

    abstract public int Subtraction(int a, int b);

}



class AbstractDemo1 {

    public static void main(String A[]) {

        // Base bp = new Base()       //Error(Abstract class' object can't be created)


    }
}
