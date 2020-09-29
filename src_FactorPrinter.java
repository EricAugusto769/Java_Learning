public class FactorPrinter {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        //Solução com o while!
        int start = 1;
        int remainder = 0;
        while (start <= number) {
            remainder = number % start;
            if (remainder == 0) {
                System.out.println(start);
                start++;
            } else {
                start++;
                continue;
            }
        }
    }
}
            //Solução com o for!
//         int start = 1;
//         int n = 0;
//         for(start = 1;start <= number;start++ ){
//              n = number % start;
//                if(n == 0){
//                    System.out.println(start);
//                }
//         }
//     }
//}
