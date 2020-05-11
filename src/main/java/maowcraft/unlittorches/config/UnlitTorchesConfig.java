package maowcraft.unlittorches.config;

import maowcraft.unlittorches.UnlitTorches;
import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

import java.util.Arrays;
import java.util.List;

@Config(name = UnlitTorches.MODID)
public class UnlitTorchesConfig implements ConfigData {
    private boolean litTorchMovesUnlitToInventory = true;

    private List<String> itemsThatCanLightList;

    public List<String> getItemsThatCanLightList() {
        return itemsThatCanLightList;
    }

    public boolean canLitTorchMoveUnlitToInventory() {
        return litTorchMovesUnlitToInventory;
    }

    @Override
    public void validatePostLoad() throws ValidationException {
        if (itemsThatCanLightList == null) {
            itemsThatCanLightList = Arrays.asList("minecraft:fire_charge");
        }
    }
}
