package game;

import game.type.pieces;

public class Pannels {
	
	public pieces [][] board;
    private final int num_row;
    private final int num_column;
   
    public Pannels(int input_row,int input_column){ // the constructor of this class
        
        this.num_row = input_row;
        this.num_column = input_column;
        this.board = new pieces [input_row][input_column];
        this.reset(); // this is the function that make board empty

    }
    
    public void reset(){ // this is the function that make board empty
       int i,j;
       for(i = 0; i < num_row; i++){
           for(j = 0;j < num_column;j++){
               board[i][j] = pieces.emp;
           }
       }
    }
    
    public int get_num_row(){ //getter of num_row
        return num_row;
    }
    public int get_num_column(){ //getter of num_column
        return num_column;
    }
    
    public void printBoard(){
        int i,j;
        for(i = 0;i < num_row;i++){
            
            for(j = 0;j < num_column;j++){
                System.out.print(board[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}
