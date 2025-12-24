public class CommunityProject // Add your class name here!
{
    // 1. write 3 instance variables for class: private type variableName;

    private String location;
    private String modeTransport;
    private double travelTime;
    private double distTraveled;
    private int numStop;
    
    
    // 2. Add a constructor with 3 parameters to set all of the instance variables to the given parameters.
    
    //int n : param 4
    //String l : param 5
    public CommunityProject(String m, double t, double d){
        this.modeTransport = m;
        this.travelTime = t;
        this.distTraveled = d;
        this.numStop = 0;
        this.location = "";
    }
    
    // 3. Write a print() method that uses System.out.println to print out all the instance variables.
    
    public void print() {
        System.out.println(this.toString());
    }
    
    // 4. Create accessor (get) methods for each of the instance variables.

    public String getModeTransport() {
        return this.modeTransport;
    }
    public double getTravelTime() {
        return this.travelTime;
    }
    public double getDistTraveled() {
        return this.distTraveled;
    }
    public int getNumStop() {
        return this.numStop;
    }
    public String getLocation() {
        return this.location;
    }
    
    // 5. Create mutator (set) methods for each of the instance variables.

    public void setModeTransport(String m) {
        this.modeTransport = m;
    }
    public void setTravelTime(double t) {
        this.travelTime = t;
    }
    public void setDistTraveled(double d) {
        this.distTraveled = d;
    }
    public void setNumStop(int n) {
        this.numStop = n;
    }
    public void setLocation(String l) {
        this.location = l;
    }
    
    // 6. Create a toString() method that returns all the information in the instance variables.

    public String toString() {
        return this.modeTransport + "\n" + this.travelTime + "\n" + distTraveled + "\n" + numStop;
    }
    
    // 7. Write an additional method for your class that takes a parameter.
    // For example, there could be a print method with arguments that indicate how you want to print out
    // the information, e.g. print(format) could print the data according to an argument that is "plain"
    // or "table" where the data is printed in a table drawn with dashes and lines (|).

    public String efficiency(int numVehicles) {
        return this.location + ": " + ((this.distTraveled - 0.125 * numVehicles) / (this.travelTime - this.numStop * 0.2));
    }
    
    // 8. Write a main method that constructs at least 2 objects of your class
    // using the constructor and then calls all of the methods that you created above to test them.
    public static void main(String[] args)
    {
       // Construct 2 objects of your class using the constructor with different values
        CommunityProject c = new CommunityProject("Car", 20.0, 60.0);
        c.print();
        CommunityProject a = new CommunityProject("Bike", 40.0, 10.0);
        a.print();
        
       // call all of the objects methods to test them
        System.out.println(a.efficiency(2));
        
        System.out.println(c.getModeTransport());
        System.out.println(c.getTravelTime());
        System.out.println(c.getDistTraveled());
        System.out.println(c.getNumStop());
        System.out.println(c.getLocation());
        
        System.out.println();
        
        c.setModeTransport("Boat");
        c.setTravelTime(1);
        c.setDistTraveled(1);
        c.setNumStop(1);
        c.setLocation("House");
        
        System.out.println(c.getModeTransport());
        System.out.println(c.getTravelTime());
        System.out.println(c.getDistTraveled());
        System.out.println(c.getNumStop());
        System.out.println(c.getLocation());
    }
}
