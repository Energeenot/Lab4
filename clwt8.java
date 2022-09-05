package Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class clwt8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String phrase = scanner.nextLine();
        int index = 100000000;
        String[] words = phrase.split(" ");
        String[] arr = new String[3];
        for (int i = 0; i < words.length; i++){
            if (words[i].equals("Миша")){
                index = i;
            }
            if (i < index){
                arr[i] = words[i];
            }
        }
        for (int i = 0; i < index; i++){
            arr[i] = words[i];
        }
        Arrays.sort(arr);
        for (String word : arr) {
            System.out.println(word);
        }
    }
}