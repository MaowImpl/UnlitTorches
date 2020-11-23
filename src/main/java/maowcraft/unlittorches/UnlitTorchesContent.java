package maowcraft.unlittorches;

import maowcraft.unlittorches.block.UnlitTorchBlock;
import maowcraft.unlittorches.block.UnlitWallTorchBlock;
import maowcraft.unlittorches.util.Torches;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.WallStandingBlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class UnlitTorchesContent {
    private static final FabricBlockSettings SETTINGS = FabricBlockSettings.of(Material.SUPPORTED).sounds(BlockSoundGroup.WOOD).breakInstantly();

    // Torches

    public static final Block UNLIT_TORCH = register(
            "unlit_torch",
            new UnlitTorchBlock(FabricBlockSettings.copyOf(SETTINGS), Torches.REGULAR)
    );
    public static final Block UNLIT_SOUL_TORCH = register(
            "unlit_soul_torch",
            new UnlitTorchBlock(FabricBlockSettings.copyOf(SETTINGS), Torches.SOUL)
    );
    public static final Block UNLIT_REDSTONE_TORCH = register(
            "unlit_redstone_torch",
            new UnlitTorchBlock(FabricBlockSettings.copyOf(SETTINGS), Torches.REDSTONE)
    );

    // Wall Torches

    public static final Block UNLIT_WALL_TORCH = register(
            "unlit_wall_torch",
            new UnlitWallTorchBlock(FabricBlockSettings.copyOf(SETTINGS), Torches.WALL_REGULAR)
    );
    public static final Block UNLIT_SOUL_WALL_TORCH = register(
            "unlit_soul_wall_torch",
            new UnlitWallTorchBlock(FabricBlockSettings.copyOf(SETTINGS), Torches.WALL_SOUL)
    );
    public static final Block UNLIT_REDSTONE_WALL_TORCH = register(
            "unlit_redstone_wall_torch",
            new UnlitWallTorchBlock(FabricBlockSettings.copyOf(SETTINGS), Torches.WALL_REDSTONE)
    );

    static {
        registerTorchItem("unlit_torch", UNLIT_TORCH, UNLIT_WALL_TORCH);
        registerTorchItem("unlit_soul_torch", UNLIT_SOUL_TORCH, UNLIT_SOUL_WALL_TORCH);
        registerTorchItem("unlit_redstone_torch", UNLIT_REDSTONE_TORCH, UNLIT_REDSTONE_WALL_TORCH);
    }

    public static void init() {}

    private static void registerTorchItem(String id, Block torch, Block wallTorch) {
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, id), new WallStandingBlockItem(torch, wallTorch, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }

    private static Block register(String id, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(UnlitTorches.MODID, id), block);
    }
}
