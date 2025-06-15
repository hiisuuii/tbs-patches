package live.hisui.tbspatch.util;

import net.minecraft.server.level.ServerLevel;

public class Util {

    public static long getNextTime(ServerLevel sl, String timecode){
        long dayTime = sl.getDayTime();
        long currentDay = dayTime / 24000;
        long newTime = dayTime;
        newTime = switch (timecode) {
            case "day" -> currentDay * 24000;
            case "night" -> currentDay * 24000 + 13000;
            case "midnight" -> currentDay * 24000 + 18000;
            default -> newTime;
        };
        return newTime;
    }

}
