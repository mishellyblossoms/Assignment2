/**
 * Design Pattern: Composite
 */
package A2;
import java.util.*;

public class Group extends APerson
{
    /**
     * data structure that holds all Person objects associated with it
     */
  private List<Person> group = new ArrayList<Person>();
  /**
   * constructor that takes in a String object
   * @param name 
   */
  public Group(String name)
  {
      super(name);
  }
  /**
   * adds a Person to the Group's List
   * @param p 
   */
  public void addToGroup(Person p)
  {
    group.add(p);
  }
  /**
   * returns the List of Persons in the group
   * @return 
   */
  public List getGroup()
  {
      return group;
  }
}
