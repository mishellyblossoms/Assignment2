 /*
 * Pattern: Vistor
 * This class is used to show the Vistor pattern
 */
package A2;

import java.util.Set;

public class ButtonTotalMessages extends MyButton{
    /**
     * Below two fields are used to hold parameters at instantiation
     */
    private javax.swing.JButton j;
    private Set<Person> s;
    /**
     * constructor that takes in JButton and Set objects
     * @param j
     * @param s 
     */
    public ButtonTotalMessages(javax.swing.JButton j, Set<Person> s)
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
       v.visitButtonTotalMessages(this); 
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
    

