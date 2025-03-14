package school.redrover;

public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        if (firstAttacker.equals(fighter1.name)) {

            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    break;
                }
                fighter1.health -= fighter2.damagePerAttack;
            }
            if (fighter1.health > fighter2.health) {
                return fighter1.name;
            }
            return fighter2.name;

        }
        if (firstAttacker.equals(fighter2.name)) {

            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    break;
                }
                fighter2.health -= fighter1.damagePerAttack;
            }
            if (fighter1.health > fighter2.health) {
                return fighter1.name;
            }
            return fighter2.name;


        }
        return null;
    }
}



class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}

