import java.lang.*;
import java.util.*;

class Number
{
    public int iNo1;
    public int iNo2;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first nuber:");
        iNo1=sobj.nextInt();

        System.out.println("Enter first nuber:");
        iNo2=sobj.nextInt();
    }

    public void Display()
    {
        System.out.println("Entered first number is:" + iNo1);
        System.out.println("Entered second number is:" + iNo2);
    }

    public int Addition()
    {
        int iAdd=0;
        iAdd=iNo1+iNo2;
        return iAdd;
    }
}

class Program5
{
    public static void main(String arg[])
    {
       
        int iAns=0;

        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();

        iAns=nobj.Addition();

        System.out.println("Addition is:" + iAns);

    }
}