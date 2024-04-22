
//Count of all even digits in a number

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

    public int CountEvenDigits()
    {
        int iDigit=0;
        int iCntEven=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            if((iDigit%2)==0)
            {
                iCntEven++;
            }
            iNo=iNo/10;
        }
        return iCntEven;
    }
}

class Program13
{
    public static void main(String arg[])
    {
        int iRet=0;

        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();

        iRet=nobj.CountEvenDigits();

        System.out.println("Count of even digits in number is: " + iRet);

    }
}
