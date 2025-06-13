package live.hisui.tbspatch.mixin;

import com.mojang.brigadier.context.CommandContext;
import live.hisui.tbspatch.TBSPatchMod;
import net.mcreator.interpritation.command.ForceEventCommand;
import net.mcreator.interpritation.procedures.EventEngineProcedure;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ForceEventCommand.class)
public class ForceRandomEventCommandMixin {

    @Inject(cancellable = true, method = "lambda$registerCommand$1", at = @At(shift = At.Shift.AFTER, value = "INVOKE", target = "Lnet/minecraft/commands/CommandSourceStack;getEntity()Lnet/minecraft/world/entity/Entity;",ordinal = 0))
    private static void inj(CommandContext<CommandSourceStack> arguments, CallbackInfoReturnable<Integer> cir){
        Level level = arguments.getSource().getLevel();
        Entity entity = arguments.getSource().getEntity();
        var x = arguments.getSource().getPosition().x();
        var y = arguments.getSource().getPosition().y();
        var z = arguments.getSource().getPosition().z();
        if(level instanceof ServerLevel sl){
            TBSPatchMod.riggedEventChance.set(true);
            EventEngineProcedure.execute(sl, x, y, z, entity);
        }
        cir.setReturnValue(1);
    }
}
