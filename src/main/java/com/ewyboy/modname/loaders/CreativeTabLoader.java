package com.ewyboy.modname.loaders;

import com.ewyboy.modname.utility.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@GameRegistry.ObjectHolder(Reference.ModInfo.ModID)
public class CreativeTabLoader {

    public static CreativeTabs TabName = new CreativeTabs(Reference.ModInfo.ModName) {
        public ItemStack getIconItemStack(){return new ItemStack(Blocks.anvil);}
        @Override
        public Item getTabIconItem() {return null;}
    };
}
