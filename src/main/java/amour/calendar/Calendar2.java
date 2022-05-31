package amour.calendar;

import java.util.Scanner;

public class Calendar2 {

    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int maxDaysOfMonth(int month) {
        return MAX_DAYS[month - 1];
    }

    public static void main(String[] args) {

        Calendar2 dayMethod = new Calendar2();

        Scanner sc = new Scanner(System.in);
        System.out.println("반복 횟수를 입력해주세요.");
        int num = sc.nextInt();
        int[] month = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("달을 입력하세요.");
            month[i] = sc.nextInt();
            if ( month[i] > 12 || month[i] <= 0 ){
                System.out.println("입력된 값이 잘못되었습니다. 다시 입력해주세요.");
                i--;
            }
        }
        for (int i : month) {
            System.out.printf("%d월은 %d일까지 있습니다.", i, dayMethod.maxDaysOfMonth(i));
            System.out.println();
        }

        System.out.println("Bye~");
        sc.close();
    }

}


