
interface A {

    int no = 11;


    private void Display()                    //In java 8+ //private
    {
        System.out.println("Inside Private Display");
    }


    default void gun() { //concrete in interface    // when default keyword is used
                                                      //Applicable after Java 8+ from 2014
        System.out.println("Inside gun");
        Display();
    }

}



class Demo implements A {           // Multiple Inheritance

    public void fun() {

        System.out.println("Inside fun  ");

    }

}

class InterfaceDemo11 {

    public static void main(String A[]) {

        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
        //dobj.Display();             //Error
    }
}
