
//Display of factors in a number

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

    public void DisplayFactors()
    {

        for(int iCnt=1;iCnt<iNo;iCnt++)
        {
            if(iNo%iCnt==0)
            {
                System.out.print(iCnt);
            }
        }
    }
}

class Program18
{
    public static void main(String arg[])
    {
        int iRet=0;

        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();

        nobj.DisplayFactors();
    }
}
