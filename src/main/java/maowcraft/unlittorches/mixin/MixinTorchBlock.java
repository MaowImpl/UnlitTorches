package maowcraft.unlittorches.mixin;

import maowcraft.unlittorches.util.StateUtils;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Intrinsic;
import org.spongepowered.asm.mixin.Mixin;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Mixin(TorchBlock.class)
public class MixinTorchBlock extends Block {
    public MixinTorchBlock(Settings settings) {
        super(settings);
    }

    @Intrinsic
    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @SuppressWarnings("deprecation")
    @Intrinsic
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        float chance = 0.8f;
        boolean isExtinguished = (ThreadLocalRandom.current().nextFloat() > chance);
        Block block = state.getBlock();
        if (isExtinguished) {
            extinguish(world, block, pos, state);
        }
    }

    private void extinguish(World world, Block block, BlockPos pos, BlockState state) {
        if (StateUtils.contains(block)) {
            BlockState defaultState = StateUtils.fromTorchToUnlitState(block);
            if (block instanceof WallTorchBlock) {
                defaultState = defaultState.with(WallTorchBlock.FACING, state.get(WallTorchBlock.FACING));
            }
            world.setBlockState(pos, defaultState);
            world.playSound(pos.getX(), pos.getY(), pos.getZ(), SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.NEUTRAL, 0.0f, 0.0f, true);
        }
    }
}
