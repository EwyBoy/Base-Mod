package com.ewyboy.modname.blocks;

import com.ewyboy.modname.loaders.CreativeTabLoader;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TestBlock extends Block implements ITileEntityProvider {

    public TestBlock() {
        super(Material.anvil);
        setCreativeTab(CreativeTabLoader.TabName);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TestTileEntity();
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public int getRenderBlockPass() {
        return 1;
    }

    @Override
    public boolean canRenderInPass(int pass) {
        return true;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
    }

    @Override
    public int getRenderType() {
        return (-1);
    }
}
