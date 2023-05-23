

public class VishuMultiDimenson {
    public static void main( String [] args)
    {
        int [] [] Flats ;
        Flats= new int[2][3];
        Flats[0][0] = 101;
        Flats[0][1] = 102;
        Flats[0][2] = 103;
        Flats[1][0] = 201;
        Flats[1][1] = 202;
        Flats[1][2] = 203;

        for ( int  i=0; i<Flats[i].length ; i++) {
                for (int j = 0; j<Flats[i].length; j++) {
                    System.out.print(Flats[i][j]);
                    System.out.print(" ");
                }
                System.out.println(" ");

            }
    }
}