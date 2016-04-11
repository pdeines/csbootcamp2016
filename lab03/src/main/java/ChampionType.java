/**
 * Created by smaloney on 4/3/15.
 */
public class ChampionType {

    public static final String FIGHTER = "fighter";
    public static final String MAGE = "mage";
    public static final String ARCHER = "archer";
    public static final String THIEF = "thief";
    public static final String PEASANT = "peasant";

    public static final double FIGHTER_MODIFIER = 1.5;
    public static final double MAGE_MODIFIER = .9;
    public static final double ARCHER_MODIFIER = 1.25;
    public static final double THIEF_MODIFIER = 1;
    public static final double PEASANT_MODIFIER = 0.1;

    /**
     * checks whether the string entered is a valid Champion Type or not
     * @param test a str
     * @return true if the test string matches one of the ChampType constants
     */
    public static boolean isValidType(String test){
        switch(test){
            case FIGHTER:
                return true;
            case MAGE:
                return true;
            case ARCHER:
                return true;
            case THIEF:
                return true;
            case PEASANT:
                return true;
            default:
                return false;
        }
    }

    /**
     * returns the attack modifier for a specific champion type
     * @param type_name champion type constant string
     * @return double attack modifier to be multiplied against base damage.
     */
    public static double getTypeModifier(String type_name) {
        switch(type_name){
            case FIGHTER:
                return FIGHTER_MODIFIER;
            case MAGE:
                return MAGE_MODIFIER;
            case ARCHER:
                return ARCHER_MODIFIER;
            case THIEF:
                return THIEF_MODIFIER;
            case PEASANT:
                return PEASANT_MODIFIER;
            default:
                return PEASANT_MODIFIER
        }
    }

}
