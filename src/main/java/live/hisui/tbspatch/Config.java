package live.hisui.tbspatch;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = TBSPatchMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.BooleanValue DISABLE_BANNING_BY_DEFAULT = BUILDER
            .comment("Whether to disable TBS banning by default")
            .define("disableBanningByDefault", true);

    private static final ForgeConfigSpec.BooleanValue DISABLE_CRASHING_BY_DEFAULT = BUILDER
            .comment("Whether to disable TBS crashing by default")
            .define("disableCrashingByDefault", true);

    private static final ForgeConfigSpec.BooleanValue DISABLE_VHS_BY_DEFAULT = BUILDER
            .comment("Whether to disable the VHS filter by default")
            .define("disableVhsFilterByDefault", true);

    private static final ForgeConfigSpec.BooleanValue DISABLE_BASE_EXPLODING_BY_DEFAULT = BUILDER
            .comment("Whether to disable the \"base exploding event\" by default")
            .define("disableBaseExplodingByDefault", true);

    private static final ForgeConfigSpec.BooleanValue RE_ENABLE_QUIT_BUTTON = BUILDER
            .comment("Whether to enable the Quit Game button on the menu")
            .define("enableQuitGameButton", true);

    private static final ForgeConfigSpec.BooleanValue DONT_BLOCK_COMMAND_USE = BUILDER
            .comment("Whether to prevent TBS from blocking command usage")
            .define("dontBlockCommands", true);


    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static boolean disableBanningByDefault;
    public static boolean disableCrashingByDefault;
    public static boolean disableVhsByDefault;
    public static boolean disableBaseExplodingByDefault;
    public static boolean enableQuitGameButton;
    public static boolean dontBlockCommands;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        disableBanningByDefault = DISABLE_BANNING_BY_DEFAULT.get();
        disableCrashingByDefault = DISABLE_CRASHING_BY_DEFAULT.get();
        disableVhsByDefault = DISABLE_VHS_BY_DEFAULT.get();
        disableBaseExplodingByDefault = DISABLE_BASE_EXPLODING_BY_DEFAULT.get();
        enableQuitGameButton = RE_ENABLE_QUIT_BUTTON.get();
        dontBlockCommands = DONT_BLOCK_COMMAND_USE.get();
    }
}
