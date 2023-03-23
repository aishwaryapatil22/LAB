import java.util.Scanner;

public class IntegerChecker {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter an integer: ");
      int number = scanner.nextInt();

      if (number > 0) {
         System.out.println(number + " is positive.");
      } else if (number < 0) {
         System.out.println(number + " is negative.");
      } else {
         System.out.println(number + " is zero.");
      }

      scanner.close();
   }
}
