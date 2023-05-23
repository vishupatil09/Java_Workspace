import java.util.Scanner;

public class Sum3number {
    public static void main(String[] args)
    {
     Scanner s= new Scanner(System.in);
        System.out.println("Enter A value: ");
        float a= s.nextInt();
        System.out.println("Enter B value: ");
        float b= s.nextInt();
        System.out.println("Enter C  value: ");
        float c= s.nextInt();
        float sum=a+b+c;
        System.out.println("sum of ABC is:  "+sum);
        float d= sum/3;
        System.out.println(d);


    }
}
