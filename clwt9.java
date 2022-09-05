package Lab4;

import java.util.Scanner;

public class clwt9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String phrase1 = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String phrase2 = scanner.nextLine();
        char[] inChar = phrase1.toCharArray();
        String countS = "";
        for (char c : inChar) {
            countS += c;
        }
        for (int i = 0; i < countS.length(); i++) {
            for (int j = 0; j < phrase2.length(); j++) {
                if (phrase2.charAt(j) == countS.charAt(i)) {
                    phrase2 = phrase2.replaceAll(String.valueOf(countS.charAt(i)), "");
                }
            }
        }
        System.out.println(phrase2);
    }
}
