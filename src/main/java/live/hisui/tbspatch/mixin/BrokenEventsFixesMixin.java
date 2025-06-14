package live.hisui.tbspatch.mixin;

import com.llamalad7.mixinextras.expression.Definition;
import com.llamalad7.mixinextras.expression.Expression;
import net.mcreator.interpritation.init.ThebrokenscriptModEntities;
import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
import net.mcreator.interpritation.procedures.EventEngineProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.eventbus.api.Event;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EventEngineProcedure.class)
public class BrokenEventsFixesMixin {


    @Definition(id = "ServerLevel", type = ServerLevel.class)
    @Expression("? instanceof ServerLevel")
    @Inject(slice = @Slice(
                from = @At(value = "CONSTANT", args = "doubleValue=35.0"),
                to = @At(value = "CONSTANT", args = "doubleValue=36.0")
            ),
            method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0, shift = At.Shift.AFTER), remap = false, cancellable = true)
    private static void fixNullStalkerEvent(Event event, LevelAccessor world, double x, double y, double z, Entity entity, CallbackInfo ci) {
        if(world instanceof ServerLevel serverLevel){
            Entity entityToSpawn = ThebrokenscriptModEntities.NULL_INVADE_BASE.get().spawn(serverLevel, BlockPos.containing(ThebrokenscriptModVariables.MapVariables.get(world).baseX, ThebrokenscriptModVariables.MapVariables.get(world).baseY + 1.0, ThebrokenscriptModVariables.MapVariables.get(world).baseZ), MobSpawnType.MOB_SUMMONED);

            if (entityToSpawn != null) {
                entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0f);
            }
        }
        ci.cancel();
    }
}
