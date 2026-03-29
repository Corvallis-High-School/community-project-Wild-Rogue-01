import java.util.ArrayList;

public class Vehicle
{
    protected static ArrayList<Vehicle> objArray = new ArrayList<>();

    protected String modeTransport;
    protected double travelTime;
    protected double distTraveled;
    
    public Vehicle(){
        this.modeTransport = "";
        this.travelTime = 0;
        this.distTraveled = 0;

        this.push();
    }
    public static void print() {
        for(Vehicle value : Vehicle.objArray) {
            System.out.println(value.getModeTransport() + ": " + value.toString());
        }
    }public static void findAndPrint(Object obj) {
        boolean bool = true;
        for(Vehicle value : Vehicle.objArray) {
            if(value.equals(obj)){
                bool = false;
                System.out.println(value.getModeTransport() + ": " + value.toString());
            }
        }
        if(bool) {
            System.out.println(obj + " was not found.");
        }
    }
    public String getModeTransport() {
        return this.modeTransport;
    }
    public double getTravelTime() {
        return this.travelTime;
    }
    public double getDistTraveled() {
        return this.distTraveled;
    }
    public void setModeTransport(String m) {
        this.modeTransport = m;
    }
    public void setTravelTime(double t) {
        this.travelTime = t;
    }
    public void setDistTraveled(double d) {
        this.distTraveled = d;
    }
    public String toString() {
        return this.modeTransport + "\n" + this.travelTime + "\n" + distTraveled;
    }
    public double efficiency(int trafficLvl) {
        return (this.distTraveled + trafficLvl) / (this.travelTime);
    }
    private void push() {
        objArray.add(this);
    }
}
class Car extends Vehicle 
{
    private static int avgSpdLimUS = 70;
    private double avgSpdLim;

    public Car() {
        super();
        this.avgSpdLim = 60;
        this.modeTransport = "car";
    }

    public double efficiency(int trafficLvl) {
        return ((this.distTraveled + trafficLvl) * this.avgSpdLim) / ((this.travelTime) * Car.avgSpdLimUS);
    }
    public String toString() {
        return super.toString() + "\n" + avgSpdLim;
    }
}
class Bike extends Vehicle 
{
    private double avgSpd;

    public Bike() {
        super();
        this.avgSpd = 12;
        this.modeTransport = "bike";
    }

    public double efficiency(int trafficLvl) {
        return ((this.distTraveled + trafficLvl) * this.avgSpd) / (this.travelTime);
    }
    public String toString() {
        return super.toString() + "\n" + avgSpd;
    }
}