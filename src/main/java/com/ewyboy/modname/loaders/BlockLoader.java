package com.ewyboy.modname.loaders;

import com.ewyboy.modname.blocks.TestBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockLoader {

    public static Block TestBlock;

    public static void loadBlocks() {
        TestBlock = new TestBlock();
        GameRegistry.registerBlock(TestBlock, "TestBlock");
    }
}
