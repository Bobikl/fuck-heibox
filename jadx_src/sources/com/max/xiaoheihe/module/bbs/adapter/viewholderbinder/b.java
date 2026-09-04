package com.max.xiaoheihe.module.bbs.adapter.viewholderbinder;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.u;
import com.max.xiaoheihe.module.bbs.adapter.m;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LinkVHBParam.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class b implements cb.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f80659j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private Context f80660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private u<?> f80661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private String f80662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private UMShareListener f80663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private String f80664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private l0.h<?> f80665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private m.b f80666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f80667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f80668i;

    public b(@dl.d Context context, @dl.d u<?> adapter, @dl.d String pageType, @dl.e UMShareListener uMShareListener, @dl.e String str, @dl.e l0.h<?> hVar, @dl.e m.b bVar, boolean z10, boolean z11) {
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        f0.p(pageType, "pageType");
        this.f80660a = context;
        this.f80661b = adapter;
        this.f80662c = pageType;
        this.f80663d = uMShareListener;
        this.f80664e = str;
        this.f80665f = hVar;
        this.f80666g = bVar;
        this.f80667h = z10;
        this.f80668i = z11;
    }

    public static /* synthetic */ b k(b bVar, Context context, u uVar, String str, UMShareListener uMShareListener, String str2, l0.h hVar, m.b bVar2, boolean z10, boolean z11, int i10, Object obj) {
        boolean z12 = z11;
        Object[] objArr = {bVar, context, uVar, str, uMShareListener, str2, hVar, bVar2, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 27538, new Class[]{b.class, Context.class, u.class, String.class, UMShareListener.class, String.class, l0.h.class, m.b.class, cls, cls, Integer.TYPE, Object.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        Context context2 = (i10 & 1) != 0 ? bVar.f80660a : context;
        u uVar2 = (i10 & 2) != 0 ? bVar.f80661b : uVar;
        String str3 = (i10 & 4) != 0 ? bVar.f80662c : str;
        UMShareListener uMShareListener2 = (i10 & 8) != 0 ? bVar.f80663d : uMShareListener;
        String str4 = (i10 & 16) != 0 ? bVar.f80664e : str2;
        l0.h hVar2 = (i10 & 32) != 0 ? bVar.f80665f : hVar;
        m.b bVar3 = (i10 & 64) != 0 ? bVar.f80666g : bVar2;
        boolean z13 = (i10 & 128) != 0 ? bVar.f80667h : z10 ? 1 : 0;
        if ((i10 & 256) != 0) {
            z12 = bVar.f80668i;
        }
        return bVar.j(context2, uVar2, str3, uMShareListener2, str4, hVar2, bVar3, z13, z12);
    }

    public final void A(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27536, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f80662c = str;
    }

    public final void B(@dl.e UMShareListener uMShareListener) {
        this.f80663d = uMShareListener;
    }

    public final void C(boolean z10) {
        this.f80667h = z10;
    }

    @dl.d
    public final Context a() {
        return this.f80660a;
    }

    @dl.d
    public final u<?> b() {
        return this.f80661b;
    }

    @dl.d
    public final String c() {
        return this.f80662c;
    }

    @dl.e
    public final UMShareListener d() {
        return this.f80663d;
    }

    @dl.e
    public final String e() {
        return this.f80664e;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27541, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f0.g(this.f80660a, bVar.f80660a) && f0.g(this.f80661b, bVar.f80661b) && f0.g(this.f80662c, bVar.f80662c) && f0.g(this.f80663d, bVar.f80663d) && f0.g(this.f80664e, bVar.f80664e) && f0.g(this.f80665f, bVar.f80665f) && f0.g(this.f80666g, bVar.f80666g) && this.f80667h == bVar.f80667h && this.f80668i == bVar.f80668i;
    }

    @dl.e
    public final l0.h<?> f() {
        return this.f80665f;
    }

    @dl.e
    public final m.b g() {
        return this.f80666g;
    }

    public final boolean h() {
        return this.f80667h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27540, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = ((((this.f80660a.hashCode() * 31) + this.f80661b.hashCode()) * 31) + this.f80662c.hashCode()) * 31;
        UMShareListener uMShareListener = this.f80663d;
        int iHashCode2 = (iHashCode + (uMShareListener == null ? 0 : uMShareListener.hashCode())) * 31;
        String str = this.f80664e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        l0.h<?> hVar = this.f80665f;
        int iHashCode4 = (iHashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        m.b bVar = this.f80666g;
        int iHashCode5 = (iHashCode4 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        boolean z10 = this.f80667h;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode5 + r10) * 31;
        boolean z11 = this.f80668i;
        return i10 + (z11 ? 1 : z11);
    }

    public final boolean i() {
        return this.f80668i;
    }

    @dl.d
    public final b j(@dl.d Context context, @dl.d u<?> adapter, @dl.d String pageType, @dl.e UMShareListener uMShareListener, @dl.e String str, @dl.e l0.h<?> hVar, @dl.e m.b bVar, boolean z10, boolean z11) {
        Object[] objArr = {context, adapter, pageType, uMShareListener, str, hVar, bVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27537, new Class[]{Context.class, u.class, String.class, UMShareListener.class, String.class, l0.h.class, m.b.class, cls, cls}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        f0.p(pageType, "pageType");
        return new b(context, adapter, pageType, uMShareListener, str, hVar, bVar, z10, z11);
    }

    @dl.d
    public final u<?> l() {
        return this.f80661b;
    }

    @dl.e
    public final l0.h<?> m() {
        return this.f80665f;
    }

    @dl.d
    public final Context n() {
        return this.f80660a;
    }

    @dl.e
    public final String o() {
        return this.f80664e;
    }

    @dl.e
    public final m.b p() {
        return this.f80666g;
    }

    @dl.d
    public final String q() {
        return this.f80662c;
    }

    @dl.e
    public final UMShareListener r() {
        return this.f80663d;
    }

    public final boolean s() {
        return this.f80667h;
    }

    public final boolean t() {
        return this.f80668i;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27539, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "LinkVHBParam(context=" + this.f80660a + ", adapter=" + this.f80661b + ", pageType=" + this.f80662c + ", shareListener=" + this.f80663d + ", folderID=" + this.f80664e + ", callBack=" + this.f80665f + ", linkActionHandler=" + this.f80666g + ", showCheckBox=" + this.f80667h + ", isConciseLink=" + this.f80668i + ')';
    }

    public final void u(@dl.d u<?> uVar) {
        if (PatchProxy.proxy(new Object[]{uVar}, this, changeQuickRedirect, false, 27535, new Class[]{u.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uVar, "<set-?>");
        this.f80661b = uVar;
    }

    public final void v(@dl.e l0.h<?> hVar) {
        this.f80665f = hVar;
    }

    public final void w(boolean z10) {
        this.f80668i = z10;
    }

    public final void x(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 27534, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f80660a = context;
    }

    public final void y(@dl.e String str) {
        this.f80664e = str;
    }

    public final void z(@dl.e m.b bVar) {
        this.f80666g = bVar;
    }
}
