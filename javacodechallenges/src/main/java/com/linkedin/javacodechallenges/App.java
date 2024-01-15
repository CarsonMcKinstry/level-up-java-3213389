package com.linkedin.javacodechallenges;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * - Minimum charge of 18.84 for 1496 (two CCFs)
 * - One CCF == 748 gallons
 * - Use more than two CCFs, charged 3.90 per additional CCF _started_
 * - i.e. Use 1800 gallons, charged 18.84 plus 3.90 for the extra volume
 */

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        BigDecimal charge = new BigDecimal("18.84");

        double ccfs = gallonsUsage / 748;

        double overage = ccfs - 2.0;

        while (overage > 0) {
            overage -= 1.0;
            charge = charge.add(new BigDecimal("3.9"));
        }

        return charge.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
