
package com.tibthink.hormone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.tibthink.hormone.itemgroup.HormoneItemGroup;
import com.tibthink.hormone.HormoneModElements;

@HormoneModElements.ModElement.Tag
public class EsterginItem extends HormoneModElements.ModElement {
	@ObjectHolder("hormone:estergin")
	public static final Item block = null;
	public EsterginItem(HormoneModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(HormoneItemGroup.tab).maxStackSize(64));
			setRegistryName("estergin");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
