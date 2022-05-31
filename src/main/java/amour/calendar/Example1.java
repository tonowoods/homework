package amour.calendar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Example1 {

    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int maxDaysOfMonth(int month) {
        return MAX_DAYS[month - 1];
    }

    public static void main(String[] args) {
        //객체 생성
        Example1 ex = new Example1();
        Scanner scanner = new Scanner(System.in);

        //질문
        System.out.println("첫 요일은 무엇입니까? (MO ,TU, WE, TH, FR, SA, SU)");
        System.out.print("WEEK > ");
        String day = scanner.nextLine();

//        String empty = "    ";
//
//        for (int i = 1; i <= 31; i++) {
//            // 월요일
//            if (day.equals("MO")) {
//                System.out.printf("%4d", i);
//
//                if ( i % 7 == 0) {
//                    System.out.println();
//                }
//            }
//            // 화요일
//            if (day.equals("TU")) {
//                if (i == 1) {
//                    System.out.print(empty);
//                    System.out.printf("%4d", i);
//                    i++;
//                }
//
//                System.out.printf("%4d", i);
//
//                if (i == 6 || i == 13 || i == 20 || i == 27 ) {
//                    System.out.println();
//                }
//            }
//            // 수요일
//            if (day.equals("WE")) {
//                if (i == 1) {
//                    System.out.print(empty);
//                    System.out.print(empty);
//                    System.out.printf("%4d", i);
//                    i++;
//                }
//
//                System.out.printf("%4d", i);
//
//                if (i == 5 || i == 12 || i == 19 || i == 26 ) {
//                    System.out.println();
//                }
//            }
//            // 목요일
//            if (day.equals("TH")) {
//                if (i == 1) {
//                    System.out.print(empty);
//                    System.out.print(empty);
//                    System.out.print(empty);
//                    System.out.printf("%4d", i);
//                    i++;
//                }
//
//                System.out.printf("%4d", i);
//
//                if (i == 4 || i == 11 || i == 18 || i == 25 ) {
//                    System.out.println();
//                }
//            }
//            // 금요일
//            if (day.equals("FR")) {
//                if (i == 1) {
//                    System.out.print(empty);
//                    System.out.print(empty);
//                    System.out.print(empty);
//                    System.out.print(empty);
//                    System.out.printf("%4d", i);
//                    i++;
//                }
//
//                System.out.printf("%4d", i);
//
//                if (i == 3 || i == 10 || i == 17 || i == 24 ) {
//                    System.out.println();
//                }
//            }
//            // 토요일
//            if (day.equals("SA")) {
//                if (i == 1) {
//                    System.out.print(empty);
//                    System.out.print(empty);
//                    System.out.print(empty);
//                    System.out.print(empty);
//                    System.out.print(empty);
//                    System.out.printf("%4d", i);
//                    i++;
//                }
//
//                System.out.printf("%4d", i);
//
//                if (i == 2 || i == 9 || i == 16 || i == 23 || i == 30 ) {
//                    System.out.println();
//                }
//            }
//            // 토요일
//            if (day.equals("SU")) {
//                if (i == 1) {
//                    System.out.print(empty);
//                    System.out.print(empty);
//                    System.out.print(empty);
//                    System.out.print(empty);
//                    System.out.print(empty);
//                    System.out.print(empty);
//                    System.out.printf("%4d", i);
//                    System.out.println();
//                    i++;
//                }
//
//                System.out.printf("%4d", i);
//
//                if ( i == 8 || i == 15 || i == 22 || i == 29 ) {
//                    System.out.println();
//                }
//            }
//
//
//        }
    }
}
