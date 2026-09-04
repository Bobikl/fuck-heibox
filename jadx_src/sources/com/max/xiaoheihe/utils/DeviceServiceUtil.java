package com.max.xiaoheihe.utils;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.Result;
import kotlin.b2;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: DeviceServiceUtil.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class DeviceServiceUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final DeviceServiceUtil f95244a = new DeviceServiceUtil();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f95245b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private DeviceServiceUtil() {
    }

    public static final /* synthetic */ void a(DeviceServiceUtil deviceServiceUtil, long j10, int i10) {
        if (PatchProxy.proxy(new Object[]{deviceServiceUtil, new Long(j10), new Integer(i10)}, null, changeQuickRedirect, true, 48674, new Class[]{DeviceServiceUtil.class, Long.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        deviceServiceUtil.e(j10, i10);
    }

    private final void c(long j10, int i10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10), new Integer(i10)}, this, changeQuickRedirect, false, 48672, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(r0.a(e1.a()), null, null, new DeviceServiceUtil$performPredefinedVibratorEffect$3(j10, i10, null), 3, null);
    }

    private final void e(long j10, int i10) {
        Object objB;
        if (PatchProxy.proxy(new Object[]{new Long(j10), new Integer(i10)}, this, changeQuickRedirect, false, 48673, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Result.a aVar = Result.f124476c;
            int I = fi.u.I(i10, -1, 255);
            Vibrator vibratorF = f();
            if (vibratorF == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                vibratorF.vibrate(VibrationEffect.createOneShot(j10, I));
            } else {
                vibratorF.vibrate(j10);
            }
            objB = Result.b(b2.f124493a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            com.max.heybox.hblog.g.f74531b.v("[performVibratorEffect] error: " + thE);
        }
    }

    private final Vibrator f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48669, new Class[0], Vibrator.class);
        if (patchProxyResultProxy.isSupported) {
            return (Vibrator) patchProxyResultProxy.result;
        }
        HeyBoxApplication heyBoxApplicationC = HeyBoxApplication.C();
        kotlin.jvm.internal.f0.o(heyBoxApplicationC, "getInstance()");
        if (Build.VERSION.SDK_INT < 31) {
            Object systemService = heyBoxApplicationC.getSystemService("vibrator");
            if (systemService instanceof Vibrator) {
                return (Vibrator) systemService;
            }
            return null;
        }
        Object systemService2 = heyBoxApplicationC.getSystemService("vibrator_manager");
        VibratorManager vibratorManager = systemService2 instanceof VibratorManager ? (VibratorManager) systemService2 : null;
        if (vibratorManager != null) {
            return vibratorManager.getDefaultVibrator();
        }
        return null;
    }

    public final void b(long j10) {
        Object objB;
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 48670, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Result.a aVar = Result.f124476c;
            Vibrator vibratorF = f();
            if (vibratorF == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                vibratorF.vibrate(VibrationEffect.createOneShot(j10, -1));
            } else {
                vibratorF.vibrate(j10);
            }
            objB = Result.b(b2.f124493a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            com.max.heybox.hblog.g.f74531b.v("[performDefaultVibratorEffect] error: " + thE);
        }
    }

    public final void d(@dl.d String delayMs, @dl.d String typeCode) {
        Object objB;
        if (PatchProxy.proxy(new Object[]{delayMs, typeCode}, this, changeQuickRedirect, false, 48671, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(delayMs, "delayMs");
        kotlin.jvm.internal.f0.p(typeCode, "typeCode");
        try {
            Result.a aVar = Result.f124476c;
            c(Long.parseLong(delayMs), Integer.parseInt(typeCode));
            objB = Result.b(b2.f124493a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            com.max.heybox.hblog.g.f74531b.v("[performPredefinedVibratorEffect] error: " + thE);
        }
    }
}
