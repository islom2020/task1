package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] differences = new char[26];

        String[][] samples = {
                {"robocontest", "slcldlkepte"},
                {"dasturchi", "ottefsdef"},
                {"shifrlash", "tefysatte"},
                {"abc", "tcd"},
                {"hello", "epaal"},

        };

        for (String[] strings : samples){
            String str1 = strings[0];
            String str2 = strings[1];

            for (int i = 0; i < str1.length(); i++) {
                differences[str1.charAt(i) - 'a'] = str2.charAt(i);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("satrni kiriting: ");
        String input = scanner.nextLine();
        StringBuilder output = new StringBuilder("");

        for (char ch : input.toCharArray())
            output.append(differences[ch - 'a']);

        System.out.println("Natija: " + output);
    }
}
