class Flight{
  String departure;
  String arrival;

  public Flight(String departure, String arrival){
    this.departure=departure;
    this.arrival=arrival;
  }

  public void fromToWhere(){
    System.out.println("Flight from "+this.departure
                      +" to "+this.arrival);
  }
}

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
