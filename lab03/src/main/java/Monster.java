/**
 * Created by Paul Deines on 4/23/16.
 */

import java.lang.Math;

public class Monster {

    private String name;
    private int health;
    private int damage;
    private int gold;
    private static float hitchance = (float)0.6;

    public Monster(String newName, int baseHealth, int baseDamage){
        setName( newName );
	setHealth( baseHealth + (int)(Math.random() * 21 ));
	setDamage( baseDamage + (int)(Math.random() * 21 ));
	setGold( (int)(Math.random() * 201));
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    /**
     * @return true if the monster is still alive (health > 0)
     */
    public boolean isAlive(){
	if(health > 0)
	{
		return true;
	}
	else
	{
		return false;
	}
    }

    public void attack(Champion target)
    {
	if((float)(Math.random()) >= getHitchance())
	{
		// miss
		System.out.println("Monster missed the champion");
	}
	else
	{
		System.out.println("Monster hit the champion");
		target.setHealth(target.getHealth()- (this.getDamage() - target.getDefense()));
	}
    }


    public int getHealth() {
        return health;
    }

    public void setHealth( int health ) {
        this.health = health;
    }

    public int getDamage()
    {
	return damage;
    }

    public void setDamage( int newDamage)
    {
	this.damage = newDamage;
    }

    public void setGold( int newGold)
    {
	this.gold = newGold;
    }

    public int getGold() {
        return gold;
    }

    public void pickupGold( int gold ) {
        this.gold += gold;
    }

    /**
     * Returns the Monsters name and health, separated by a space
     * @return <name> <health>
     */
    public String toString() {
        return new String(getName() + " " + getHealth());
    }

    public float getHitchance()
    {
	return hitchance;
    }


}
