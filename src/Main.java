public class Main {

    public static void main(String[] args) {
        // int result=
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(2, -2020));
    }


    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    //    /400
                    return year % 400 == 0;
                } else {
                    return true;
                    //     /100
                }
            } else {
                return false;
                //     /4
            }
        }
        return false;
    }


    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }


        switch (month) {
            case 1:
                return 31;

            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }

            case 3:
                return 31;

            case 4:
                return 31;

            case 5:
                return 31;

            case 6:
                return 31;

            case 7:
                return 31;

            case 8:
                return 31;

            case 9:
                return 31;

            case 10:
                return 31;

            case 11:
                return 31;

            case 12:
                return 31;


            default:
                return -1;
        }


    }
}






