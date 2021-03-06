//Dounglan Cheung
//Flower.java
//2.18.2020
public class Flower extends Plant {
//made by UML diagram
  //global variables
  protected boolean isAnnual; 
  protected String colorOfFlowers;
  
  //methods
  public void setPlantType(boolean userIsAnnual) {
    isAnnual = userIsAnnual;
  }
  
  public boolean getPlantType() {
    return isAnnual;
  }
  
  public void setColorOfFlowers(String userColorOfFlower) {
    colorOfFlowers = userColorOfFlower;
  }
  
  public String getColorOfFlowers() {
    return colorOfFlowers;
  }
  
  public void printInfo() {
    System.out.println("Plant Information: ");
    System.out.println("   Plant name: " + plantName);
    System.out.println("   Cost: " + plantCost);
    System.out.println("   Annual: " +  isAnnual);
    System.out.println("   Color of Flowers: " + colorOfFlowers);
    System.out.println();
  }
}