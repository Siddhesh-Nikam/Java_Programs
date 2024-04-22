
//Count of all odd digits in a number

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

    public int CountOddDigits()
    {
        int iDigit=0;
        int iCntOdd=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            if((iDigit%2)!=0)
            {
                iCntOdd++;
            }
            iNo=iNo/10;
        }
        return iCntOdd;
    }
}

class Program14
{
    public static void main(String arg[])
    {
        int iRet=0;

        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();

        iRet=nobj.CountOddDigits();

        System.out.println("Count of odd digits in number is: " + iRet);

    }
}
