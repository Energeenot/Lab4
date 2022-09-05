package Lab4;

import java.util.Scanner;

public class clwt11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Введите строку");
        String phrase = scanner.nextLine();
        for (int i = 0; i < phrase.length(); i++){
            if (phrase.charAt(i) == '('){
                count++;
            }
            if (phrase.charAt(i) == ')'){
                count--;
            }
        }
        if (count != 0){
            System.out.println("Нет баланса");
        }
        else {
            System.out.println("Есть баланс");
        }
    }
}
