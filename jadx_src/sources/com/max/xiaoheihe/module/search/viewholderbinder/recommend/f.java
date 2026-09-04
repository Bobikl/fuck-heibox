package com.max.xiaoheihe.module.search.viewholderbinder.recommend;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.u;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchRecommendVHBParam.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class f implements cb.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f91857d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private Context f91858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private u<?> f91859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private BannerViewPager<AdsBannerObj> f91860c;

    public f(@dl.d Context context, @dl.d u<?> adapter, @dl.e BannerViewPager<AdsBannerObj> bannerViewPager) {
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        this.f91858a = context;
        this.f91859b = adapter;
        this.f91860c = bannerViewPager;
    }

    public static /* synthetic */ f e(f fVar, Context context, u uVar, BannerViewPager bannerViewPager, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, context, uVar, bannerViewPager, new Integer(i10), obj}, null, changeQuickRedirect, true, 43447, new Class[]{f.class, Context.class, u.class, BannerViewPager.class, Integer.TYPE, Object.class}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            context = fVar.f91858a;
        }
        if ((i10 & 2) != 0) {
            uVar = fVar.f91859b;
        }
        if ((i10 & 4) != 0) {
            bannerViewPager = fVar.f91860c;
        }
        return fVar.d(context, uVar, bannerViewPager);
    }

    @dl.d
    public final Context a() {
        return this.f91858a;
    }

    @dl.d
    public final u<?> b() {
        return this.f91859b;
    }

    @dl.e
    public final BannerViewPager<AdsBannerObj> c() {
        return this.f91860c;
    }

    @dl.d
    public final f d(@dl.d Context context, @dl.d u<?> adapter, @dl.e BannerViewPager<AdsBannerObj> bannerViewPager) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, adapter, bannerViewPager}, this, changeQuickRedirect, false, 43446, new Class[]{Context.class, u.class, BannerViewPager.class}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        return new f(context, adapter, bannerViewPager);
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43450, new Class[]{Object.class}, Boolean.TYPE);
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
        return f0.g(this.f91858a, fVar.f91858a) && f0.g(this.f91859b, fVar.f91859b) && f0.g(this.f91860c, fVar.f91860c);
    }

    @dl.d
    public final u<?> f() {
        return this.f91859b;
    }

    @dl.e
    public final BannerViewPager<AdsBannerObj> g() {
        return this.f91860c;
    }

    @dl.d
    public final Context h() {
        return this.f91858a;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43449, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = ((this.f91858a.hashCode() * 31) + this.f91859b.hashCode()) * 31;
        BannerViewPager<AdsBannerObj> bannerViewPager = this.f91860c;
        return iHashCode + (bannerViewPager != null ? bannerViewPager.hashCode() : 0);
    }

    public final void i(@dl.d u<?> uVar) {
        if (PatchProxy.proxy(new Object[]{uVar}, this, changeQuickRedirect, false, 43445, new Class[]{u.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uVar, "<set-?>");
        this.f91859b = uVar;
    }

    public final void j(@dl.e BannerViewPager<AdsBannerObj> bannerViewPager) {
        this.f91860c = bannerViewPager;
    }

    public final void k(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 43444, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f91858a = context;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43448, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchRecommendVHBParam(context=" + this.f91858a + ", adapter=" + this.f91859b + ", banner=" + this.f91860c + ')';
    }
}
