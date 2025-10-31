import java.util.ArrayList;

/**
* Represents a House, a type of Building that can have residents and may include a dining room.
* Tracks residents and provides methods to move students in and out, check residency,
* and get the number of residents. 
*/
public class House extends Building {
  private ArrayList<Student> residents;
  private boolean hasDiningRoom;

  /**
  * Constructs a new House object with the specified name, address, number of floors, and whether 
  * it has a dining room. Initializes an empty list of residents.
  * 
  * @param name        the name of the house
  * @param address     the address of the house
  * @param nFloors     the number of floors in the house
  * @param diningRoom  true if the house has a dining room, false if not
  */
  public House(String name, String address, int nFloors, boolean diningRoom) {
    super(name, address, nFloors);
    hasDiningRoom = diningRoom;
    residents = new ArrayList<Student>();
    System.out.println("You have built a house: 🏠");
  }

  /**
  * Returns if this house has a dining room
  *
  * @return  true if the house has a dining room, false if not
  */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  } 

  /**
  * Returns how many residents are in this house
  *
  * @return  the number of residents in the house
  */
  public int nResidents() {
    return residents.size();
  } 

  /**
  * Adds a student into the list of residents in this house
  *
  * @param s  the student moving into the house
  */
  public void moveIn(Student s) {
    residents.add(s);
  }

  /**
  * Removes a student from the list of residents in this house
  *
  * @param s  the student moving out of the house
  * @return   the student who moved ouf of the house        
  */
  public Student moveOut(Student s) {
    residents.remove(s);
    return s;
  } 
    
  /**
  * Returns whether the student is a resident of this house
  *
  * @param s  the student being checked 
  * @return   true if the student is a resident, false if not
  */
  public boolean isResident(Student s) {
    return residents.contains(s);
  } 

  public static void main(String[] args) {
    House myHouse = new House("The House", "1234 st", 2, true);
    System.out.println(myHouse);
  }
}