
interface A {

    void fun();
}

interface B {

    void fun();

}

class Demo implements A, B {           // Multiple Inheritance

    public void fun() {

        System.out.println("inside fun");

    }

}

class InterfaceDemo7 {

    public static void main(String A[]) {

        Demo dobj = new Demo();
        dobj.fun();
    }
}
