public class RegistrationClass {
    String login;
    String password;
    String confirmPassword;

    public RegistrationClass(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static void registration(String login, String password, String confirmPassword) throws LoginException, PasswordException {


        if (login.length() > 20) {
            throw new LoginException("Ошибка! Слишком длинный логин");
        }
        if (!login.matches("[a-zA-Z0-9_]+")) {
            throw new LoginException("В логине присутствуют недопустимые символы");
        }
        if (password.length() >= 20) {
            throw new PasswordException("Ошибка! Слишком длинный пароль");
        }
        if (!password.matches("[a-zA-Z0-9_]+")) {
            throw new PasswordException("В пароле присутствуют недопустимые символы");
        }
        if (!password.equals(confirmPassword)) {
            throw new PasswordException("Ошибка! Пароли не совпадают");
        }
    }
}
