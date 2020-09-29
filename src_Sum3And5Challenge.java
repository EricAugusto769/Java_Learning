public class Sum3And5Challenge {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) & (i % 5 == 0)) {
                n++;
                System.out.println("The number: " + i + " can be divided by 3 and 5");
                sum +=i;
            }if (n == 5) {
                System.out.println("The sum of the numbers = " + sum);
                System.out.println("Exiting loop");
                break;
            }
        }
    }
}


