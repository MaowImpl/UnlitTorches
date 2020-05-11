package maowcraft.unlittorches.util;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public enum TorchTypes {
    REGULAR(Blocks.TORCH, Items.TORCH),
    SOUL(Blocks.SOUL_TORCH, Items.SOUL_TORCH);

    public Block litBlock;
    public Item litItem;

    TorchTypes(Block litBlock, Item litItem) {
        this.litBlock = litBlock;
        this.litItem = litItem;
    }
}
