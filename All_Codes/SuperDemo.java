class Hello
{
public int i;

public Hello(int no)
{
            System.out.println("Inside Hello constructor");
            this.i=no+1;
}

public void display()
{
     System.out.println("Inside Hello Display");

}
}
class Demo extends Hello
{
    public int i;

    public Demo(int a)
    {
        super (a);               //First use
        System.out.println("Inside Demo Constructor");
        this.i = a;

    }
    public void display()
    {
        int i =0;
        System.out.println("Inside Display  " + i);         //0
        System.out.println("Inside Display  " + this.i);    //51
        System.out.println("Inside Display  " + super.i);   //52             //Second use

        super.display();              //Third use
    }
}

class SuperDemo
{
    public static void main (String A[])
    {
            Demo dobj = new Demo(51);
            dobj.display();

    }    
}