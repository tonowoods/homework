package amour.calendar;

public class MyAnswer {
    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapTrue(int year) {
        if ( year % 4 == 0 && ( year % 100 != 0 || year % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }


    public int maxDaysOfMonth(int year, int month) {
        if(isLeapTrue(year)) {
            return LEAP_MAX_DAYS[month -1];
        } else {
            return MAX_DAYS[month - 1];
        }
    }


    // 캘린더
    public void printCal(int year , int month, String day) {
        System.out.printf("   <<    %4d년 %3d월     >>\n", year, month);
        System.out.println("-------------------------------");
        System.out.print("  MO  TU  WE  TH  FR  SA  SU\n");

        int maxDays = maxDaysOfMonth(year, month);
        String empty = "    ";

        for (int i = 1; i <= maxDays; i++) {
            // 월요일
            if (day.equals("MO")) {
                System.out.printf("%4d", i);

                if ( i % 7 == 0) {
                    System.out.println();
                }
            }
            // 화요일
            if (day.equals("TU")) {
                if (i == 1) {
                    System.out.print(empty);
                    System.out.printf("%4d", i);
                    i++;
                }

                System.out.printf("%4d", i);

                if ( i % 7 == 6 ) {
                    System.out.println();
                }
            }
            // 수요일
            if (day.equals("WE")) {
                if (i == 1) {
                    System.out.print(empty);
                    System.out.print(empty);
                    System.out.printf("%4d", i);
                    i++;
                }

                System.out.printf("%4d", i);

                if (i % 7 == 5) {
                    System.out.println();
                }
            }
            // 목요일
            if (day.equals("TH")) {
                if (i == 1) {
                    System.out.print(empty);
                    System.out.print(empty);
                    System.out.print(empty);
                    System.out.printf("%4d", i);
                    i++;
                }

                System.out.printf("%4d", i);

                if (i % 7 == 4) {
                    System.out.println();
                }
            }
            // 금요일
            if (day.equals("FR")) {
                if (i == 1) {
                    System.out.print(empty);
                    System.out.print(empty);
                    System.out.print(empty);
                    System.out.print(empty);
                    System.out.printf("%4d", i);
                    i++;
                }

                System.out.printf("%4d", i);

                if (i % 7 == 3 ) {
                    System.out.println();
                }
            }
            // 토요일
            if (day.equals("SA")) {
                if (i == 1) {
                    System.out.print(empty);
                    System.out.print(empty);
                    System.out.print(empty);
                    System.out.print(empty);
                    System.out.print(empty);
                    System.out.printf("%4d", i);
                    i++;
                }

                System.out.printf("%4d", i);

                if (i % 7 == 2) {
                    System.out.println();
                }
            }
            // 토요일
            if (day.equals("SU")) {
                if (i == 1) {
                    System.out.print(empty);
                    System.out.print(empty);
                    System.out.print(empty);
                    System.out.print(empty);
                    System.out.print(empty);
                    System.out.print(empty);
                    System.out.printf("%4d", i);
                    i++;
                    System.out.println();
                }

                System.out.printf("%4d", i);

                if ( i % 7 == 1 ) {
                    System.out.println();
                }
            }
        }
    }

/*  내가 한것.
        for (int i = 1; i <= maxDays; i++) {
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
        System.out.println();*/





    public static void main(String[] args) {


    }

}
