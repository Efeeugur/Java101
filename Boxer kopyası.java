class Boxer {
    private String name;
    private int health;
    private int damage;

    public Boxer(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void attack(Boxer opponent) {
        opponent.takeDamage(damage);
        System.out.println(opponent.getName() + " hasar aldı. Kalan canı: " + opponent.getHealth());
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
}
