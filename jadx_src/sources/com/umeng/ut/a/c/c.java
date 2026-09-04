package com.umeng.ut.a.c;

import android.content.Context;
import com.umeng.commonsdk.framework.UMFrUtils;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static boolean b(Context context) {
        if (context == null) {
            return true;
        }
        try {
            return UMFrUtils.isOnline(context);
        } catch (Throwable th2) {
            e.a("", th2, new Object[0]);
            return true;
        }
    }
}
