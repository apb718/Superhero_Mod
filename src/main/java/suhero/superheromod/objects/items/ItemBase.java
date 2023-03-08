package suhero.superheromod.objects.items;

import suhero.superheromod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import suhero.superheromod.init.ItemInit;
import suhero.superheromod.proxy.ClientProxy;


public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name)
    {
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ClientProxy.registerModel(this, 0, "inventory");
    }
}
