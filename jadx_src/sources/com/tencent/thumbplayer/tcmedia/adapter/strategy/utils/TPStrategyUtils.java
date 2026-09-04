package com.tencent.thumbplayer.tcmedia.adapter.strategy.utils;

import com.tencent.thumbplayer.tcmedia.adapter.b;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryException;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.tcmedia.core.common.TPThumbplayerCapabilityHelper;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class TPStrategyUtils {
    private static final String TAG = "TPStrategyUtils";

    public static boolean enablePlayBySystemPlayer(b bVar) {
        if (bVar.n() == 0) {
            return true;
        }
        return isSupportMediaCodec(bVar);
    }

    public static boolean enablePlayByThumbPlayer(b bVar) {
        return bVar == null || bVar.n() == 0 || isSupportFFmpegCodec(bVar) || isSupportMediaCodec(bVar);
    }

    public static boolean isSupportFFmpegCodec(b bVar) {
        try {
            return TPThumbplayerCapabilityHelper.isVCodecCapabilitySupport(101, TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapCodecType.class, bVar.n()), (int) bVar.a(), (int) bVar.b(), bVar.e(), bVar.h());
        } catch (TPNativeLibraryException e10) {
            TPLogUtil.e(TAG, e10);
            return false;
        }
    }

    public static boolean isSupportMediaCodec(b bVar) {
        try {
            return TPThumbplayerCapabilityHelper.isVCodecCapabilitySupport(102, TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapCodecType.class, bVar.n()), (int) bVar.a(), (int) bVar.b(), bVar.e(), bVar.h());
        } catch (TPNativeLibraryException e10) {
            TPLogUtil.e(TAG, e10);
            return false;
        }
    }

    public static boolean isSystemPlayerEnable() {
        return true;
    }

    public static boolean isTVPlatform() {
        return false;
    }

    public static boolean isThumbPlayerEnable() {
        return TPNativeLibraryLoader.isLibLoadedAndTryToLoad();
    }
}
