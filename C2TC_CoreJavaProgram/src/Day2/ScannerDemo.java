package Day2;

import java.util.Scanner;

public class ScannerDemo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // java.util.Scanner
        System.out.println("Enter your name:");
        String n = input.nextLine();
        System.out.println("Hello " + n);
    }
}
