

//1 * 3 * 5

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
        for(int i=1;i<=iNo;i++)
        {
            if((i%2)==0)
            {
                System.out.print("*" + " ");
            }
            else
            {
                System.out.print(i + " ");
            }
        }
    }
}

class Program36
{
    public static void main(String arg[])
    {
        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();
        nobj.DisplayPattern();
    } 
}