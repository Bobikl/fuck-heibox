package com.umeng.ut.a.c;

import android.content.Context;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static boolean a(Context context) {
        try {
            return UMUtils.isMainProgress(context);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return true;
        }
    }
}
