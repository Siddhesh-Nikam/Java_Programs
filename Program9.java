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

    public void FiboSeries()
    {
        int x=0;
        int y=1;

        for(int i=1;i<=iNo;i++)
        {
            System.out.println(x);
            int z=x+y;
            x=y;
            y=z;
        }

        
    }
}

class Program9
{
    public static void main(String arg[])
    {
        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();

        nobj.FiboSeries();

    }
}