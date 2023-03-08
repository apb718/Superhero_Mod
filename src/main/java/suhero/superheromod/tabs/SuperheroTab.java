package suhero.superheromod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import suhero.superheromod.init.ItemInit;

public class SuperheroTab extends CreativeTabs {

    public SuperheroTab(String label) {
        super("superhero_tab");
//        this.setBackgroundImageName("superhero.png");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemInit.TEMP_ITEM);
    }
}
