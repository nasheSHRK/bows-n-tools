package com.nasheshrk.bowsntools.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup BNTTOOLS_GROUP = new ItemGroup("bnttoolstab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.RUBY_SWORD.get());
        }
    };
    public static final ItemGroup BNTMATERIALS_GROUP = new ItemGroup("bntmaterialstab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }
    };
    public static final ItemGroup BNTARMOR_GROUP = new ItemGroup("bntarmortab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.RUBY_CHESTPLATE.get());
        }
    };
}
