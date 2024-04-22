
//-5 -4 -3 -2 -1 0 1 2 3 4 5

import java.lang.*;
import java.util.*;

class Number
{
    public int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        iNo=sobj.nextInt();

    }

    public void Display()
    {
        System.out.println("Entered number is: " + iNo);
    }

    public void DisplayPattern()
    {
        for(int i=-iNo;i<=iNo;i++)
        {
            System.out.print(i + " ");
        }
    }
}

class Program35
{
    public static void main(String arg[])
    {
        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();
        nobj.DisplayPattern();
    } 
}