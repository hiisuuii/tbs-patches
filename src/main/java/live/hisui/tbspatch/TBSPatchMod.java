package live.hisui.tbspatch;

import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
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
    }

}
