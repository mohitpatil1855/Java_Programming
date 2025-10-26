
interface A {

    int no = 11;

    void fun();
}

interface B {

    int no = 8;

    void fun();
}

class Demo implements A, B {           // Multiple Inheritance

    public void fun() {

        System.out.println("inside fun  " + A.no);

    }

}

class InterfaceDemo9 {

    public static void main(String A[]) {

        Demo dobj = new Demo();
        dobj.fun();
    }
}
