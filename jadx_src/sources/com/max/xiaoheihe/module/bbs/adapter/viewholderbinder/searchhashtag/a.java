package com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.searchhashtag;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.xiaoheihe.module.bbs.adapter.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SearchHashtagVHBParam.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class a implements cb.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f80704e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private Context f80705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private s<?> f80706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private t.a f80707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f80708d;

    public a(@d Context context, @d s<?> adapter, @e t.a aVar, boolean z10) {
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        this.f80705a = context;
        this.f80706b = adapter;
        this.f80707c = aVar;
        this.f80708d = z10;
    }

    public /* synthetic */ a(Context context, s sVar, t.a aVar, boolean z10, int i10, u uVar) {
        this(context, sVar, aVar, (i10 & 8) != 0 ? true : z10);
    }

    public static /* synthetic */ a f(a aVar, Context context, s sVar, t.a aVar2, boolean z10, int i10, Object obj) {
        boolean z11 = z10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, context, sVar, aVar2, new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 27572, new Class[]{a.class, Context.class, s.class, t.a.class, Boolean.TYPE, Integer.TYPE, Object.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        Context context2 = (i10 & 1) != 0 ? aVar.f80705a : context;
        s sVar2 = (i10 & 2) != 0 ? aVar.f80706b : sVar;
        t.a aVar3 = (i10 & 4) != 0 ? aVar.f80707c : aVar2;
        if ((i10 & 8) != 0) {
            z11 = aVar.f80708d;
        }
        return aVar.e(context2, sVar2, aVar3, z11);
    }

    @d
    public final Context a() {
        return this.f80705a;
    }

    @d
    public final s<?> b() {
        return this.f80706b;
    }

    @e
    public final t.a c() {
        return this.f80707c;
    }

    public final boolean d() {
        return this.f80708d;
    }

    @d
    public final a e(@d Context context, @d s<?> adapter, @e t.a aVar, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, adapter, aVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27571, new Class[]{Context.class, s.class, t.a.class, Boolean.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        return new a(context, adapter, aVar, z10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27575, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f0.g(this.f80705a, aVar.f80705a) && f0.g(this.f80706b, aVar.f80706b) && f0.g(this.f80707c, aVar.f80707c) && this.f80708d == aVar.f80708d;
    }

    @d
    public final s<?> g() {
        return this.f80706b;
    }

    @d
    public final Context h() {
        return this.f80705a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27574, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = ((this.f80705a.hashCode() * 31) + this.f80706b.hashCode()) * 31;
        t.a aVar = this.f80707c;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z10 = this.f80708d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode2 + r10;
    }

    @e
    public final t.a i() {
        return this.f80707c;
    }

    public final boolean j() {
        return this.f80708d;
    }

    public final void k(@d s<?> sVar) {
        if (PatchProxy.proxy(new Object[]{sVar}, this, changeQuickRedirect, false, 27570, new Class[]{s.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sVar, "<set-?>");
        this.f80706b = sVar;
    }

    public final void l(@d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 27569, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f80705a = context;
    }

    public final void m(@e t.a aVar) {
        this.f80707c = aVar;
    }

    public final void n(boolean z10) {
        this.f80708d = z10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27573, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchHashtagVHBParam(context=" + this.f80705a + ", adapter=" + this.f80706b + ", itemClickListener=" + this.f80707c + ", showDiv=" + this.f80708d + ')';
    }
}
