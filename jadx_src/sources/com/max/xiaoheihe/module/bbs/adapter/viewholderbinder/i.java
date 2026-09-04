package com.max.xiaoheihe.module.bbs.adapter.viewholderbinder;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.u;
import com.max.hbsearch.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WikiVHBParam.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class i implements cb.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f80693d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private Context f80694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private u<?> f80695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private p f80696c;

    public i(@dl.d Context context, @dl.d u<?> adapter, @dl.e p pVar) {
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        this.f80694a = context;
        this.f80695b = adapter;
        this.f80696c = pVar;
    }

    public static /* synthetic */ i e(i iVar, Context context, u uVar, p pVar, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, context, uVar, pVar, new Integer(i10), obj}, null, changeQuickRedirect, true, 27557, new Class[]{i.class, Context.class, u.class, p.class, Integer.TYPE, Object.class}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            context = iVar.f80694a;
        }
        if ((i10 & 2) != 0) {
            uVar = iVar.f80695b;
        }
        if ((i10 & 4) != 0) {
            pVar = iVar.f80696c;
        }
        return iVar.d(context, uVar, pVar);
    }

    @dl.d
    public final Context a() {
        return this.f80694a;
    }

    @dl.d
    public final u<?> b() {
        return this.f80695b;
    }

    @dl.e
    public final p c() {
        return this.f80696c;
    }

    @dl.d
    public final i d(@dl.d Context context, @dl.d u<?> adapter, @dl.e p pVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, adapter, pVar}, this, changeQuickRedirect, false, 27556, new Class[]{Context.class, u.class, p.class}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        return new i(context, adapter, pVar);
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27560, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return f0.g(this.f80694a, iVar.f80694a) && f0.g(this.f80695b, iVar.f80695b) && f0.g(this.f80696c, iVar.f80696c);
    }

    @dl.d
    public final u<?> f() {
        return this.f80695b;
    }

    @dl.d
    public final Context g() {
        return this.f80694a;
    }

    @dl.e
    public final p h() {
        return this.f80696c;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27559, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = ((this.f80694a.hashCode() * 31) + this.f80695b.hashCode()) * 31;
        p pVar = this.f80696c;
        return iHashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    public final void i(@dl.d u<?> uVar) {
        if (PatchProxy.proxy(new Object[]{uVar}, this, changeQuickRedirect, false, 27555, new Class[]{u.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uVar, "<set-?>");
        this.f80695b = uVar;
    }

    public final void j(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 27554, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f80694a = context;
    }

    public final void k(@dl.e p pVar) {
        this.f80696c = pVar;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27558, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WikiVHBParam(context=" + this.f80694a + ", adapter=" + this.f80695b + ", listener=" + this.f80696c + ')';
    }
}
