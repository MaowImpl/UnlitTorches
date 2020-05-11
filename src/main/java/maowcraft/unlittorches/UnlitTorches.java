package maowcraft.unlittorches;

import maowcraft.unlittorches.common.init.UnlitTorchesContent;
import maowcraft.unlittorches.config.UnlitTorchesConfig;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UnlitTorches implements ModInitializer {
    public static final String MODID = "unlittorches";

    private static Logger logger = LogManager.getLogger(MODID);

    @Override
    public void onInitialize() {
        UnlitTorchesContent.registerAll();
        AutoConfig.register(UnlitTorchesConfig.class, JanksonConfigSerializer::new);
        logger.info("UnlitTorches has initialized.");
    }
}
