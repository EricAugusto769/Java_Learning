public class LastDigitChecker {

    public static boolean hasSameLastDigit (int n1, int n2, int n3){
        if((n1 < 10 || n1 > 1000)|| (n2 < 10 || n2 > 1000) || (n3 < 10 || n3 > 1000)){
            return false;
        }
        n1 %= 10;
        System.out.println(n1);
        n2 %= 10;
        System.out.println(n2);
        n3 %= 10;
        System.out.println(n3);
        if((n1 == n2) || (n1 == n3) || (n2 == n3)){
            return true;
        }
        return false;
    }
    public static boolean isValid (int number){
        if(number < 10 || number > 1000){
            return false;
        }
        return true;
    }
}
