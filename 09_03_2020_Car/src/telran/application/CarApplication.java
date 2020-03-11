package telran.application;

import telran.data.Car;

import static telran.data.Car.*;

public class CarApplication {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "black", 2018);
        Car car2 = new Car("Opel", "white", 2007);
        Car car3 = new Car ("Volkswagen", "red", 2011);
        Car car4 = new Car ("Nissan", "blue", 2006);
        Car car5 = new Car("Mazda", "grey", 2007);
        Car.wheel = 5;

       Car[] cars = new Car[]{car1, car2, car3, car4, car5};
       printArrayCar(cars);
       sortCarsWithComparator2(cars);
       System.out.println();
       printArrayCar(cars);


    }
}
