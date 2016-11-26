/*
 * Design Pattern: Observer
 */
package A2;

/**
 * The interface for observer design pattern for the Subject
 * @author mdyuong
 */
public interface Observable {
    /**
     * 
     * @param str 
     */
    public void notify(String str);
    /**
     * 
     * @param p 
     */
    public void addFollower(APerson p);
    
    
}
