public class Main {
	public static void main (String[] args){
		System.out.println("Players gunna play play play");
		System.out.println("Haters gunna hate hate hate");
		
		Weapon RightHand = new Weapon("RightHand", 10);
		Weapon LeftHand = new Weapon("LeftHand", 8);

		int damage = 500;

		System.out.println("\n\n**Initial Values**");
		printout(RightHand, LeftHand, damage);

		// increment damage, upgrade weapons
		damage = incrementDamage(damage);
		upgradeWeapon(RightHand, 15);
		upgradeWeapon(LeftHand, 13);

		System.out.println("\n**Values after increment and upgrades**");
		printout(RightHand, LeftHand, damage);

		// Swap weapons
		swap(RightHand, LeftHand);

		System.out.println("\n**Values after Weapon swap**");
		printout(RightHand, LeftHand, damage);

	}

	public static int incrementDamage(int x){
		// add 50 to whatever value is passed in
		return x + 50;
	}

	public static void upgradeWeapon(Weapon w, int dmg){
		// power up your weapon by the value passed in
		w.powerUp(dmg);
	}

	public static void swap(Weapon weapon1, Weapon weapon2){
		// swap so that weapon2 = weapon1 and vice versa
		String tempname = weapon1.getName();
		int tempdmg = weapon1.getDamage();

		weapon1.setName(weapon2.getName());
		weapon1.powerUp(weapon2.getDamage());
		weapon2.setName(tempname);
		weapon2.powerUp(tempdmg);
	}

	public static void printout(Weapon w1, Weapon w2, int dmg){
                System.out.println("Damage:" + dmg);
                System.out.println("Weapon1");
                System.out.println("   " + w1.getName());
                System.out.println("   " + w1.getDamage());
                System.out.println("Weapon2");
                System.out.println("   " + w2.getName());
                System.out.println("   " + w2.getDamage());
	}

}


