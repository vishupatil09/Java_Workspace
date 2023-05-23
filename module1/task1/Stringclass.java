public class Stringclass {
    public static void main( String[] args)
    {
         String name ="Vishal";
        //int value= name.length();

        //System.out.println(value);

        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        //String ustring = name.toUpperCase();
        //System.out.println(ustring);

       // String nontrimmedString="         Vishal       ";
        //System.out.println(nontrimmedString);

        //String trimmedString=nontrimmedString.trim();
        //System.out.println(trimmedString);

        System.out.println(name.substring(1));

        System.out.println(name.substring(0,6));

        System.out.println(name.replace('s','d'));
        System.out.println(name.replace("ish","u"));
    }
}
