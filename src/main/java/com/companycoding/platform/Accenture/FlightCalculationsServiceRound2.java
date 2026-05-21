/*
    Program: Flight Calculations Service

    Description:
    Create a Java program to perform flight fuel calculations where:

    1. Calculate total fuel consumption
    2. Calculate total fuel cost
    3. Calculate average fuel efficiency

    Concepts Used:
    - BigDecimal Operations
    - RoundingMode
    - Precision Handling
    - Mathematical Calculations
    - Method Creation

    Author: Dnyanesh Patil
*/

package com.companycoding.platform.Accenture;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FlightCalculationsServiceRound2 {

    public static void main(String[] args) {

        FlightCalculationsServiceRound2 obj = new FlightCalculationsServiceRound2();

        BigDecimal fuelConsumptionRate = new BigDecimal("5.5");
        BigDecimal distance = new BigDecimal("120");

        BigDecimal totalFuelConsumption = obj.calculateTotalFuelConsumption(fuelConsumptionRate, distance, "2", "HALF_UP");

        System.out.println("Total Fuel Consumption : " + totalFuelConsumption);

        BigDecimal totalFuelCost = obj.calculateTotalFuelCost(totalFuelConsumption, new BigDecimal("4.5"), "2", "HALF_UP");

        System.out.println("Total Fuel Cost : " + totalFuelCost);

        BigDecimal averageFuelEfficiency = obj.calculateAverageFuelEfficiency(distance, totalFuelConsumption, "2", "HALF_UP");

        System.out.println("Average Fuel Efficiency : " + averageFuelEfficiency);
    }


    // Calculate Total Fuel Consumption
    public BigDecimal calculateTotalFuelConsumption(BigDecimal fuelConsumptionRate, BigDecimal distance, String scaleValue, String roundingModeValue) {

        int scale = Integer.parseInt(scaleValue);
        RoundingMode roundingMode = RoundingMode.valueOf(roundingModeValue);

        return fuelConsumptionRate.multiply(distance).setScale(scale, roundingMode);
    }

    // Calculate Total Fuel Cost
    public BigDecimal calculateTotalFuelCost(BigDecimal totalFuelConsumption, BigDecimal fuelCostPerGallon, String scaleValue, String roundingModeValue) {

        int scale = Integer.parseInt(scaleValue);
        RoundingMode roundingMode = RoundingMode.valueOf(roundingModeValue);

        return totalFuelConsumption.multiply(fuelCostPerGallon).setScale(scale, roundingMode);
    }

    // Calculate Average Fuel Efficiency
    public BigDecimal calculateAverageFuelEfficiency(BigDecimal distance, BigDecimal totalFuelConsumption, String scaleValue, String roundingModeValue) {

        int scale = Integer.parseInt(scaleValue);
        RoundingMode roundingMode = RoundingMode.valueOf(roundingModeValue);

        return distance.divide(totalFuelConsumption, scale, roundingMode);
    }
}