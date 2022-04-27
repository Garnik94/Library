package service;

public class UserValidatorService {

    private static boolean isLoginMode = false;

    public static boolean isLoginMode() {
        return isLoginMode;
    }

    public static void setLoginMode(boolean loginMode) {
        isLoginMode = loginMode;
    }

    public static void validateUser(String username, String password) {
        isLoginMode = (username.equals("admin") && password.equals("1234")) ||
                (username.equals("systemUser") && password.equals("1234"));
    }
}
