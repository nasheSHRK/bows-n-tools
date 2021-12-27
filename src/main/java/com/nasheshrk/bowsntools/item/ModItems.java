package com.nasheshrk.bowsntools.item;

import com.nasheshrk.bowsntools.BowsnTools;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BowsnTools.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().group(ModItemGroup.BNTMATERIALS_GROUP)));

    public static final RegistryObject<Item> RUBY_SHARD = ITEMS.register("ruby_shard",
            () -> new Item(new Item.Properties().group(ModItemGroup.BNTMATERIALS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.BNTMATERIALS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_SCRAP = ITEMS.register("titanium_scrap",
            () -> new Item(new Item.Properties().group(ModItemGroup.BNTMATERIALS_GROUP)));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModItemTier.RUBY, 4, -2,
                    new Item.Properties().group(ModItemGroup.BNTTOOLS_GROUP)));

    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModItemTier.RUBY, -2, 3,
                    new Item.Properties().group(ModItemGroup.BNTTOOLS_GROUP)));

    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModItemTier.RUBY, 6, -3,
                    new Item.Properties().group(ModItemGroup.BNTTOOLS_GROUP)));

    public static final RegistryObject<Item> RUBY_SHOVEL= ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModItemTier.RUBY, -3, 3,
                    new Item.Properties().group(ModItemGroup.BNTTOOLS_GROUP)));

    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModItemTier.RUBY, -6, 3,
                    new Item.Properties().group(ModItemGroup.BNTTOOLS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_DAGGER = ITEMS.register("titanium_dagger",
            () -> new SwordItem(ModItemTier.TITANIUM, 1, 1,
                    new Item.Properties().group(ModItemGroup.BNTTOOLS_GROUP)));

        public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModItemTier.TITANIUM, -1, -1,
                    new Item.Properties().group(ModItemGroup.BNTTOOLS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(ModItemTier.TITANIUM, 3, -4,
                    new Item.Properties().group(ModItemGroup.BNTTOOLS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(ModItemTier.TITANIUM, -2, -1,
                    new Item.Properties().group(ModItemGroup.BNTTOOLS_GROUP)));

    public static final RegistryObject<Item> RUBY_BOW = ITEMS.register("ruby_bow",
            () -> new BowItem(new Item.Properties().group(ModItemGroup.BNTTOOLS_GROUP).maxStackSize(1)));

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.BNTARMOR_GROUP)));

    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.BNTARMOR_GROUP)));

    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.BNTARMOR_GROUP)));

    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.BNTARMOR_GROUP)));

    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.BNTARMOR_GROUP)));

    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.BNTARMOR_GROUP)));

    public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.BNTARMOR_GROUP)));

    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.BNTARMOR_GROUP)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
