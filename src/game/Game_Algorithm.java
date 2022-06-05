package game;

import game.type_of_pannel.pieces;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class Game_Algorithm {
    
    public Pannels Board;
    public User player1,player2;
    private int row,col;
    private boolean IsPlayer1Turn;
    
    public Game_Algorithm(Pannels Board,User p1,User p2){
        this.Board = Board;
        this.player1 = p1;
        this.player2 = p2;
        IsPlayer1Turn = true;
    }
    
    public boolean get_IsPlayer1Turn(){
        return IsPlayer1Turn;
    }
    
    public void set_IsPlayer1Turn(boolean IsPlayer1Turn){
        this.IsPlayer1Turn = IsPlayer1Turn;
    }
    
    public boolean IsMoveLeft(){
        for(row = 0;row < Board.get_num_row();row++){
            for(col = 0;col < Board.get_num_column();col++){
                if(Board.board[row][col] == pieces.emp)
                    return true;
            }
        }
        
        return false;
    }
    
    public int evaluate_score(int depth){
        
        // Checking for Rows for X or O victory.
        pieces type = pieces.emp;
        for (row = 0; row < Board.get_num_row(); row++)
        {
            type = Board.board[row][0];
            for(col = 0;col < Board.get_num_column();col++){
                if(Board.board[row][col] != type)
                    break;
            }
            
            if(col == Board.get_num_column()){
            
                if(type == player1.get_o_x_emp())
                    return 10 - depth;
                else if(type == player2.get_o_x_emp())
                    return depth - 10;
            }
        }

        // Checking for Columns for X or O victory.
        for (col = 0; col < Board.get_num_column(); col++)
        {
            type = Board.board[0][col];
            for(row = 0;row < Board.get_num_row();row++){
                if(Board.board[row][col] != type)
                    break;
                
            }
            
            if(row == Board.get_num_row()){
                            
                if(type == player1.get_o_x_emp())
                    return 10 - depth;
                else if(type == player2.get_o_x_emp())
                    return depth - 10;
            }
        }

        // Checking for Diagonals for X or O victory.
        type = Board.board[0][0];
        for(row = 0;row < Board.get_num_row();row++){
            
            if(Board.board[row][row] != type)
                break;
            
        }
        if(row == Board.get_num_row()){
            
           
            if(type == player1.get_o_x_emp())
                return 10 - depth;
            else if(type == player2.get_o_x_emp())
                    return depth - 10;
        }
        
        
        row = 0;
        col = Board.get_num_column()-1;
        type = Board.board[row][col];
        while(col >= 0){
            if(Board.board[row][col] != type)
                break;
            row++;
            col--;
        }
        
        if(col < 0){
            
            if(type == player1.get_o_x_emp())
                return 10 - depth;
            else if(type == player2.get_o_x_emp())
                    return depth - 10;
        }

        // Else if none of them have won then return 0
        return 0; 
        
    }
    
    public int minimax(boolean isMax,int depth)
    {
        
        int score = evaluate_score(depth+1);

        // If Maximizer has won the game return his/her
        // evaluated score
        if (score > 0)
            return score;

        // If Minimizer has won the game return his/her
        // evaluated score
        if (score < 0)
            return score;

        // If there are no more moves and no winner then
        // it is a tie
        if (IsMoveLeft()==false)
            return 0;

        // If this maximizer's move
        if (isMax)
        {
            
            int best = -1000;

            // Traverse all cells
            for (int i = 0; i < Board.get_num_row(); i++)
            {
                for (int j = 0; j< Board.get_num_column(); j++)
                {
                    // Check if cell is empty
                    if (Board.board[i][j] == pieces.emp)
                    {
                        // Make the move
                        Board.board[i][j] = player1.get_o_x_emp();

                        // Call minimax recursively and choose
                        // the maximum value
                        best = max(best , minimax(!isMax,depth+1));

                        // Undo the move
                        Board.board[i][j] = pieces.emp;
                    }
                }
            }
            return best;
        }

        // If this minimizer's move
        else
        {
            int best = 1000;

            // Traverse all cells
            for (int i = 0; i < Board.get_num_row(); i++)
            {
                for (int j = 0; j < Board.get_num_column(); j++)
                {
                    // Check if cell is empty
                    if (Board.board[i][j] == pieces.emp)
                    {
                        // Make the move
                        Board.board[i][j] = player2.get_o_x_emp();

                        // Call minimax recursively and choose
                        // the minimum value
                        best = min(best , minimax(!isMax,depth+1));

                        // Undo the move
                        Board.board[i][j] = pieces.emp;
                    }
                }
            }
            return best;
        }
    }
    
    public  int[] findBestMove()
    {
        
        int bestVal = -1000;
        int[] bestMove = new int[3];
        bestMove[0] = -1;
        bestMove[1] = -1;
        bestMove[2] = -1;
        // Traverse all cells, evalutae minimax function for
        // all empty cells. And return the cell with optimal
        // value.
        
        System.out.println("Computer is evaluting the best possible move.......");
        for (int i = 0; i < Board.get_num_row(); i++)
        {
            for (int j = 0; j < Board.get_num_column(); j++)
            {
                // Check if celll is empty
                if (Board.board[i][j] == pieces.emp)
                {
                    // Make the move
                    Board.board[i][j] = player1.get_o_x_emp();

                    // compute evaluation function for this
                    // move.
                    int moveVal = minimax(false,0);
                    // Undo the move
               
                    Board.board[i][j] = pieces.emp;

                    // If the value of the current move is
                    // more than the best value, then update
                    // best/
                    if (moveVal > bestVal)
                    {
                        bestMove[0] = i;
                        bestMove[1] = j;
                        bestVal = moveVal;
                        bestMove[2] = bestVal;
                    }
                }
            }
        }
        System.out.println("done, Best possible move is " + bestMove[0] + "," +bestMove[1] + " with score " + bestVal);
        return bestMove;
    }
    
    
   
}
    

