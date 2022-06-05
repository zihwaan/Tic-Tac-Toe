package game;

import game.type_of_pannel.pieces;

public class User {
    
    private String name; // name of player 
    private int num_wins; // number of total win
    private pieces o_x_emp; // the type of pieces
    
    public User(pieces piece_type) { // the constructor
        num_wins = 0;
        this.o_x_emp = piece_type;
    }
    
    public pieces get_o_x_emp(){ // getter of pannel type
        return o_x_emp;
    }
    public void set_o_x_emp(pieces piece_type){ //setter of pannel type
        this.o_x_emp = piece_type;
    }
    public void win_plus_one(){ // the method to set win++
        num_wins++;
    }
    
    public void win_to_Zero(){ // the method to reset wins/
        num_wins = 0;
    }
    public int get_num_wins(){ // getter of num_wins
        return num_wins;
    }
    public String get_name(){ // getter of name
        return name;
    }
    public void set_name(String name){ //setter of name
        this.name = name;
    }
}
