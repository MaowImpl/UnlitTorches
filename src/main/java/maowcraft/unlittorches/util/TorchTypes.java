package maowcraft.unlittorches.util;

import maowcraft.unlittorches.common.init.UnlitTorchesContent;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public enum TorchTypes {
    REGULAR(UnlitTorchesContent.UNLIT_TORCH, Blocks.TORCH, Items.TORCH),
    REDSTONE(UnlitTorchesContent.UNLIT_REDSTONE_TORCH, Blocks.REDSTONE_TORCH, Items.REDSTONE_TORCH),
    TRAPPED(UnlitTorchesContent.TRAPPED_UNLIT_TORCH, Blocks.REDSTONE_TORCH, Items.TORCH);

    public Block unlitBlock;
    public Block litBlock;
    public Item litItem;

    TorchTypes(Block unlitBlock, Block litBlock, Item litItem) {
        this.unlitBlock = unlitBlock;
        this.litBlock = litBlock;
        this.litItem = litItem;
    }
}
