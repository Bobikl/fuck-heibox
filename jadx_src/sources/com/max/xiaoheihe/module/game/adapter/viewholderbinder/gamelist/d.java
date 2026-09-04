package com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.xiaoheihe.module.game.a2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: GameListVHBParam.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class d implements cb.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f86386f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private Context f86387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private s<?> f86388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private a2 f86389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private String f86390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f86391e;

    public d(@dl.d Context context, @dl.d s<?> adapter, @dl.e a2 a2Var, @dl.e String str, boolean z10) {
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        this.f86387a = context;
        this.f86388b = adapter;
        this.f86389c = a2Var;
        this.f86390d = str;
        this.f86391e = z10;
    }

    public /* synthetic */ d(Context context, s sVar, a2 a2Var, String str, boolean z10, int i10, u uVar) {
        this(context, sVar, a2Var, str, (i10 & 16) != 0 ? true : z10);
    }

    public static /* synthetic */ d g(d dVar, Context context, s sVar, a2 a2Var, String str, boolean z10, int i10, Object obj) {
        boolean z11 = z10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, context, sVar, a2Var, str, new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 36224, new Class[]{d.class, Context.class, s.class, a2.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        Context context2 = (i10 & 1) != 0 ? dVar.f86387a : context;
        s sVar2 = (i10 & 2) != 0 ? dVar.f86388b : sVar;
        a2 a2Var2 = (i10 & 4) != 0 ? dVar.f86389c : a2Var;
        String str2 = (i10 & 8) != 0 ? dVar.f86390d : str;
        if ((i10 & 16) != 0) {
            z11 = dVar.f86391e;
        }
        return dVar.f(context2, sVar2, a2Var2, str2, z11);
    }

    @dl.d
    public final Context a() {
        return this.f86387a;
    }

    @dl.d
    public final s<?> b() {
        return this.f86388b;
    }

    @dl.e
    public final a2 c() {
        return this.f86389c;
    }

    @dl.e
    public final String d() {
        return this.f86390d;
    }

    public final boolean e() {
        return this.f86391e;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 36227, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f0.g(this.f86387a, dVar.f86387a) && f0.g(this.f86388b, dVar.f86388b) && f0.g(this.f86389c, dVar.f86389c) && f0.g(this.f86390d, dVar.f86390d) && this.f86391e == dVar.f86391e;
    }

    @dl.d
    public final d f(@dl.d Context context, @dl.d s<?> adapter, @dl.e a2 a2Var, @dl.e String str, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, adapter, a2Var, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36223, new Class[]{Context.class, s.class, a2.class, String.class, Boolean.TYPE}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        return new d(context, adapter, a2Var, str, z10);
    }

    @dl.d
    public final s<?> h() {
        return this.f86388b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36226, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = ((this.f86387a.hashCode() * 31) + this.f86388b.hashCode()) * 31;
        a2 a2Var = this.f86389c;
        int iHashCode2 = (iHashCode + (a2Var == null ? 0 : a2Var.hashCode())) * 31;
        String str = this.f86390d;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z10 = this.f86391e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode3 + r10;
    }

    @dl.d
    public final Context i() {
        return this.f86387a;
    }

    @dl.e
    public final a2 j() {
        return this.f86389c;
    }

    @dl.e
    public final String k() {
        return this.f86390d;
    }

    public final boolean l() {
        return this.f86391e;
    }

    public final void m(@dl.d s<?> sVar) {
        if (PatchProxy.proxy(new Object[]{sVar}, this, changeQuickRedirect, false, 36222, new Class[]{s.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sVar, "<set-?>");
        this.f86388b = sVar;
    }

    public final void n(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 36221, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f86387a = context;
    }

    public final void o(@dl.e a2 a2Var) {
        this.f86389c = a2Var;
    }

    public final void p(@dl.e String str) {
        this.f86390d = str;
    }

    public final void q(boolean z10) {
        this.f86391e = z10;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36225, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameListVHBParam(context=" + this.f86387a + ", adapter=" + this.f86388b + ", downloadController=" + this.f86389c + ", keyPoint=" + this.f86390d + ", showDiv=" + this.f86391e + ')';
    }
}
