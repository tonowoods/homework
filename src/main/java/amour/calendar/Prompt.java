package amour.calendar;

import java.util.Scanner;

public class Prompt {
    public void runPrompt() {
        Scanner sc = new Scanner(System.in);
        MyAnswer dayMethod = new MyAnswer();

        while(true) {

            System.out.println("연도를 입력하세요. ");
            System.out.print("YEAR > ");
            int year = sc.nextInt();

            // 달 입력
            System.out.println("달을 입력하세요. ");
            System.out.print("MONTH > ");
            int month = sc.nextInt();
            //-1 입력하거나 12 이상 입력하면 종료.
            if (month > 12 || month <= 0){
                break;
            }

            // 달의 첫 요일을 입력하세요.
            System.out.println("첫 요일은 무엇입니까? (MO ,TU, WE, TH, FR, SA, SU)");
            System.out.print("WEEK > ");
            String day = sc.next();

            System.out.println();

            dayMethod.printCal( year, month, day );
            System.out.println();
        }

        System.out.println("Bye~");
        sc.close();
    }

    public static void main(String[] args) {

        // 셀 실행
        Prompt p = new Prompt();
        p.runPrompt();

    }

}
