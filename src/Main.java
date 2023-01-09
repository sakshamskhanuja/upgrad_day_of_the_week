import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the input.
        Scanner scanner = new Scanner(System.in);

        // Stores the month.
        String month = scanner.nextLine();

        // Stores the date.
        int date = scanner.nextInt();

        // Stores the day.
        int day = 0;

        // Checks the month.
        switch (month) {
            case "January":
                day = date;
                break;

            case "Febuary":
                day = 31 + date;
                break;

            case "March":
                day = 31 + 28 + date;
                break;

            case "April":
                day = 31 + 28 + 31 + date;
                break;

            case "May":
                day = 31 + 28 + 31 + 30 + date;
                break;

            case "June":
                day = 31 + 28 + 31 + 30 + 31 + date;
                break;

            case "July":
                day = 31 + 28 + 31 + 30 + 31 + 30 + date;
                break;

            case "August":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + date;
                break;

            case "September":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + date;
                break;

            case "October":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + date;
                break;

            case "November":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + date;
                break;

            case "December":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + date;
                break;
        }

        // Checks if it's a weekend.
        int weekday = day % 7;
        if (weekday > 5) {
            System.out.println("Hurray!");
        } else {
            System.out.println("Ohhh! It's a workday :|");
        }

        scanner.close();
    }
}