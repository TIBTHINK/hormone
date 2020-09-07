
package com.tibthink.hormone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import com.tibthink.hormone.itemgroup.HormoneItemGroup;
import com.tibthink.hormone.HormoneModElements;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

@HormoneModElements.ModElement.Tag
public class EsterginSyringeItem extends HormoneModElements.ModElement {
	@ObjectHolder("hormone:estergin_syringe")
	public static final Item block = null;
	public EsterginSyringeItem(HormoneModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(HormoneItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()
						.effect(new EffectInstance(Effects.WEAKNESS, 10000, 0), 2)
						.build())
			));
			setRegistryName("estergin_syringe");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
