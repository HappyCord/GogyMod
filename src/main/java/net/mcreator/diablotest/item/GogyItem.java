
package net.mcreator.diablotest.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.diablotest.init.DiablotestModTabs;

public abstract class GogyItem extends ArmorItem {
	public GogyItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.fall"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "gogy";
			}

			@Override
			public float getToughness() {
				return Float.MAX_VALUE;
			}

			@Override
			public float getKnockbackResistance() {
				return Float.MAX_VALUE;
			}
		}, slot, properties);
	}

	public static class Helmet extends GogyItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(DiablotestModTabs.TAB_DIABLO_MOD));
			setRegistryName("gogy_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "diablotest:textures/models/armor/shit_layer_1.png";
		}
	}

	public static class Chestplate extends GogyItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(DiablotestModTabs.TAB_DIABLO_MOD));
			setRegistryName("gogy_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "diablotest:textures/models/armor/shit_layer_1.png";
		}
	}

	public static class Leggings extends GogyItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(DiablotestModTabs.TAB_DIABLO_MOD));
			setRegistryName("gogy_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "diablotest:textures/models/armor/shit_layer_2.png";
		}
	}

	public static class Boots extends GogyItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(DiablotestModTabs.TAB_DIABLO_MOD));
			setRegistryName("gogy_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "diablotest:textures/models/armor/shit_layer_1.png";
		}
	}
}
