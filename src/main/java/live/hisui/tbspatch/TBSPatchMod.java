package live.hisui.tbspatch;

import com.mojang.logging.LogUtils;
import live.hisui.tbspatch.command.ForceEventCommand;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TBSPatchMod.MODID)
public class TBSPatchMod
{
    public static ThreadLocal<Double> forcedEventID = null;

    // Define mod id in a common place for everything to reference
    public static final String MODID = "tbspatch";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    public TBSPatchMod(FMLJavaModLoadingContext context)
    {
        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
        MinecraftForge.EVENT_BUS.addListener(this::registerCommands);
    }

    @SubscribeEvent
    public void registerCommands(RegisterCommandsEvent event){
        ForceEventCommand.register(event.getDispatcher(), event.getBuildContext());
    }
}
