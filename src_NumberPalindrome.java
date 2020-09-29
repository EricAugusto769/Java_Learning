public class NumberPalindrome {
    public static boolean isPalindrome ( int number){
        int reverse = 0;
        int lastDigit = 0;
        int number1 = number;
        while (number != 0){
            lastDigit = number % 10;
            reverse = reverse * 10;
            reverse+=lastDigit;
            number = number / 10;
        }
        if(reverse == number1){
            return true;
        }else{
            return false;
        }
    }
}
