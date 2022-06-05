package game;

import game.type_of_pannel.pieces;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class Game_Algorithm {
    
    public Pannels Board;
    public User SKKU_Bot,User_player;
    private int row,column;
    private boolean TurnOfSKKU;
    
    public Game_Algorithm(Pannels Board,User p1,User p2){ // constructor of this class
        this.Board = Board;
        this.SKKU_Bot = p1;
        this.User_player = p2;
        TurnOfSKKU = true;
    }
    
    public boolean get_TurnOfSKKU(){ // getter of TurnOfSKKU
        return TurnOfSKKU;
    }
    
    public void set_TurnOfSKKU(boolean TurnOfSKKU){ // setter of TurnOfSKKU
        this.TurnOfSKKU = TurnOfSKKU;
    }
    
    public boolean IsMoveLeft(){
        for(row = 0;row < Board.get_num_row();row++){
            for(column = 0;column < Board.get_num_column();column++){
                if(Board.board[row][column] == pieces.emp)
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
            for(column = 0;column < Board.get_num_column();column++){
                if(Board.board[row][column] != type)
                    break;
            }
            
            if(column == Board.get_num_column()){
            
                if(type == SKKU_Bot.get_o_x_emp())
                    return 10 - depth;
                else if(type == User_player.get_o_x_emp())
                    return depth - 10;
            }
        }

        // Checking for Columns for X or O victory.
        for (column = 0; column < Board.get_num_column(); column++)
        {
            type = Board.board[0][column];
            for(row = 0;row < Board.get_num_row();row++){
                if(Board.board[row][column] != type)
                    break;
                
            }
            
            if(row == Board.get_num_row()){
                            
                if(type == SKKU_Bot.get_o_x_emp())
                    return 10 - depth;
                else if(type == User_player.get_o_x_emp())
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
            
           
            if(type == SKKU_Bot.get_o_x_emp())
                return 10 - depth;
            else if(type == User_player.get_o_x_emp())
                    return depth - 10;
        }
        
        
        row = 0;
        column = Board.get_num_column()-1;
        type = Board.board[row][column];
        while(column >= 0){
            if(Board.board[row][column] != type)
                break;
            row++;
            column--;
        }
        
        if(column < 0){
            
            if(type == SKKU_Bot.get_o_x_emp())
                return 10 - depth;
            else if(type == User_player.get_o_x_emp())
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
                        Board.board[i][j] = SKKU_Bot.get_o_x_emp();

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
                        Board.board[i][j] = User_player.get_o_x_emp();

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
    
    public  int[] Calculate_Solution()
    {
        
        int result = -1000;
        int[] solution = new int[3];
        solution[0] = -1;
        solution[1] = -1;
        solution[2] = -1;
        // Traverse all cells, evalutae minimax function for
        // all empty cells. And return the cell with optimal
        // value.
        
        System.out.println("****** SKKU Bot is evaluting the best possible move ******");
        Board.history += "****** SKKU Bot is evaluting the best possible move ******"+ "\n";
        for (int i = 0; i < Board.get_num_row(); i++)
        {
            for (int j = 0; j < Board.get_num_column(); j++)
            {
                // Check if celll is empty
                if (Board.board[i][j] == pieces.emp)
                {
                    // Make the move
                    Board.board[i][j] = SKKU_Bot.get_o_x_emp();

                    // compute evaluation function for this
                    // move.
                    int movement = minimax(false,0);
                    // Undo the move
               
                    Board.board[i][j] = pieces.emp;

                    // If the value of the current move is
                    // more than the best value, then update
                    // best/
                    if (movement > result)
                    {
                        solution[0] = i;
                        solution[1] = j;
                        result = movement;
                        solution[2] = result;
                    }
                }
            }
        }
        System.out.println("The calculated result of AI is " + solution[0] + "," +solution[1] + " with point " + result);
        Board.history += "The calculated result of AI is " + solution[0] + "," +solution[1] + " with point " + result + "\n"; //record the history of this game.
        return solution;
    }
    
    
   
}
    

