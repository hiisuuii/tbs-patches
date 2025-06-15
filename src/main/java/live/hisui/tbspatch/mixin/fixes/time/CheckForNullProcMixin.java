package live.hisui.tbspatch.mixin.fixes.time;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import live.hisui.tbspatch.util.Util;
import net.mcreator.interpritation.procedures.CheckForNullProcedure;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.eventbus.api.Event;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import javax.annotation.Nullable;

@Mixin(CheckForNullProcedure.class)
public class CheckForNullProcMixin {
    @WrapOperation(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/Commands;performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)I"))
    private static int timeSetMidnight(Commands instance, CommandSourceStack pSource, String pCommand, Operation<Integer> original, @Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity){
        if(world instanceof ServerLevel sl) {
            sl.setDayTime(Util.getNextTime(sl,"midnight"));
        }
        return 0;
    }
}
