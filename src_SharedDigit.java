public class SharedDigit {

    public static boolean hasSharedDigit (int n1, int n2){
        if ((n1 < 10 || n1 > 99) || (n2 < 10 || n2 >99)){
            return false;
        }
        int lastDigit = n1 % 10;
        System.out.println(lastDigit);
        int lastDigit2 = n2 % 10;
        System.out.println(lastDigit2);
        int firstDigit = n1 / 10;
        System.out.println(firstDigit);
        int firstDigit2 = n2 / 10;
        System.out.println(firstDigit2);
        if((lastDigit == lastDigit2) || (firstDigit == firstDigit2) || (lastDigit == firstDigit2) || (lastDigit2 == firstDigit)){
            return true;
        }
        return false;
    }
}
