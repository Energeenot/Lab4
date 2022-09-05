package Lab4;

import java.util.Scanner;

public class clwt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String phrase = scanner.nextLine();
        phrase = phrase.toLowerCase();
        phrase = phrase.replace(" ", "");
        String ispalindrom = "";
        for (int i = 0; i < phrase.length(); i++){
            if (phrase.charAt(i) != phrase.charAt(phrase.length() - i - 1)){
                ispalindrom = "Это не палиндром";
            }
            else {ispalindrom = "Это палиндром";}
        }
        System.out.println(ispalindrom);
        System.out.println(phrase.length());


    }
}
