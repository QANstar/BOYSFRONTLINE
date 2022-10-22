package com.qanstar.boysfrontline.block;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.Arrays;

import static com.qanstar.boysfrontline.BoysFrontline.BLACK_GROUP;
import static com.qanstar.boysfrontline.BoysFrontline.modID;

public class BlockRegister {
    /* 声明和初始化我们的自定义方块实例。
      我们将方块材质（material）设置为METAL（金属），需要镐来高效挖掘。

      `strength`会将方块的硬度和抗性设为同一个值。
      硬度决定了方块需要多久挖掘，抗性决定了方块抵御爆破伤害（如爆炸）的能力。
      石头的硬度为1.5f，抗性为6.0f，黑曜石的硬度为50.0f，抗性为1200.0f。

      可以在`Blocks`类中查找所有原版方块的统计。
   */
    public static final Block Black_Metal_Ore=new Block(FabricBlockSettings.of(Material.METAL).hardness(20.0f).requiresTool());
    // 矿脉生成
    private static ConfiguredFeature<?, ?> OVERWORLD_Black_Metal_Ore_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    BlockRegister.Black_Metal_Ore.getDefaultState(),
                    5)); // 矿脉大小

    public static PlacedFeature OVERWORLD_Black_Metal_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_Black_Metal_Ore_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(12), // 每个区块的矿脉数量
                    SquarePlacementModifier.of(), // 水平传播
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(20))
            )); // 高度
    public static void register() {
        Registry.register(Registry.BLOCK,new Identifier("boysfrontline","black_metal_ore"),Black_Metal_Ore);
        Registry.register(Registry.ITEM,new Identifier("boysfrontline","black_metal_ore"),new BlockItem(Black_Metal_Ore,new Item.Settings().group(BLACK_GROUP)));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(modID, "overworld_black_ore"), OVERWORLD_Black_Metal_Ore_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(modID, "overworld_black_ore"),
                OVERWORLD_Black_Metal_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(modID, "overworld_black_ore")));
    }
}
