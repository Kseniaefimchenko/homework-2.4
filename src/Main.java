public class Main {
    public static void main(String[] args) {
        try {
            RegistrationClass.registration("jhhgfdy-", "kjrt/", "kjrt/");
        }catch (LoginException  | PasswordException e){
            System.out.println(e.getMessage());
        }

    }
}