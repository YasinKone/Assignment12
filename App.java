import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String password;

        System.out.print("Enter a password: ");
        password = scanner.nextLine();

        if(isValid(password)){
            System.out.println("Valid Password");
        }

        else{
            System.out.println("Password Invalid");
        }

        scanner.close();

    }

    public static boolean isValid(String password){
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        boolean validLength = true;
        int valid = 0;
        
        if(password.length() < 8 || password.length() > 16){
            validLength = false;
        }

        for(int i = 0; i < password.length(); i++){
            char letter = password.charAt(i);

            if(Character.isUpperCase(letter)){
                hasUpperCase = true;
            }
           
            else if(Character.isLowerCase(letter)){
                hasLowerCase = true;
            }

            else if(Character.isDigit(letter)){
                hasDigit = true;
            }

            else if(letter == ' '){
                valid--;
            }
            
            else{
                hasSpecialChar= true;
            }

        }

        if(hasUpperCase){
            valid++;
        }

        if(hasLowerCase){
            valid++;
        }

        if(hasDigit){
            valid++;
        }

        if(hasSpecialChar){
            valid++;
        }

        if(validLength && valid >= 3){
            return true;
        }

        else{
            return false;
        }
    }
}
