package com.max.network;

import bb.c;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import kotlin.jvm.internal.f0;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: compiled from: HttpLogger.kt */
/* JADX INFO: loaded from: classes2.dex */
public class HttpLogger implements HttpLoggingInterceptor.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // okhttp3.logging.HttpLoggingInterceptor.a
    public void log(@d String message) {
        if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, c.m.f34772hd, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(message, "message");
        g gVarB = g.f74531b.B();
        if (gVarB != null) {
            gVarB.a0(message);
        }
    }
}
