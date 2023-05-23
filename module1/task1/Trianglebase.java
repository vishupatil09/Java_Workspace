import java.util.Scanner;

public class Trianglebase {
    public static void main( String[] args)
    {
        Scanner a= new Scanner(System.in);
        System.out.println(" Enter the base of Triangle : ");
        float b  = a.nextFloat();
        Scanner c = new Scanner(System.in);
        System.out.println(" Enter the hight of Triangle : ");
        Float d = c.nextFloat();
        Float f = ( b*d)/2;
        System.out.println("area of Triangle is= "+f);

    }
}
