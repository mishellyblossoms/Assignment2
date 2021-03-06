/*
 * The second main JFrame
 */
package A2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultListModel;




public class UserBoard extends javax.swing.JFrame {
    /**
     * reference to the name of the Person associated with the board
     */
  private String n;
  /**
   * Holds the instance of the set given through the UserBoard constructor 
   */
  private Set<Person> s; 
  /**
   * the Person field associated with the UserBoard
   */
  private Person user;
    /**
     * Creates new form UserBoard
     */
  
    /**
     * Creates new form UserBoard
     * @param n
     * @param s
     */
    public UserBoard(String n, Set<Person> s) {
        initComponents();
        
        this.n = n;
        this.s = s;
        userTitle.setText(n);
        for(Person p: s)
        {
           if( p.getName().equals(n))
           {
             user = p;  
           }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        follow = new javax.swing.JTextField();
        toFollow = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListOfFollowing = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tweet = new javax.swing.JTextArea();
        toTweet = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        recentMessages = new javax.swing.JList<>();
        userTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        follow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followActionPerformed(evt);
            }
        });

        toFollow.setText("Follow");
        toFollow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toFollowActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ListOfFollowing);

        tweet.setColumns(20);
        tweet.setRows(5);
        jScrollPane2.setViewportView(tweet);

        toTweet.setText("Tweet");
        toTweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toTweetActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(recentMessages);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(toTweet, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(follow)
                        .addGap(18, 18, 18)
                        .addComponent(toFollow, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(follow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toFollow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toTweet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void followActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followActionPerformed
    
        
    }//GEN-LAST:event_followActionPerformed
/**
 * action performed when "tweet" button is clicked
 * user notifies its followers in the follower's UserBoard
 * @param evt 
 */
    private void toTweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toTweetActionPerformed
       
       user.notify(tweet.getText());
       tweet.setText("");
       updateEveryone();
    }//GEN-LAST:event_toTweetActionPerformed
   /**
    * method used to update the JList in each of the follower's UserBoard
    */
    private void updateEveryone()
   {
      for(Person p: s) 
      {
          if( p.getUB() != null  )
          {
             
              UserBoard ub = p.getUB();
              DefaultListModel d = new DefaultListModel();
              List<String> m = p.getFMessages();
              for(String str: m )
              {
                  d.add(0, (Object)str);
                  
              }
              
              ub.recentMessages.setModel(d);
          }
      }
       
   }
    /**
     * action performed when "follow" is clicked
     * when clicked, the Person who this Person wants to follow, adds this Person 
     * to its subscriber list(following)
     * @param evt 
     */
    private void toFollowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toFollowActionPerformed
        DefaultListModel model = new DefaultListModel();
        for(Person p: s)
          {
              if(p.getName().equals(follow.getText()))
                 {
                     p.addFollower(user);
                     
                 }
           
          }
        Set<Person> following = new HashSet<Person>();
        for(Person pp: s)
           {
              if(pp.getFollowers().contains(user))
                 {
                   following.add(pp);
                   
                 }
           }
        for(Person ff: following)
           {
            model.add(0,(Object)ff.getName());
           }
        ListOfFollowing.setModel(model);
        follow.setText("");

      
    }//GEN-LAST:event_toFollowActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListOfFollowing;
    private javax.swing.JTextField follow;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> recentMessages;
    private javax.swing.JButton toFollow;
    private javax.swing.JButton toTweet;
    private javax.swing.JTextArea tweet;
    private javax.swing.JLabel userTitle;
    // End of variables declaration//GEN-END:variables
}
