class Main {
  public static void main(String[] args) {
    // Construct 2 objects of your class using the constructor with different values
    Vehicle vehicle = new Vehicle();
    Vehicle bike = new Bike();
    // call all of the objects methods to test them
    Vehicle.print();
    Vehicle.findAndPrint(bike);

    System.out.println(bike.getModeTransport());
    System.out.println(bike.getTravelTime());
    System.out.println(bike.getDistTraveled());

    bike.setModeTransport("air");
    bike.setTravelTime(2000.0);
    bike.setDistTraveled(1000.0);

    System.out.println(bike.getModeTransport());
    System.out.println(bike.getTravelTime());
    System.out.println(bike.getDistTraveled());

    System.out.print(bike.toString());

    System.out.print(bike.efficiency(5));
  }
}