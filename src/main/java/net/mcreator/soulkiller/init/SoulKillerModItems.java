
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.soulkiller.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.soulkiller.item.SoulshardItem;
import net.mcreator.soulkiller.item.SoulenderpearlitemItem;
import net.mcreator.soulkiller.item.SoulenderpearlItem;
import net.mcreator.soulkiller.item.SoulemeraldItem;
import net.mcreator.soulkiller.item.SoulelytraItem;
import net.mcreator.soulkiller.item.SoulblazerodItem;
import net.mcreator.soulkiller.item.SoulblazepowderItem;
import net.mcreator.soulkiller.item.SItem;
import net.mcreator.soulkiller.SoulKillerMod;

public class SoulKillerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SoulKillerMod.MODID);
	public static final RegistryObject<Item> SOULERORE = block(SoulKillerModBlocks.SOULERORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SOULSHARD = REGISTRY.register("soulshard", () -> new SoulshardItem());
	public static final RegistryObject<Item> SOULEMERALD = REGISTRY.register("soulemerald", () -> new SoulemeraldItem());
	public static final RegistryObject<Item> SOULENDERPEARLITEM = REGISTRY.register("soulenderpearlitem", () -> new SoulenderpearlitemItem());
	public static final RegistryObject<Item> SOULENDERPEARL = REGISTRY.register("soulenderpearl", () -> new SoulenderpearlItem());
	public static final RegistryObject<Item> SOULBLAZEPOWDER = REGISTRY.register("soulblazepowder", () -> new SoulblazepowderItem());
	public static final RegistryObject<Item> SOULBLAZEROD = REGISTRY.register("soulblazerod", () -> new SoulblazerodItem());
	public static final RegistryObject<Item> S_HELMET = REGISTRY.register("s_helmet", () -> new SItem.Helmet());
	public static final RegistryObject<Item> S_CHESTPLATE = REGISTRY.register("s_chestplate", () -> new SItem.Chestplate());
	public static final RegistryObject<Item> S_LEGGINGS = REGISTRY.register("s_leggings", () -> new SItem.Leggings());
	public static final RegistryObject<Item> S_BOOTS = REGISTRY.register("s_boots", () -> new SItem.Boots());
	public static final RegistryObject<Item> SOULELYTRA_CHESTPLATE = REGISTRY.register("soulelytra_chestplate",
			() -> new SoulelytraItem.Chestplate());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
