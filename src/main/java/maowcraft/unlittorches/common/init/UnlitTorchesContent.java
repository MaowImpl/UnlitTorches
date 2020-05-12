package maowcraft.unlittorches.common.init;

import maowcraft.unlittorches.UnlitTorches;
import maowcraft.unlittorches.common.block.UnlightableUnlitTorchBlock;
import maowcraft.unlittorches.common.block.UnlightableUnlitWallTorchBlock;
import maowcraft.unlittorches.common.block.UnlitTorchBlock;
import maowcraft.unlittorches.common.block.UnlitWallTorchBlock;
import maowcraft.unlittorches.common.item.OtherFlintAndSteelItem;
import maowcraft.unlittorches.util.OtherFlintAndSteelTypes;
import maowcraft.unlittorches.util.TorchTypes;
import maowcraft.unlittorches.util.WallTorchTypes;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.WallStandingBlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class UnlitTorchesContent {
    // Block
    public static final Block UNLIT_TORCH;
    public static final Block UNLIT_SOUL_TORCH;
    public static final Block UNLIT_REDSTONE_TORCH;
    public static final Block TRAPPED_UNLIT_TORCH;
    public static final Block UNLIGHTABLE_UNLIT_TORCH;

    // WallBlock
    public static final Block UNLIT_WALL_TORCH;
    public static final Block UNLIT_SOUL_WALL_TORCH;
    public static final Block UNLIT_REDSTONE_WALL_TORCH;
    public static final Block TRAPPED_UNLIT_WALL_TORCH;
    public static final Block UNLIGHTABLE_UNLIT_WALL_TORCH;

    // Item
    public static final Item FLINT_AND_WOOD;
    public static final Item FLINT_AND_COAL;
    public static final Item FLINT_AND_GOLD;
    public static final Item FLINT_AND_DIAMOND;
    public static final Item FLINT_AND_EMERALD;
    public static final Item FLINT_AND_NETHERITE;

    public static final Item CREATIVE_FLINT_AND_STEEL;

    static {
        // Block
        UNLIT_TORCH = new UnlitTorchBlock(FabricBlockSettings.of(Material.PART).breakInstantly(), TorchTypes.REGULAR);
        UNLIT_SOUL_TORCH = new UnlitTorchBlock(FabricBlockSettings.of(Material.PART).breakInstantly(), TorchTypes.SOUL);
        UNLIT_REDSTONE_TORCH = new UnlitTorchBlock(FabricBlockSettings.of(Material.PART).breakInstantly(), TorchTypes.REDSTONE);
        TRAPPED_UNLIT_TORCH = new UnlitTorchBlock(FabricBlockSettings.of(Material.PART).breakInstantly(), TorchTypes.TRAPPED);
        UNLIGHTABLE_UNLIT_TORCH = new UnlightableUnlitTorchBlock(FabricBlockSettings.of(Material.PART).breakInstantly());

        // Wall Block
        UNLIT_WALL_TORCH = new UnlitWallTorchBlock(FabricBlockSettings.of(Material.PART).breakInstantly(), WallTorchTypes.REGULAR);
        UNLIT_SOUL_WALL_TORCH = new UnlitWallTorchBlock(FabricBlockSettings.of(Material.PART).breakInstantly(), WallTorchTypes.SOUL);
        UNLIT_REDSTONE_WALL_TORCH = new UnlitWallTorchBlock(FabricBlockSettings.of(Material.PART).breakInstantly(), WallTorchTypes.REDSTONE);
        TRAPPED_UNLIT_WALL_TORCH = new UnlitWallTorchBlock(FabricBlockSettings.of(Material.PART).breakInstantly(), WallTorchTypes.TRAPPED);
        UNLIGHTABLE_UNLIT_WALL_TORCH = new UnlightableUnlitWallTorchBlock(FabricBlockSettings.of(Material.PART).breakInstantly());

        // Item
        FLINT_AND_WOOD = new OtherFlintAndSteelItem(new Item.Settings().group(ItemGroup.TOOLS), OtherFlintAndSteelTypes.WOOD);
        FLINT_AND_COAL = new OtherFlintAndSteelItem(new Item.Settings().group(ItemGroup.TOOLS), OtherFlintAndSteelTypes.COAL);
        FLINT_AND_GOLD = new OtherFlintAndSteelItem(new Item.Settings().group(ItemGroup.TOOLS), OtherFlintAndSteelTypes.GOLD);
        FLINT_AND_DIAMOND = new OtherFlintAndSteelItem(new Item.Settings().group(ItemGroup.TOOLS), OtherFlintAndSteelTypes.DIAMOND);
        FLINT_AND_EMERALD = new OtherFlintAndSteelItem(new Item.Settings().group(ItemGroup.TOOLS), OtherFlintAndSteelTypes.EMERALD);
        FLINT_AND_NETHERITE = new OtherFlintAndSteelItem(new Item.Settings().group(ItemGroup.TOOLS), OtherFlintAndSteelTypes.NETHERITE);

        CREATIVE_FLINT_AND_STEEL = new OtherFlintAndSteelItem(new Item.Settings().group(ItemGroup.TOOLS), OtherFlintAndSteelTypes.CREATIVE);
    }

    public static void registerAll() {
        registerBlock();
        registerItem();
    }

    private static void registerBlock() {
        // Block
        Registry.register(Registry.BLOCK, new Identifier(UnlitTorches.MODID, "unlit_torch"), UNLIT_TORCH);
        Registry.register(Registry.BLOCK, new Identifier(UnlitTorches.MODID, "unlit_soul_torch"), UNLIT_SOUL_TORCH);
        Registry.register(Registry.BLOCK, new Identifier(UnlitTorches.MODID, "unlit_redstone_torch"), UNLIT_REDSTONE_TORCH);
        Registry.register(Registry.BLOCK, new Identifier(UnlitTorches.MODID, "trapped_unlit_torch"), TRAPPED_UNLIT_TORCH);
        Registry.register(Registry.BLOCK, new Identifier(UnlitTorches.MODID, "unlightable_unlit_torch"), UNLIGHTABLE_UNLIT_TORCH);

        // WallBlock
        Registry.register(Registry.BLOCK, new Identifier(UnlitTorches.MODID, "unlit_wall_torch"), UNLIT_WALL_TORCH);
        Registry.register(Registry.BLOCK, new Identifier(UnlitTorches.MODID, "unlit_soul_wall_torch"), UNLIT_SOUL_WALL_TORCH);
        Registry.register(Registry.BLOCK, new Identifier(UnlitTorches.MODID, "unlit_redstone_wall_torch"), UNLIT_REDSTONE_WALL_TORCH);
        Registry.register(Registry.BLOCK, new Identifier(UnlitTorches.MODID, "trapped_unlit_wall_torch"), TRAPPED_UNLIT_WALL_TORCH);
        Registry.register(Registry.BLOCK, new Identifier(UnlitTorches.MODID, "unlightable_unlit_wall_torch"), UNLIGHTABLE_UNLIT_WALL_TORCH);
    }

    private static void registerItem() {
        // Item
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "flint_and_wood"), FLINT_AND_WOOD);
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "flint_and_coal"), FLINT_AND_COAL);
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "flint_and_gold"), FLINT_AND_GOLD);
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "flint_and_diamond"), FLINT_AND_DIAMOND);
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "flint_and_emerald"), FLINT_AND_EMERALD);
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "flint_and_netherite"), FLINT_AND_NETHERITE);

        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "creative_flint_and_steel"), CREATIVE_FLINT_AND_STEEL);

        // BlockItem
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "unlit_torch"), new WallStandingBlockItem(UNLIT_TORCH, UNLIT_WALL_TORCH, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "unlit_soul_torch"), new WallStandingBlockItem(UNLIT_SOUL_TORCH, UNLIT_SOUL_WALL_TORCH, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "unlit_redstone_torch"), new WallStandingBlockItem(UNLIT_REDSTONE_TORCH, UNLIT_REDSTONE_WALL_TORCH, new Item.Settings().group(ItemGroup.REDSTONE)));
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "trapped_unlit_torch"), new WallStandingBlockItem(TRAPPED_UNLIT_TORCH, TRAPPED_UNLIT_WALL_TORCH, new Item.Settings().group(ItemGroup.REDSTONE)));
        Registry.register(Registry.ITEM, new Identifier(UnlitTorches.MODID, "unlightable_unlit_torch"), new WallStandingBlockItem(UNLIGHTABLE_UNLIT_TORCH, UNLIGHTABLE_UNLIT_WALL_TORCH, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }
}
