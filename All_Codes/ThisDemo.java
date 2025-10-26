class Demo{
      public int i;

    public static int j;

    static{
        j=21;
    }

    public Demo()
    {
        System.out.println("Inside Default");

        this.i = 11;                     //First use
    }

       public Demo(int a)
    {
        this();                     //second use
        System.out.println("Inside parametrized");

    }

    public void display()
    {
         System.out.println("Inside display  "+this.i);      //Third use

    }
}

class ThisDemo
{

    public static void main(String A[])
    {
Demo dobj = new Demo(51);
dobj.display();
    }
}