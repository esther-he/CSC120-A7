import java.util.Hashtable;

/**
 * Represents a Library, which is a type of Building that manages a collection of books.
 * Each book title is stored as a String key in a Hashtable, and its value is a boolean that 
 * indicates whether it is available. Provides methods to add and remove books, check out and 
 * return books, and ask about the possession and availability of a certain title.
 */
public class Library extends Building {

    private Hashtable<String, Boolean> collection;

    /**
     * Constructs a new Library with the specified name, address, and number of floors.
     * Initializes an empty collection of book titles.
     *
     * @param name the name of the library
     * @param address the address of the library
     * @param nFloors the number of floors in the library
     */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    /**
     * Adds a book title to the collection and marks it as available.
     *
     * @param title the title of the book to add
     */
    public void addTitle(String title) {
      collection.put(title, true);
    }
    
    /**
     * Removes a book title from the collection.
     *
     * @param title the title of the book to remove
     * @return the title that was removed
     */
    public String removeTitle(String title) {
      collection.remove(title);
      return title;
    }

    /** 
     * Checks out a book from the library, marking it as unavailable.
     *
     * @param title the title of the book to check out
     */
    public void checkOut(String title) {
      collection.replace(title, true, false);
    }

    /**
     * Returns a book to the library, marking it as available.
     *
     * @param title the title of the book being returned
     */
    public void returnBook(String title) {
      collection.replace(title, false, true);
    }

    /**
     * Checks whether a given book title exists in the library's collection.
     *
     * @param title the title to check for
     * @return true if the collection contains the title, false if not
     */
    public boolean containsTitle(String title) {
      return collection.containsKey(title);
    }

    /**
     * Checks whether a given book is currently available for checkout.
     * 
     * @param title the title of the book to check
     * @return true if the book is available, false if it is checked out
     */
    public boolean isAvailable(String title) {
      return collection.get(title);
    }

    /**
     * Prints the entire library collection to the console.
     * Each book title is displayed along with its availability status.
     */
    public void printCollection() {
      System.out.println(collection.toString());
    } 
  
    public static void main(String[] args) {
      Library myLibrary = new Library("The Library", "1234 st", 3);
      myLibrary.addTitle("Little Women");
      myLibrary.addTitle("Pride and Prejudice");
      
      myLibrary.checkOut("Pride and Prejudice");
      myLibrary.printCollection();
      
      myLibrary.returnBook("Pride and Prejudice");
      myLibrary.printCollection();
    }
  
  }