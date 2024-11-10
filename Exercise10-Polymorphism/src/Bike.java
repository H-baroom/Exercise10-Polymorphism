public class Bike implements Vehicle{
    private String brand;
    private double hour;

    Bike(){}

    public Bike(String brand) {
        this.brand = brand;
    }

    public Bike(double hour) {
        this.hour = hour;
    }

    public Bike(String brand, double hour) {
        this.brand = brand;
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return hour * 10;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: "+brand+" \n" +
                "Hourly Rental Rate: $10.0 \n" +
                "Rental Cost: "+calculateRentalCost());

    }
}
