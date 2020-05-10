package maowcraft.unlittorches.common.init;

import maowcraft.unlittorches.UnlitTorches;
import maowcraft.unlittorches.common.block.UnlitTorchBlock;
import maowcraft.unlittorches.common.item.OtherFlintAndSteelItem;
import maowcraft.unlittorches.util.OtherFlintAndSteelTypes;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class UnlitTorchesContent {
    // Block
    public static final Block UNLIT_TORCH;

    // Item
    public static final Item FLINT_AND_WOOD;
    public static final Item FLINT_AND_COAL;
    public static final Item FLINT_AND_GOLD;
    public static final Item FLINT_AND_DIAMOND;

    // Tech Reborn Compat Items

    static {
        // Block
        UNLIT_TORCH = new UnlitTorchBlock(FabricBlockSettings.of(Material.PART).breakByHand(true).sounds(BlockSoundGroup.WOOD));

        // Item
        FLINT_AND_WOOD = new OtherFlintAndSteelItem(new Item.Settings().group(ItemGroup.TOOLS), OtherFlintAndSteelTypes.WOOD);
        FLINT_AND_COAL = new OtherFlintAndSteelItem(new Item.Settings().group(ItemGroup.TOOLS), OtherFlintAndSteelTypes.COAL);
        FLINT_AND_GOLD = new OtherFlintAndSteelItem(new Item.Settings().group(ItemGroup.TOOLS), OtherFlintAndSteelTypes.GOLD);
        FLINT_AND_DIAMOND = new OtherFlintAndSteelItem(new Item.Settings().group(ItemGroup.TOOLS), OtherFlintAndSteelTypes.DIAMOND);
    }

    public static void registerAll() {
        registerBlock();
        registerItem();
    }

    private static void registerBlock() {
        // Block
        Registry.register(Registry.BLOCK, new Identifier(UnlitTorches.MODID, "unlit_torch"), UNLIT_TORCH);
    }

    private static void registerItem() {
        // Item
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "flint_and_wood"), FLINT_AND_WOOD);
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "flint_and_coal"), FLINT_AND_COAL);
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "flint_and_gold"), FLINT_AND_GOLD);
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "flint_and_diamond"), FLINT_AND_DIAMOND);

        // BlockItem
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "unlit_torch"), new BlockItem(UNLIT_TORCH, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }
}
