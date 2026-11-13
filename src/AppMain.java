import exception.InputValidation;

import java.util.Scanner;

public class AppMain {
    static void main(String[] args) {
        InputValidation validation = new InputValidation();
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        validation.nameCheck(name);
    }
}
