package amour.calendar;

import java.util.Scanner;

//
//두 수를 입력하세요.
//        5 10 (엔터)
//        두 수의 합은 15입니다.
public class UseScannerExample1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("두 수를 입력해주세요.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        
        System.out.print("두 수의 합은 : " + sum);
        System.out.printf("두 수의 합은 %d 입니다." , sum);

        sc.close();

    }
}
