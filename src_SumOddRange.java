public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int oddSum = 0;
        if ((end >= start) && (end > 0) && (start > 0)) {
            for (start = start; start <= end; start++) {
                if (isOdd(start)) {
                    oddSum += start;
                }
            }
        } else{
            return -1;
        }
        return oddSum;
    }
}