import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Wort eingeben.");
        String word = scanner.nextLine();

        char[] wordArray = word.toCharArray();
        String hidden = "*".repeat(word.length());
        System.out.println(hidden);
        int fail = 0;


        while (!hidden.equals(word) /*|| fail == 12*/) {
            if (fail == 12) {
                break;
            }
            char[] hiddenArray = hidden.toCharArray();
            System.out.println("Bitte Buchstaben eingeben.");
            char letter = scanner.next().charAt(0);

            if (word.contains(String.valueOf(letter))) {
                for (int w = 0; w < wordArray.length; w++) {
                    if (wordArray[w] == letter) {
                        hiddenArray[w] = letter;
                    }
                }
                hidden = new String(hiddenArray);
                System.out.println(hidden);

            } else {
                fail++;
                switch (fail) {
                    case 1 -> System.out.printf("%n %n %n %n %n %n %n __ __%n");
                    case 2 -> System.out.printf("%n %n %n %n %n %n   |  %n __|__%n");
                    case 3 -> System.out.printf("%n %n %n %n   |  %n   |  %n   |  %n __|__%n");
                    case 4 -> System.out.printf("%n %n   |  %n   |  %n   |  %n   |  %n   |  %n __|__%n");
                    case 5 -> System.out.printf("%n   |/  %n   |  %n   |  %n   |  %n   |  %n   |  %n __|__%n");
                    case 6 -> System.out.printf("   ____   %n   |/  %n   |  %n   |  %n   |  %n   |  %n   |  %n __|__%n");
                    case 7 -> System.out.printf("   ___ ___%n   |/  %n   |  %n   |  %n   |  %n   |  %n   |  %n __|__%n");
                    case 8 -> System.out.printf("   ___ ___%n   |/     |  %n   |  %n   |  %n   |  %n   |  %n   |  %n __|__%n");
                    case 9 -> System.out.printf("   ___ ___%n   |/     | %n   |     (_)%n   |  %n   |  %n   |  %n   |  %n __|__%n");
                    case 10 -> System.out.printf("   ___ ___%n   |/     | %n   |     (_)%n   |     \\|/%n   |  %n   |  %n   |  %n __|__%n");
                    case 11 -> System.out.printf("   ___ ___%n   |/     | %n   |     (_)%n   |     \\|/%n   |      | %n   |  %n   |  %n __|__%n");
                    case 12 -> System.out.printf("   ___ ___%n   |/     | %n   |     (_)%n   |     \\|/%n   |      | %n   |     / \\%n   |  %n __|__%n Game over");
                }
            }
        }
    }
}
