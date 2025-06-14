package live.hisui.tbspatch.mixin;

import live.hisui.tbspatch.Config;
import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.resources.ResourceLocation;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;

import javax.annotation.Nullable;

@Mixin(LevelRenderer.class)
public class ReplaceCorruptMoonLogicMixin {

    @Shadow @Nullable private ClientLevel level;

    @ModifyArg(slice = @Slice(
            from = @At(value = "FIELD", opcode = Opcodes.GETSTATIC, target = "Lnet/minecraft/client/renderer/LevelRenderer;MOON_LOCATION:Lnet/minecraft/resources/ResourceLocation;")
    ),
            method = "renderSky",at = @At(value = "INVOKE", ordinal = 0, target = "Lcom/mojang/blaze3d/systems/RenderSystem;setShaderTexture(ILnet/minecraft/resources/ResourceLocation;)V"), index = 1)
    private ResourceLocation newMoonPhaseRenderingLogic(ResourceLocation pTextureId){
        if (ThebrokenscriptModVariables.MapVariables.get(level).moonphase == 1.0d) {
            if(Config.useOldMoonPhases){
                return new ResourceLocation("thebrokenscript","textures/moonevent/moon_phases_old.png");
            } else {
                return new ResourceLocation("thebrokenscript", "textures/moonevent/moon_phases1.png");
            }
        }

        if (ThebrokenscriptModVariables.MapVariables.get(level).moonphase == 2.0d) {
            return new ResourceLocation("thebrokenscript","textures/moonevent/moon_phases2.png");
        }
        return pTextureId;
    }
}
