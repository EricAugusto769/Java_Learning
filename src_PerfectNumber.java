public class PerfectNumber {

    public static boolean isPerfectNumber (int number){
        if(number < 1){
            return false;
        }
        int start = 1;
        int remainder = 0;
        int n = 0;
        while(start < number){
            remainder = number % start;
            if(remainder == 0){
                System.out.println(start);
                n += start;
                start++;
            } else{
                start++;
            }
        }
        System.out.println();
        if(n == number ){
            return true;
        } else {
            return false;
        }
    }
}
