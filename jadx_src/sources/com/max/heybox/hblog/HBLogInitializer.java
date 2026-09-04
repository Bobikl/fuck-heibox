package com.max.heybox.hblog;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBLogInitializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HBLogInitializer implements androidx.startup.b<b2> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.b2] */
    @Override // androidx.startup.b
    public /* bridge */ /* synthetic */ b2 a(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.l.f34450t7, new Class[]{Context.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        c(context);
        return b2.f124493a;
    }

    @Override // androidx.startup.b
    @dl.d
    public List<Class<? extends androidx.startup.b<?>>> b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34428s7, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : new ArrayList();
    }

    public void c(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.l.f34406r7, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        g.f74531b.P(context, false);
    }
}
