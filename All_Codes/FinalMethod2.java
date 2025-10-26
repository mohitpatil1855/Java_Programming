
class Base {

    final public void fun() {               //Definition  //Final
    }

    final public void gun() {               //Definition   //Final
    }

}

class Derived extends Base {

    public void run() {                //Definition  
    }

    public void gun() {               //Overriding        //Error
    }

}

class FinalMethod2 {

    public static void main(String A[]) {
    }
}
