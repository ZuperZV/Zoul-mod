
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.soulkiller.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.soulkiller.world.features.ores.SouleroreFeature;
import net.mcreator.soulkiller.SoulKillerMod;

@Mod.EventBusSubscriber
public class SoulKillerModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SoulKillerMod.MODID);
	public static final RegistryObject<Feature<?>> SOULERORE = REGISTRY.register("soulerore", SouleroreFeature::feature);
}
