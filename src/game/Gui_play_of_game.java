package game;

import java.awt.Color;
import java.awt.Component;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Gui_play_of_game extends javax.swing.JFrame {

    private Gui_manu_of_game MainMenu;
    private Game_Algorithm GA;
    private int point;
    private Component frame = null;

    public Gui_play_of_game(Game_Algorithm engine) {
    	setBackground(Color.BLACK);
    	getContentPane().setBackground(new Color(144, 238, 144));
    	setResizable(false);
        init();
        this.GA = engine;
        MainMenu = new Gui_manu_of_game(this.GA, this);
        MainMenu.setVisible(true);
        engine.set_TurnOfSKKU(false);
                
    }

    private void init() {

        Pannel_Board = new javax.swing.JPanel();
        Pannel1 = new javax.swing.JPanel();
        Pannel1.setBounds(0, 0, 98, 99);
        pannel1 = new javax.swing.JButton();
        Pannel2 = new javax.swing.JPanel();
        Pannel2.setBounds(98, 0, 98, 98);
        pannel4 = new javax.swing.JButton();
        Pannel3 = new javax.swing.JPanel();
        Pannel3.setBounds(196, 0, 98, 98);
        pannel7 = new javax.swing.JButton();
        Pannel4 = new javax.swing.JPanel();
        Pannel4.setBounds(0, 99, 98, 98);
        pannel2 = new javax.swing.JButton();
        Pannel7 = new javax.swing.JPanel();
        Pannel7.setBounds(0, 197, 98, 98);
        pannel3 = new javax.swing.JButton();
        Pannel5 = new javax.swing.JPanel();
        Pannel5.setBounds(98, 99, 98, 98);
        pannel5 = new javax.swing.JButton();
        Pannel6B = new javax.swing.JPanel();
        Pannel6B.setBounds(196, 99, 122, 98);
        Pannel6 = new javax.swing.JPanel();
        pannel8 = new javax.swing.JButton();
        Pannel8 = new javax.swing.JPanel();
        Pannel8.setBounds(98, 197, 98, 98);
        pannel6 = new javax.swing.JButton();
        Pannel9 = new javax.swing.JPanel();
        Pannel9.setBounds(196, 197, 98, 98);
        pannel9 = new javax.swing.JButton();
        Banner = new javax.swing.JPanel();
        Banner.setBackground(new Color(152, 251, 152));
        Options = new javax.swing.JPanel();
        Options.setBackground(new Color(152, 251, 152));
        ResetGame = new javax.swing.JButton();
        ResetGame.setFont(new Font("Arial", Font.PLAIN, 18));
        ResetGame.setBackground(new Color(250, 250, 210));
        ResetGame.setBounds(52, 183, 176, 59);
        Write_History = new javax.swing.JButton();
        Write_History.setFont(new Font("Arial", Font.PLAIN, 18));
        Write_History.setBounds(52, 287, 176, 59);
        StartGame = new javax.swing.JButton();
        StartGame.setFont(new Font("Arial", Font.PLAIN, 18));
        StartGame.setBackground(new Color(250, 250, 210));
        StartGame.setBounds(52, 81, 176, 59);
        Point_jPannel = new javax.swing.JPanel();
        Point_jPannel.setBackground(new Color(173, 255, 47));
        Point_Label = new javax.swing.JLabel();
        Point_Label.setHorizontalAlignment(SwingConstants.CENTER);
        Point_Label.setBounds(33, 10, 175, 52);
        YOU = new javax.swing.JLabel();
        YOU.setBounds(86, 108, 116, 52);
        SKKU_Bot = new javax.swing.JLabel();
        SKKU_Bot.setBounds(69, 180, 135, 52);
        You_point = new javax.swing.JLabel();
        You_point.setBounds(172, 120, 63, 29);
        You_point.setHorizontalAlignment(SwingConstants.RIGHT);
        SKKU_Bot_point = new javax.swing.JLabel();
        SKKU_Bot_point.setBounds(172, 192, 63, 29);
        SKKU_Bot_point.setHorizontalAlignment(SwingConstants.RIGHT);


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SKKU Sam-Mok");

        Pannel1.setBackground(new java.awt.Color(254, 254, 254));
        Pannel1.setBorder(new javax.swing.border.MatteBorder(null));

        pannel1.setFont(new java.awt.Font("Arial", 1, 48));  
        pannel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pannel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pannel1_Click(evt);
            }
        });

        javax.swing.GroupLayout gl_Pannel1 = new javax.swing.GroupLayout(Pannel1);
        Pannel1.setLayout(gl_Pannel1);
        gl_Pannel1.setHorizontalGroup(
            gl_Pannel1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        gl_Pannel1.setVerticalGroup(
            gl_Pannel1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_Pannel1.createSequentialGroup()
                .addComponent(pannel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Pannel2.setBackground(new java.awt.Color(254, 254, 254));
        Pannel2.setBorder(new javax.swing.border.MatteBorder(null));

        pannel4.setFont(new java.awt.Font("Arial", 1, 48));  
        pannel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pannel4_Click(evt);
            }
        });

        javax.swing.GroupLayout gl_Pannel2 = new javax.swing.GroupLayout(Pannel2);
        Pannel2.setLayout(gl_Pannel2);
        gl_Pannel2.setHorizontalGroup(
            gl_Pannel2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        gl_Pannel2.setVerticalGroup(
            gl_Pannel2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Pannel3.setBackground(new java.awt.Color(252, 252, 252));
        Pannel3.setBorder(new javax.swing.border.MatteBorder(null));

        pannel7.setFont(new java.awt.Font("Arial", 1, 48));  
        pannel7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pannel7_Click(evt);
            }
        });

        javax.swing.GroupLayout gl_Pannel3 = new javax.swing.GroupLayout(Pannel3);
        Pannel3.setLayout(gl_Pannel3);
        gl_Pannel3.setHorizontalGroup(
            gl_Pannel3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        gl_Pannel3.setVerticalGroup(
            gl_Pannel3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Pannel4.setBackground(new java.awt.Color(254, 252, 250));
        Pannel4.setBorder(new javax.swing.border.MatteBorder(null));

        pannel2.setFont(new java.awt.Font("Arial", 1, 48));  
        pannel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pannel2_Click(evt);
            }
        });

        javax.swing.GroupLayout gl_Pannel4 = new javax.swing.GroupLayout(Pannel4);
        Pannel4.setLayout(gl_Pannel4);
        gl_Pannel4.setHorizontalGroup(
            gl_Pannel4.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        gl_Pannel4.setVerticalGroup(
            gl_Pannel4.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Pannel7.setBackground(new java.awt.Color(253, 251, 250));
        Pannel7.setBorder(new javax.swing.border.MatteBorder(null));

        pannel3.setFont(new java.awt.Font("Arial", 1, 48));  
        pannel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pannel3_Click(evt);
            }
        });

        javax.swing.GroupLayout gl_Pannel7 = new javax.swing.GroupLayout(Pannel7);
        Pannel7.setLayout(gl_Pannel7);
        gl_Pannel7.setHorizontalGroup(
            gl_Pannel7.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        gl_Pannel7.setVerticalGroup(
            gl_Pannel7.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Pannel5.setBackground(new java.awt.Color(254, 252, 250));
        Pannel5.setBorder(new javax.swing.border.MatteBorder(null));

        pannel5.setFont(new java.awt.Font("Arial", 1, 48));  
        pannel5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pannel5_Click(evt);
            }
        });

        javax.swing.GroupLayout gl_Pannel5 = new javax.swing.GroupLayout(Pannel5);
        Pannel5.setLayout(gl_Pannel5);
        gl_Pannel5.setHorizontalGroup(
            gl_Pannel5.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        gl_Pannel5.setVerticalGroup(
            gl_Pannel5.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Pannel6.setBackground(new java.awt.Color(251, 250, 248));
        Pannel6.setBorder(new javax.swing.border.MatteBorder(null));

        pannel8.setFont(new java.awt.Font("Arial", 1, 48));  
        pannel8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pannel8_Click(evt);
            }
        });

        javax.swing.GroupLayout gl_Pannel6 = new javax.swing.GroupLayout(Pannel6);
        Pannel6.setLayout(gl_Pannel6);
        gl_Pannel6.setHorizontalGroup(
            gl_Pannel6.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        gl_Pannel6.setVerticalGroup(
            gl_Pannel6.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout gl_Pannel6B = new javax.swing.GroupLayout(Pannel6B);
        Pannel6B.setLayout(gl_Pannel6B);
        gl_Pannel6B.setHorizontalGroup(
            gl_Pannel6B.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_Pannel6B.createSequentialGroup()
                .addComponent(Pannel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        gl_Pannel6B.setVerticalGroup(
            gl_Pannel6B.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_Pannel6B.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Pannel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Pannel8.setBackground(new java.awt.Color(251, 250, 248));
        Pannel8.setBorder(new javax.swing.border.MatteBorder(null));

        pannel6.setFont(new java.awt.Font("Arial", 1, 48));  
        pannel6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pannel6_Click(evt);
            }
        });

        javax.swing.GroupLayout gl_Pannel8 = new javax.swing.GroupLayout(Pannel8);
        Pannel8.setLayout(gl_Pannel8);
        gl_Pannel8.setHorizontalGroup(
            gl_Pannel8.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        gl_Pannel8.setVerticalGroup(
            gl_Pannel8.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Pannel9.setBackground(new java.awt.Color(250, 248, 246));
        Pannel9.setBorder(new javax.swing.border.MatteBorder(null));

        pannel9.setFont(new java.awt.Font("Arial", 1, 48)); 
        pannel9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pannel9_Click(evt);
            }
        });

        javax.swing.GroupLayout gl_Pannel9 = new javax.swing.GroupLayout(Pannel9);
        Pannel9.setLayout(gl_Pannel9);
        gl_Pannel9.setHorizontalGroup(
            gl_Pannel9.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        gl_Pannel9.setVerticalGroup(
            gl_Pannel9.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannel9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        ResetGame.setText("Reset");
        ResetGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtn_Clicked(evt);
            }
        });

        Write_History.setBackground(new Color(250, 250, 210));
        Write_History.setText("Write History (txt)");
        Write_History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Write_history(evt);
            }
        });

        StartGame.setText("Start Sam-Mok");
        StartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtn_Click(evt);
            }
        });

        Point_Label.setFont(new Font("Arial", Font.BOLD, 36)); 
        Point_Label.setText("Point");

        YOU.setFont(new java.awt.Font("Arial", 1, 24));
        YOU.setForeground(new java.awt.Color(51, 111, 44));
        YOU.setText("    YOU   :");

        SKKU_Bot.setFont(new java.awt.Font("Arial", 1, 24)); 
        SKKU_Bot.setForeground(new java.awt.Color(240, 84, 84));
        SKKU_Bot.setText("SKKU Bot : ");

        You_point.setFont(new java.awt.Font("Arial", 1, 24)); 
        You_point.setForeground(new java.awt.Color(0, 185, 0));
        You_point.setText("0");

        SKKU_Bot_point.setFont(new java.awt.Font("Arial", 1, 24));  
        SKKU_Bot_point.setForeground(new java.awt.Color(215, 73, 73));
        SKKU_Bot_point.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(1)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(Point_jPannel, GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        					.addGap(23)
        					.addComponent(Pannel_Board, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(7)
        					.addComponent(Banner, GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)))
        			.addGap(29)
        			.addComponent(Options, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(16)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(Options, GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        					.addContainerGap())
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(Banner, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(11)
        							.addComponent(Point_jPannel, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(Pannel_Board, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)))
        					.addGap(56))))
        );
        Banner.setLayout(null);
        
        JLabel Banner_Text = new JLabel("Beats the SKKU - Bot!!");
        Banner_Text.setFont(new Font("Arial", Font.BOLD, 43));
        Banner_Text.setForeground(new Color(255, 215, 0));
        Banner_Text.setHorizontalAlignment(SwingConstants.CENTER);
        Banner_Text.setBounds(22, 10, 526, 68);
        Banner.add(Banner_Text);
        Options.setLayout(null);
        Options.add(Write_History);
        Options.add(ResetGame);
        Options.add(StartGame);
        Pannel_Board.setLayout(null);
        Pannel_Board.add(Pannel1);
        Pannel_Board.add(Pannel2);
        Pannel_Board.add(Pannel3);
        Pannel_Board.add(Pannel4);
        Pannel_Board.add(Pannel7);
        Pannel_Board.add(Pannel5);
        Pannel_Board.add(Pannel6B);
        Pannel_Board.add(Pannel8);
        Pannel_Board.add(Pannel9);
        Point_jPannel.setLayout(null);
        Point_jPannel.add(Point_Label);
        Point_jPannel.add(YOU);
        Point_jPannel.add(You_point);
        Point_jPannel.add(SKKU_Bot);
        Point_jPannel.add(SKKU_Bot_point);
        
        JLabel YOU_logo = new JLabel();
        YOU_logo.setIcon(new ImageIcon(getClass().getResource("me.png")));
        YOU_logo.setBounds(12, 108, 50, 52);
        Point_jPannel.add(YOU_logo);
        
        JLabel SKKU_Bot_logo = new JLabel();
        SKKU_Bot_logo.setIcon(new ImageIcon(getClass().getResource("com.png")));
        SKKU_Bot_logo.setBounds(12, 180, 50, 50);
        Point_jPannel.add(SKKU_Bot_logo);
        getContentPane().setLayout(layout);

        pack();
    }

    private void pannel5_Click(java.awt.event.ActionEvent evt) {
        if (pannel5.getText().isEmpty()) {
           
            GA.Board.board[1][1] = GA.User_player.get_o_x_emp();
            pannel5.setText(GA.User_player.get_o_x_emp().toString());
            user_move();
            skku_move();
            
        }
    }

    private void pannel1_Click(java.awt.event.ActionEvent evt) {
        if (pannel1.getText().isEmpty()) {
            
            GA.Board.board[0][0] = GA.User_player.get_o_x_emp();
            pannel1.setText(GA.User_player.get_o_x_emp().toString());

            user_move();
            skku_move();

        }
    }

    private void pannel9_Click(java.awt.event.ActionEvent evt) {
       
        if (pannel9.getText().isEmpty()) {
            
            GA.Board.board[2][2] = GA.User_player.get_o_x_emp();
            pannel9.setText(GA.User_player.get_o_x_emp().toString());

            user_move();
            skku_move();
            
        }
        
    }

    private void pannel4_Click(java.awt.event.ActionEvent evt) {
        if (pannel4.getText().isEmpty()) {
            
            GA.Board.board[0][1] = GA.User_player.get_o_x_emp();
            pannel4.setText(GA.User_player.get_o_x_emp().toString());

            user_move();
            skku_move();
            
        }
        
    }

    private void resetBtn_Clicked(java.awt.event.ActionEvent evt) {
        board_reset();
    }

    private void pannel2_Click(java.awt.event.ActionEvent evt) {
        if (pannel2.getText().isEmpty()) {
            
            GA.Board.board[1][0] = GA.User_player.get_o_x_emp();
            pannel2.setText(GA.User_player.get_o_x_emp().toString());

            user_move();
            skku_move();
            
        }
        
    }

    private void pannel7_Click(java.awt.event.ActionEvent evt) {
        if (pannel7.getText().isEmpty()) {
            
            GA.Board.board[0][2] = GA.User_player.get_o_x_emp();
            pannel7.setText(GA.User_player.get_o_x_emp().toString());

            user_move();
            skku_move();
            
        }
        
    }

    private void pannel8_Click(java.awt.event.ActionEvent evt) {
        if (pannel8.getText().isEmpty()) {
            
            GA.Board.board[1][2] = GA.User_player.get_o_x_emp();
            pannel8.setText(GA.User_player.get_o_x_emp().toString());

            user_move();
            skku_move();
            
        }
        
    }

    private void pannel3_Click(java.awt.event.ActionEvent evt) {
        if (pannel3.getText().isEmpty()) {
            
            GA.Board.board[2][0] = GA.User_player.get_o_x_emp();
            pannel3.setText(GA.User_player.get_o_x_emp().toString());

            user_move();
            skku_move();
            
        }
        
    }

    private void pannel6_Click(java.awt.event.ActionEvent evt) {
        if (pannel6.getText().isEmpty()) {
            
            GA.Board.board[2][1] = GA.User_player.get_o_x_emp();
            pannel6.setText(GA.User_player.get_o_x_emp().toString());

            user_move();
            skku_move();
            
        }
        
    }

    private void startBtn_Click(java.awt.event.ActionEvent evt) {
        
            board_reset();
            
            setSKKUTurn();
            
            if ( GA.get_TurnOfSKKU()) {
               GA.Board.board[0][0] = GA.SKKU_Bot.get_o_x_emp();
               pannel1.setText(GA.SKKU_Bot.get_o_x_emp().toString());
               setUserTurn();
            }
        
    }

    private void Write_history(java.awt.event.ActionEvent evt) {
    	// Write the history text file.
    	FileWriter fw; // FileWriter

		try {
			fw = new FileWriter("History.txt", false);
			fw.write("");
			fw.append(GA.Board.history+"\n\n");
			fw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    private void setSKKUTurn() {
        GA.set_TurnOfSKKU(true);
    }

    private void setUserTurn() {
        GA.set_TurnOfSKKU(false);
    }

    private void board_reset() {

        GA.Board.reset();
        btnColor_reset();
        pannel1.setText("");
        pannel4.setText("");
        pannel7.setText("");
        pannel2.setText("");
        pannel5.setText("");
        pannel8.setText("");
        pannel3.setText("");
        pannel6.setText("");
        pannel9.setText("");

    }

    private void user_move() {

        point = GA.cal_score_If_Win(0);
        setSKKUTurn();
        if (point > 0) {
            
            System.out.println("Player1 Wins");
            GA.Board.history +="Player1 Wins\n";
            GA.Board.printBoard();
            GA.SKKU_Bot.win_plus_one();
            SKKU_Bot_point.setText(Integer.toString(GA.SKKU_Bot.get_num_wins()));
            JOptionPane.showMessageDialog(frame,
                                    "YOU Lost , Your Opponent has played better than you");
           
            

        } else if (point < 0) {
            
            System.out.println("Player2 wins");
            GA.Board.history +="Player2 Wins\n";
            GA.Board.printBoard();
            GA.User_player.win_plus_one();
            You_point.setText(Integer.toString(GA.User_player.get_num_wins()));
            
            JOptionPane.showMessageDialog(frame,
                                    "You beat the SKKU Bot!!");
           

        }

        if (!GA.isNotFinish()) {
            JOptionPane.showMessageDialog(frame, "It's Draw");
           
        }

    }

    private void skku_move() {

        int[] SolutionMove = new int[3];

        if (GA.get_TurnOfSKKU()) {

            SolutionMove = GA.Calculate_Solution();

            if (SolutionMove[2] == -1) {
                System.out.println("Game Draw");
                GA.Board.history +="Game Draw\n";
                JOptionPane.showMessageDialog(frame,
                        "It's Draw");
            } else {

                if (SolutionMove[0] == 0 && SolutionMove[1] == 0) {
                    GA.Board.board[0][0] = GA.SKKU_Bot.get_o_x_emp();
                    pannel1.setText(GA.SKKU_Bot.get_o_x_emp().toString());

                }else if (SolutionMove[0] == 1 && SolutionMove[1] == 0) {
                    GA.Board.board[1][0] = GA.SKKU_Bot.get_o_x_emp();
                    pannel2.setText(GA.SKKU_Bot.get_o_x_emp().toString());
                }else if (SolutionMove[0] == 2 && SolutionMove[1] == 0) {
                    GA.Board.board[2][0] = GA.SKKU_Bot.get_o_x_emp();
                    pannel3.setText(GA.SKKU_Bot.get_o_x_emp().toString());
                }else if (SolutionMove[0] == 0 && SolutionMove[1] == 1) {
                    GA.Board.board[0][1] = GA.SKKU_Bot.get_o_x_emp();
                    pannel4.setText(GA.SKKU_Bot.get_o_x_emp().toString());
                }else if (SolutionMove[0] == 1 && SolutionMove[1] == 1) {
                    GA.Board.board[1][1] = GA.SKKU_Bot.get_o_x_emp();
                    pannel5.setText(GA.SKKU_Bot.get_o_x_emp().toString());
                }else if (SolutionMove[0] == 2 && SolutionMove[1] == 1) {
                    GA.Board.board[2][1] = GA.SKKU_Bot.get_o_x_emp();
                    pannel6.setText(GA.SKKU_Bot.get_o_x_emp().toString());
                }else if (SolutionMove[0] == 0 && SolutionMove[1] == 2) {
                    GA.Board.board[0][2] = GA.SKKU_Bot.get_o_x_emp();
                    pannel7.setText(GA.SKKU_Bot.get_o_x_emp().toString());
                }else if (SolutionMove[0] == 1 && SolutionMove[1] == 2) {
                    GA.Board.board[1][2] = GA.SKKU_Bot.get_o_x_emp();
                    pannel8.setText(GA.SKKU_Bot.get_o_x_emp().toString());
                }else if (SolutionMove[0] == 2 && SolutionMove[1] == 2) {
                    GA.Board.board[2][2] = GA.SKKU_Bot.get_o_x_emp();
                    pannel9.setText(GA.SKKU_Bot.get_o_x_emp().toString());
                }

                setUserTurn();
                point = GA.cal_score_If_Win(0);
                if (point > 0) {
                    System.out.println("Player1 Wins");
                    GA.Board.history +="Player1 Wins\n";
                    GA.SKKU_Bot.win_plus_one();
                    SKKU_Bot_point.setText(Integer.toString(GA.SKKU_Bot.get_num_wins()));
                    GA.Board.printBoard();
                    JOptionPane.showMessageDialog(frame,
                            "You lose..");

                }
                if (!GA.isNotFinish()) {
                    JOptionPane.showMessageDialog(frame, "It's Draw");
                
                   
                }
            }

        }

        
        System.out.println("Finish");
        GA.Board.history +="Finish\n";
    }
    
    
    
    void btnColor_reset(){
        pannel1.setBackground(new java.awt.Color(249,249,248));
        pannel4.setBackground(new java.awt.Color(249,249,248));
        pannel7.setBackground(new java.awt.Color(249,249,248));
        pannel2.setBackground(new java.awt.Color(249,249,248));
        pannel5.setBackground(new java.awt.Color(249,249,248));
        pannel8.setBackground(new java.awt.Color(249,249,248));
        pannel3.setBackground(new java.awt.Color(249,249,248));
        pannel6.setBackground(new java.awt.Color(249,249,248));
        pannel9.setBackground(new java.awt.Color(249,249,248));
        
    }
    private javax.swing.JButton Write_History;
    private javax.swing.JLabel SKKU_Bot;
    private javax.swing.JLabel SKKU_Bot_point;
    private javax.swing.JLabel You_point;
    private javax.swing.JButton ResetGame;
    private javax.swing.JLabel Point_Label;
    private javax.swing.JButton StartGame;
    private javax.swing.JLabel YOU;
    private javax.swing.JPanel Pannel_Board;
    private javax.swing.JPanel Pannel8;
    private javax.swing.JPanel Pannel9;
    private javax.swing.JPanel Banner;
    private javax.swing.JPanel Options;
    private javax.swing.JPanel Point_jPannel;
    private javax.swing.JPanel Pannel1;
    private javax.swing.JPanel Pannel2;
    private javax.swing.JPanel Pannel3;
    private javax.swing.JPanel Pannel4;
    private javax.swing.JPanel Pannel7;
    private javax.swing.JPanel Pannel5;
    private javax.swing.JPanel Pannel6B;
    private javax.swing.JPanel Pannel6;
    private javax.swing.JButton pannel1;
    private javax.swing.JButton pannel4;
    private javax.swing.JButton pannel7;
    private javax.swing.JButton pannel2;
    private javax.swing.JButton pannel5;
    private javax.swing.JButton pannel8;
    private javax.swing.JButton pannel3;
    private javax.swing.JButton pannel6;
    private javax.swing.JButton pannel9;
}
