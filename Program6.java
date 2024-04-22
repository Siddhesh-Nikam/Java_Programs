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

    public int Factorial()
    {
        int iFact=1;

        for(int iCnt=1;iCnt<=iNo;iCnt++)
        {
            iFact=iFact*iCnt;
        }
        return iFact;
    }
}

class Program6
{
    public static void main(String arg[])
    {
       
        int iAns=0;

        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();

        iAns=nobj.Factorial();

        System.out.println("Factorial is:" + iAns);

    }
}