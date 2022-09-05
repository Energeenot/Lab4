package Lab4;

import java.util.Scanner;

public class clwt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String phrase = scanner.nextLine();
        int count = 0;
        int min = 1000000000;
        String minS = "";
        int max = -1000;
        String maxS = "";
        System.out.println("Введите подпункт, который нужно выполнить");
        String letter = scanner.nextLine();
        switch (letter){
            case "a":
                phrase = phrase.replaceAll("\\s+", " ");
                String[] words = phrase.split(" ");
                for (String word : words){
                    count++;
                }
                System.out.println(count);
                break;
            case "b":
                phrase = phrase.replaceAll("\\s+", " ");
                String[] wordis = phrase.split(" ");
                for(String word : wordis){
                    if (word.length() < min){
                        minS = word;
                    }
                    if (word.length() > max){
                        maxS = word;
                    }
                }
                System.out.println(minS + " " + maxS);
        }
    }
}
