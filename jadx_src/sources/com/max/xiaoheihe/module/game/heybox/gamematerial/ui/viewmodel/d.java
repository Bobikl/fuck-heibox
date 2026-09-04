package com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PostPageViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f87718c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final Result<BBSLinkTreeObj> f87719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final String f87720b;

    public d(@dl.e Result<BBSLinkTreeObj> result, @dl.e String str) {
        this.f87719a = result;
        this.f87720b = str;
    }

    public static /* synthetic */ d d(d dVar, Result result, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, result, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 37871, new Class[]{d.class, Result.class, String.class, Integer.TYPE, Object.class}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            result = dVar.f87719a;
        }
        if ((i10 & 2) != 0) {
            str = dVar.f87720b;
        }
        return dVar.c(result, str);
    }

    @dl.e
    public final Result<BBSLinkTreeObj> a() {
        return this.f87719a;
    }

    @dl.e
    public final String b() {
        return this.f87720b;
    }

    @dl.d
    public final d c(@dl.e Result<BBSLinkTreeObj> result, @dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result, str}, this, changeQuickRedirect, false, 37870, new Class[]{Result.class, String.class}, d.class);
        return patchProxyResultProxy.isSupported ? (d) patchProxyResultProxy.result : new d(result, str);
    }

    @dl.e
    public final Result<BBSLinkTreeObj> e() {
        return this.f87719a;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37874, new Class[]{Object.class}, Boolean.TYPE);
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
        return f0.g(this.f87719a, dVar.f87719a) && f0.g(this.f87720b, dVar.f87720b);
    }

    @dl.e
    public final String f() {
        return this.f87720b;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37873, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Result<BBSLinkTreeObj> result = this.f87719a;
        int iHashCode = (result == null ? 0 : result.hashCode()) * 31;
        String str = this.f87720b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37872, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostPageData(bbsLinkTreeResult=" + this.f87719a + ", from=" + this.f87720b + ')';
    }
}
