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

    public void ReverseNumber()
    {
        int iDigit=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            System.out.print(iDigit);
            iNo=iNo/10;
        }
    }
}

class Program10
{
    public static void main(String arg[])
    {
        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();

        nobj.ReverseNumber();

    }
}