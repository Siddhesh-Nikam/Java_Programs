import java.lang.*;
import java.util.*;

class Number
{
    public int iNo1;
    public int iNo2;

    public int Addition(int iNo1,int iNo2)
    {
        int iAdd=0;
        iAdd=iNo1+iNo2;
        return iAdd;
    }
}

class Program4
{
    public static void main(String arg[])
    {
        int iValue1=0;
        int iValue2=0;
        int iAns=0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first nuber:");
        iValue1=sobj.nextInt();

        System.out.println("Enter first nuber:");
        iValue2=sobj.nextInt();

        Number nobj = new Number();

        iAns=nobj.Addition(iValue1,iValue2);

        System.out.println("Addition is:" + iAns);

    }
}