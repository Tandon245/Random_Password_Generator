# Random Password Generator

This Java program generates random passwords with a specified length, ensuring a mix of lowercase letters, uppercase letters, digits, and special characters.

## Features

- Generates random passwords with specified length.
- Ensures each generated password contains at least one of each character type: lowercase, uppercase, digit, and special character.
- Uses <a href="https://docs.oracle.com/javase/8/docs/api/java/security/SecureRandom.html">`SecureRandom`</a>  for cryptographically strong random number generation.
- Shuffles the characters in the password for better randomness.
- Customizable password length.

## Technologies Used

- Java
- `SecureRandom` for random number generation

## Usage

1. Clone the repository or download the Java file (`Main.java`).

2. Compile and run the Java program:

   ```shell
   javac Main.java
   java Main
Set the desired password length by modifying the `passWordLength` variable in the `Main` class's `main` method.
Enjoy your securely generated random password!
