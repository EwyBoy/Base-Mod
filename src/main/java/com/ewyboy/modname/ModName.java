package com.ewyboy.modname;

import com.ewyboy.modname.loaders.BlockLoader;
import com.ewyboy.modname.loaders.ConfigLoader;
import com.ewyboy.modname.loaders.ItemLoader;
import com.ewyboy.modname.proxies.CommonProxy;
import com.ewyboy.modname.utility.Logger;
import com.ewyboy.modname.utility.Reference;
import com.google.common.base.Stopwatch;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import java.util.concurrent.TimeUnit;

@Mod(modid = Reference.ModInfo.ModID, name = Reference.ModInfo.ModName, version = Reference.ModInfo.BuildVersion, acceptedMinecraftVersions = "["+ Reference.ModInfo.MinecraftVersion+"]")
public class ModName {

    @Mod.Instance(Reference.ModInfo.ModID)
    public static ModName instance;

    @SidedProxy(modId = Reference.ModInfo.ModID, clientSide = Reference.Path.clientProxyPath, serverSide = Reference.Path.commonProxyPath)
    public static CommonProxy proxy;

    private long launchTime;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Stopwatch watch = Stopwatch.createStarted();
            Logger.info("Pre-Initialization started");
                ConfigLoader.init(event.getSuggestedConfigurationFile());
                FMLInterModComms.sendMessage("Waila", "register", Reference.Path.wailaPath);
                launchTime += watch.elapsed(TimeUnit.MILLISECONDS);
            Logger.info("Pre-Initialization finished after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms");
        Logger.info("Pre-Initialization process successfully done");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        Stopwatch watch = Stopwatch.createStarted();
            Logger.info("Initialization started");
                ItemLoader.loadItems();
                BlockLoader.loadBlocks();
                launchTime += watch.elapsed(TimeUnit.MILLISECONDS);
            Logger.info("Initialization finished after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms");
        Logger.info("Initialization process successfully done");
    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event) {
        Stopwatch watch = Stopwatch.createStarted();
            Logger.info("Post-Initialization started");
                launchTime += watch.elapsed(TimeUnit.MILLISECONDS);
            Logger.info("Post-Initialization finished after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms");
        Logger.info("Post-Initialization process successfully done");
        Logger.info("Total Initialization time was " + launchTime);
    }
}
