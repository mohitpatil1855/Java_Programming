
interface Demo {

    int no = 11;

    void Display();
}

abstract class Hello implements Demo {

}

class InterfaceDemo4 {

    public static void main(String a[]) {

        Hello hobj = new Hello();           //Error

    }
}
