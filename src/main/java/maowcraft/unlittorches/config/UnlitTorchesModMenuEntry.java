package maowcraft.unlittorches.config;

import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;
import maowcraft.unlittorches.UnlitTorches;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;

@Environment(EnvType.CLIENT)
public class UnlitTorchesModMenuEntry implements ModMenuApi {
    @Override
    public String getModId() {
        return UnlitTorches.MODID;
    }

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return (screen) -> (Screen)AutoConfig.getConfigScreen(UnlitTorchesConfig.class, screen).get();
    }
}
