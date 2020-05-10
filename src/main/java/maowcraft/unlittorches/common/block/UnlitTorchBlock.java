package maowcraft.unlittorches.common.block;

import maowcraft.unlittorches.common.item.OtherFlintAndSteelItem;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.TorchBlock;
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

public class UnlitTorchBlock extends TorchBlock {
    public UnlitTorchBlock(Settings settings) {
        super(settings.nonOpaque().noCollision());
    }

    @SuppressWarnings("deprecation")
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.getItem() == Items.FLINT_AND_STEEL || itemStack.getItem() instanceof OtherFlintAndSteelItem || itemStack.getItem() == Items.TORCH) {
            if (itemStack.getItem() != Items.TORCH) {
                world.playSound(player, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.NEUTRAL, 1.0F, 1.0F);
            } else {
                world.playSound(player, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ITEM_FIRECHARGE_USE, SoundCategory.NEUTRAL, 1.0F, 1.0F);
            }
            if (!world.isClient()) {
                if (itemStack.getItem() == Items.TORCH) {
                    player.giveItemStack(new ItemStack(Items.TORCH));
                    world.setBlockState(pos, Blocks.AIR.getDefaultState());
                } else {
                    world.setBlockState(pos, Blocks.TORCH.getDefaultState());
                }
                itemStack.damage(1, player, (playerEntity) -> playerEntity.sendToolBreakStatus(hand));
            }
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {}
}
