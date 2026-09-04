package com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameMaterialListViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class f {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f87743e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f87744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String f87745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final String f87746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final String f87747d;

    public f(@dl.d String topicId, @dl.d String sortKey, @dl.d String sizeKey, @dl.d String filterKey) {
        f0.p(topicId, "topicId");
        f0.p(sortKey, "sortKey");
        f0.p(sizeKey, "sizeKey");
        f0.p(filterKey, "filterKey");
        this.f87744a = topicId;
        this.f87745b = sortKey;
        this.f87746c = sizeKey;
        this.f87747d = filterKey;
    }

    public static /* synthetic */ f f(f fVar, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 37896, new Class[]{f.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        return fVar.e((i10 & 1) != 0 ? fVar.f87744a : str, (i10 & 2) != 0 ? fVar.f87745b : str2, (i10 & 4) != 0 ? fVar.f87746c : str3, (i10 & 8) != 0 ? fVar.f87747d : str4);
    }

    @dl.d
    public final String a() {
        return this.f87744a;
    }

    @dl.d
    public final String b() {
        return this.f87745b;
    }

    @dl.d
    public final String c() {
        return this.f87746c;
    }

    @dl.d
    public final String d() {
        return this.f87747d;
    }

    @dl.d
    public final f e(@dl.d String topicId, @dl.d String sortKey, @dl.d String sizeKey, @dl.d String filterKey) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{topicId, sortKey, sizeKey, filterKey}, this, changeQuickRedirect, false, 37895, new Class[]{String.class, String.class, String.class, String.class}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        f0.p(topicId, "topicId");
        f0.p(sortKey, "sortKey");
        f0.p(sizeKey, "sizeKey");
        f0.p(filterKey, "filterKey");
        return new f(topicId, sortKey, sizeKey, filterKey);
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37899, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return f0.g(this.f87744a, fVar.f87744a) && f0.g(this.f87745b, fVar.f87745b) && f0.g(this.f87746c, fVar.f87746c) && f0.g(this.f87747d, fVar.f87747d);
    }

    @dl.d
    public final String g() {
        return this.f87747d;
    }

    @dl.d
    public final String h() {
        return this.f87746c;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37898, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((((this.f87744a.hashCode() * 31) + this.f87745b.hashCode()) * 31) + this.f87746c.hashCode()) * 31) + this.f87747d.hashCode();
    }

    @dl.d
    public final String i() {
        return this.f87745b;
    }

    @dl.d
    public final String j() {
        return this.f87744a;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37897, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RequestParams(topicId=" + this.f87744a + ", sortKey=" + this.f87745b + ", sizeKey=" + this.f87746c + ", filterKey=" + this.f87747d + ')';
    }
}
