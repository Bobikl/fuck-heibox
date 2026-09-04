package com.max.xiaoheihe.accelworld;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWorldDarkMode.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@dl.e Context context) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.Qv, new Class[]{Context.class}, Void.TYPE).isSupported || context == null) {
            return;
        }
        boolean zA = n.a(context);
        boolean zB = com.max.hbutils.utils.u.b(context);
        boolean zD = com.max.hbutils.utils.u.d(context);
        String strJ = com.max.hbcache.c.j(com.max.hbcache.c.f66157x0);
        if (!f0.g("0", strJ) ? (!zB || !f0.g("2", strJ)) && (zB || !f0.g("1", strJ)) : zB == zD) {
            z10 = false;
        }
        com.max.heybox.hblog.g.f74531b.M("inMultiWindowMode: " + zA + "  appDarkMode: " + zB + "  isSystemDark: " + zD + "  state: " + strJ + "  needRefreshDarkMode: " + z10 + "  activity=" + context.getClass().getName());
        if (z10) {
            com.max.xiaoheihe.utils.d.g1();
        }
    }
}
