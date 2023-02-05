
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.soulkiller.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.soulkiller.block.SouleroreBlock;
import net.mcreator.soulkiller.SoulKillerMod;

public class SoulKillerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SoulKillerMod.MODID);
	public static final RegistryObject<Block> SOULERORE = REGISTRY.register("soulerore", () -> new SouleroreBlock());
}
