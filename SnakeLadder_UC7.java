public class SnakeLadder_UC7 {
    
    public static void main(String[] args) {
        
        int diceRoll = 0;
        int current_position = 0;
        int max_position = 100;
        int ladder_start[] = {3,8,21,28,50};
        int snake_start[] = {32,48,62,88,95};
        int count = 0;
        int play = 1;

        System.out.println("Welcome to Snake and Ladder Game!");

        if(play ==1){
            System.out.println("Player 1 play");
            for(current_position = 0;current_position<100;current_position++){

                diceRoll = (int) ((Math.random()*6)+1);
                count ++;
                current_position += diceRoll;
                current_position -= 1;
                System.out.println("Current position :"+current_position);
    
                if(diceRoll == 0)
                    System.out.println("stay in the same position");
    
                if(current_position == ladder_start[0]){
                    current_position += diceRoll;
                    System.out.println("You got a ladder");
                    System.out.println(current_position);
                }
                else if(current_position == ladder_start[1]){
                    current_position += diceRoll;
                    System.out.println("You got a ladder");
                    System.out.println(current_position);
                }
                else if(current_position == ladder_start[2]){
                    current_position += diceRoll;
                    System.out.println("You got a ladder");
                    System.out.println(current_position);
                }
                else if(current_position == ladder_start[3]){
                    current_position += diceRoll;
                    System.out.println("You got a ladder");
                    System.out.println(current_position);
                }
                else if(current_position == ladder_start[4]){
                    current_position += diceRoll;
                    System.out.println("You got a ladder");
                    System.out.println(current_position);
                }
    
    
                if(current_position == snake_start[0]){
                    current_position -= diceRoll;
                    System.out.println("You bitten by a snake.");
                    System.out.println(current_position);
                }
                else if(current_position == snake_start[1]){
                    current_position -= diceRoll;
                    System.out.println("You bitten by a snake.");
                    System.out.println(current_position);
                }
                else if(current_position == snake_start[2]){
                    current_position -= diceRoll;
                    System.out.println("You bitten by a snake.");
                    System.out.println(current_position);
                }
                else if(current_position == snake_start[3]){
                    current_position -= diceRoll;
                    System.out.println("You bitten by a snake.");
                    System.out.println(current_position);
                }
                else if(current_position == snake_start[4]){
                    current_position -= diceRoll;
                    System.out.println("You bitten by a snake.");
                    System.out.println(current_position);
                }
    
                if(current_position <0)
                    current_position = 0;
    
    
                if(current_position == max_position){
                    System.out.println("Congratulations, You win the game!");
                }
                
                if(current_position > max_position){
                    current_position -= diceRoll;
                }
    
    
            }
            System.out.println("The total diceroll is :"+count);
            
        }
        play ++;
        if(play ==2){
            System.out.println("Player 2 play");
            for(current_position = 0;current_position<100;current_position++){

                diceRoll = (int) ((Math.random()*6)+1);
                count ++;
                current_position += diceRoll;
                current_position -= 1;
                System.out.println("Current position :"+current_position);
    
                if(diceRoll == 0)
                    System.out.println("stay in the same position");
    
                if(current_position == ladder_start[0]){
                    current_position += diceRoll;
                    System.out.println("You got a ladder");
                    System.out.println(current_position);
                }
                else if(current_position == ladder_start[1]){
                    current_position += diceRoll;
                    System.out.println("You got a ladder");
                    System.out.println(current_position);
                }
                else if(current_position == ladder_start[2]){
                    current_position += diceRoll;
                    System.out.println("You got a ladder");
                    System.out.println(current_position);
                }
                else if(current_position == ladder_start[3]){
                    current_position += diceRoll;
                    System.out.println("You got a ladder");
                    System.out.println(current_position);
                }
                else if(current_position == ladder_start[4]){
                    current_position += diceRoll;
                    System.out.println("You got a ladder");
                    System.out.println(current_position);
                }
    
    
                if(current_position == snake_start[0]){
                    current_position -= diceRoll;
                    System.out.println("You bitten by a snake.");
                    System.out.println(current_position);
                }
                else if(current_position == snake_start[1]){
                    current_position -= diceRoll;
                    System.out.println("You bitten by a snake.");
                    System.out.println(current_position);
                }
                else if(current_position == snake_start[2]){
                    current_position -= diceRoll;
                    System.out.println("You bitten by a snake.");
                    System.out.println(current_position);
                }
                else if(current_position == snake_start[3]){
                    current_position -= diceRoll;
                    System.out.println("You bitten by a snake.");
                    System.out.println(current_position);
                }
                else if(current_position == snake_start[4]){
                    current_position -= diceRoll;
                    System.out.println("You bitten by a snake.");
                    System.out.println(current_position);
                }
    
                if(current_position <0)
                    current_position = 0;
    
    
                if(current_position == max_position){
                    System.out.println("Congratulations, You win the game!");
                }
                
                if(current_position > max_position){
                    current_position -= diceRoll;
                }
    
    
            }
            System.out.println("The total diceroll is :"+count);
            

        }
        play --;
    }
}
