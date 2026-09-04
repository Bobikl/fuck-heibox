package com.max.xiaoheihe.utils;

import android.content.Context;
import android.content.Intent;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: SystemUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class b0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48879, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        b(context, str, context.getString(R.string.text_copied));
    }

    public static void b(Context context, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 48880, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        d.o(context, str);
        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.d(str2);
    }

    public static void c(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 48882, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        System.setProperty("jsse.enableSNIExtension", String.valueOf(z10));
    }

    public static void d(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48881, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        context.startActivity(new Intent("android.settings.SETTINGS"));
    }
}
