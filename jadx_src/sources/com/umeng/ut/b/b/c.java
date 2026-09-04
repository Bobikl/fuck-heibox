package com.umeng.ut.b.b;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static String getTid(Context context) {
        if (context == null) {
            return null;
        }
        return d.a(context).m();
    }

    public static String getUtdid(Context context) {
        if (context == null) {
            return "ffffffffffffffffffffffff";
        }
        com.umeng.ut.a.a.a().a(context);
        return a.a().getUtdid(context);
    }

    public static boolean isNewDid(Context context) {
        if (context == null) {
            return false;
        }
        return d.a(context).d();
    }

    public static void removeTid(Context context) {
        if (context == null) {
            return;
        }
        d.a(context).f();
    }

    public static void resetDid(Context context, String str, long j10) {
        if (context == null) {
            return;
        }
        d.a(context).a(str, j10);
    }
}
