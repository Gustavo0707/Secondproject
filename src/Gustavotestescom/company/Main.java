package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int number1, number2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type some number");
        number1 = scanner.nextInt();

        System.out.println("Type some second number");
        number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("The greater number is " + number1);
        }
        else if (number2 > number1) {
            System.out.println("The greater number is " + number2);
        }
        else if (number1 >= number2){
            System.out.println("The numbers have the same value");
        }

    }
}
