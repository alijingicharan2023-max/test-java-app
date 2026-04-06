public class App {

    public String registerUser(String username, String email, String password) {

        if (username == null || username.isEmpty()) {
            return "Username cannot be empty";
        }

        if (email == null || !email.contains("@")) {
            return "Invalid email format";
        }

        if (password == null || password.length() < 6) {
            return "Password must be at least 6 characters";
        }

        return "User registered successfully";
    }

    public static void main(String[] args) {
        App app = new App();

        String result = app.registerUser("Charan", "charan@gmail.com", "123456");
        System.out.println(result);
    }
}