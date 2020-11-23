package maowcraft.unlittorches;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class UnlitTorches implements ModInitializer, ClientModInitializer {
    public static final String MODID = "unlittorches";

    @Override
    public void onInitialize() {
        UnlitTorchesContent.init();
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(UnlitTorchesContent.UNLIT_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(UnlitTorchesContent.UNLIT_SOUL_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(UnlitTorchesContent.UNLIT_REDSTONE_TORCH, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(UnlitTorchesContent.UNLIT_WALL_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(UnlitTorchesContent.UNLIT_SOUL_WALL_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(UnlitTorchesContent.UNLIT_REDSTONE_WALL_TORCH, RenderLayer.getCutout());
    }
}
