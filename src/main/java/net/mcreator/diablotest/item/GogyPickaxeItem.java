
package net.mcreator.diablotest.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

import net.mcreator.diablotest.init.DiablotestModTabs;

public class GogyPickaxeItem extends PickaxeItem {
	public GogyPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return Float.MAX_VALUE;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 69;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().tab(DiablotestModTabs.TAB_DIABLO_MOD));
		setRegistryName("gogy_pickaxe");
	}
}
