package Lab4;

import java.util.Scanner;

public class clwt12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String phrase = scanner.nextLine();
        String[] num = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int result = 0;
        for(int i = 0; i < phrase.length(); i++){
            for (int j = 0; j < num.length; j++)
            while (phrase.startsWith(num[j])){
                result += val[j];
                phrase = phrase.substring(num[j].length());
            }
        }
        System.out.println(result);
    }
}
