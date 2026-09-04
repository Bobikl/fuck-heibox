package com.ss.bytertc.engine.video;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class EffectResourceFinderAdapter {
    public static IRtcResourceFinder sFinder;

    @CalledByNative
    public static long CreateNativeResourceFinder(long j10) {
        IRtcResourceFinder iRtcResourceFinder;
        if (j10 == 0 || (iRtcResourceFinder = sFinder) == null) {
            return 0L;
        }
        return iRtcResourceFinder.createNativeResourceFinder(j10);
    }

    @CalledByNative
    public static void ReleaseNativeResourceFinder(long j10) {
        sFinder.release(j10);
    }
}
