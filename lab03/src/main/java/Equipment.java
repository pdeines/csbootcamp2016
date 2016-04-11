/**
 * Created by smaloney on 4/3/15.
 */
public class Equipment{

    private String type;
    private int damage;
    private int defense;
    private String name;

    /**
     * Constructor to initialize a new piece of equipment.
     */
    public Equipment(String newName, String newType, int newDmg, int newDefense){
        setDamage( newDmg );
        setName( newName );
        setType( newType );
        setDefense( newDefense );
    }

    /* ------------  Mutators and Accessors below ------------ */
    public String getType() {
        return type;
    }

    public void setType( String type ) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage( int damage ) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense( int defense ) {
        this.defense = defense;
    }

}
