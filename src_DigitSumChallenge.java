public class DigitSumChallenge {

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        } else {
            int n1 = 0;
            int n2 = 0;
            int totalN2 = 0;
            n1 = number % 10;
            while (number >= 10) {
                n2 = number / 10;
                number = n2;
                n2 = n2 % 10;
                totalN2+=n2;
                System.out.println(totalN2);
            }
            return n1 + totalN2;
        }
    }
}
