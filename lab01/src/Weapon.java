public class Weapon {
    private String name;
    private int damage;

    //This is a default constructor
    public Weapon(String newName, int newDamage) {
        name = newName;
        damage = newDamage;
    }

    //this is a modifier
    public void powerUp(int newDamage){
        damage = newDamage;
    }

    //this is a special method that converts an object into a string
    public String toString(){
        return "Weapon: " + name + " Damage: " + damage;
    }

    //accessors for the private variables
    public String getName()             { return name;     }
    public int getDamage()              { return damage;   }
    public void setName(String newName) { name = newName;  }
    public void setDamage(int newDmg)   { damage = newDmg; }

}
