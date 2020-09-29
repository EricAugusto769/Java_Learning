public class EvenDigitSum {
    public static int getEvenDigitSum (int number){
        if(number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        int digit = 0;
        int sumEven = 0;
        while (number >= 10){
            number = number / 10;
            digit = number % 10;
            if((digit % 2) == 0){
                sumEven+=digit;
            }
        }
        if((lastDigit % 2) == 0){
            sumEven+=lastDigit;
        }
        return sumEven ;
    }
}
