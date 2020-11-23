package maowcraft.unlittorches.block;

import maowcraft.unlittorches.util.Torches;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class UnlitWallTorchBlock extends WallTorchBlock {
    private final Torches type;

    public UnlitWallTorchBlock(Settings settings, Torches type) {
        super(settings.nonOpaque().noCollision(), ParticleTypes.FLAME);
        this.type = type;
    }

    @SuppressWarnings("deprecation")
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.getItem() == Items.FLINT_AND_STEEL) {
            world.playSound(player, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.NEUTRAL, 1.0F, 1.0F);
            if (!world.isClient()) {
                if (!player.isCreative()) {
                    itemStack.damage(1, player, (playerEntity) -> playerEntity.sendToolBreakStatus(hand));
                }
                world.setBlockState(pos, type.torch.getDefaultState());
            }
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {}
}
