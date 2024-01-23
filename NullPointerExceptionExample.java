package pboooo;

public class NullPointerExceptionExample {
     public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length(); // Akses panjang string yang null akan menyebabkan NullPointerException
            System.out.println("Length of string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Error: NullPointerException - Akses objek null.");
        }
    }
}
