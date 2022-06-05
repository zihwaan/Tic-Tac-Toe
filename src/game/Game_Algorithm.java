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
    
    public boolean isNotFinish(){ // whether there are left pannel
        for(row = 0;row < Board.get_num_row();row++){
            for(column = 0;column < Board.get_num_column();column++){
                if(Board.board[row][column] == pieces.emp)
                    return true;
            }
        }
        return false;
    }
    
    public int cal_score_If_Win(int input_cost){
        
        // Check for win of X or O.
        pieces typeOfPiece = pieces.emp;
        for (row = 0; row < Board.get_num_row(); row++)
        {
            typeOfPiece = Board.board[row][0];
            for(column = 0;column < Board.get_num_column();column++){
                if(Board.board[row][column] != typeOfPiece)
                    break;
            }
            
            if(column == Board.get_num_column()){
            
                if(typeOfPiece == SKKU_Bot.get_o_x_emp())
                    return 10 - input_cost;
                else if(typeOfPiece == User_player.get_o_x_emp())
                    return input_cost - 10;
            }
        }

        
        for (column = 0; column < Board.get_num_column(); column++)
        {
            typeOfPiece = Board.board[0][column];
            for(row = 0;row < Board.get_num_row();row++){
                if(Board.board[row][column] != typeOfPiece)
                    break;
                
            }
            
            if(row == Board.get_num_row()){
                            
                if(typeOfPiece == SKKU_Bot.get_o_x_emp())
                    return 10 - input_cost;
                else if(typeOfPiece == User_player.get_o_x_emp())
                    return input_cost - 10;
            }
        }

        typeOfPiece = Board.board[0][0];
        for(row = 0;row < Board.get_num_row();row++){
            
            if(Board.board[row][row] != typeOfPiece)
                break;
            
        }
        if(row == Board.get_num_row()){
            if(typeOfPiece == SKKU_Bot.get_o_x_emp())
                return 10 - input_cost;
            else if(typeOfPiece == User_player.get_o_x_emp())
                    return input_cost - 10;
        }
        
        
        row = 0;
        column = Board.get_num_column()-1;
        typeOfPiece = Board.board[row][column];
        while(column >= 0){
            if(Board.board[row][column] != typeOfPiece)
                break;
            row++;
            column--;
        }
        
        if(column < 0){
            if(typeOfPiece == SKKU_Bot.get_o_x_emp())
                return 10 - input_cost;
            else if(typeOfPiece == User_player.get_o_x_emp())
                return input_cost - 10;
        }

        // If No one won, return 0.
        return 0; 
        
    }
    
    public int recur_Cost_Func(int input_score, boolean is_Maximum)
    {
        
        int score = cal_score_If_Win(input_score+1);
        
        // if win the game, return score.
        if(score!=0) {
        	return score;
        }

        // it is when draw is occur. return 0.
        if (isNotFinish()==false) {
            return 0;
        }
        
        if (is_Maximum)
        {
            
            int maxVal = -1000;
            
            //check for all pannels
            for (int i = 0; i < Board.get_num_row(); i++)
            {
                for (int j = 0; j< Board.get_num_column(); j++)
                {
                    // if pannel is empty
                    if (Board.board[i][j] == pieces.emp)
                    {
                        Board.board[i][j] = SKKU_Bot.get_o_x_emp();
                        maxVal = max(maxVal , recur_Cost_Func(input_score+1,!is_Maximum)); // call recursive function
                        //restore the movement.
                        Board.board[i][j] = pieces.emp;
                    }
                }
            }
            return maxVal;
        }else
        {
            int minVal = 1000;

            //check for all pannels
            for (int i = 0; i < Board.get_num_row(); i++)
            {
                for (int j = 0; j < Board.get_num_column(); j++)
                {
                	// if pannel is empty
                    if (Board.board[i][j] == pieces.emp)
                    {
                        Board.board[i][j] = User_player.get_o_x_emp();
                        minVal = min(minVal , recur_Cost_Func(input_score+1,!is_Maximum));// call recursive function
                        Board.board[i][j] = pieces.emp; //restore the movement.
                    }
                }
            }
            return minVal;
        }
    }
    
    public  int[] Calculate_Solution()
    {
        int[] solution = new int[3];
        solution[0] = -1;
        solution[1] = -1;
        solution[2] = -1;
        int result = -1000;
        
        System.out.println("****** SKKU Bot is evaluting the best possible move ******");
        Board.history += "****** SKKU Bot is evaluting the best possible move ******"+ "\n";
        // while traveling all of pannels, calculate the optimal value of movement using recur Function
        for (int i = 0; i < Board.get_num_row(); i++)
        {
            for (int j = 0; j < Board.get_num_column(); j++)
            {
                // if pannel is empty
                if (Board.board[i][j] == pieces.emp)
                {
                    Board.board[i][j] = SKKU_Bot.get_o_x_emp();
                    int movement = recur_Cost_Func(0,false); // call recur function
                    // restore the movement
                    Board.board[i][j] = pieces.emp;

                    if (movement > result) // if it find the better solution, update.
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
    

