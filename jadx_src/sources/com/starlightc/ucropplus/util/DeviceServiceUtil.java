package com.starlightc.ucropplus.util;

import android.content.Context;
import android.os.Vibrator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DeviceServiceUtil.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DeviceServiceUtil {

    @d
    public static final DeviceServiceUtil INSTANCE = new DeviceServiceUtil();
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private static Vibrator vibrator;

    private DeviceServiceUtil() {
    }

    public final void vibrate(@d Context context, long j10) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{context, new Long(j10)}, this, changeQuickRedirect, false, 50911, new Class[]{Context.class, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        if (vibrator == null) {
            vibrator = (Vibrator) context.getSystemService("vibrator");
        }
        Vibrator vibrator2 = vibrator;
        if (vibrator2 != null && vibrator2.hasVibrator()) {
            z10 = true;
        }
        if (z10) {
            Vibrator vibrator3 = vibrator;
            f0.m(vibrator3);
            vibrator3.vibrate(j10);
        }
    }

    public final void vibrate(@d Context context, @d long[] pattern) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{context, pattern}, this, changeQuickRedirect, false, 50912, new Class[]{Context.class, long[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(pattern, "pattern");
        if (vibrator == null) {
            vibrator = (Vibrator) context.getSystemService("vibrator");
        }
        Vibrator vibrator2 = vibrator;
        if (vibrator2 != null && vibrator2.hasVibrator()) {
            z10 = true;
        }
        if (z10) {
            Vibrator vibrator3 = vibrator;
            f0.m(vibrator3);
            vibrator3.vibrate(pattern, -1);
        }
    }
}
