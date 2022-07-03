package task1;

import java.util.Scanner;

public class usul_2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int ans = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (scanner.nextInt() == 1)
                    ans = (Math.abs(3 - i) + Math.abs(3 - j));
            }
        }

        System.out.println("Eng qisqa yo'l: " + ans);
    }
}