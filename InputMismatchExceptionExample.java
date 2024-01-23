package pboooo;

import java.util.Scanner;

public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan angka: ");
            int number = scanner.nextInt(); // Membaca input yang bukan angka akan menyebabkan InputMismatchException
            System.out.println("Angka yang dimasukkan: " + number);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: InputMismatchException - Input tidak sesuai dengan tipe yang diharapkan.");
        }
    }
}
