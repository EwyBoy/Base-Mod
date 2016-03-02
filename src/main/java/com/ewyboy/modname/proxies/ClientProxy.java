package com.ewyboy.modname.proxies;

import com.ewyboy.modname.blocks.TestBlockRenderer;
import com.ewyboy.modname.blocks.TestTileEntity;
import com.ewyboy.modname.loaders.BlockLoader;
import com.ewyboy.modname.utility.Reference;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import org.lwjgl.input.Keyboard;

public class ClientProxy extends CommonProxy {

    public static boolean shiftPressed() {
        return Keyboard.isKeyDown(Keyboard.KEY_LSHIFT);
    }

    @Override
    public void loadModels() {
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockLoader.TestBlock), new TestBlockRenderer());
        Reference.BlockName.renderID = RenderingRegistry.getNextAvailableRenderId();
        ClientRegistry.bindTileEntitySpecialRenderer(TestTileEntity.class, new TestBlockRenderer());
    }
}
