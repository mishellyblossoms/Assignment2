
package A2;
import java.util.*;

public class Person extends APerson implements Observable, Observer {
    /**
     * List of Persons following this Person
     */
    private Set<Person> following = new HashSet<Person>();
    /**
     * List of my messages
     */
    private List<String> myMessages = new ArrayList<String>();
    /**
     * List of messages from the people this Person is following
     */
    private List<String> fMessages = new ArrayList<String>();
    /**
     * The UserBoard object associated with this Person
     */
    private UserBoard ub;
    
   
    /**
     * constructor that takes in a String parameter
     * @param name 
     */
    public Person(String name)
    {
      super(name);
    }
    /**
     * sets the ub to this.ub
     * @param ub 
     */
    public void associateUBwithPerson(UserBoard ub)
    {
        this.ub = ub;
    }
    /**
     * lets the ub JFrame to visible
     */
    public void setUBVisible()
    {
        ub.setVisible(true);
    }
    /**
     * returns the UserBoard associated with this Person
     * @return 
     */
    public UserBoard getUB()
    {
        return ub;
    }
    
    /**
     * Since this is Observer pattern and Person is the subject, it must be able to 
     * followers list
     * @param p 
     */    
    @Override
   public void addFollower(APerson p)
    {
        following.add((Person)p);
    }
   /**
    * adds specified message to myMessages
    * @param s 
    */
   public void addMyMessage(String s)
   {
       myMessages.add(s);
   }
   /**
    * adds specified string to fMessages
    * @param tweet 
    */
   public void addMessageToFollowers(String tweet)
   {
       fMessages.add(0,tweet);
   }
   /**
    * return this Person's total message number
    * @return 
    */
   public int getTotalMyMessages()
   {
       return myMessages.size();
   }
   /**
    * returns the list of myMessages
    * @return 
    */
   public List<String> getMyMessagesSet()
   {
       return myMessages;
   }
   /**
    * returns the list of this Person's followers
    * @return 
    */
   public Set<Person> getFollowers()
   {
       return following;
   }
   /**
    * notify followers of a tweet
    * @param tweet 
    */
    @Override
   public void notify(String tweet )
   {  
       this.addMyMessage(tweet);
       
       for(Person p: this.following)
       {
             
             p.update(tweet);
           
          
       }
   }
   /**
    * Since for the observer pattern, Person is the observer as well as the subject,
    * it needs the update() method
    * @param tweet 
    */
    @Override
   public void update(String tweet)
   {
       
       
       addMessageToFollowers(tweet);
     
      
   }
   /**
    * returns the lost of fMessages
    * @return 
    */
   public List<String> getFMessages()
   {
       return fMessages;
   }
 }
