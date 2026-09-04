package com.max.hbcommon.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: compiled from: HBHttpLogger.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class k implements HttpLoggingInterceptor.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // okhttp3.logging.HttpLoggingInterceptor.a
    public void log(@dl.d String message) {
        if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, bb.c.e.Ac, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(message, "message");
        com.max.heybox.hblog.g gVarB = com.max.heybox.hblog.g.f74531b.B();
        if (gVarB != null) {
            gVarB.a0(message);
        }
    }
}
