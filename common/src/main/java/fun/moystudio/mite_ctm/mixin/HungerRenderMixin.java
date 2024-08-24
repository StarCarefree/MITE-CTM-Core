package fun.moystudio.mite_ctm.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.moystudio.mite_ctm.pubilc_interface.IMaxFoodLevel;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Gui.class)
public abstract class HungerRenderMixin {
    @Shadow @Final private static ResourceLocation FOOD_EMPTY_HUNGER_SPRITE;

    @Shadow @Final private static ResourceLocation FOOD_HALF_HUNGER_SPRITE;

    @Shadow @Final private static ResourceLocation FOOD_FULL_HUNGER_SPRITE;

    @Shadow @Final private static ResourceLocation FOOD_EMPTY_SPRITE;

    @Shadow @Final private static ResourceLocation FOOD_HALF_SPRITE;

    @Shadow @Final private static ResourceLocation FOOD_FULL_SPRITE;

    @Shadow private int tickCount;

    @Shadow @Final private RandomSource random;

    /**
     * @author Terry_MC
     * @reason 重写饥饿值渲染器(TMD非得让我写author和reason你无敌了Mixin)
     */
    @Overwrite
    private void renderFood(GuiGraphics guiGraphics, Player player, int i, int j){
        FoodData foodData = player.getFoodData();
        int k = foodData.getFoodLevel();
        RenderSystem.enableBlend();

        for(int l = 0; l < 10; ++l) {
            int m = i;
            ResourceLocation resourceLocation;
            ResourceLocation resourceLocation2;
            ResourceLocation resourceLocation3;
            if (player.hasEffect(MobEffects.HUNGER)) {
                resourceLocation = FOOD_EMPTY_HUNGER_SPRITE;
                resourceLocation2 = FOOD_HALF_HUNGER_SPRITE;
                resourceLocation3 = FOOD_FULL_HUNGER_SPRITE;
            } else {
                resourceLocation = FOOD_EMPTY_SPRITE;
                resourceLocation2 = FOOD_HALF_SPRITE;
                resourceLocation3 = FOOD_FULL_SPRITE;
            }

            if (player.getFoodData().getSaturationLevel() <= 0.0F && this.tickCount % (k * 3 + 1) == 0) {
                m += this.random.nextInt(3) - 1;
            }

            int n = j - l * 8 - 9;
            if(Math.ceil(((double)((IMaxFoodLevel)player.getFoodData()).getMaxFoodLevel()/2.0))>l) {//判断最大可渲染空饥饿值的部分（甚至他还会倒过来，离谱）
                guiGraphics.blitSprite(resourceLocation, n, m, 9, 9);
            }

            if (l * 2 + 1 < k) {
                guiGraphics.blitSprite(resourceLocation3, n, m, 9, 9);
            }

            if (l * 2 + 1 == k) {
                guiGraphics.blitSprite(resourceLocation2, n, m, 9, 9);
            }
        }

        RenderSystem.disableBlend();
    }
}
