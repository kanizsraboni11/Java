import java.util.Scanner;
public class CustomerCoffee {
    public static void main(String[] args) {

        Scanner Obj = new Scanner(System.in);
        System.out.println("What kind of coffee you want?For small press1.For medium press 2.For large press3");


        int size = Obj.nextInt();
        if (size == 1) {
            System.out.println("you select small coffee");
            System.out.println("How many coffee do you want");
            int count = Obj.nextInt();
            int price = 4;
            int totalbal = count * price;
            System.out.println("Your total balance=" + totalbal);

        } else if (size == 2) {
            System.out.println("you select small coffee");
            System.out.println("How many coffee do you want");
            int count = Obj.nextInt();
            int price = 7;
            int totalbal = count * price;
            System.out.println("Your total balance=" + totalbal);
        } else if (size == 3) {
            System.out.println("you select small coffee");
            System.out.println("How many coffee do you want");
            int count = Obj.nextInt();
            int price = 8;
            int totalbal = count * price;
            System.out.println("Your total balance=" + totalbal);
        } else {
            System.out.println("You entered invalid number,number should be pressed 1,2,3");
        }
        System.out.println("Have a nice day");
    }

}
