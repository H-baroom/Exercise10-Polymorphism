public class Car implements Vehicle{
    private String model;
    private double days;

    Car(){

    }
    public Car(double days, String model) {
        this.days = days;
        this.model = model;
    }

    public double getDays() {
        return days;
    }

    public void setDays(double days) {
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double calculateRentalCost() {
        return days * 50;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: "+model+" \n" +
                "Daily Rental Rate: $50.0 \n" +
                "Rental Cost: "+calculateRentalCost());

    }
}
