package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.n0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
@Deprecated
public class d {
    @n0
    @v8.a
    public static String a(@n0 PowerManager.WakeLock wakeLock, @n0 String str) {
        String strValueOf = String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock)));
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        return String.valueOf(strValueOf).concat(String.valueOf(str));
    }
}
