import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month, year;

        while (true) {
            month = sc.nextInt();
            year = sc.nextInt();

            if (month >= 1 && month <= 12 && year >= 0) break;
        }

        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int days;
        switch (month) {
            case 2:
                days = leap ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            default:
                days = 31;
        }

        System.out.println(days);
           sc.close();
    }
}