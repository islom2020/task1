package task1;

import java.util.Scanner;

public class usul_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[7][7];

        // 1 raqamining kordinatasi
        int col = 0, row = 0;

        boolean isValid = false;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                int temp = scanner.nextInt();

                if ((temp == 1 && isValid) || temp < 0 || temp > 1) {
                    System.out.println("Noto'gri raqam kiritildi");
                    return;
                }

                arr[i][j] = temp;

                if (temp == 1) {
                    row = i + 1;
                    col = j + 1;
                    isValid = true;
                }
            }
        }

        if (isValid)
            System.out.println("Eng qisqa yo'l: " + (Math.abs(4 - row) + Math.abs(4 - col)));

    }
}