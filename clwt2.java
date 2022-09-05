package Lab4;

import java.util.Scanner;

public class clwt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String phrase = scanner.nextLine();
        String ph;
        int index;
        System.out.println("Введите подпункт, который нужно выполнить");
        String letter = scanner.nextLine();
        switch (letter){
            case "a":
                ph = phrase.replaceAll("1", "5").replace("a", "A").replace("f", "F").replace("g", "G");
                System.out.println(ph);
                break;
            case "b":
                ph = phrase.replace("min", "max");
                System.out.println(ph);
                break;
            case "c":
                ph = phrase.replace("ku-ku", "");
                System.out.println(ph);
                break;
            case "d":
                index = phrase.indexOf("Вася");
                //ph = phrase.substring(index);
                ph = phrase.substring(0, index);
                System.out.println(ph + " Вася");
                break;
            case "e":
                ph = phrase.replaceAll(".", "$0$0"); // . - любой символ, $0$0 - ссылается на совпадающий символ 2 раза
                System.out.println(ph);
        }
    }
}
