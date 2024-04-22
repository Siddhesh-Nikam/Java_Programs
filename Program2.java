import java.lang.*;
import java.util.*;

class Program2
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

        iAns=iValue1+iValue2;

        System.out.println("Addition is:" + iAns);

    }
}