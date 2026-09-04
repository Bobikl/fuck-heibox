package com.umeng.ut.device;

import android.content.Context;
import com.umeng.ut.b.b.c;

/* JADX INFO: loaded from: classes4.dex */
public class UTDevice {
    private static String getTid(Context context) {
        return c.getTid(context);
    }

    public static String getUtdid(Context context) {
        return c.getUtdid(context);
    }

    private static boolean isNewDid(Context context) {
        return c.isNewDid(context);
    }

    private static void removeTid(Context context) {
        c.removeTid(context);
    }

    private static void resetDid(Context context, String str, long j10) {
        c.resetDid(context, str, j10);
    }
}
