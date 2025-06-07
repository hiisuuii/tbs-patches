package live.hisui.tbspatch.mixin;

import live.hisui.tbspatch.Config;
import net.mcreator.interpritation.ExitDissable;
import net.minecraftforge.client.event.ScreenEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = ExitDissable.class, remap = false)
public class ReenableQuitGameMixin {

    @Inject(method = "onGuiInit", at = @At("HEAD"), cancellable = true)
    private static void inj(ScreenEvent.Init.Post event, CallbackInfo ci){
        if(Config.enableQuitGameButton) {
            ci.cancel();
        }
    }
}
