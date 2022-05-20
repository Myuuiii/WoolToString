package moe.myuuiii.wooltostring;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.RecipeChoice.MaterialChoice;
import org.bukkit.plugin.Plugin;

public class WoolToStringRecipe extends ShapelessRecipe {
	public WoolToStringRecipe(Plugin plugin) {
		super(new NamespacedKey(plugin, "wooltostring.craft"), new ItemStack(Material.STRING, 4));
		MaterialChoice anyWool = new MaterialChoice(
				Material.WHITE_WOOL,
				Material.ORANGE_WOOL,
				Material.MAGENTA_WOOL,
				Material.LIGHT_BLUE_WOOL,
				Material.YELLOW_WOOL,
				Material.LIME_WOOL,
				Material.PINK_WOOL,
				Material.GRAY_WOOL,
				Material.LIGHT_GRAY_WOOL,
				Material.CYAN_WOOL,
				Material.PURPLE_WOOL,
				Material.BLUE_WOOL,
				Material.BROWN_WOOL,
				Material.GREEN_WOOL,
				Material.RED_WOOL,
				Material.BLACK_WOOL);
		addIngredient(anyWool);
	}
}