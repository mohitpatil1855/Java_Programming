
class Base {

    public int i, j;

}

class Derived extends Base {

    public int x;

}

class RMDDemo1 {

    public static void main(String A[]) {

        Base bp1 = new Base(); //NoCasting
        Derived dp1 = new Derived(); //NoCasting

        Base bp2 = new Derived();   // upcasting
        Derived dp2 = new Base();   //Down Casting              //Error

    }
}
