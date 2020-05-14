package maowcraft.unlittorches.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.TorchBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class UnlightableUnlitTorchBlock extends TorchBlock {
    public UnlightableUnlitTorchBlock(Settings settings) {
        super(settings.nonOpaque().noCollision());
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {}
}
