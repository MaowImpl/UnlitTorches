package maowcraft.unlittorches.util;

public enum OtherFlintAndSteelTypes {
    // vanilla
    WOOD(16),
    COAL(32),
    GOLD(32),
    DIAMOND(96),
    EMERALD(128);

    public int damage;

    OtherFlintAndSteelTypes(int damage) {
        this.damage = damage;
    }
}
