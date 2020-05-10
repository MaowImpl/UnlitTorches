package maowcraft.unlittorches.util;

public enum OtherFlintAndSteelTypes {
    WOOD(16),
    COAL(32),
    GOLD(32),
    DIAMOND(96);

    public int damage;

    OtherFlintAndSteelTypes(int damage) {
        this.damage = damage;
    }
}
