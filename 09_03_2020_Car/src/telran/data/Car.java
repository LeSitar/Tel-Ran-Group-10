package telran.data;

public class Car {
    private String brand;
    private String color;
    private int productionYear;
    public static int wheel  = 4;

    public Car(String brand, String color, int productionYear) {
        this.brand = brand;
        this.color = color;
        this.productionYear = productionYear;
    }

    public void displayCar(){
        System.out.println(brand + ", color: " + color + ", year of production: " + productionYear);
       // System.out.println(wheel);
    }

    public static void printArrayCar(Car[] cars){
        for (Car car:cars) {
            car.displayCar();
        }
    }

    public static void sortCarsByYear(Car[] cars){
        for (int i = 0; i < cars.length -1; i++) {
            for (int j = 0; j < (cars.length-1) - i; j++) {
                if(cars[j].productionYear>cars[j+1].productionYear){
                    Car temp = cars[j];
                    cars[j] = cars[j+1];
                    cars[j+1] = temp;
                }
            }

        }
    }

    public static void sortCarsWithComparator(Car[] cars){
        for (int i = 0; i < cars.length -1; i++) {
            for (int j = 0; j < (cars.length-1) - i; j++) {
                if(compareCars(cars[j],cars[j+1])<0){
                    Car temp = cars[j];
                    cars[j] = cars[j+1];
                    cars[j+1] = temp;
                }
            }

        }

    }

    public static void sortCarsWithComparator2(Car [] cars){
        for (int i = 0; i < cars.length-1; i++) {
            for (int j = 0; j <(cars.length - 1) -i; j++) {
                if(cars[j].compareToCar(cars[j+1])>0){
                    Car temp = cars[j];
                    cars[j] = cars[j+1];
                    cars[j+1] = temp;
                }
            }

        }
    }

    private static int compareCars(Car car1, Car car2){
        if(car1.productionYear>car2.productionYear) return 1;
        else if(car1.productionYear<car2.productionYear) return -1;
        else return 0;
    }

    private int compareToCar(Car car){
        if(this.productionYear>car.productionYear) return 1;
        else if(this.productionYear<car.productionYear) return -1;
        else return 0;
    }

}
