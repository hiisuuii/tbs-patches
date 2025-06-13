package live.hisui.tbspatch.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import live.hisui.tbspatch.TBSPatchMod;
import net.mcreator.interpritation.procedures.EventEngineProcedure;
import net.minecraft.commands.CommandBuildContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.server.level.ServerPlayer;

public class ForceEventCommand {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher, CommandBuildContext context) {
        dispatcher.register(
                Commands.literal("tbsp_forceevent")
                .requires(source -> source.getEntity() instanceof ServerPlayer)
                .then(Commands.argument("id", IntegerArgumentType.integer(0,54))
                        .executes(ctx -> {
                            if(TBSPatchMod.forcedEventID == null) {
                                TBSPatchMod.forcedEventID = new ThreadLocal<>();
                            }
                            var id = IntegerArgumentType.getInteger(ctx, "id");
                            TBSPatchMod.forcedEventID.set((double) id);
                            TBSPatchMod.LOGGER.info("We are attempting to force an event with ID: {}",id);
                            EventEngineProcedure.execute(ctx.getSource().getLevel(), ctx.getSource().getPosition().x, ctx.getSource().getPosition().y, ctx.getSource().getPosition().z, ctx.getSource().getEntityOrException());
                            return IntegerArgumentType.getInteger(ctx, "id");
                        }))

        );
    }
}
