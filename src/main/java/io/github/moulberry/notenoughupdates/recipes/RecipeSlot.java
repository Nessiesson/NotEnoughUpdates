/*
 * Copyright (C) 2022 NotEnoughUpdates contributors
 *
 * This file is part of NotEnoughUpdates.
 *
 * NotEnoughUpdates is free software: you can redistribute it
 * and/or modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * NotEnoughUpdates is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with NotEnoughUpdates. If not, see <https://www.gnu.org/licenses/>.
 */

package io.github.moulberry.notenoughupdates.recipes;

import io.github.moulberry.notenoughupdates.miscgui.GuiItemRecipe;
import net.minecraft.item.ItemStack;

public class RecipeSlot {
	private final int x;
	private final int y;
	private final ItemStack itemStack;
	private double stackSize = -1;

	public RecipeSlot(int x, int y, ItemStack itemStack) {
		this.x = x;
		this.y = y;
		this.itemStack = itemStack;
	}

	public RecipeSlot(int x, int y, ItemStack itemStack, double stackSize) {
		this.x = x;
		this.y = y;
		this.itemStack = itemStack;
		this.stackSize = stackSize;
	}

	public ItemStack getItemStack() {
		return itemStack;
	}

	public double getStackSize() {
		return stackSize;
	}

	public int getX(GuiItemRecipe recipe) {
		return recipe.guiLeft + x;
	}

	public int getY(GuiItemRecipe recipe) {
		return recipe.guiTop + y;
	}
}
