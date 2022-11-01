package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        final int distanceKilometersHomeToOffice = 150;
        System.out.println("Расстояние в километрах от дома до офиса : " + distanceKilometersHomeToOffice);

        final double averageTaxiSpeed = 55;
        System.out.println("Cредняя скорость такси : " + averageTaxiSpeed);

        double timeTesterGetsHomeToOffice = distanceKilometersHomeToOffice / averageTaxiSpeed;
        System.out.println("Время за которое тестировщик добирается от дома до офиса : " + timeTesterGetsHomeToOffice);

        final double coefficientSlowDownTransportEvening = 1.6;
        System.out.println("Коеффициент замедления транспорта вечером : " + coefficientSlowDownTransportEvening);

        double timeTesterTaxiGetsOfficeToHome = timeTesterGetsHomeToOffice * coefficientSlowDownTransportEvening;
        System.out.println("Время за которое тестировщик добирается на такси с работы домой : " + timeTesterTaxiGetsOfficeToHome);


    }
}
