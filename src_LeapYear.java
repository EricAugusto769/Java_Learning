// four done!
public class LeapYear {
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        } else if ((year % 4) != 0){
            System.out.println(year % 4 +" 40 ");
            return false;
        } else if ((year % 100) != 0){
            System.out.println(year % 100 +" 100");
            return true;
        } else if ((year % 400) == 0){
            System.out.println(year % 400 +" 400");
            return true;
        } else{
            return  false;
        }
    }
}
