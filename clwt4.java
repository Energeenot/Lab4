package Lab4;

import java.util.Scanner;

public class clwt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String phrase = scanner.nextLine();
        String ph;
        String ph1;
        String ph2;
        int sered;
        if (phrase.contains("ku-ku")){
            System.out.println(phrase.lastIndexOf("ku-ku"));
        }
        else {
            if (phrase.length() % 2 != 0){
                sered = (phrase.length() + 1) / 2;
            }
            else{
                sered = phrase.length() / 2;
            }
            ph = phrase.substring(0, sered);
            ph1 = phrase.substring(sered, phrase.length());
            ph2 = "ku-kuku-kuku-ku";
            phrase = phrase.join(" ", ph, ph2, ph1);
            System.out.println(phrase);
        }
    }
}