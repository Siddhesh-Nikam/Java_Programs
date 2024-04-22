import java.lang.*;
import java.util.*;

class Number
{
    public int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter nuber:");
        iNo=sobj.nextInt();
    }

    public void Display()
    {
        System.out.println("Entered number is:" + iNo);
    }

    public int ReverseNumber()
    {
        int iDigit=0;
        int iRev=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            iRev=(iRev*10)+iDigit;
            iNo=iNo/10;
        }
        return iRev;
    }
}

class Program11
{
    public static void main(String arg[])
    {
        int iRet=0;

        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();

        iRet=nobj.ReverseNumber();

        System.out.println("Reverse number is: " + iRet);

    }
}