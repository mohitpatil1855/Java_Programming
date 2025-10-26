
interface A {

    void fun();
}

interface B {

    void gun();

}

class Demo implements A, B {           // Multiple Inheritance

    public void fun() {

        System.out.println("inside fun");

    }

    public void gun() {

        System.out.println("inside gun");

    }
}

class InterfaceDemo6 {

    public static void main(String A[]) {

        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
    }
}
