package com.bridgelabz;

public class CabInvoiceGenerator {

    private static final int MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;

    //Creating calculateFare method to calculate the fare for the given distance and time
    public static double calculateFare(double distance, int time) {//parameterized method
        return distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
    }

    //Creating calculateFare method with multiple rides
    public double calculateFare(Ride[] rides) {
        double totalFare = 0.0;
        for (Ride ride : rides) {//Iterate over the rides
            totalFare += calculateFare(ride.getDistance(), ride.getTime());//calculate total fare
        }
        return totalFare;
    }

    public static void main(String[] args) {
        System.out.println("Total Fair is : " + calculateFare(5.5, 10));//calling method calculateFare and pass distance and time
    }
}
