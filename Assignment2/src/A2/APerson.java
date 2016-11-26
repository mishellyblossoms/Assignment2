/**
 * Design Pattern: Composite
 */
package A2;

public abstract class APerson 
{
    /**
     * Holds the object's name
     */
    String name;
    /**
     * constructor that takes in a string
     * @param name 
     */
    public APerson(String name)
    {
       this.name = name;
    }
    /**
     * returns the string associated with the field "name"
     * @return 
     */
   public String getName()
    {
        return name;
    }
}
