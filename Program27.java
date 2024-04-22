
//* * * * *

import java.lang.*;
import java.util.*;

class Program27
{
    public static void Display(int iNo)
    {
        for(int i=0;i<iNo;i++)
        {
            System.out.print("*" + " ");
        }
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int iValue=sobj.nextInt();

        Display(iValue);
    } 
}