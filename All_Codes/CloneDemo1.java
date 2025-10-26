// class Demo extends Object

class Demo implements Cloneable         //Cloneable is a Marker interface
{
    public int i;
    public int j;

    public Demo(int a , int b)
    {
        this.i=a;
        this.j=b;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class CloneDemo1
{
    public static void main(String A[])
    {
        try
        {
        Demo dobj1 = new Demo(11,21);
        Demo dobj2 = (Demo)dobj1.clone();        //Type Casting = conversion of object to demo

        System.out.println(dobj2.i);
        System.out.println(dobj2.j);
        }

        catch(CloneNotSupportedException cobj)
        {}
    }
}