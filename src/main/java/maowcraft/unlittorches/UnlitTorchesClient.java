package maowcraft.unlittorches;

import maowcraft.unlittorches.common.init.UnlitTorchesContent;
import maowcraft.unlittorches.config.UnlitTorchesConfig;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class UnlitTorchesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AutoConfig.getGuiRegistry(UnlitTorchesConfig.class);
        BlockRenderLayerMap.INSTANCE.putBlock(UnlitTorchesContent.UNLIT_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(UnlitTorchesContent.UNLIT_SOUL_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(UnlitTorchesContent.UNLIGHTABLE_UNLIT_TORCH, RenderLayer.getCutout());
    }
}
