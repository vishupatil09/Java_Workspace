import java.util.Scanner;

public class positivenagative {
    public static void main( String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Please Enter The Value: ");
        byte b = a.nextByte();
        if ( b>=0)
        {
            System.out.println("Your value is positive: " + b);
        }
      else {
            System.out.println(" Your value is Nagative: "+b);
        }


    }
}
