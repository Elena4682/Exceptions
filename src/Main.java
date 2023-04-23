public class Main {
    public static void main(String[] args) {
        try {
            check(" login ", " pass ", " pass1");
        }catch (WrongLoginException | WrongPasswordException e){
            throw new RuntimeException(e);
        }finally {
            System.out.println(" Логин выполнен");
        }

    }
    public static void check(String login,String password,String confirmPassword){
        if (!login.matches (" [a-zA-Z0-9_]+")){
            throw new WrongLoginException();
        }
        if (login.length() > 20) {
            throw new WrongLoginException();
        }
        if (!password.matches (" [a-zA-Z0-9_]+")) {
            throw new WrongPasswordException();
        }
        if (password.length() >= 20 || !password.equals(confirmPassword)){
            throw new WrongPasswordException ();
        }
    }
}
