public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number){
        if(number < 0){
            return -1;
        }
        int n1 = number % 10;
        while(number >= 10){
            number = number / 10;
        }
        return n1 + number;
    }
}
