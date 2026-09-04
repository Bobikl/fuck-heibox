package com.max.hbcommon.push;

import android.content.Context;
import bb.c;
import com.igexin.sdk.PushManager;
import com.max.hbcommon.network.p;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import io.reactivex.schedulers.b;

/* JADX INFO: compiled from: hBGeTuiPushUtil.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@e Context context, @e String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.e.Xe, new Class[]{Context.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported || str == null) {
            return;
        }
        String clientid = PushManager.getInstance().getClientid(context);
        if (z10) {
            PushManager.getInstance().bindAlias(context, str, "heybox");
            g.f74531b.q("[Getui] bind alias: " + str);
        } else {
            PushManager.getInstance().unBindAlias(context, str, true, "heybox");
            g.f74531b.q("[Getui] unbind alias: " + str);
        }
        c(context, z10, clientid);
    }

    public static final boolean b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.e.We, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : HBGTIntentService.f68178c.a();
    }

    public static final void c(@e Context context, boolean z10, @e String str) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0), str}, null, changeQuickRedirect, true, 4352, new Class[]{Context.class, Boolean.TYPE, String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        if (z10) {
            com.max.hbcommon.network.e.a().M(str).I5(b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new p());
        } else {
            com.max.hbcommon.network.e.a().n(str).I5(b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new p());
        }
    }
}
