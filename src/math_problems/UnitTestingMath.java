package math_problems;

import static java.lang.Math.PI;

public class UnitTestingMath {

    /**
     * Use this class to unit test all of the class within this package
     */

    public static void main(String[] args) {
        UnitTestingMath unit = new UnitTestingMath();
        double unitPi = Math.PI;
        System.out.println("The value of PI  " + unitPi);
        double unitSin = Math.sin(0.5);
        System.out.println("The Deg of SIN(0.5) = "  + unitSin);
        double unitCos = Math.cos(0.75);
        System.out.println("The Deg of COS(0.75) = " + unitCos);
    }
}
