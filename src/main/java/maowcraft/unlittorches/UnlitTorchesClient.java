package maowcraft.unlittorches;

import maowcraft.unlittorches.common.init.UnlitTorchesContent;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class UnlitTorchesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(UnlitTorchesContent.UNLIT_TORCH, RenderLayer.getCutout());
    }
}
