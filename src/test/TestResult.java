package test;

import domain.Exercise;
import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number: ");
        int number = scanner.nextInt();
        System.out.println("Is "+ number +" an Armstrong number? " + Exercise.Armstrong(number));
        

    }
}
