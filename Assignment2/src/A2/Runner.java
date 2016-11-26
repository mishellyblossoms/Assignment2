
package A2;


public class Runner 
{
    /**
     * store the single AdminBoard object
     */
   private static AdminBoard admin;
   /**
    * main method that runs the application
    * initialization of one AdminBoard instance (in line with Singleton)
    * @param args 
    */
   public static void main(String args[]) 
   {
       admin = AdminBoard.getInstance();
       admin.setVisible(true);
      
   } 
}
