import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please add the first whole number you would like to add.");
    int num1 = keyboard.nextInt();

    System.out.println("Please add the second whole number you would like to add.");
    int num2 = keyboard.nextInt();

    System.out.println("Please add the third whole number you would like to add.");
    int num3 = keyboard.nextInt();

    System.out.println("Please add the first decimal number you would like to add.");
    double dub1 = keyboard.nextDouble();

    System.out.println("Please add the second decimal number you would like to add.");
    double dub2 = keyboard.nextDouble();

    System.out.println("Please add the third decimal number you would like to add.");
    double dub3 = keyboard.nextDouble();

    int intSum = num1 + num2 + num3;
    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + intSum);

    double dubSum = dub1 + dub2 + dub3;
    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + dubSum);


    //TODO prompt the user to get input for all of the above int variables.

    //TODO prompt the user to get input for all of the above double variables.

    //TODO print the three ints and their sum.

    //TODO print the three doubles and their sum.

  }
}
