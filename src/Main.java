import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_+=<>?";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the length of the Password ");
        int passWordLength = sc.nextInt();
        String randomPassword = randomPasswordGenerator(passWordLength);
        System.out.println("Random Password: " + randomPassword);
    }

    private static String randomPasswordGenerator(int passWordLength) {
        SecureRandom random = new SecureRandom();
        char[] password = new char[passWordLength];


        // Make sure the password contains at least one of each character type

        password[0] = LOWERCASE.charAt(random.nextInt(LOWERCASE.length()));
        password[1] = UPPERCASE.charAt(random.nextInt(UPPERCASE.length()));
        password[2] = DIGITS.charAt(random.nextInt(DIGITS.length()));
        password[3] = SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length()));

        // Fill the rest of the password with random characters

        String allCharacters = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARACTERS;

        for (int i = 4; i < passWordLength; i++) {
            password[i] = allCharacters.charAt(random.nextInt(allCharacters.length()));
        }


        // Shuffle the characters in the password for better randomness
        for (int i = 0; i < passWordLength; i++) {
            int randomIndex = random.nextInt(passWordLength);
            char temp = password[i];
            password[i] = password[randomIndex];
            password[randomIndex] = temp;
        }

        return new String(password);


    }
}