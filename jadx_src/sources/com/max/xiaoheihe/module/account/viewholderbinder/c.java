package com.max.xiaoheihe.module.account.viewholderbinder;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PushStateVHBParam.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class c implements cb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f79450c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private Context f79451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private s<?> f79452b;

    public c(@d Context context, @d s<?> adapter) {
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        this.f79451a = context;
        this.f79452b = adapter;
    }

    public static /* synthetic */ c d(c cVar, Context context, s sVar, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar, context, sVar, new Integer(i10), obj}, null, changeQuickRedirect, true, 25559, new Class[]{c.class, Context.class, s.class, Integer.TYPE, Object.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            context = cVar.f79451a;
        }
        if ((i10 & 2) != 0) {
            sVar = cVar.f79452b;
        }
        return cVar.c(context, sVar);
    }

    @d
    public final Context a() {
        return this.f79451a;
    }

    @d
    public final s<?> b() {
        return this.f79452b;
    }

    @d
    public final c c(@d Context context, @d s<?> adapter) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, adapter}, this, changeQuickRedirect, false, 25558, new Class[]{Context.class, s.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        return new c(context, adapter);
    }

    @d
    public final s<?> e() {
        return this.f79452b;
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25562, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f0.g(this.f79451a, cVar.f79451a) && f0.g(this.f79452b, cVar.f79452b);
    }

    @d
    public final Context f() {
        return this.f79451a;
    }

    public final void g(@d s<?> sVar) {
        if (PatchProxy.proxy(new Object[]{sVar}, this, changeQuickRedirect, false, 25557, new Class[]{s.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sVar, "<set-?>");
        this.f79452b = sVar;
    }

    public final void h(@d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 25556, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f79451a = context;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25561, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (this.f79451a.hashCode() * 31) + this.f79452b.hashCode();
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25560, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PushStateVHBParam(context=" + this.f79451a + ", adapter=" + this.f79452b + ')';
    }
}
