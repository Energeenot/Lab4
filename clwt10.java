package Lab4;

import java.util.Scanner;

public class clwt10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String phrase = scanner.nextLine();
        int start = 0;
        int end = 0;
        for (int i = 0; i < phrase.length(); i++){
            if (phrase.charAt(i) == '('){
                start = i;
            }
            if (phrase.charAt(i) == ')'){
                end = i;
            }
        }
        phrase = phrase.replaceAll("\\([^()]*\\)", "");
        System.out.println(phrase);
    }
}
