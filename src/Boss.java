public class Boss extends GameEntity {

    public Boss(String name, int health, int damage, String defence) {
        super(name, health, damage, defence);
    }

    Weapon weapon = new Weapon("Magic Axe", "Destroyer");

    public String bossInfo() {
        return gameEntityInfo() + " TypeOfWeapon: " + weapon.getTypeOfWeapon() + " NameOfWeapon: " + weapon.getNameOfWeapon();
    }
}
