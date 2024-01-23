package pboooo;

public class IllegalArgumentExceptionExample {
     public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("Umur tidak boleh negatif");
            }
            System.out.println("Umur: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: IllegalArgumentException - " + e.getMessage());
        }
    }
}
