class Demo{
        public int Division(int iNo1, int iNo2) throws ArithmeticException
        {
            int iAns =0;
            iAns = iNo1/iNo2;
            return iAns ;
        }
}

class ThrowsDemo
{
    public static void main(String A[])
    {
        Demo obj = new Demo();

        int iRet=0;

        try 
        {
            iRet = obj.Division(11,0);
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Inside Catch  "+ aobj);
        }


        System.out.println("Division is :"+ iRet);
    }
}