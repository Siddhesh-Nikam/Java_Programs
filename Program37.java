
// ****
// ****
// ****
// ****

import java.lang.*;
import java.util.*;

class Number
{
    public int iRows;
    public int iColumns;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        iRows=sobj.nextInt();

        System.out.println("Enter number of columns:");
        iColumns=sobj.nextInt();

    }

    public void Display()
    {
        System.out.println("Entered number of rows is: " + iRows);
        System.out.println("Entered number of columns is: " + iColumns);
    }

    public void DisplayPattern()
    {
        for(int i=1;i<=iRows;i++)
        {
            for(int j=1;j<=iColumns;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Program37
{
    public static void main(String arg[])
    {
        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();
        nobj.DisplayPattern();
    } 
}