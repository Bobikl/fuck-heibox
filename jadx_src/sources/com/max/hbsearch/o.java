package com.max.hbsearch;

import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbsearch.bean.HotSearchObj;
import com.max.hbsearch.bean.SearchHotwordObj;
import com.max.hbsearch.bean.SearchHotwordsObj;
import com.max.hbutils.bean.Result;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: SearchHotWordsManager.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final o f72357a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    @xh.e
    public static SearchHotwordsObj f72358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    @xh.e
    public static String f72359c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private static List<? extends AdsBannerObj> f72360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private static List<? extends SearchHotwordObj> f72361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private static List<? extends SearchHotwordObj> f72362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private static List<? extends SearchHotwordObj> f72363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private static HotSearchObj f72364h;

    /* JADX INFO: compiled from: SearchHotWordsManager.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<SearchHotwordsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public void onNext(@dl.d Result<SearchHotwordsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.f33585h2, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            o oVar = o.f72357a;
            SearchHotwordsObj result2 = result.getResult();
            oVar.n(result2 != null ? result2.getList() : null);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.f33608i2, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SearchHotwordsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SearchHotWordsManager.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<SearchHotwordsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(@dl.d Result<SearchHotwordsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.f33631j2, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            com.max.hbcache.c.z(com.max.hbcache.c.M, com.max.hbutils.utils.k.p(result.getResult()));
            o oVar = o.f72357a;
            o.f72358b = result.getResult();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.f33654k2, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SearchHotwordsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SearchHotWordsManager.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<SearchHotwordsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public void onNext(@dl.d Result<SearchHotwordsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.f33677l2, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            o oVar = o.f72357a;
            SearchHotwordsObj result2 = result.getResult();
            oVar.k(result2 != null ? result2.getList() : null);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.f33700m2, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SearchHotwordsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SearchHotWordsManager.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<SearchHotwordsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        public void onNext(@dl.d Result<SearchHotwordsObj> result) {
            List<SearchHotwordObj> list;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.f33723n2, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            o oVar = o.f72357a;
            if (result.getResult() != null) {
                SearchHotwordsObj result2 = result.getResult();
                kotlin.jvm.internal.f0.m(result2);
                list = result2.getList();
            } else {
                list = null;
            }
            oVar.o(list);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.f33746o2, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SearchHotwordsObj>) obj);
        }
    }

    private o() {
    }

    @xh.m
    public static final void a() {
        nd.a aVarA;
        io.reactivex.z<Result<SearchHotwordsObj>> zVarD;
        io.reactivex.z<Result<SearchHotwordsObj>> zVarI5;
        io.reactivex.z<Result<SearchHotwordsObj>> zVarA4;
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.f33516e2, new Class[0], Void.TYPE).isSupported || (aVarA = nd.b.a()) == null || (zVarD = aVarA.d("mall", null)) == null || (zVarI5 = zVarD.I5(io.reactivex.schedulers.b.d())) == null || (zVarA4 = zVarI5.a4(io.reactivex.android.schedulers.a.c())) == null) {
            return;
        }
        zVarA4.g(new a());
    }

    @xh.m
    public static final void g() {
        io.reactivex.z<Result<SearchHotwordsObj>> zVarI5;
        io.reactivex.z<Result<SearchHotwordsObj>> zVarA4;
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.f33493d2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        nd.a aVarA = nd.b.a();
        io.reactivex.z<Result<SearchHotwordsObj>> zVarE = aVarA != null ? aVarA.e(null, null) : null;
        if (zVarE == null || (zVarI5 = zVarE.I5(io.reactivex.schedulers.b.d())) == null || (zVarA4 = zVarI5.a4(io.reactivex.android.schedulers.a.c())) == null) {
            return;
        }
        zVarA4.g(new b());
    }

    @xh.m
    public static final void h(@dl.d String type, @dl.e String str) {
        io.reactivex.z<Result<SearchHotwordsObj>> zVarI5;
        io.reactivex.z<Result<SearchHotwordsObj>> zVarA4;
        if (PatchProxy.proxy(new Object[]{type, str}, null, changeQuickRedirect, true, bb.c.k.f33469c2, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(type, "type");
        nd.a aVarA = nd.b.a();
        io.reactivex.z<Result<SearchHotwordsObj>> zVarE = aVarA != null ? aVarA.e(type, str) : null;
        if (zVarE == null || (zVarI5 = zVarE.I5(io.reactivex.schedulers.b.d())) == null || (zVarA4 = zVarI5.a4(io.reactivex.android.schedulers.a.c())) == null) {
            return;
        }
        zVarA4.g(new c());
    }

    @xh.m
    public static final void i(@dl.e String str) {
        io.reactivex.z<Result<SearchHotwordsObj>> zVarI5;
        io.reactivex.z<Result<SearchHotwordsObj>> zVarA4;
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.f33539f2, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        nd.a aVarA = nd.b.a();
        io.reactivex.z<Result<SearchHotwordsObj>> zVarE = aVarA != null ? aVarA.e("topic", str) : null;
        if (zVarE == null || (zVarI5 = zVarE.I5(io.reactivex.schedulers.b.d())) == null || (zVarA4 = zVarI5.a4(io.reactivex.android.schedulers.a.c())) == null) {
            return;
        }
        zVarA4.g(new d());
    }

    @xh.m
    public static final boolean j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.f33562g2, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : ad.a.a(ad.a.f1205l, false);
    }

    @dl.e
    public final List<SearchHotwordObj> b() {
        return f72363g;
    }

    @dl.e
    public final HotSearchObj c() {
        return f72364h;
    }

    @dl.e
    public final List<AdsBannerObj> d() {
        return f72360d;
    }

    @dl.e
    public final List<SearchHotwordObj> e() {
        return f72361e;
    }

    @dl.e
    public final List<SearchHotwordObj> f() {
        return f72362f;
    }

    public final void k(@dl.e List<? extends SearchHotwordObj> list) {
        f72363g = list;
    }

    public final void l(@dl.e HotSearchObj hotSearchObj) {
        f72364h = hotSearchObj;
    }

    public final void m(@dl.e List<? extends AdsBannerObj> list) {
        f72360d = list;
    }

    public final void n(@dl.e List<? extends SearchHotwordObj> list) {
        f72361e = list;
    }

    public final void o(@dl.e List<? extends SearchHotwordObj> list) {
        f72362f = list;
    }
}
