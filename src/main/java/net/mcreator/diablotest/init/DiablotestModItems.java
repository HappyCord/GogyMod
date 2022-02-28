
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diablotest.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.diablotest.item.GogyPickaxeItem;
import net.mcreator.diablotest.item.GogyItem;
import net.mcreator.diablotest.item.GogyDimensionItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DiablotestModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item GOGY_HELMET = register(new GogyItem.Helmet());
	public static final Item GOGY_CHESTPLATE = register(new GogyItem.Chestplate());
	public static final Item GOGY_LEGGINGS = register(new GogyItem.Leggings());
	public static final Item GOGY_BOOTS = register(new GogyItem.Boots());
	public static final Item GOGY_BLOCK = register(DiablotestModBlocks.GOGY_BLOCK, DiablotestModTabs.TAB_DIABLO_MOD);
	public static final Item GOGY_DIMENSION = register(new GogyDimensionItem());
	public static final Item GOGY_PICKAXE = register(new GogyPickaxeItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
