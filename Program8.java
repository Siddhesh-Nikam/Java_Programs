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

    public boolean ChkEven()
    {
        if((iNo%2)==0)
        {
            return true;
        }

        else
        {
            return false;
        }
    }
}

class Program8
{
    public static void main(String arg[])
    {
       
        boolean bRet=false;

        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();

        bRet=nobj.ChkEven();

        if(bRet==true)
        {
            System.out.println("Given number is even");
        }

        else
        {
            System.out.println("Given number is not even");
        }
    }
}