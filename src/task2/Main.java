package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("N ni kiriting: ");
        n = scanner.nextInt();

        if (n < 1) System.out.println("Noto'g'ri raqam kiritildi");
        else if (n < 5) System.out.println("1 dan " + n + " gacha tub sonlar ko'paytmasi nol bilan tugamaydi");
        else System.out.println("1 dan " + n + " gacha tub sonlar ko'paytmasi 1 ta no'l bilan tugaydi");

        /** Izoh:
         * nol hosil bo'lishi uchun 2 va 5 ning ishtiroki kerak bo'ladi.
         * barcha tub sonlar ichida bitta 2 va bitta 5 raqami bor.
         * 2 yoki 5 ga bo'linadigan boshqa tub son yo'q.
         * demak agar n soni 5 dan katta bo'lsa, har doim natija 1 ga teng bo'ladi.
         */

    }
}
