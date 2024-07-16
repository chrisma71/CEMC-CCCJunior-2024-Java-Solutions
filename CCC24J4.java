// 3 of 15 part marks received

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pressed = scanner.nextLine();
        String displayed = scanner.nextLine();

        char sillyKey = '-';
        char quietKey = '-';
        char wrongLetter = '-';

        StringBuilder expectedDisplayed = new StringBuilder();

        for (int i = 0, j = 0; i < pressed.length(); i++) {
            char currentPressed = pressed.charAt(i);
            if (j < displayed.length() && currentPressed == displayed.charAt(j)) {
                expectedDisplayed.append(currentPressed);
                j++;
            } else if (j < displayed.length()) {
       
                sillyKey = currentPressed;
                wrongLetter = displayed.charAt(j);
                expectedDisplayed.append(wrongLetter);
                j++;
            } else {
                quietKey = currentPressed;
                break; 
            }
        }

        if (expectedDisplayed.length() < displayed.length()) {
            for (int i = 0; i < displayed.length(); i++) {
                if (expectedDisplayed.charAt(i) != displayed.charAt(i)) {
                    quietKey = pressed.charAt(i);
                    break;
                }
            }
        }

        System.out.println(sillyKey + " " + wrongLetter);
        System.out.println(quietKey == '-' ? "-" : quietKey);
    }
}
