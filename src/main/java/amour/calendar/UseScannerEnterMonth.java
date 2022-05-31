package amour.calendar;

import java.util.Scanner;

public class UseScannerEnterMonth {

    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int maxDaysOfMonth(int month) {
        return MAX_DAYS[month + 1];
    }

    public static void main(String[] args) {

        UseScannerEnterMonth dayMethod = new UseScannerEnterMonth();

        Scanner sc = new Scanner(System.in);
        System.out.println("달을 입력하세요.");
        int month = sc.nextInt();

        System.out.printf("%d월은 %d일까지 있습니다." , month, dayMethod.maxDaysOfMonth(month) );


//        //배열에 달을 가지고 있는 날짜 저장하기
//        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        int month;
//
//        //입력하기
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("달을 입력하세요.");
//        month = sc.nextInt();
//
//        System.out.printf("%d 월은 %d 일까지 있습니다." , month, days[month + 1] );

    }
}


