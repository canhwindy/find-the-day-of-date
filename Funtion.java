package find.out.the.day.of.entered.date;


public class Funtion {
    public void checkDate(String input) {
        String[] part = input.split("/");
        int day = Integer.parseInt(part[0]);
        int month = Integer.parseInt(part[1]);
        int year = Integer.parseInt(part[2]);
        
        if (day <= 0 || month <= 0 || year <=0 || month >= 13) {
            System.out.println("Invalid Date");
        } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12) && day >= 32) {
            System.out.println("Invalid Date");
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            System.out.println("Invalid Date");
        } else if (month == 2 && day > 29) {
            System.out.println("Invalid Date");
        }
        
    }
    
    public void checkDay(String input) {
        String[] part = input.split("/");
       int day = Integer.parseInt(part[0]);
        int month = Integer.parseInt(part[1]);
        int year = Integer.parseInt(part[2]);
        
        if (month< 3 ) {
            month = month +12;
            year = year -1;
        }
        int k = year % 100;
        int j = year/100;
        int h = (day + (13 * (month + 1))/5 +k + k/4 + j/4 - 2 * j) % 7;
        if (h == 1) {
            System.out.println("Your day is Sunday");
        } else if (h == 2 ) {
            System.out.println("Your day is Monday");
        } else if (h == 3 ) {
            System.out.println("Your day is Tuesday");
        } else if ( h == 4) {
            System.out.println("Your day is Wednesday");
        } else if (h == 5 ) {
            System.out.println("Your dau is Thursday");
        } else if (h == 6 ) {
            System.out.println("Your day is Friday");
        } else if (h == 0 ) {
            System.out.println("Your day is Saturdays");
        }
    }
}
