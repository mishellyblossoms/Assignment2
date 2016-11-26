
package A2;
/**
 * interface for visitor design pattern
 * @author mdyuong
 */

public abstract class Visit
{
    
    public abstract void visitButtonPeople(ButtonPeople p);
    public abstract void visitButtonGroup(ButtonGroup g);
    public abstract void visitButtonTotalMessages(ButtonTotalMessages tm);
    public abstract void visitButtonPositiveMessages(ButtonPositiveMessages pm);
    
   
  }
