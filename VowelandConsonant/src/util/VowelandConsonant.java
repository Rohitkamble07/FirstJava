import java.util.Scanner;

public class VowelandConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet to check if it is a vowel or a consonant: ");
        char alphabet = sc.next().charAt(0);
        checkVowelOrConsonant(alphabet);
    }

    static void checkVowelOrConsonant(char alphabet){
        String isVowelOrConsonant;
        switch(Character.toLowerCase(alphabet)) {
            case 'a', 'e', 'i', 'o', 'u' -> isVowelOrConsonant = "vowel";
            default -> isVowelOrConsonant = "consonant";
        }
        System.out.println(isVowelOrConsonant);
    }
}

