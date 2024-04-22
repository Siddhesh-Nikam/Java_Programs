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

    public boolean PrimeNumber()
    {

        for(int iCnt=2;iCnt<iNo;iCnt++)
        {
            if(iNo%iCnt==0)
            {
                return true;
            }
        }
        return false;
    }
}

class Program7
{
    public static void main(String arg[])
    {
       
        boolean bRet=false;

        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();

        bRet=nobj.PrimeNumber();

        if(bRet==true)
        {
            System.out.println("Given number is not prime");
        }

        else
        {
            System.out.println("Given number is prime");
        }
    }
}