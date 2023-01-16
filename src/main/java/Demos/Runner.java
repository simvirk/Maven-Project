package Demos;

import Demos.PhoneChecker;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneChecker phonechecker = new PhoneChecker();
        System.out.println("Key in Phone");
        String phone = scanner.nextLine();

        String out = phonechecker.testPhone(phone)?"Valid Phone": "Invalid Phone";
        System.out.println(out);
    }
}
