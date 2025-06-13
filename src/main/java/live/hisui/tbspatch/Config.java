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

    static {
        BUILDER.push("Default TBS-Config options");
        //region defaults
        DISABLE_BANNING_BY_DEFAULT = BUILDER
                .comment("Whether to disable TBS banning by default")
                .define("disableBanningByDefault", true);
        DISABLE_CRASHING_BY_DEFAULT = BUILDER
                .comment("Whether to disable TBS crashing by default")
                .define("disableCrashingByDefault", true);
        DISABLE_VHS_BY_DEFAULT = BUILDER
                .comment("Whether to disable the VHS filter by default")
                .define("disableVhsFilterByDefault", true);
        DISABLE_BASE_EXPLODING_BY_DEFAULT = BUILDER
                .comment("Whether to disable the \"base exploding event\" by default")
                .define("disableBaseExplodingByDefault", true);
        DISABLE_ENTITIES_BY_DEFAULT = BUILDER
                .comment("Whether to disable any Broken Script entities from spawning by default")
                .define("disableEntitiesByDefault",false);
        DISABLE_EVENTS_BY_DEFAULT = BUILDER
                .comment("Whether to disable any random events from occurring by default")
                .define("disableEventsByDefault",false);
        DISABLE_JUMPSCARES_BY_DEFAULT = BUILDER
                .comment("Whether to disable any jumpscares from happening by default")
                .define("disableJumpscaresByDefault",false);
        DISABLE_STRUCTURES_BY_DEFAULT = BUILDER
                .comment("Whether to disable any Broken Script structures from spawning by default")
                .define("disableStructuresByDefault",false);
        DISABLE_BLOCK_BREAKING_BY_DEFAULT = BUILDER
                .comment("Whether to disable any Broken Script entities from breaking blocks by default")
                .define("disableBlockBreakingByDefault",false);

        //endregion
        BUILDER.pop();

        BUILDER.push("Mod Tweaks");
        //region tweaks
        RE_ENABLE_QUIT_BUTTON = BUILDER
                .comment("Whether to enable the Quit Game button on the menu")
                .define("enableQuitGameButton", true);
        DONT_BLOCK_COMMAND_USE = BUILDER
                .comment("Whether to prevent TBS from blocking command usage")
                .define("dontBlockCommands", true);
        USE_OLD_MOON_PHASES = BUILDER
                .comment("Whether to use the old corrupted moon textures")
                .define("useOldMoonPhases", false);
        //endregion
        BUILDER.pop();

        BUILDER.push("Event toggles");
        //region events
        DISABLE_DAMAGE_LOOK_AROUND_EVENT = BUILDER
                .comment("Disable the damage and look around event")
                .define("damageLookAroundEvent", false);

        DISABLE_DAMAGE_EVENT = BUILDER
                .comment("Disable the damage event")
                .define("damageEvent", false);

        DISABLE_NIGHT_EFFECTS_EVENT = BUILDER
                .comment("Disable the night effects event")
                .comment("Plays sound, makes it night, gives blindness/slowness/slow falling, lightning chance")
                .define("nightEffectsEvent", false);

        DISABLE_FIRE_EVENT = BUILDER
                .comment("Disable the fire event")
                .define("fireEvent", false);

        DISABLE_LIGHTNING_STRIKE_EVENT = BUILDER
                .comment("Disable the lightning strike event")
                .define("lightningStrikeEvent", false);

        DISABLE_GRASS_BREAKING_SOUNDS_EVENT = BUILDER
                .comment("Disable the grass breaking sounds event")
                .define("grassBreakingSoundsEvent", false);

        DISABLE_NIGHT_CAVE_SOUNDS_EVENT = BUILDER
                .comment("Disable the night cave sounds event")
                .comment("Sets night, plays cave sounds and heartbeat")
                .define("nightCaveSoundsEvent", false);

        DISABLE_HUNGER_EVENT = BUILDER
                .comment("Disable the hunger event")
                .define("hungerEvent", false);

        DISABLE_CLOSE_GUI_EVENT = BUILDER
                .comment("Disable the close GUI event")
                .define("closeGuiEvent", false);

        DISABLE_NULL_SCREENS_EVENT = BUILDER
                .comment("Disable the null screens event")
                .define("nullScreensEvent", false);

        DISABLE_CHAT_MESSAGES_EVENT = BUILDER
                .comment("Disable the chat messages event")
                .define("chatMessagesEvent", false);

        DISABLE_SOUND_EFFECTS_EVENT = BUILDER
                .comment("Disable the sound effects event")
                .comment("Plays cave sounds, disc 13, disc 11, or stops sounds")
                .define("soundEffectsEvent", false);

        DISABLE_NULL_ADVANCEMENT_EVENT = BUILDER
                .comment("Disable the null advancement event")
                .define("nullAdvancementEvent", false);

        DISABLE_NULL_BOOK_EVENT = BUILDER
                .comment("Disable the null book event")
                .define("nullBookEvent", false);

        DISABLE_NOTHING_EVENT = BUILDER
                .comment("Disable the nothing event")
                .define("nothingEvent", false);

        DISABLE_NULL_DISPLAY_EVENT = BUILDER
                .comment("Disable the null display event")
                .define("nullDisplayEvent", false);

        DISABLE_BEDROCK_PLACEMENT_EVENT = BUILDER
                .comment("Disable the bedrock placement event")
                .define("bedrockPlacementEvent", false);

        DISABLE_WATER_PLACEMENT_EVENT = BUILDER
                .comment("Disable the water placement event")
                .define("waterPlacementEvent", false);

        DISABLE_EXPLOSION_EVENT = BUILDER
                .comment("Disable the explosion event")
                .define("explosionEvent", false);

        DISABLE_TIME_CHANGE_EVENT = BUILDER
                .comment("Disable the time change event")
                .comment("Sets time to midnight or dawn")
                .define("timeChangeEvent", false);

        DISABLE_NULL_JUMPSCARE_EVENT = BUILDER
                .comment("Disable the null jumpscare event")
                .define("nullJumpscareEvent", false);

        DISABLE_XP_REWARD_EVENT = BUILDER
                .comment("Disable the XP reward event")
                .define("xpRewardEvent", false);

        DISABLE_DISC_REWARD_EVENT = BUILDER
                .comment("Disable the disc reward event")
                .define("discRewardEvent", false);

        DISABLE_RANDOM_ROTATION_EVENT = BUILDER
                .comment("Disable the random rotation event")
                .define("randomRotationEvent", false);

        DISABLE_VOID_DIMENSION_BLOCK_EVENT = BUILDER
                .comment("Disable the void dimension block event")
                .define("voidDimensionBlockEvent", false);

        DISABLE_REDSTONE_TORCH_EVENT = BUILDER
                .comment("Disable the redstone torch event")
                .define("redstoneTorchEvent", false);

        DISABLE_BLANK_SIGN_EVENT = BUILDER
                .comment("Disable the blank sign event")
                .define("blankSignEvent", false);

        DISABLE_WATER_SPAWN_EVENT = BUILDER
                .comment("Disable the water spawn event")
                .define("waterSpawnEvent", false);

        DISABLE_SPAWN_SET_EVENT = BUILDER
                .comment("Disable the spawn set event")
                .define("spawnSetEvent", false);

        DISABLE_EVENING_TIME_EVENT = BUILDER
                .comment("Disable the evening time event")
                .define("eveningTimeEvent", false);

        DISABLE_RANDOM_PUSH_EVENT = BUILDER
                .comment("Disable the random push event")
                .define("randomPushEvent", false);

        DISABLE_BLACK_PARTICLES_EVENT = BUILDER
                .comment("Disable the black particles event")
                .define("blackParticlesEvent", false);

        DISABLE_BLACK_BOX_EVENT = BUILDER
                .comment("Disable the black box event")
                .define("blackBoxEvent", false);

        DISABLE_HELLO_BLOCK_EVENT = BUILDER
                .comment("Disable the hello block event")
                .define("helloBlockEvent", false);

        DISABLE_EXPLODING_BLOCK_EVENT = BUILDER
                .comment("Disable the exploding block event")
                .define("explodingBlockEvent", false);

        DISABLE_GOOD_LUCK_SCREEN_EVENT = BUILDER
                .comment("Disable the good luck screen event")
                .define("goodLuckScreenEvent", false);

        DISABLE_NULL_SPAWN_EVENT = BUILDER
                .comment("Disable the null spawn event")
                .comment("Spawns Null with lightning and static effects")
                .define("nullSpawnEvent", false);

        DISABLE_DAYLIGHT_CYCLE_EVENT = BUILDER
                .comment("Disable the daylight cycle event")
                .define("daylightCycleEvent", false);

        DISABLE_FAKE_BSOD_EVENT = BUILDER
                .comment("Disable the fake BSOD event")
                .define("fakeBsodEvent", false);

        DISABLE_OBFUSCATED_SIGN_EVENT = BUILDER
                .comment("Disable the obfuscated sign event")
                .define("obfuscatedSignEvent", false);

        DISABLE_DIAMOND_CHEST_EVENT = BUILDER
                .comment("Disable the diamond chest event")
                .define("diamondChestEvent", false);

        DISABLE_OPENGL_ERROR_EVENT = BUILDER
                .comment("Disable the OpenGL error event")
                .define("openglErrorEvent", false);

        DISABLE_NETHERRACK_BLOCK_EVENT = BUILDER
                .comment("Disable the netherrack block event")
                .define("netherrackBlockEvent", false);

        DISABLE_BLOCK_REMOVAL_EVENT = BUILDER
                .comment("Disable the block removal event")
                .define("blockRemovalEvent", false);

        DISABLE_VHS_FILTER_EVENT = BUILDER
                .comment("Disable the VHS filter event")
                .define("vhsFilterEvent", false);

        DISABLE_BLACK_DOTS_EVENT = BUILDER
                .comment("Disable the black dots event")
                .comment("Places dots on screen, teleports up, gives slow falling")
                .define("blackDotsEvent", false);

        DISABLE_SPOOKY_EYES_EVENT = BUILDER
                .comment("Disable the spooky eyes event")
                .define("spookyEyesEvent", false);

        DISABLE_SMILEY_CHAT_EVENT = BUILDER
                .comment("Disable the smiley chat event")
                .define("smileyChatEvent", false);

        DISABLE_DOOR_SOUNDS_EVENT = BUILDER
                .comment("Disable the door sounds event")
                .define("doorSoundsEvent", false);

        DISABLE_MOON_SOUND_EVENT = BUILDER
                .comment("Disable the moon sound event")
                .define("moonSoundEvent", false);

        DISABLE_LEAVE_POTION_EVENT = BUILDER
                .comment("Disable the leave potion event")
                .define("leavePotionEvent", false);

        DISABLE_HEAR_ME_ADVANCEMENT_EVENT = BUILDER
                .comment("Disable the hear me advancement event")
                .define("hearMeAdvancementEvent", false);

        DISABLE_FAKE_VILLAGER_EVENT = BUILDER
                .comment("Disable the fake villager event")
                .define("fakeVillagerEvent", false);

        DISABLE_BROKEN_MOON_EVENT = BUILDER
                .comment("Disable the broken moon event")
                .define("brokenMoonEvent", false);

        DISABLE_LAVA_CAST_EVENT = BUILDER
                .comment("Disable the lava cast event")
                .define("lavaCastEvent", false);

        DISABLE_LAVA_PLACEMENT_EVENT = BUILDER
                .comment("Disable the lava placement event")
                .define("lavaPlacementEvent", false);

        DISABLE_SHADOW_CUBE_EVENT = BUILDER
                .comment("Disable the shadow cube event")
                .comment("Spawns destructive shadow bug cube")
                .define("shadowCubeEvent", false);
        //endregion
        BUILDER.pop();
    }

    //region tweaks
    private static final ForgeConfigSpec.BooleanValue DISABLE_BANNING_BY_DEFAULT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_CRASHING_BY_DEFAULT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_VHS_BY_DEFAULT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_BASE_EXPLODING_BY_DEFAULT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_ENTITIES_BY_DEFAULT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_EVENTS_BY_DEFAULT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_JUMPSCARES_BY_DEFAULT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_STRUCTURES_BY_DEFAULT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_BLOCK_BREAKING_BY_DEFAULT;

    private static final ForgeConfigSpec.BooleanValue RE_ENABLE_QUIT_BUTTON;
    private static final ForgeConfigSpec.BooleanValue DONT_BLOCK_COMMAND_USE;
    private static final ForgeConfigSpec.BooleanValue USE_OLD_MOON_PHASES;
    //endregion

    //region events
    private static final ForgeConfigSpec.BooleanValue DISABLE_DAMAGE_LOOK_AROUND_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_DAMAGE_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_NIGHT_EFFECTS_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_FIRE_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_LIGHTNING_STRIKE_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_GRASS_BREAKING_SOUNDS_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_NIGHT_CAVE_SOUNDS_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_HUNGER_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_CLOSE_GUI_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_NULL_SCREENS_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_CHAT_MESSAGES_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_SOUND_EFFECTS_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_NULL_ADVANCEMENT_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_NULL_BOOK_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_NOTHING_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_NULL_DISPLAY_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_BEDROCK_PLACEMENT_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_WATER_PLACEMENT_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_EXPLOSION_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_TIME_CHANGE_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_NULL_JUMPSCARE_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_XP_REWARD_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_DISC_REWARD_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_RANDOM_ROTATION_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_VOID_DIMENSION_BLOCK_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_REDSTONE_TORCH_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_BLANK_SIGN_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_WATER_SPAWN_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_SPAWN_SET_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_EVENING_TIME_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_RANDOM_PUSH_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_BLACK_PARTICLES_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_BLACK_BOX_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_HELLO_BLOCK_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_EXPLODING_BLOCK_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_GOOD_LUCK_SCREEN_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_NULL_SPAWN_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_DAYLIGHT_CYCLE_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_FAKE_BSOD_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_OBFUSCATED_SIGN_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_DIAMOND_CHEST_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_OPENGL_ERROR_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_NETHERRACK_BLOCK_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_BLOCK_REMOVAL_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_VHS_FILTER_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_BLACK_DOTS_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_SPOOKY_EYES_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_SMILEY_CHAT_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_DOOR_SOUNDS_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_MOON_SOUND_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_LEAVE_POTION_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_HEAR_ME_ADVANCEMENT_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_FAKE_VILLAGER_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_BROKEN_MOON_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_LAVA_CAST_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_LAVA_PLACEMENT_EVENT;
    private static final ForgeConfigSpec.BooleanValue DISABLE_SHADOW_CUBE_EVENT;
    //endregion

    static final ForgeConfigSpec SPEC = BUILDER.build();

    //region tweaks
    public static boolean disableBanningByDefault;
    public static boolean disableCrashingByDefault;
    public static boolean disableVhsByDefault;
    public static boolean disableBaseExplodingByDefault;
    public static boolean disableEntitiesByDefault;
    public static boolean disableEventsByDefault;
    public static boolean disableJumpscaresByDefault;
    public static boolean disableStructuresByDefault;
    public static boolean disableBlockBreakingByDefault;

    public static boolean enableQuitGameButton;
    public static boolean dontBlockCommands;
    public static boolean useOldMoonPhases;
    //endregion
    //region events
    public static boolean damageLookAroundEvent;
    public static boolean damageEvent;
    public static boolean nightEffectsEvent;
    public static boolean fireEvent;
    public static boolean lightningStrikeEvent;
    public static boolean grassBreakingSoundsEvent;
    public static boolean nightCaveSoundsEvent;
    public static boolean hungerEvent;
    public static boolean closeGuiEvent;
    public static boolean nullScreensEvent;
    public static boolean chatMessagesEvent;
    public static boolean soundEffectsEvent;
    public static boolean nullAdvancementEvent;
    public static boolean nullBookEvent;
    public static boolean nothingEvent;
    public static boolean nullDisplayEvent;
    public static boolean bedrockPlacementEvent;
    public static boolean waterPlacementEvent;
    public static boolean explosionEvent;
    public static boolean timeChangeEvent;
    public static boolean nullJumpscareEvent;
    public static boolean xpRewardEvent;
    public static boolean discRewardEvent;
    public static boolean randomRotationEvent;
    public static boolean voidDimensionBlockEvent;
    public static boolean redstoneTorchEvent;
    public static boolean blankSignEvent;
    public static boolean waterSpawnEvent;
    public static boolean spawnSetEvent;
    public static boolean eveningTimeEvent;
    public static boolean randomPushEvent;
    public static boolean blackParticlesEvent;
    public static boolean blackBoxEvent;
    public static boolean helloBlockEvent;
    public static boolean explodingBlockEvent;
    public static boolean goodLuckScreenEvent;
    public static boolean nullSpawnEvent;
    public static boolean daylightCycleEvent;
    public static boolean fakeBsodEvent;
    public static boolean obfuscatedSignEvent;
    public static boolean diamondChestEvent;
    public static boolean openglErrorEvent;
    public static boolean netherrackBlockEvent;
    public static boolean blockRemovalEvent;
    public static boolean vhsFilterEvent;
    public static boolean blackDotsEvent;
    public static boolean spookyEyesEvent;
    public static boolean smileyChatEvent;
    public static boolean doorSoundsEvent;
    public static boolean moonSoundEvent;
    public static boolean leavePotionEvent;
    public static boolean hearMeAdvancementEvent;
    public static boolean fakeVillagerEvent;
    public static boolean brokenMoonEvent;
    public static boolean lavaCastEvent;
    public static boolean lavaPlacementEvent;
    public static boolean shadowCubeEvent;
    //endregion
    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        //region tweaks
        disableBanningByDefault = DISABLE_BANNING_BY_DEFAULT.get();
        disableCrashingByDefault = DISABLE_CRASHING_BY_DEFAULT.get();
        disableVhsByDefault = DISABLE_VHS_BY_DEFAULT.get();
        disableBaseExplodingByDefault = DISABLE_BASE_EXPLODING_BY_DEFAULT.get();
        disableEntitiesByDefault = DISABLE_ENTITIES_BY_DEFAULT.get();
        disableEventsByDefault = DISABLE_EVENTS_BY_DEFAULT.get();
        disableJumpscaresByDefault = DISABLE_JUMPSCARES_BY_DEFAULT.get();
        disableStructuresByDefault = DISABLE_STRUCTURES_BY_DEFAULT.get();
        disableBlockBreakingByDefault = DISABLE_BLOCK_BREAKING_BY_DEFAULT.get();

        enableQuitGameButton = RE_ENABLE_QUIT_BUTTON.get();
        dontBlockCommands = DONT_BLOCK_COMMAND_USE.get();
        useOldMoonPhases = USE_OLD_MOON_PHASES.get();
        //endregion
        //region events

        damageLookAroundEvent = DISABLE_DAMAGE_LOOK_AROUND_EVENT.get();
        damageEvent = DISABLE_DAMAGE_EVENT.get();
        nightEffectsEvent = DISABLE_NIGHT_EFFECTS_EVENT.get();
        fireEvent = DISABLE_FIRE_EVENT.get();
        lightningStrikeEvent = DISABLE_LIGHTNING_STRIKE_EVENT.get();
        grassBreakingSoundsEvent = DISABLE_GRASS_BREAKING_SOUNDS_EVENT.get();
        nightCaveSoundsEvent = DISABLE_NIGHT_CAVE_SOUNDS_EVENT.get();
        hungerEvent = DISABLE_HUNGER_EVENT.get();
        closeGuiEvent = DISABLE_CLOSE_GUI_EVENT.get();
        nullScreensEvent = DISABLE_NULL_SCREENS_EVENT.get();
        chatMessagesEvent = DISABLE_CHAT_MESSAGES_EVENT.get();
        soundEffectsEvent = DISABLE_SOUND_EFFECTS_EVENT.get();
        nullAdvancementEvent = DISABLE_NULL_ADVANCEMENT_EVENT.get();
        nullBookEvent = DISABLE_NULL_BOOK_EVENT.get();
        nothingEvent = DISABLE_NOTHING_EVENT.get();
        nullDisplayEvent = DISABLE_NULL_DISPLAY_EVENT.get();
        bedrockPlacementEvent = DISABLE_BEDROCK_PLACEMENT_EVENT.get();
        waterPlacementEvent = DISABLE_WATER_PLACEMENT_EVENT.get();
        explosionEvent = DISABLE_EXPLOSION_EVENT.get();
        timeChangeEvent = DISABLE_TIME_CHANGE_EVENT.get();
        nullJumpscareEvent = DISABLE_NULL_JUMPSCARE_EVENT.get();
        xpRewardEvent = DISABLE_XP_REWARD_EVENT.get();
        discRewardEvent = DISABLE_DISC_REWARD_EVENT.get();
        randomRotationEvent = DISABLE_RANDOM_ROTATION_EVENT.get();
        voidDimensionBlockEvent = DISABLE_VOID_DIMENSION_BLOCK_EVENT.get();
        redstoneTorchEvent = DISABLE_REDSTONE_TORCH_EVENT.get();
        blankSignEvent = DISABLE_BLANK_SIGN_EVENT.get();
        waterSpawnEvent = DISABLE_WATER_SPAWN_EVENT.get();
        spawnSetEvent = DISABLE_SPAWN_SET_EVENT.get();
        eveningTimeEvent = DISABLE_EVENING_TIME_EVENT.get();
        randomPushEvent = DISABLE_RANDOM_PUSH_EVENT.get();
        blackParticlesEvent = DISABLE_BLACK_PARTICLES_EVENT.get();
        blackBoxEvent = DISABLE_BLACK_BOX_EVENT.get();
        helloBlockEvent = DISABLE_HELLO_BLOCK_EVENT.get();
        explodingBlockEvent = DISABLE_EXPLODING_BLOCK_EVENT.get();
        goodLuckScreenEvent = DISABLE_GOOD_LUCK_SCREEN_EVENT.get();
        nullSpawnEvent = DISABLE_NULL_SPAWN_EVENT.get();
        daylightCycleEvent = DISABLE_DAYLIGHT_CYCLE_EVENT.get();
        fakeBsodEvent = DISABLE_FAKE_BSOD_EVENT.get();
        obfuscatedSignEvent = DISABLE_OBFUSCATED_SIGN_EVENT.get();
        diamondChestEvent = DISABLE_DIAMOND_CHEST_EVENT.get();
        openglErrorEvent = DISABLE_OPENGL_ERROR_EVENT.get();
        netherrackBlockEvent = DISABLE_NETHERRACK_BLOCK_EVENT.get();
        blockRemovalEvent = DISABLE_BLOCK_REMOVAL_EVENT.get();
        vhsFilterEvent = DISABLE_VHS_FILTER_EVENT.get();
        blackDotsEvent = DISABLE_BLACK_DOTS_EVENT.get();
        spookyEyesEvent = DISABLE_SPOOKY_EYES_EVENT.get();
        smileyChatEvent = DISABLE_SMILEY_CHAT_EVENT.get();
        doorSoundsEvent = DISABLE_DOOR_SOUNDS_EVENT.get();
        moonSoundEvent = DISABLE_MOON_SOUND_EVENT.get();
        leavePotionEvent = DISABLE_LEAVE_POTION_EVENT.get();
        hearMeAdvancementEvent = DISABLE_HEAR_ME_ADVANCEMENT_EVENT.get();
        fakeVillagerEvent = DISABLE_FAKE_VILLAGER_EVENT.get();
        brokenMoonEvent = DISABLE_BROKEN_MOON_EVENT.get();
        lavaCastEvent = DISABLE_LAVA_CAST_EVENT.get();
        lavaPlacementEvent = DISABLE_LAVA_PLACEMENT_EVENT.get();
        shadowCubeEvent = DISABLE_SHADOW_CUBE_EVENT.get();
        //endregion
    }
}
