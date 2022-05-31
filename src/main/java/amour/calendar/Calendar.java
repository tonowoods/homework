package amour.calendar;


public class Calendar {
    public static void main(String[] args) {

        System.out.print("MON TUE WED THU FRI SAT SUN");
        System.out.println();
        System.out.println("---------------------------");

        for (int i = 1; i <= 31; i++) {
            if ( i < 10 ){
                if (i % 7 == 0) {
                    System.out.print(" " + i + "  ");
                    System.out.println();
                } else {
                    System.out.print(" " + i + "  ");
                }
            } else {
                if (i % 7 == 0) {
                    System.out.print(i + "  ");
                    System.out.println();
                } else {
                    System.out.print(i + "  ");
                }
            }
        }

    }
}

// 날짜 배열 얻기
//        int[] date = new int[31];
//
//        for (int i = 0; i < date.length; i++) {
//            date[i] = i + 1;
//        }
//
//        for (int j = 0; j <= date.length - 1; j++) {
//            if (j % 7 == 0) {
//                System.out.print(date[j] + "  ");
//                System.out.println();
//                if ( j == 0 ){
//                    System.out.print(date[j] + "  ");
//                }
//            } else {
//                System.out.print(date[j] + "  ");
//            }
//        }


//        for (int j = 1; j <= 31; j++) {
//            if (j % 7 == 0) {
//                System.out.print(j + "  ");
//                System.out.println();
//            } else {
//                System.out.print(j + "  ");
//            }
//        }

