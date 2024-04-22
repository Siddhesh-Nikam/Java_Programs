import java.lang.*;
import java.util.*;

class Program3
{
    public static int Addition(int iNo1,int iNo2)
    {
        int iAdd=0;
        iAdd=iNo1+iNo2;
        return iAdd;
    }

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

        iAns=Addition(iValue1,iValue2);

        System.out.println("Addition is:" + iAns);

    }
}