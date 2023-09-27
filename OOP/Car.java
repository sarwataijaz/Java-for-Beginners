import java.util.*;
public class Car {

    public String colour;
    public String carType;
    public int carCapacity;

    public Car() {
        carType = "Manual";
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setCarCap(int carNum) {
        this.carCapacity = carNum;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void display() {

        System.out.println("Car type: " + carType);
        System.out.println("Colour: " + colour);
        System.out.println("Capacity: " + carCapacity);
    }
    public void changeGear() {
        System.out.println("Manually shifting the gears.");
    }
}

class AutomatedCar extends Car {

    public void changeGear() {
        System.out.println("Gears are automatically shifted by the car.");
    }
}

class SportsCar extends AutomatedCar {

    public void changeGear() {
        System.out.println("Gears are shifted either manually or automatically.");
    }
}

class Example2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose tour car type: 1-Manual, 2-Automatic, 3-Sports");
        int n = sc.nextInt();

        String colour;
        int capacity;

        sc.nextLine();

        switch(n) {
            case 1:
            {
                Car c1 = new Car();
                System.out.println("Enter colour: ");
                colour = sc.nextLine();
                c1.colour = colour;


                System.out.println("Enter capacity: ");
                capacity = sc.nextInt();
                c1.carCapacity = capacity;

                c1.display();

                break;
            }

            case 2: {

                AutomatedCar automatedCar = new AutomatedCar();
                automatedCar.carType = "Automatic";

                System.out.println("Enter colour: ");
                colour = sc.nextLine();
                automatedCar.colour = colour;

                System.out.println("Enter capacity: ");
                capacity = sc.nextInt();
                automatedCar.carCapacity = capacity;

                automatedCar.display();

                break;
            }

            case 3: {
                SportsCar sportsCar = new SportsCar();
                sportsCar.carType = "SportsCar";

                System.out.println("Enter colour: ");
                colour = sc.nextLine();
                sportsCar.colour = colour;

                System.out.println("Enter capacity: ");
                capacity = sc.nextInt();
                sportsCar.carCapacity = capacity;

                sportsCar.display();

                break;
            }
        }
    }
}

