import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to the FizzBuzz");

        System.out.println("Enter your array length ");
        int arrLlength = input.nextInt();
        int counter = 0;
        int[] fizzBuzzNumber = new int[arrLlength];
        System.out.println("Enter "+arrLlength+" numbers ");
        while (counter < arrLlength) {
            fizzBuzzNumber[counter] = input.nextInt();
            counter++;
        }
        for (int i = 0; i < fizzBuzzNumber.length; i++) {
            if ((fizzBuzzNumber[i] % 3 == 0 && fizzBuzzNumber[i] % 5 == 0)) {
                System.out.println("The number " + fizzBuzzNumber[i] + " fizz buzz");
            } else if (fizzBuzzNumber[i] % 3 == 0) {
                System.out.println("The number " + fizzBuzzNumber[i] + " fizz");
            } else if (fizzBuzzNumber[i] % 5 == 0) {
                System.out.println("The number " + fizzBuzzNumber[i] + " buzz");
            } else {
                System.out.println("The number is :" + fizzBuzzNumber[i]);
            }
        }

    }
}
