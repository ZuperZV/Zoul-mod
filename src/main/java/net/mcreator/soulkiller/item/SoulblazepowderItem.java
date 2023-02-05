
package net.mcreator.soulkiller.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class SoulblazepowderItem extends Item {
	public SoulblazepowderItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(16).fireResistant().rarity(Rarity.COMMON));
	}
}
