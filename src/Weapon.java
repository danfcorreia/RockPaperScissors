public enum Weapon {

    ROCK(1),
    PAPER(2),
    SCISSORS (3);

    final int weaponNumber;

    Weapon (int weaponNumber){
        this.weaponNumber = weaponNumber;
    }

    public static Weapon byNumber(int weaponNumber){
        return Weapon.values()[weaponNumber-1];
    }

    }


