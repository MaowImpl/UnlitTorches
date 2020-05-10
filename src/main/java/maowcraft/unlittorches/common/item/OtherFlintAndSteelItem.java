package maowcraft.unlittorches.common.item;

import maowcraft.unlittorches.util.OtherFlintAndSteelTypes;
import net.minecraft.item.FlintAndSteelItem;

public class OtherFlintAndSteelItem extends FlintAndSteelItem {
    public OtherFlintAndSteelItem(Settings settings, OtherFlintAndSteelTypes type) {
        super(settings.maxDamage(type.damage));
    }
}
