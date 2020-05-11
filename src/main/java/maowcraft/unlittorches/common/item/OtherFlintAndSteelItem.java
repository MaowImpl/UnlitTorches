package maowcraft.unlittorches.common.item;

import maowcraft.unlittorches.api.ICanLightUnlitTorch;
import maowcraft.unlittorches.util.OtherFlintAndSteelTypes;
import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class OtherFlintAndSteelItem extends FlintAndSteelItem implements ICanLightUnlitTorch {
    public OtherFlintAndSteelItem(Settings settings, OtherFlintAndSteelTypes type) {
        super(settings.maxDamage(type.damage));
    }

    @Override
    public boolean depletedOnUse() {
        return false;
    }

    @Override
    public SoundEvent soundPlayedOnUse() {
        return SoundEvents.ITEM_FLINTANDSTEEL_USE;
    }
}
