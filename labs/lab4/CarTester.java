//Dounglan Cheung; dcheun01@syr.edu
//2.12.2020
//lab4

//pt3
public class CarTester {
  public static void main(String[] args) {
//Create two Car objects of your choice.
    Car dreamCar1;
    Car dreamCar2;
    
    dreamCar1 = new Car("Mercedes", 2020);
    dreamCar2 = new Car("Audi", 2015);
/*Display the Car objects so that you know that your constructor is working correctly by calling 
the toString method and printing that result.*/
    System.out.println(dreamCar1.toString());
    System.out.println(dreamCar2.toString());
//pt5
/*For the first car, call the accelerate() method 5 times in a row and call the getSpeed() method
in a print statement (with an appropriate label) for each increase*/
    System.out.println("For Car1: ");
    for (int i = 0; i < 5; i++) {
      dreamCar1.accelerate();
      dreamCar1.brake(); //call brake 5 times in a row calling getSpeed() with each pass
      System.out.println("New Speed: " + dreamCar1.getSpeed());
  }
//Do the same for car2, but 3 times.
    System.out.println("\nFor Car2: ");
    for (int i = 0; i < 3; i++) {
      dreamCar2.accelerate();
      System.out.println("New Speed: " + dreamCar2.getSpeed());
  }
/*Print the result of a call to the toString() method for each of the cars. The first car should be at
zero and the second at 15 mph.*/
    System.out.println("Car1: " + dreamCar1.toString());
    System.out.println("Car2: " + dreamCar2.toString());
  }
}