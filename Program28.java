
//* * * * *


import java.lang.*;
import java.util.*;


class Number
{
    public void Display(int iNo)
    {
        for(int i=0;i<iNo;i++)
        {
            System.out.print("*" + " ");
        }
    }
}

class Program28
{
    public static void main(String arg[])
    {
        Number nobj = new Number();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int iValue=sobj.nextInt();

        nobj.Display(iValue);
    } 
}