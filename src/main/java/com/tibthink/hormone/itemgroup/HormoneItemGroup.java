
package com.tibthink.hormone.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.tibthink.hormone.item.BinderArmorItem;
import com.tibthink.hormone.HormoneModElements;

@HormoneModElements.ModElement.Tag
public class HormoneItemGroup extends HormoneModElements.ModElement {
	public HormoneItemGroup(HormoneModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabhormone") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BinderArmorItem.body, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
