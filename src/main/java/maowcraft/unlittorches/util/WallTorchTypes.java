package maowcraft.unlittorches.util;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public enum WallTorchTypes {
    REGULAR(Blocks.WALL_TORCH, Items.TORCH),
    REDSTONE(Blocks.REDSTONE_WALL_TORCH, Items.REDSTONE_TORCH),
    TRAPPED(Blocks.REDSTONE_WALL_TORCH, Items.TORCH);

    public Block litBlock;
    public Item litItem;

    WallTorchTypes(Block litBlock, Item litItem) {
        this.litBlock = litBlock;
        this.litItem = litItem;
    }
}
