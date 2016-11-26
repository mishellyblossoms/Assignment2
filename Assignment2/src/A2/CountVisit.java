/*
 * Design Pattern: Vistor
 * 
 */
package A2;


import java.util.List;
import java.util.Set;

/**
 *
 * @author mdyuong
 */
public class CountVisit extends Visit{
 
/**
 * if p == ButtonPeople, total number of users is displayed
 * @param p 
 */
@Override
public void visitButtonPeople(ButtonPeople p)
 {
   int size = p.getEveryone().size();
   String s = ("The total number of users is: " + size);
   Display dis = new Display(s);
   dis.setVisible(true);
 }
/**
 * if m == ButtonGroup, total number of groups is displayed 
 * @param m 
 */
@Override
public void visitButtonGroup(ButtonGroup m)
 {
   int size = m.getGroups().size();
   String s = ("The total number of groups is: " + size);
   Display dis = new Display(s);
   dis.setVisible(true);
 }
/**
 * if tm == ButtonTotalMessages, the total number of messages is displayed
 * @param tm 
 */
@Override
public void visitButtonTotalMessages(ButtonTotalMessages tm)
{
   Set<Person> all = tm.getEveryone();
   int cnt = 0;
   for(Person p: all)
   {
       cnt = cnt + p.getTotalMyMessages();
   }
   String s = ("The total number of messages is: " + cnt);
   Display dis = new Display(s);
   dis.setVisible(true);
}
/**
 * if pm = ButtonPositiveMessages, then the total number of positive messages (
 * defined as those messages containing "a") is shown out of the total number
 * of messages
 * @param pm 
 */
@Override
  public  void visitButtonPositiveMessages(ButtonPositiveMessages pm)
  {
      Set<Person> all = pm.getEveryone();
      int cnt = 0;
      int total = 0;
      for(Person p: all)
        {  
           total = total + p.getTotalMyMessages();
           List<String> list = p.getMyMessagesSet();
         
             for(String str: list)
             {
                 if(str.contains("a"))
                 {
                     cnt++;
                 }
             }
        }
      String s = ("The total number of positive messages is: " + cnt + " out of " + total);
      Display dis = new Display(s);
      dis.setVisible(true); 
  }
        
        

    
}
