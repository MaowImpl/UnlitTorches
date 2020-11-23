package maowcraft.unlittorches.util;

import maowcraft.unlittorches.UnlitTorchesContent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

import java.util.HashMap;
import java.util.Map;

public class StateUtils {
    private static final Map<Block, BlockState> torchToUnlitState = new HashMap<>();
    static {
        torchToUnlitState.put(Blocks.TORCH, UnlitTorchesContent.UNLIT_TORCH.getDefaultState());
        torchToUnlitState.put(Blocks.SOUL_TORCH, UnlitTorchesContent.UNLIT_SOUL_TORCH.getDefaultState());
        torchToUnlitState.put(Blocks.REDSTONE_TORCH, UnlitTorchesContent.UNLIT_REDSTONE_TORCH.getDefaultState());
        torchToUnlitState.put(Blocks.WALL_TORCH, UnlitTorchesContent.UNLIT_WALL_TORCH.getDefaultState());
        torchToUnlitState.put(Blocks.SOUL_WALL_TORCH, UnlitTorchesContent.UNLIT_SOUL_WALL_TORCH.getDefaultState());
        torchToUnlitState.put(Blocks.REDSTONE_WALL_TORCH, UnlitTorchesContent.UNLIT_REDSTONE_WALL_TORCH.getDefaultState());
    }

    public static BlockState fromTorchToUnlitState(Block torch) {
        return torchToUnlitState.get(torch);
    }

    public static boolean contains(Block torch) {
        return torchToUnlitState.containsKey(torch);
    }
}
