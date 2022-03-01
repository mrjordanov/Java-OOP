package rpg_lab;



public class Hero {

    private String name;
    private int experience;
    private Weapon weapon;
    private Target target;

    public Hero(String name, Weapon weapon) {
        this.name = name;
        this.experience = 0;
        this.weapon = weapon;
    }

    public String getName() {
        return this.name;
    }

    public int getExperience() {
        return this.experience;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void attack(Target target) {
        this.weapon.attack(target);

        if (target.isDead()) {
            this.experience += target.giveExperience();
        }
    }

   /*     //Package private to be called in tests
     void setExperience(int experience){
        this.experience=experience;
    }*/

}
