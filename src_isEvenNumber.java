public class isEvenNumber {
    public static void main(String[] args) {
      int number = 4;
      int finishNumber = 20;
      int count = 0;

      while (number <= finishNumber){
          number++;
          if(!isEvenNumber(number)){
              continue;
          }
          count++;
          System.out.println("Even number " + count + " = " + number);
          if (count == 5){
              break;
          }
      }
        System.out.println("even numbers founded = " + count);
    }

    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
