package maowcraft.unlittorches.common.block;

import maowcraft.unlittorches.common.item.OtherFlintAndSteelItem;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.TorchBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
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
        if (itemStack.getItem() == Items.FLINT_AND_STEEL || itemStack.getItem() instanceof OtherFlintAndSteelItem) {
            if (!world.isClient()) {
                world.setBlockState(pos, Blocks.TORCH.getDefaultState());
                itemStack.damage(1, player, (playerEntity) -> playerEntity.sendToolBreakStatus(hand));
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {}
}
