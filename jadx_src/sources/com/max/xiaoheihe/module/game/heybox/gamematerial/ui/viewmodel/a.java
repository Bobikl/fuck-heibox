package com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: GameMaterialLibraryViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f87705c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f87706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f87707b;

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public a(int i10, int i11) {
        this.f87706a = i10;
        this.f87707b = i11;
    }

    public /* synthetic */ a(int i10, int i11, int i12, u uVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    public static /* synthetic */ a d(a aVar, int i10, int i11, int i12, Object obj) {
        Object[] objArr = {aVar, new Integer(i10), new Integer(i11), new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 37793, new Class[]{a.class, cls, cls, cls, Object.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if ((i12 & 1) != 0) {
            i10 = aVar.f87706a;
        }
        if ((i12 & 2) != 0) {
            i11 = aVar.f87707b;
        }
        return aVar.c(i10, i11);
    }

    public final int a() {
        return this.f87706a;
    }

    public final int b() {
        return this.f87707b;
    }

    @dl.d
    public final a c(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37792, new Class[]{cls, cls}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a(i10, i11);
    }

    public final int e() {
        return this.f87706a;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f87706a == aVar.f87706a && this.f87707b == aVar.f87707b;
    }

    public final int f() {
        return this.f87707b;
    }

    public final void g(int i10) {
        this.f87706a = i10;
    }

    public final void h(int i10) {
        this.f87707b = i10;
    }

    public int hashCode() {
        return (this.f87706a * 31) + this.f87707b;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37794, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FilterStateItem(listIndex=" + this.f87706a + ", secondIndex=" + this.f87707b + ')';
    }
}
