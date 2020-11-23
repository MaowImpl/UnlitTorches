package maowcraft.unlittorches.util;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public enum Torches {
    REGULAR(Blocks.TORCH),
    SOUL(Blocks.SOUL_TORCH),
    REDSTONE(Blocks.REDSTONE_TORCH),
    WALL_REGULAR(Blocks.WALL_TORCH),
    WALL_SOUL(Blocks.SOUL_WALL_TORCH),
    WALL_REDSTONE(Blocks.REDSTONE_WALL_TORCH)
    ;

    public final Block torch;

    Torches(Block torch) {
        this.torch = torch;
    }
}
