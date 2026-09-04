package com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel;

import androidx.compose.foundation.b0;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: GameMaterialListViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f87712f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final List<GameMaterialItem> f87713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f87714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f87715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f87716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private final String f87717e;

    public c() {
        this(null, false, 0, false, null, 31, null);
    }

    public c(@dl.e List<GameMaterialItem> list, boolean z10, int i10, boolean z11, @dl.e String str) {
        this.f87713a = list;
        this.f87714b = z10;
        this.f87715c = i10;
        this.f87716d = z11;
        this.f87717e = str;
    }

    public /* synthetic */ c(List list, boolean z10, int i10, boolean z11, String str, int i11, u uVar) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? true : z10, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) == 0 ? z11 : false, (i11 & 16) != 0 ? "" : str);
    }

    public static /* synthetic */ c g(c cVar, List list, boolean z10, int i10, boolean z11, String str, int i11, Object obj) {
        boolean z12 = z10;
        int i12 = i10;
        boolean z13 = z11;
        Object[] objArr = {cVar, list, new Byte(z12 ? (byte) 1 : (byte) 0), new Integer(i12), new Byte(z13 ? (byte) 1 : (byte) 0), str, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 37821, new Class[]{c.class, List.class, cls, cls2, cls, String.class, cls2, Object.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        List list2 = (i11 & 1) != 0 ? cVar.f87713a : list;
        if ((i11 & 2) != 0) {
            z12 = cVar.f87714b;
        }
        if ((i11 & 4) != 0) {
            i12 = cVar.f87715c;
        }
        if ((i11 & 8) != 0) {
            z13 = cVar.f87716d;
        }
        return cVar.f(list2, z12, i12, z13, (i11 & 16) != 0 ? cVar.f87717e : str);
    }

    @dl.e
    public final List<GameMaterialItem> a() {
        return this.f87713a;
    }

    public final boolean b() {
        return this.f87714b;
    }

    public final int c() {
        return this.f87715c;
    }

    public final boolean d() {
        return this.f87716d;
    }

    @dl.e
    public final String e() {
        return this.f87717e;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37818, new Class[]{Object.class}, Boolean.TYPE);
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
        return f0.g(this.f87713a, cVar.f87713a) && this.f87714b == cVar.f87714b;
    }

    @dl.d
    public final c f(@dl.e List<GameMaterialItem> list, boolean z10, int i10, boolean z11, @dl.e String str) {
        Object[] objArr = {list, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Byte(z11 ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37820, new Class[]{List.class, cls, Integer.TYPE, cls, String.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new c(list, z10, i10, z11, str);
    }

    @dl.e
    public final List<GameMaterialItem> h() {
        return this.f87713a;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37819, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<GameMaterialItem> list = this.f87713a;
        return ((list != null ? list.hashCode() : 0) * 31) + b0.a(this.f87714b);
    }

    public final boolean i() {
        return this.f87714b;
    }

    @dl.e
    public final String j() {
        return this.f87717e;
    }

    public final int k() {
        return this.f87715c;
    }

    public final boolean l() {
        return this.f87716d;
    }

    public final void m(boolean z10) {
        this.f87714b = z10;
    }

    public final void n(int i10) {
        this.f87715c = i10;
    }

    public final void o(boolean z10) {
        this.f87716d = z10;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37822, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameMaterialListModel(gameMaterialList=" + this.f87713a + ", hasMore=" + this.f87714b + ", offset=" + this.f87715c + ", smoothScrollToTop=" + this.f87716d + ", hashTag=" + this.f87717e + ')';
    }
}
