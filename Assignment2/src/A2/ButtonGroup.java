/*
 * Pattern: Vistor
 * This class is used to show the Vistor pattern
 */
package A2;

import java.util.Set;

public class ButtonGroup extends MyButton 
{
    /**
     * the two below fields are used to hold the objects passed at instantiation 
     */
    private javax.swing.JButton j;
    private Set<Group> g;
    /**
     * constructor that takes in  JButton and Set object
     * @param j
     * @param g 
     */
    public ButtonGroup(javax.swing.JButton j, Set<Group> g)
    {
        this.j = j;
        this.g = g;
    }
    /**
     * 
     * @param v 
     */
    @Override
    public void accept(Visit v)
    {
       v.visitButtonGroup(this); 
    }
    /**
     * returns the set of groups
     * @return 
     */
    public Set getGroups()
    {
        return g;
    }
    
}
