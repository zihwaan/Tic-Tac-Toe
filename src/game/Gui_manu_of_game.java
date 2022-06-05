package game;

import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;


public class Gui_manu_of_game extends javax.swing.JFrame {

    private Game_Algorithm GA;
    private Gui_play_of_game GamePlay;

    public Gui_manu_of_game(Game_Algorithm engine,Gui_play_of_game GamePlay) {
    	setResizable(false);
    	setAutoRequestFocus(false);
    	getContentPane().setBackground(new Color(0, 128, 0));
        Init();
        
        this.GA = engine;
        this.GamePlay = GamePlay;
    }

    private void Init() {
        Title = new javax.swing.JLabel();
        Title.setHorizontalAlignment(SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SKKU - Sam-Mok");
        setBackground(new java.awt.Color(224, 187, 149));

        Title.setFont(new Font("Arial", Font.BOLD, 36)); 
        Title.setForeground(new Color(255, 255, 0));
        Title.setText("SKKU Sam-mok Game with AI");
        Title.setToolTipText("");
        
        JLabel poxox = new JLabel();
        poxox.setIcon(new ImageIcon(getClass().getResource("poxox.png")));
        
        JLabel oxox = new JLabel();
        oxox.setIcon(new ImageIcon(getClass().getResource("oxox.png")));
        
        JLabel skku_logo = new JLabel();
        skku_logo.setIcon(new ImageIcon(getClass().getResource("skku.png")));
        Game_start = new javax.swing.JButton();
        Game_start.setForeground(new Color(0, 0, 128));
        Game_start.setBackground(new Color(0, 191, 255));
        
                Game_start.setText("Play with AI");
                Game_start.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        start_with_AI(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(377, Short.MAX_VALUE)
        			.addComponent(Title)
        			.addGap(319))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(152)
        					.addComponent(poxox, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
        					.addGap(239)
        					.addComponent(skku_logo, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 258, Short.MAX_VALUE))
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addGap(330)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(Game_start, GroupLayout.PREFERRED_SIZE, 547, GroupLayout.PREFERRED_SIZE)
        						.addComponent(Info_game, GroupLayout.PREFERRED_SIZE, 547, GroupLayout.PREFERRED_SIZE))
        					.addGap(114)))
        			.addComponent(oxox)
        			.addGap(96))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(119)
        			.addComponent(oxox, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        			.addGap(369))
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(51)
        					.addComponent(Title, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(skku_logo, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        					.addGap(61))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(157)
        					.addComponent(poxox)
        					.addGap(118)))
        			.addGap(17)
        			.addComponent(Game_start, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(43)
        			.addComponent(Info_game, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(243, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void start_with_AI(java.awt.event.ActionEvent evt) {
        setVisible(false);
        GamePlay.setVisible(true);
        GA.SKKU_Bot.set_name("SKKU_Bot");
    }

    private javax.swing.JButton Game_start;
    private javax.swing.JLabel Title;
}
