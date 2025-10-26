
interface A {

    int no = 11;

    void fun();

    default void gun() { //concrete in interface    // when default keyword is used
                                                      //Applicable after Java 8+ from 2014
        System.out.println("Inside gun");
    }
}

class Demo implements A {           // Multiple Inheritance

    public void fun() {

        System.out.println("Inside fun  ");

    }

}

class InterfaceDemo10 {

    public static void main(String A[]) {

        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
    }
}
