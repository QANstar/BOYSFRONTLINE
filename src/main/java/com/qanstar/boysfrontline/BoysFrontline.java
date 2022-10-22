package com.qanstar.boysfrontline;

import com.qanstar.boysfrontline.block.BlockRegister;
import com.qanstar.boysfrontline.item.Discs.DiscsRegister;
import com.qanstar.boysfrontline.item.ItemRegister;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class BoysFrontline implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String modID = "boysfrontline";
	public static final Logger LOGGER = LoggerFactory.getLogger("boysfrontline");
	// 黑组
	public static final ItemGroup BLACK_GROUP = FabricItemGroupBuilder.create(
					new Identifier("boysfrontline", "black_group"))
			.icon(() -> new ItemStack(Register.ModBook)) // 这里将你创建的新的材料的模型用作图标，但是你也可以随时使用你喜欢的
			.build();
	// lovelive组
	public static final ItemGroup LOVELIVE_GROUP = FabricItemGroupBuilder.create(
					new Identifier("boysfrontline", "lovelive_rainbow_group"))
			.icon(() -> new ItemStack(DiscsRegister.MUSIC_DISC_LOVELIVE_DREAMMYSUN)) // 这里将你创建的新的材料的模型用作图标，但是你也可以随时使用你喜欢的
			.build();
	// kano组
	public static final ItemGroup KANO_GROUP = FabricItemGroupBuilder.create(
					new Identifier("boysfrontline", "kano_group"))
			.icon(() -> new ItemStack(DiscsRegister.MUSIC_DISC_KANO_CALC)) // 这里将你创建的新的材料的模型用作图标，但是你也可以随时使用你喜欢的
			.build();
	// other组
	public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
					new Identifier("boysfrontline", "other_group"))
			.icon(() -> new ItemStack(DiscsRegister.MUSIC_DISC_OTHER_SINCERELY)) // 这里将你创建的新的材料的模型用作图标，但是你也可以随时使用你喜欢的
			.build();


	@Override
	public void onInitialize() {
		Register.register();
	}
}
