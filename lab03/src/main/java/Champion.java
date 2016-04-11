/**
 * Created by smaloney on 4/3/15.
 */
public class Champion {

    private String name;
    private String type;
    private int health;
    private Equipment weapon;
    private Equipment armor;
    private int gold;

    public Champion(String newName, String newType, int newHealth){
        setName( newName );
        setType( newType );
        setHealth( newHealth );
        gold = 0;
        weapon = new Equipment( "Fists", "weapon", 10, 0 );
        armor = new Equipment( "Cloth Shirt", "armor", 0, 1 );
    }

    /**
     * Return the current attack damage of the champion.
     * The damage is the current equipped weapon's damage times the modifier for the champion type of this champion
     * @return
     */
    public int getAttackDamage() {
        //@TODO: Implement me
    }

    /**
     * Return the current defense of the champion.
     * The defense is equal to the current equipped armour's defense.
     * This value mitigates any incoming damage by that amount.
     * @return
     */
    public int getDefense() {
        //@TODO: Implement me
    }

    /**
     * Attack the target monster, lowering its health by your damage
     * - Print out the name of the champion, and how much damage they do.
     * @param target
     */
    /* --------- Uncomment once Monster is implemented ---------
    public void attack( Monster target ){
        //@TODO: Implement me
    }
    */

    /**
     * Drop the currently equiped weapon
     * @return the weapon that was just dropped
     */
    public Equipment dropWeapon() {
        Equipment dropped = weapon;
        weapon = null;
        return dropped;
    }

    /**
     * equip a new weapon on this champion
     * @param newWeapon the equipment to put on
     */
    public void equipWeapon( Equipment newWeapon ) {
        weapon = newWeapon;
    }

    /**
     * equip new armor on this champion
     * @param newArmor the equipment to put on
     */
    public void equipArmor(Equipment newArmor) {
        this.armor =  newArmor;
    }

    /**
     * Drop the currently equipped armor
     * @return the armor just dropped
     */
    public Equipment dropArmor() {
        Equipment dropped = armor;
        armor = null;
        return dropped;
    }

    public String getType() {
        return type;
    }

    /**
     * Set the type of champion.
     * - Validate the string. If the type is not valid, set to Peasant instead
     * @param newType
     */
    public void setType( String newType ) {
        // @TODO: Implement me
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    /**
     * @return true if the champion is still alive (health > 0)
     */
    public boolean isAlive(){
        //@TODO: Implement me
    }

    public int getHealth() {
        return health;
    }

    public void setHealth( int health ) {
        this.health = health;
    }

    public int getGold() {
        return gold;
    }

    public void pickupGold( int gold ) {
        this.gold += gold;
    }

    /**
     * Returns the champions name and health, separated by a space
     * @return <name> <health>
     */
    public String toString() {
        //@TODO: implement me
    }

}
