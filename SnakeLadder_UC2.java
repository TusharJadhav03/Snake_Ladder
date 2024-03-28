public class SnakeLadder_UC2 {
    
    public static void main(String[] args) {
        
        int diceRoll = 0;
        int current_position = 0;
        int max_position = 100;

        System.out.println("Welcome to Snake and Ladder Game!");

        for(current_position = 0;current_position<100;current_position++){

            diceRoll = (int) ((Math.random()*6)+1);
            current_position += diceRoll;
            current_position -= 1;
            System.out.println("Current position :"+current_position);


        }
    }
}
