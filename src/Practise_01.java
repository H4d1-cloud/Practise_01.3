import java.util.Scanner;

public class Practise_01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange användarnamn:  ");
        String username = scanner.nextLine();

        System.out.println("Ange lösenord:  ");
        String password = scanner.nextLine();

        if (username.equals("noname") & password.equals("password")){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong username or password");
        }
    }
}
