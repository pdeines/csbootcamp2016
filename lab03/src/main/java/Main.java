import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String FIGHT_DECISION = "fight";
    private static final String SURRENDER_DECISION = "surrender";
    private static final String INVENTORY_DECISION = "inventory";

    private static final int VICTORY_OUTCOME = 1;
    private static final int DEFEAT_OUTCOME = 2;

    /**
     * This is the main entry point for our game.  yayyyy.
     * @param args NOT USED
     */
    public static void main(String[] args) {

        Champion theChamp = buildChampion( );
        System.out.println( theChamp );

        /* UNCOMMENT ME LATER
        gameIntro( theChamp );
        int outcome = battleLoop( theChamp );
        endGame( theChamp, outcome);
        */

    }

    /**
     * Prompts the user to create a champion for the game by asking for the name and fighter and stuff
     * @return a champion object specified by the user.
     */
    public static Champion buildChampion(){
        System.out.println( "Welcome to Monster Killer!  Create your champion!" );
        String name = readLine("Champion Name: ");
        String type = readLine("Champion Type ("+ChampionType.FIGHTER+", "+ChampionType.ARCHER+", "+ChampionType.MAGE+", "+ChampionType.THIEF+"): ");
        String reroll;
        int health = 0;
        do {
            health = (int)(Math.random() * 100);
            System.out.println( "You have rolled a champ with " + health +"hp." );
            reroll = readLine( "Reroll? (y/n)?:" );
        } while (!reroll.equals("n"));

        return new Champion(name, type, health);
    }




    /**
     * Prints out the compelling background story for the game before it begins
     */
    public static void gameIntro( Champion theChamp){
        System.out.println("");
        System.out.println("");
        System.out.println(theChamp.getName() + " wakes up groggily with a terrible headache and a big gash over their head " +
                "and then looks around. \n" + theChamp.getName() + "'realizes that somehow they have been captured and placed into a colliseum. " +
                theChamp.getName() + "'s ears are \n ringing with the sound of a large crowd cheering. Suddenly, before you know, it gates" +
                " on the far \n east side open up and a Monster rushes you...");

    }

    /**
     * This is the main game loop.  Monsters continue to charge into the game for you to fight until you surrender.
     * Upon surrenduring the loop is exited.
     * @param theChamp  the champion object that the user created.
     */
/* ----UNCOMMENT ME LATER ----
    public static int battleLoop( Champion theChamp) {
        String decision = FIGHT_DECISION;

        while (theChamp.getHealth() > 0 && decision.equals( FIGHT_DECISION ) ) {
            Monster enemy = new Monster("Snake", 15, 5);
            System.out.println( enemy );
            System.out.println( theChamp );
            decision = fightPrompt();

            switch (decision) {
                case SURRENDER_DECISION:
                    System.out.println( "The crowd boos as you curl up and cower in the fetal position. BUT, miraculously your life has been spared." );
                    return VICTORY_OUTCOME;
                case INVENTORY_DECISION:
                    break;
                case FIGHT_DECISION:
                    int outcome = attackLoop( theChamp, enemy );
                    if ( outcome == DEFEAT_OUTCOME) {
                        return DEFEAT_OUTCOME;
                    };
                    break;
            }
        }

        return VICTORY_OUTCOME;

    }
*/

    /**
     * This function loops while the champ and monster attack eachother until one of the two die.
     * @param theChamp champion that the user created
     * @param enemy the randomly generated monster.
     */
/* ----UNCOMMENT ME LATER ----
    public static int attackLoop( Champion theChamp, Monster enemy){
        while (theChamp.isAlive() && enemy.isAlive()) {

            theChamp.attack( enemy );
            if( enemy.isAlive() ) {
                enemy.attack( theChamp );
            } else {
                System.out.println( "You have defeated the monster.  It has dropped " + enemy.getGold() + " gold. Which you pick up." );
                theChamp.pickupGold( enemy.getGold() );
                return VICTORY_OUTCOME;
            }

            if (!theChamp.isAlive()) {
                return DEFEAT_OUTCOME;
            }
        }

        return VICTORY_OUTCOME;
    }
*/

    /**
     * Prints the end game message
     * @param theChamp
     * @param outcome
     */
    public static void endGame(Champion theChamp, int outcome){
        if (outcome == DEFEAT_OUTCOME ) {
            System.out.println( " \n \n You lose. You get nothing! Good Day sir!" );
            System.exit( 0 );
        } else if (outcome == VICTORY_OUTCOME) {
            System.out.println("Congrats: You are still alive. Your gold score: " + theChamp.getGold() );
            System.exit(0);
        }
    }

    /**
     * Asks the user whether they want to continue fighting or surrender, then returns the response
     * @return string "fight" or string "surrender"
     */
    public static String fightPrompt() {
        String retVal;
        do {
            retVal = readLine("What will you do? (fight/surrender): ");
        } while ( !retVal.equals( FIGHT_DECISION ) && !retVal.equals( SURRENDER_DECISION ) );
        return retVal;
    }

    /**
     * This is a wrapper function that makes it easier to read in from the command line
     * @param prompt A string that is displayed before the user is prompted for input
     * @return The input entered into the command line console
     */
    public static String readLine(String prompt){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print(prompt);
            return br.readLine();
        } catch (IOException e){
            System.out.println("Shit broke yo.");
            return "";
        }
    }


}
