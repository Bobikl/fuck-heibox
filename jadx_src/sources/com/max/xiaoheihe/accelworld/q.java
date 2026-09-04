package com.max.xiaoheihe.accelworld;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.msp.push.HeytapPushManager;
import com.hihonor.push.sdk.HonorPushClient;
import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.vivo.push.PushClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: AccelWorldPush.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nAccelWorldPush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccelWorldPush.kt\ncom/max/xiaoheihe/accelworld/AccelWorldPushKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
public final class q {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final boolean a(@dl.e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.ux, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            String str = Build.BRAND;
            Log.d("Assist_HW", "brand =  " + str);
            if (kotlin.text.u.L1(str, "huawei", true)) {
                return true;
            }
            if (kotlin.text.u.L1(str, "honor", true)) {
                boolean zK = k();
                Log.d("Assist_HW", "is honor newDevice :  " + zK);
                return !zK;
            }
        } catch (Throwable th2) {
            Log.d("Assist_HW", "check hw device error = " + th2);
        }
        return false;
    }

    public static final boolean b(@dl.e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.tx, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            return HonorPushClient.getInstance().checkSupportHonorPush(context);
        } catch (Throwable th2) {
            Log.e("Assist_Honor", "honor check support failed." + th2);
            return false;
        }
    }

    public static final boolean c(@dl.e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.Dx, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            HeytapPushManager.init(context, false);
            return HeytapPushManager.isSupportPush(context);
        } catch (Throwable th2) {
            String message = th2.getMessage();
            f0.m(message);
            Log.d("Assist_OP", message);
            return false;
        }
    }

    public static final boolean d(@dl.e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.Cx, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            boolean zIsSupport = PushClient.getInstance(context).isSupport();
            Log.d("Assist_VV", "the vivo system push support = " + zIsSupport);
            return zIsSupport;
        } catch (Throwable th2) {
            String message = th2.getMessage();
            f0.m(message);
            Log.d("Assist_VV", message);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    public static final boolean e(@dl.d Context var0) {
        boolean z10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{var0}, null, changeQuickRedirect, true, bb.c.m.zx, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(var0, "var0");
        try {
            if (m()) {
                PackageInfo it = var0.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0);
                f0.o(it, "it");
                z10 = it != null && it.versionCode >= 105;
            }
            return z10;
        } catch (Throwable unused) {
            return false;
        }
    }

    @dl.d
    public static final String f(@dl.e String str) {
        String str2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.yx, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            f0.n(objInvoke, "null cannot be cast to non-null type kotlin.String");
            str2 = (String) objInvoke;
        } catch (Throwable th2) {
            Log.d("Assist_HW", "getBuildVersion error : " + th2.getMessage());
            str2 = "";
        }
        Log.d("Assist_HW", "getBuildVersion: " + str2);
        return str2;
    }

    @dl.e
    public static final String g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.sx, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        BaseApplication context = BaseApplication.a();
        if (a(context)) {
            return PUSH_CHANNEL_TYPE.HUAWEI.getValue();
        }
        if (b(context)) {
            return PUSH_CHANNEL_TYPE.HONOR.getValue();
        }
        f0.o(context, "context");
        if (e(context)) {
            return PUSH_CHANNEL_TYPE.XIAOMI.getValue();
        }
        if (c(context)) {
            return PUSH_CHANNEL_TYPE.OPPO.getValue();
        }
        if (d(context)) {
            return PUSH_CHANNEL_TYPE.VIVO.getValue();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @dl.e
    public static final String h(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.rx, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1206476313:
                    if (str.equals("huawei")) {
                        return PUSH_CHANNEL_TYPE.HUAWEI.getValue();
                    }
                    break;
                case -759499589:
                    if (str.equals("xiaomi")) {
                        return PUSH_CHANNEL_TYPE.XIAOMI.getValue();
                    }
                    break;
                case 3418016:
                    if (str.equals("oppo")) {
                        return PUSH_CHANNEL_TYPE.OPPO.getValue();
                    }
                    break;
                case 3620012:
                    if (str.equals("vivo")) {
                        return PUSH_CHANNEL_TYPE.VIVO.getValue();
                    }
                    break;
                case 99462250:
                    if (str.equals("honor")) {
                        return PUSH_CHANNEL_TYPE.HONOR.getValue();
                    }
                    break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static final String i(String str) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.Bx, new Class[]{String.class}, String.class);
        ?? bufferedReader = patchProxyResultProxy.isSupported;
        if (bufferedReader != 0) {
            return (String) patchProxyResultProxy.result;
        }
        String line = null;
        line = null;
        line = null;
        ?? r10 = 0;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
                    try {
                        line = bufferedReader.readLine();
                        bufferedReader.close();
                        bufferedReader = bufferedReader;
                    } catch (Exception e10) {
                        e = e10;
                        e.printStackTrace();
                        if (bufferedReader != 0) {
                            bufferedReader.close();
                            bufferedReader = bufferedReader;
                        }
                        return line;
                    }
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            } catch (Exception e12) {
                e = e12;
                bufferedReader = 0;
            } catch (Throwable th2) {
                th = th2;
                if (r10 != 0) {
                    try {
                        r10.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                throw th;
            }
            return line;
        } catch (Throwable th3) {
            th = th3;
            r10 = bufferedReader;
        }
    }

    private static final boolean j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.wx, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : kotlin.text.u.L1(Build.MANUFACTURER, "HONOR", true);
    }

    public static final boolean k() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.vx, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return j() && !l();
    }

    public static final boolean l() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.xx, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String strF = f(r4.a.f138781a);
        if (TextUtils.isEmpty(strF)) {
            return false;
        }
        return StringsKt__StringsKt.W2(strF, "MagicUI", false, 2, null) || StringsKt__StringsKt.W2(strF, "MagicOS", false, 2, null);
    }

    private static final boolean m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.Ax, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (TextUtils.isEmpty(i("ro.miui.ui.version.name")) && TextUtils.isEmpty(i("ro.miui.ui.version.code"))) ? false : true;
    }
}
