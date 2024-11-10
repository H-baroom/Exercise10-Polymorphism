import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Vehicle> arr = new ArrayList();
        int n=0;
        do {
            menu();
            System.out.println("Enter your choice:");
            n= input.nextInt();
            if(n == 1){
                System.out.println("Enter Car Model: ");
                input.nextLine();
                String car_model = input.nextLine();
                System.out.println("Enter Rental Days: ");
                int days = input.nextInt();
                Car car = new Car(days,car_model);
                System.out.println("Rental Details:");
                car.displayDetails();
                arr.add(car);

            } else if (n == 2) {
                System.out.println("Enter Bike Brand: ");
                input.nextLine();
                String bike_brand = input.nextLine();
                System.out.println("Enter Rental hours: ");
                int hours = input.nextInt();
                Bike bike = new Bike(bike_brand,hours);
                System.out.println("Rental Details:");
                bike.displayDetails();
                arr.add(bike);

            } else if (n == 3) {
                System.out.println("Enter Truck Type: ");
                input.nextLine();
                String truck_type = input.nextLine();
                System.out.println("Enter Rental weeks: ");
                int weeks = input.nextInt();
                Truck truck = new Truck(truck_type,weeks);
                System.out.println("Rental Details:");
                truck.displayDetails();
                arr.add(truck);

            } else if (n == 4) {
                System.out.println("Rented Vehicles: ");
                System.out.println("***************************************");
                for (Vehicle v:arr){
                    v.displayDetails();
                    System.out.println("***************************************");
                }
            } else if (! (n == 5)) {
                System.out.println("please enter number between 1 - 5");
                continue;
            }


        }while(n != 5);
        System.out.println("Thank you for using the Vehicle Rental System!");


    }

    public static void menu(){
        System.out.println("##### Vehicle Rental System #####");
        System.out.println("1. Rent a Car ");
        System.out.println("2. Rent a Bike");
        System.out.println("3. Rent a Truck ");
        System.out.println("4. View Rented Vehicles ");
        System.out.println("5. Exit");
        System.out.println("##################################");
    }
}