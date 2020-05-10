package maowcraft.unlittorches;

import maowcraft.unlittorches.common.init.UnlitTorchesContent;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UnlitTorches implements ModInitializer {
    public static final String MODID = "unlittorches";

    private static Logger logger = LogManager.getLogger(MODID);

    @Override
    public void onInitialize() {
        UnlitTorchesContent.registerAll();
        logger.info("UnlitTorches has initialized.");
    }
}
