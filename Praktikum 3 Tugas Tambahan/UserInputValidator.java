import java.util.regex.*;

public class UserInputValidator {
    public static void validateUsername(String username) {
        // Persyaratan untuk username: minimal 5 karakter, maksimal 20 karakter,
        // hanya huruf, angka, dan underscore (_), harus diawali dengan huruf
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,19}$";
        if (!Pattern.matches(regex, username)) {
            throw new IllegalArgumentException("Invalid username format!");
        }
    }

    public static void validateEmail(String email) {
        // Persyaratan untuk email: harus berbentuk email yang valid
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (!Pattern.matches(regex, email)) {
            throw new IllegalArgumentException("Invalid email format!");
        }
    }

    public static void validateAge(int age) {
        // Persyaratan untuk usia: di antara 17 tahun hingga 99 tahun
        if (age < 17 || age > 99) {
            throw new IllegalArgumentException("Age must be between 17 and 99!");
        }
    }
}
