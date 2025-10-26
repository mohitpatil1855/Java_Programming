
class Demo {

    public int i;                            //Instance variable
    static public int j;               //class variable

    static {

        System.out.println("Inside Static");

        j = 21;

    }

    public Demo() {

        System.out.println("Inside Constructor");
        this.i = 11;

    }
}

class Blocks {

    public static void main(String A[]) {

        System.out.println("Inside Main");

        Demo dobj1 = new Demo();

        Demo dobj2 = new Demo();

        Demo dobj3 = new Demo();

    }
}
