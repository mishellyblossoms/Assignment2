/**
 * Design Pattern: Visitor
 * interface for the objects that shall be visited
 */
package A2;

/**
 *
 * @author mdyuong
 */
public abstract class MyButton {
    /**
     * 
     * @param v 
     */
    public abstract void accept(Visit v);
    
}
