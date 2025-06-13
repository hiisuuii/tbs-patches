package live.hisui.tbspatch;

import live.hisui.tbspatch.command.ForceEventCommand;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.MixinEnvironment;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TBSPatchMod.MODID)
public class TBSPatchMod
{
    public static ThreadLocal<Integer> forcedEventID = null;
    public static ThreadLocal<Boolean> riggedEventChance = ThreadLocal.withInitial(() -> false);

    // Define mod id in a common place for everything to reference
    public static final String MODID = "tbspatch";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    public TBSPatchMod(FMLJavaModLoadingContext context)
    {
        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
        context.registerConfig(ModConfig.Type.COMMON, EventToggles.SPEC, "tbspatch-events.toml");
        MinecraftForge.EVENT_BUS.addListener(this::registerCommands);
        MixinEnvironment.getCurrentEnvironment().audit();
    }

    @SubscribeEvent
    public void registerCommands(RegisterCommandsEvent event){
        ForceEventCommand.register(event.getDispatcher(), event.getBuildContext());
    }
}
