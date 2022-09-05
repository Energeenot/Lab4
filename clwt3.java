package Lab4;

import java.util.Scanner;

public class clwt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countZ = 0;
        int countz = 0;
        int sum;
        int count= 0;
        int index;
        String countS = "";
        System.out.println("Введите строку");
        String phrase = scanner.nextLine();
        System.out.println("Введите подпункт, который нужно выполнить");
        String letter = scanner.nextLine();
        switch (letter){
            case "a":
                for (int i = 0; i < phrase.length(); i++){
                    if (phrase.charAt(i) == 'z'){
                        countz += 1;
                    }
                    if (phrase.charAt(i) == 'Z'){
                        countZ += 1;
                    }
                }
                sum = countZ + countz;
                System.out.println("Количество z = " + countz + ", количество Z = " + countZ + ", общее количество = " + sum);
                break;
            case "b":
                for (int i = 0; i < phrase.length(); i++) {
                    if (phrase.charAt(i) == '0' || phrase.charAt(i) == '1' || phrase.charAt(i) == '2' || phrase.charAt(i) == '3' || phrase.charAt(i) == '4' || phrase.charAt(i) == '5' || phrase.charAt(i) == '6' || phrase.charAt(i) == '7' || phrase.charAt(i) == '8' || phrase.charAt(i) == '9'){
                        count += 1;
                    }
                }
                System.out.println(count);
                break;
            case "c":
                for (int i = 0; i < phrase.length(); i++){
                    if (Character.isUpperCase(phrase.charAt(i))){
                        count += 1;
                    }
                }
                System.out.println(count);
                break;
            case "d":
                char[] inChar = phrase.toCharArray();
                int[] countA = new int[100];
                for (int i = 0; i < inChar.length; i++){
                    index = countS.indexOf(inChar[i]);
                    if (index >= 0){
                        countA[index]++;
                    }
                    else {
                        countS += inChar[i];
                        countA[countS.length() - 1]++;
                    }
                }
                for (int i = 0; i < countS.length(); i++){
                    System.out.println(countS.charAt(i) + " " + countA[i]);
                }

        }
    }
}
