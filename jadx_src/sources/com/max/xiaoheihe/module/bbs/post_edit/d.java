package com.max.xiaoheihe.module.bbs.post_edit;

import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: IPostEditSlice.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f82943d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final List<GameObj> f82944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final String f82945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final String f82946c;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@dl.e List<? extends GameObj> list, @dl.e String str, @dl.e String str2) {
        this.f82944a = list;
        this.f82945b = str;
        this.f82946c = str2;
    }

    public static /* synthetic */ d e(d dVar, List list, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, list, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 29643, new Class[]{d.class, List.class, String.class, String.class, Integer.TYPE, Object.class}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = dVar.f82944a;
        }
        if ((i10 & 2) != 0) {
            str = dVar.f82945b;
        }
        if ((i10 & 4) != 0) {
            str2 = dVar.f82946c;
        }
        return dVar.d(list, str, str2);
    }

    @dl.e
    public final List<GameObj> a() {
        return this.f82944a;
    }

    @dl.e
    public final String b() {
        return this.f82945b;
    }

    @dl.e
    public final String c() {
        return this.f82946c;
    }

    @dl.d
    public final d d(@dl.e List<? extends GameObj> list, @dl.e String str, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str, str2}, this, changeQuickRedirect, false, 29642, new Class[]{List.class, String.class, String.class}, d.class);
        return patchProxyResultProxy.isSupported ? (d) patchProxyResultProxy.result : new d(list, str, str2);
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29646, new Class[]{Object.class}, Boolean.TYPE);
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
        return kotlin.jvm.internal.f0.g(this.f82944a, dVar.f82944a) && kotlin.jvm.internal.f0.g(this.f82945b, dVar.f82945b) && kotlin.jvm.internal.f0.g(this.f82946c, dVar.f82946c);
    }

    @dl.e
    public final String f() {
        return this.f82946c;
    }

    @dl.e
    public final String g() {
        return this.f82945b;
    }

    @dl.e
    public final List<GameObj> h() {
        return this.f82944a;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29645, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<GameObj> list = this.f82944a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f82945b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82946c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29644, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "EditingData(selectedGameObjList=" + this.f82944a + ", inputTitle=" + this.f82945b + ", inputContent=" + this.f82946c + ')';
    }
}
