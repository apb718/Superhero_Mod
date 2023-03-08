package suhero.superheromod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import suhero.superheromod.objects.items.ItemBase;

public class ClientProxy extends CommonProxy {
    public static void registerModel(ItemBase itemBase, int i, String inventory) {
    }

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }

}
