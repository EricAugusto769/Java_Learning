public class feetAndInchesToCentimeters {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            double centimeters =  (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + "feet, " + inches + " inches = " + centimeters + "cm");
            return centimeters;
        }
            System.out.println("Invalid feet or inches");
            return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double feet = 0;
        inches = calcFeetAndInchesToCentimeters(inches);
        if (inches >= 0) {
            double feets = (int) inches/12;
            System.out.println();
            return inches/12;
        } else {
            System.out.println("Invalid feet or inches");
            return -1;
        }
    }
}

