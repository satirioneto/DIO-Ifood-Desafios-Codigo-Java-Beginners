import java.util.Scanner;

public class FizzBuzz {
    public static void fizzBuzz () {
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        int div3 = num % 3;
        int div5 = num % 5;

        if (div3 == 0 && div5 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (div3 == 0) {
            System.out.println("Fizz");
        }
        else if (div5 == 0) {
            System.out.println("Buzz");
        } else
            System.out.println(num);
    }
}
