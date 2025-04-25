import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a number: ");

        int x = 0;

        int count = 0;

        while (x != 10) {
            System.out.println("Type 10...");
            System.out.println("Type a number: ");
            x = sc.nextInt();
            count++;
        }
        System.out.println("You tried " + count + " times");

//        do {
//            System.out.println("Type a number: ");
//            x = sc.nextInt();
//        } while (x != 10);

//        int x = 0;
//
//        while (x <= 10) {
//            x += 1;
//
//        }
    }
}
