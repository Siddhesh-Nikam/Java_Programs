
//Count of all digits in a number

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

    public int CountDigits()
    {
        int iDigit=0;
        int iDigCnt=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            iDigCnt++;
            iNo=iNo/10;
        }
        return iDigCnt;
    }
}

class Program15
{
    public static void main(String arg[])
    {
        int iRet=0;

        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();

        iRet=nobj.CountDigits();

        System.out.println("Count of digits in number is: " + iRet);

    }
}
