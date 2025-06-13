package live.hisui.tbspatch;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = TBSPatchMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventToggles {


    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.BooleanValue DISABLE_DAMAGE_LOOK_AROUND_EVENT = BUILDER
            .comment("Disable the damage and look around event")
            .define("damageLookAroundEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_DAMAGE_EVENT = BUILDER
            .comment("Disable the damage event")
            .define("damageEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_NIGHT_EFFECTS_EVENT = BUILDER
            .comment("Disable the night effects event")
            .comment("Plays sound, makes it night, gives blindness/slowness/slow falling, lightning chance")
            .define("nightEffectsEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_FIRE_EVENT = BUILDER
            .comment("Disable the fire event")
            .define("fireEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_LIGHTNING_STRIKE_EVENT = BUILDER
            .comment("Disable the lightning strike event")
            .define("lightningStrikeEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_GRASS_BREAKING_SOUNDS_EVENT = BUILDER
            .comment("Disable the grass breaking sounds event")
            .define("grassBreakingSoundsEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_NIGHT_CAVE_SOUNDS_EVENT = BUILDER
            .comment("Disable the night cave sounds event")
            .comment("Sets night, plays cave sounds and heartbeat")
            .define("nightCaveSoundsEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_HUNGER_EVENT = BUILDER
            .comment("Disable the hunger event")
            .define("hungerEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_CLOSE_GUI_EVENT = BUILDER
            .comment("Disable the close GUI event")
            .define("closeGuiEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_NULL_SCREENS_EVENT = BUILDER
            .comment("Disable the null screens event")
            .define("nullScreensEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_CHAT_MESSAGES_EVENT = BUILDER
            .comment("Disable the chat messages event")
            .define("chatMessagesEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_SOUND_EFFECTS_EVENT = BUILDER
            .comment("Disable the sound effects event")
            .comment("Plays cave sounds, disc 13, disc 11, or stops sounds")
            .define("soundEffectsEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_NULL_ADVANCEMENT_EVENT = BUILDER
            .comment("Disable the null advancement event")
            .define("nullAdvancementEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_NULL_BOOK_EVENT = BUILDER
            .comment("Disable the null book event")
            .define("nullBookEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_NOTHING_EVENT = BUILDER
            .comment("Disable the nothing event")
            .define("nothingEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_NULL_DISPLAY_EVENT = BUILDER
            .comment("Disable the null display event")
            .define("nullDisplayEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_BEDROCK_PLACEMENT_EVENT = BUILDER
            .comment("Disable the bedrock placement event")
            .define("bedrockPlacementEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_WATER_PLACEMENT_EVENT = BUILDER
            .comment("Disable the water placement event")
            .define("waterPlacementEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_EXPLOSION_EVENT = BUILDER
            .comment("Disable the explosion event")
            .define("explosionEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_TIME_CHANGE_EVENT = BUILDER
            .comment("Disable the time change event")
            .comment("Sets time to midnight or dawn")
            .define("timeChangeEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_NULL_JUMPSCARE_EVENT = BUILDER
            .comment("Disable the null jumpscare event")
            .define("nullJumpscareEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_XP_REWARD_EVENT = BUILDER
            .comment("Disable the XP reward event")
            .define("xpRewardEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_DISC_REWARD_EVENT = BUILDER
            .comment("Disable the disc reward event")
            .define("discRewardEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_RANDOM_ROTATION_EVENT = BUILDER
            .comment("Disable the random rotation event")
            .define("randomRotationEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_VOID_DIMENSION_BLOCK_EVENT = BUILDER
            .comment("Disable the void dimension block event")
            .define("voidDimensionBlockEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_REDSTONE_TORCH_EVENT = BUILDER
            .comment("Disable the redstone torch event")
            .define("redstoneTorchEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_BLANK_SIGN_EVENT = BUILDER
            .comment("Disable the blank sign event")
            .define("blankSignEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_WATER_SPAWN_EVENT = BUILDER
            .comment("Disable the water spawn event")
            .define("waterSpawnEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_SPAWN_SET_EVENT = BUILDER
            .comment("Disable the spawn set event")
            .define("spawnSetEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_EVENING_TIME_EVENT = BUILDER
            .comment("Disable the evening time event")
            .define("eveningTimeEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_RANDOM_PUSH_EVENT = BUILDER
            .comment("Disable the random push event")
            .define("randomPushEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_BLACK_PARTICLES_EVENT = BUILDER
            .comment("Disable the black particles event")
            .define("blackParticlesEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_BLACK_BOX_EVENT = BUILDER
            .comment("Disable the black box event")
            .define("blackBoxEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_HELLO_BLOCK_EVENT = BUILDER
            .comment("Disable the hello block event")
            .define("helloBlockEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_EXPLODING_BLOCK_EVENT = BUILDER
            .comment("Disable the exploding block event")
            .define("explodingBlockEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_GOOD_LUCK_SCREEN_EVENT = BUILDER
            .comment("Disable the good luck screen event")
            .define("goodLuckScreenEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_NULL_SPAWN_EVENT = BUILDER
            .comment("Disable the null spawn event")
            .comment("Spawns Null with lightning and static effects")
            .define("nullSpawnEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_DAYLIGHT_CYCLE_EVENT = BUILDER
            .comment("Disable the daylight cycle event")
            .define("daylightCycleEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_FAKE_BSOD_EVENT = BUILDER
            .comment("Disable the fake BSOD event")
            .define("fakeBsodEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_OBFUSCATED_SIGN_EVENT = BUILDER
            .comment("Disable the obfuscated sign event")
            .define("obfuscatedSignEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_DIAMOND_CHEST_EVENT = BUILDER
            .comment("Disable the diamond chest event")
            .define("diamondChestEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_OPENGL_ERROR_EVENT = BUILDER
            .comment("Disable the OpenGL error event")
            .define("openglErrorEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_NETHERRACK_BLOCK_EVENT = BUILDER
            .comment("Disable the netherrack block event")
            .define("netherrackBlockEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_BLOCK_REMOVAL_EVENT = BUILDER
            .comment("Disable the block removal event")
            .define("blockRemovalEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_VHS_FILTER_EVENT = BUILDER
            .comment("Disable the VHS filter event")
            .define("vhsFilterEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_BLACK_DOTS_EVENT = BUILDER
            .comment("Disable the black dots event")
            .comment("Places dots on screen, teleports up, gives slow falling")
            .define("blackDotsEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_SPOOKY_EYES_EVENT = BUILDER
            .comment("Disable the spooky eyes event")
            .define("spookyEyesEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_SMILEY_CHAT_EVENT = BUILDER
            .comment("Disable the smiley chat event")
            .define("smileyChatEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_DOOR_SOUNDS_EVENT = BUILDER
            .comment("Disable the door sounds event")
            .define("doorSoundsEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_MOON_SOUND_EVENT = BUILDER
            .comment("Disable the moon sound event")
            .define("moonSoundEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_LEAVE_POTION_EVENT = BUILDER
            .comment("Disable the leave potion event")
            .define("leavePotionEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_HEAR_ME_ADVANCEMENT_EVENT = BUILDER
            .comment("Disable the hear me advancement event")
            .define("hearMeAdvancementEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_FAKE_VILLAGER_EVENT = BUILDER
            .comment("Disable the fake villager event")
            .define("fakeVillagerEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_BROKEN_MOON_EVENT = BUILDER
            .comment("Disable the broken moon event")
            .define("brokenMoonEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_LAVA_CAST_EVENT = BUILDER
            .comment("Disable the lava cast event")
            .define("lavaCastEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_LAVA_PLACEMENT_EVENT = BUILDER
            .comment("Disable the lava placement event")
            .define("lavaPlacementEvent", false);

    private static final ForgeConfigSpec.BooleanValue DISABLE_SHADOW_CUBE_EVENT = BUILDER
            .comment("Disable the shadow cube event")
            .comment("Spawns destructive shadow bug cube")
            .define("shadowCubeEvent", false);


    static final ForgeConfigSpec SPEC = BUILDER.build();

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

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
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

    }
}
