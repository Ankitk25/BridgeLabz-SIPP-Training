
interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 && password.matches(".*[0-9].*") && password.matches(".*[A-Z].*");
    }
}

public class SecurityTest {
    public static void main(String[] args) {
        String pass = "StrongPass1";
        System.out.println("Password strong? " + SecurityUtils.isStrongPassword(pass));
    }
}
