
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diablotest.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DiablotestModTabs {
	public static CreativeModeTab TAB_DIABLO_MOD;

	public static void load() {
		TAB_DIABLO_MOD = new CreativeModeTab("tabdiablo_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.WEEPING_VINES);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
