package pboooo;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 5 / 0; // Pembagian dengan nol akan menyebabkan ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: ArithmeticException - Pembagian dengan nol tidak diizinkan.");
        }
    }
}
