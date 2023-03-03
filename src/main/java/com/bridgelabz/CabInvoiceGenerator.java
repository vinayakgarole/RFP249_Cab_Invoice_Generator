package com.bridgelabz;

public class CabInvoiceGenerator {

    private static final int MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;
    private static final int MIN_FARE = 5;

    // Creating calculateFare method to calculate the fare for the given distance and time
    public static double calculateFare(double distance, int time) {//parameterized method
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        return Math.max(totalFare, MIN_FARE);
    }

    // Creating calculateFare method with multiple rides
    public Invoice calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.getDistance(), ride.getTime());
        }
        return new Invoice(rides.length, totalFare);
    }

    public static void main(String[] args) {

        System.out.println("Total Fair is : " + calculateFare(5.5, 10));   // Calling method calculateFare and pass distance and time
    }
}