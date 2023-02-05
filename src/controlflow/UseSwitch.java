package controlflow;

public class UseSwitch {
    public static void main(String[] args) {
        dayOftheWeek(7);
        nameofDay("Monday");

    }

    public static void dayOftheWeek(int daynum) {

        switch (daynum) {
            case 1:
                System.out.println(" Today is Monday");
                break;
            case 2:
                System.out.println(" Today is Tuesday");
                break;
            case 3:
                System.out.println(" Today is Wednesday");
                break;
            case 4:
                System.out.println(" Today is Thursday");
                break;
            case 5:
                System.out.println(" Today is Friday");
                break;
            case 6:
                System.out.println(" Today is Saturday");
                break;
            case 7:
                System.out.println(" Today is Sunday");
                break;
            default:
                System.out.println("No Valid number, please try with a valid number again!");
        }
    }

    public static void nameofDay(String nameOfDay) {
        switch (nameOfDay) {
            case "Monday":
                System.out.println("Today is the 1st day of the week");
                break;
            case "Tuesday":
                System.out.println("Today is the 2nd day of the week");
                break;
            case "Wednesday":
                System.out.println("Today is the 3rd day of the week");
                break;
            case "Thursday":
                System.out.println("Today is the 4th day of the week");
                break;
            case "Friday":
                System.out.println("Today is the 5th day of the week");
                break;
            case "Saturday":
                System.out.println("Today is the 6th day of the week");
                break;
            case "Sunday":
                System.out.println("Today is the 7th day of the week");
                break;
            default:
                System.out.println("Not a valid day Name");
        }
    }
}
