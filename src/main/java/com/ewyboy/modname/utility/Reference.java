package com.ewyboy.modname.utility;

public class Reference {

    public static final class ModInfo {
        public static final String ModID = "modname";
        public static final String ModName = "Mod Name";
        public static final String VersionMajor = "1";
        public static final String VersionMinor = "0";
        public static final String VersionPatch = "0";
        public static final String BuildVersion = VersionMajor + "." + VersionMinor + "." + VersionPatch;
        public static final String MinecraftVersion = "1.7.10";
    }

    public static final class Path {
        public static final String wailaPath = "com.ewyboy.modname.dependencies.Waila.onWailaCall";
        public static final String clientProxyPath = "com.ewyboy.modname.proxies.ClientProxy";
        public static final String commonProxyPath = "com.ewyboy.modname.proxies.CommonProxy";
    }

    public static final class NBT {}

    public static final class BlockName {
        public static int renderID;
    }

    public static final class ItemName {}

    public static final class ConfigCategoryName {}

}
