package by.tms.lesson21.calculator.consol;

import java.util.Scanner;

public class ConsoleReader {
    private final Scanner scanner = new Scanner(System.in);

    public String readOperationType() {
        return scanner.next();
    }
    public double readNum() {
        return scanner.nextDouble();
    }
}
