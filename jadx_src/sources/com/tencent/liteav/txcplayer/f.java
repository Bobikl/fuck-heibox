package com.tencent.liteav.txcplayer;

import android.content.Context;
import com.tencent.liteav.base.util.LiteavLog;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f99927a = "com.tencent.liteav.txcplayer.f";

    public static ITXVCubePlayer a(Context context) {
        return b(context);
    }

    private static ITXVCubePlayer b(Context context) {
        try {
            Constructor<?> declaredConstructor = Class.forName("com.tencent.liteav.thumbplayer.ThumbMediaPlayer").getDeclaredConstructor(Context.class);
            declaredConstructor.setAccessible(true);
            return (ITXVCubePlayer) declaredConstructor.newInstance(context);
        } catch (Exception e10) {
            LiteavLog.e(f99927a, "create thumbplayer exception: " + e10.getMessage());
            return null;
        }
    }
}
