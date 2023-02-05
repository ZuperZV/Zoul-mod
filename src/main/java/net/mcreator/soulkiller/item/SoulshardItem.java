
package net.mcreator.soulkiller.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class SoulshardItem extends Item {
	public SoulshardItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(16).fireResistant().rarity(Rarity.COMMON));
	}
}
