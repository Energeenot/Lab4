package Lab4;

import java.util.Scanner;

public class clwt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String phrase = scanner.nextLine();
        int count = 0;
        int maxc = 0;
        for (int i = 0; i < phrase.length(); i++){
            if (phrase.charAt(i) == ' '){
                count+=1;
                if (maxc < count){
                    maxc = count;
                }
            }
            else {
                count = 0;
            }
        }
        System.out.println("максимальное количество пробелов " + maxc);
        System.out.println(phrase.replaceAll("\\s+", " "));
    }
}
