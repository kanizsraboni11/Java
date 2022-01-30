import java.util.Locale;

public class StringTest {
     public static void main(String[] args) {
         String fname = "KanizFatema";
         char p= fname.charAt(5);
         int c=fname.indexOf("Fatema");
         System.out.println(c);
         System.out.println(p);
         String mname = "M";
         String lname = "Sraboni";
         String b="nsksnksdneujfn";
         System.out.println(b.toUpperCase());
         b.length();
         System.out.println(b.length());
         String fullname = fname + " " + mname + " " + lname + " ";
         int a=fullname.length();
         System.out.println(a);
         System.out.println(fullname);
         String r = "Kaniz";
         if(fname.equals(r))
         {
             System.out.println("Names are equals");
         }
         else if (fname.equalsIgnoreCase(r)){
             System.out.println("Names are not equals");
         }
         else {
             System.out.println("Names are not equals");
         }



     }}