package find.out.the.day.of.entered.date;
import java.util.Scanner;

public class FindOutTheDayOfEnteredDate {
    public static void main(String[] args) {
        System.out.print("Please enter date with format [dd/mm/yyyy]: ");
        Scanner sn = new Scanner(System.in);
        String input = sn.next();
        
        Funtion ham = new Funtion();  
        ham.checkDate(input);
        
        ham.checkDay(input);
    }
    
}
