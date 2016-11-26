
 /*
 * Pattern: Vistor
 * This class is used to show the Vistor pattern
 */
 
package A2;
import java.util.*;
public class ButtonPeople extends MyButton{
   /**
    * Below two fields are used to hold parameters passed during instantiation 
    */
    private javax.swing.JButton j;
    private Set<Person> s;
    /**
     * Constructor that takes in JButton and Set objects
     * @param j
     * @param s 
     */
    public ButtonPeople(javax.swing.JButton j, Set<Person> s)
    {
        this.j = j;
        this.s = s;
    }
    /**
     * 
     * @param v 
     */
    @Override
    public void accept(Visit v)
    {
       v.visitButtonPeople(this); 
    }
    /**
     * returns the set of all Persons
     * @return 
     */
    public Set getEveryone()
    {
        return s;
    }
    
}
