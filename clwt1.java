package Lab4;

import java.util.Scanner;

public class clwt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сначала имя, потом фамилию, в конце отчество(через энтер)");
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String patronymic = scanner.nextLine();
        String ini;
        char n;
        char s;
        char p;
        System.out.println("Введите подпункт, который нужно выполнить");
        String letter = scanner.nextLine();
        switch (letter){
            case "a":
                System.out.println(surname + " " + name + " " + patronymic);
                break;
            case "b":
                n = name.charAt(0);
                s = surname.charAt(0);
                p = patronymic.charAt(0);
                System.out.println(s + ". " + n + ". " + p + ".");
                break;

            case "c":
                n = name.charAt(0);
                p = patronymic.charAt(0);
                System.out.println(surname + ". " + n + ". " + p + ".");
        }
    }
}
