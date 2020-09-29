public class Main {

    public static void main(String[] args) {

        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = "+miles);
        SpeedConverter.printConversion(10.5);
        MegaBytesConverter.printMegaBytesAndKiloBytes(2050);
        boolean barking = BarkingDog.shouldWakeUp(true,6);
        System.out.println(barking);
        boolean year = LeapYear.isLeapYear(1855);
        System.out.println(year);
        boolean decimalComparator = DecimalComparator.areEqualByThreeDecimalPlaces(3.1756,3.175);
        System.out.println(decimalComparator);
        boolean sumChecker = EqualSumChecker.hasEqualSum(12,1,2);
        System.out.println(sumChecker);
        boolean teen = TeenNumberChecker.hasTeen(20,20,29);
        System.out.println(teen);
        System.out.println(SecondAndMinutes.getDurationString(65,45));
        System.out.println(SecondAndMinutes.getDurationString(5000));
        MinutesToYearsDaysCalculator.printYearAndDays(525600);
        System.out.println(PlayingCat.isCatPlaying(false,46));
        DayOfTheWeekChallenge.printDayOfTheWeek(-1);
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(4,2020));
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(SumOddRange.sumOdd(1,100));
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(DigitSumChallenge.sumDigits(32123));
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(NumberPalindrome.isPalindrome(123));
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(10));
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println(SharedDigit.hasSharedDigit(15,55));
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println(LastDigitChecker.hasSameLastDigit(777,771,77));
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12,30));
        System.out.println("++++++++++++++++++++++++++++++");
        FactorPrinter.printFactors(32);
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println(PerfectNumber.isPerfectNumber(28));
        System.out.println("+++++++++++++++++++++++++++++++");
        NumberToWords.numberToWords(0);
        System.out.println("+++++++++++++++++++++++++++++++");
        int i = 0;
        int reverse = NumberToWords.reverse(1001);
        System.out.println(reverse);
        int n = 0;
        boolean rev = true;
        for(i = NumberToWords.getDigitCount(reverse); i < NumberToWords.getDigitCount(1001);i++){
            if(rev){
                reverse = NumberToWords.reverse(reverse);
                rev =  false;
            }
            reverse *= 10;
             n = reverse;
        }
        System.out.println(n);
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(NumberToWords.getDigitCount(-222));
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(FlourPacker.canPack(5,1,4));
    }
}
