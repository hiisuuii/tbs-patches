package live.hisui.tbspatch.mixin.tweaks;

import live.hisui.tbspatch.Config;
import net.mcreator.interpritation.procedures.CommandExecutedByPlayerProcedure;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.eventbus.api.Event;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CommandExecutedByPlayerProcedure.class)
public class DontPreventCommandsMixin {

    @Inject(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;Ljava/lang/String;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void configDontBlockCommands(Event event, LevelAccessor world, double x, double y, double z, Entity entity, String command, CallbackInfo ci){
        if(Config.dontBlockCommands){
            ci.cancel();
        }
    }
}
