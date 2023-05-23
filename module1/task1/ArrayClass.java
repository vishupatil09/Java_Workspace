//Array

public class ArrayClass {
    public static void main(String[] args)
    {
        int [] marks={100,25,50,42,98};

        System.out.println(marks.length);
        System.out.println(marks[2]);
        /* String [] name={"Raj" ,"Kishan", "Jay","Ravi", "Chirag"};
        System.out.println(name[2]);
        */

        // reverce way

        //for ( int  i= marks.length -1; i>=0 ; i--){


        for ( int  i=0; i<marks.length ; i++) {
            System.out.println(marks[i]);
        }
         for ( int element:marks){
             System.out.println(element);
         }






    }
}
