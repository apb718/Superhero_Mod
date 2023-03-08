package suhero.superheromod;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import suhero.superheromod.proxy.CommonProxy;
import net.minecraftforge.fml.common.SidedProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import suhero.superheromod.proxy.CommonProxy;
import suhero.superheromod.tabs.SuperheroTab;
import suhero.superheromod.util.Reference;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

    public static final CreativeTabs superheroTab = new SuperheroTab("superherotab");

    @Instance
    public static Main Instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {}
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {}
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {}


}
