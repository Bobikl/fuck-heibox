package com.max.hbpermission;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.annotation.b1;
import androidx.annotation.n0;
import androidx.core.content.t0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HappyPermissions.java */
/* JADX INFO: loaded from: classes11.dex */
public class d {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean a(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.i.f33398v3, new Class[]{Context.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : d(context, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    public static boolean b(@n0 Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.i.f33388t3, new Class[]{Context.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if ("Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            return c(context, str);
        }
        return androidx.core.content.d.a(context, str) == 0;
    }

    private static boolean c(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.i.f33393u3, new Class[]{Context.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String strF = androidx.core.app.p.f(str);
        if (strF == null) {
            return true;
        }
        return androidx.core.app.p.b(context, strF, Process.myUid(), context.getPackageName()) == 0 && t0.d(context, str) == 0;
    }

    public static boolean d(@n0 Context context, @b1(min = 1) String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, strArr}, null, changeQuickRedirect, true, bb.c.i.f33383s3, new Class[]{Context.class, String[].class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        for (String str : strArr) {
            if (!b(context, str)) {
                return false;
            }
        }
        return true;
    }
}
