package com.tencent.thumbplayer.tcmedia.core.player;

import android.view.Surface;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TPNativePlayerUtils {
    static boolean isTPNativePlayerSurface(Surface surface) {
        return surface instanceof TPNativePlayerSurface;
    }

    public static String[] tpMapStringToStringArray(Map<String, String> map) {
        int i10 = 0;
        if (map == null || map.isEmpty()) {
            return new String[0];
        }
        String[] strArr = new String[map.size() * 2];
        for (String str : map.keySet()) {
            int i11 = i10 * 2;
            strArr[i11] = str;
            strArr[i11 + 1] = map.get(str);
            i10++;
        }
        return strArr;
    }
}
