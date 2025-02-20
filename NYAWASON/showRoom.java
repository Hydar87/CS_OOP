//CT101/G/202354/23
//HAIDAR NYAWA ZUMA

//SECTION B
//QUESTION b (i)
import java.util.Scanner;

class Vehicle {
    private String brand;  
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() { 
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    private String fuelType; 

    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}

class showRoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter car brand: ");
        String brand = input.nextLine();

        System.out.print("Enter car model: ");
        String model = input.nextLine();

        System.out.print("Enter car year: ");
        int year = input.nextInt();
        input.nextLine(); // Consume newline

        System.out.print("Enter car fuel type: ");
        String fuelType = input.nextLine();

        Car myCar = new Car(brand, model, year, fuelType);

        System.out.println("\nCar Details:");
        myCar.displayDetails();
        input.close();
    }
}