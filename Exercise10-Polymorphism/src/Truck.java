public class Truck implements Vehicle{
    private String type;
    private double week;

    Truck(){}
    public Truck(String type) {
        this.type = type;
    }
    public Truck(double week) {
        this.week = week;
    }
    public Truck(String type, double week) {
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeek() {
        return week;
    }

    public void setWeek(double week) {
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return week * 500;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type: "+type+" \n" +
                "Weekly Rental Rate: $500.0 \n" +
                "Rental Cost: "+calculateRentalCost());

    }
}
