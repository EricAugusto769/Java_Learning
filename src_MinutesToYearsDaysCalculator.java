public class MinutesToYearsDaysCalculator {
    public static void printYearAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        long year = minutes / 525600;
        long days = (minutes - (year * 525600)) / 1440;
        System.out.println(minutes + " min = " + year + " y and " + days + " d");
    }
}
