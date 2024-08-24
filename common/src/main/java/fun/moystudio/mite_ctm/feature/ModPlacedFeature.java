package fun.moystudio.mite_ctm.feature;

import dev.architectury.registry.level.biome.BiomeModifications;
import fun.moystudio.mite_ctm.MITE_CTM;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeature {
    public static final ResourceKey<PlacedFeature> MITHRIL_ORE_PLACED=ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(MITE_CTM.MOD_ID, "mithril_ore_placed"));
    public static void register(){
        BiomeModifications.addProperties((biomeContext, mutable) -> {
            if(biomeContext.hasTag(BiomeTags.IS_OVERWORLD)){
                mutable.getGenerationProperties().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, MITHRIL_ORE_PLACED);
            }
        });
    }
}
