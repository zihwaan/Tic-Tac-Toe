package game;

import java.awt.Component;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;


public class Gui_Main_Menu extends javax.swing.JFrame {

    private game_engine engine;
    private Gui_game_play GamePlay;
    private boolean IsTwoPlayerGame;
    private boolean firsttime;

    /**
     * Creates new form 
     * @param player1
    
     */
    public Gui_Main_Menu(game_engine engine,Gui_game_play GamePlay) {
    	setResizable(false);
    	setAutoRequestFocus(false);
    	getContentPane().setBackground(new Color(0, 128, 0));
        initComponents();
        
        firsttime = true;
        this.engine = engine;
        this.GamePlay = GamePlay;
        this.IsTwoPlayerGame = false;
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        play_with_computer = new javax.swing.JButton();
        play_with_computer.setForeground(new Color(0, 0, 128));
        play_with_computer.setBackground(new Color(0, 191, 255));
        welcome = new javax.swing.JLabel();
        welcome.setHorizontalAlignment(SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setBackground(new java.awt.Color(224, 187, 149));

        jPanel1.setBackground(new java.awt.Color(240, 242, 241));

        play_with_computer.setText("Play with AI");
        play_with_computer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_with_computerActionPerformed(evt);
            }
        });
        
        JButton Info_game = new JButton();
        Info_game.setText("Information about this game");
        Info_game.setForeground(new Color(0, 0, 128));
        Info_game.setBackground(new Color(0, 191, 255));
        Info_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	JOptionPane.showMessageDialog(null, "The object of this game is to get three in a row. \n"
            			+ "You play on a three by three game board. The first player is known as X and the second is O. \n"
            			+ "Players alternate placing Xs and Os on the game board until either oppent has three in a row or all nine squares are filled. \n"
            			+ "X always goes first, and in the event that no one has three in a row, the stalemate is called a cat game.");
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        					.addGap(25)
        					.addComponent(play_with_computer, GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE))
        				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        					.addContainerGap(25, Short.MAX_VALUE)
        					.addComponent(Info_game, GroupLayout.PREFERRED_SIZE, 547, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(43)
        			.addComponent(play_with_computer, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(35)
        			.addComponent(Info_game, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        welcome.setFont(new Font("Arial", Font.BOLD, 36)); 
        welcome.setForeground(new Color(255, 255, 0));
        welcome.setText("SKKU Sam-mok Game with AI");
        welcome.setToolTipText("");
        
        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setIcon(new ImageIcon(getClass().getResource("poxox.png")));
        
        JLabel lblNewLabel_1 = new JLabel();
        lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("oxox.png")));
        
        JLabel lblNewLabel_3 = new JLabel();
        lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("skku.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(152)
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
        			.addGap(239)
        			.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
        			.addComponent(lblNewLabel_1)
        			.addGap(96))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(336, Short.MAX_VALUE)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 584, GroupLayout.PREFERRED_SIZE)
        			.addGap(287))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(377, Short.MAX_VALUE)
        			.addComponent(welcome)
        			.addGap(319))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(51)
        			.addComponent(welcome, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        			.addGap(18)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
        			.addGap(129))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(119)
        			.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        			.addGap(369))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(157)
        			.addComponent(lblNewLabel)
        			.addContainerGap(405, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void play_with_computerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_with_computerActionPerformed
        // TODO add your handling code here:
        
        engine.player1.set_name("COMPUTER");
        setVisible(false);
        GamePlay.setVisible(true);
        IsTwoPlayerGame = false;
        
        if(firsttime){
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "1.Click on Start Game Button to play the Game\n" 
                                           + "2.Current Turn will be displyed at the top of the game window\n");
            firsttime = false;
        }
        
    }//GEN-LAST:event_play_with_computerActionPerformed

    public boolean get_IsTwoPlayerGame(){
        return IsTwoPlayerGame;
        
    }
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton play_with_computer;
    private javax.swing.JLabel welcome;
}
