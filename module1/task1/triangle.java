import java.io.*;
import java.lang.Package;


public class triangle {
    public static void Triangle(int n)
    {
        int a, b;
        for (a=0;a<n;a++)
        {
            for (b=0;b<=a;b++)
                {
                System.out.printf("* ");
                }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int k= 9;
        Triangle(k);

    }
}
