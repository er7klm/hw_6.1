public class GameEntity {

    private String name;
    private int health;
    private int damage;
    private String defence;


    public GameEntity() {
    }

    public GameEntity(String name, int health, int damage, String defence) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public String gameEntityInfo() {
        return "Boss: " + name + " Health: " + health + " Damage: " + damage + " Defence: " + defence;

    }
}
