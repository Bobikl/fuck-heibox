package com.max.xiaoheihe.module.search.viewholderbinder;

import android.content.Context;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.video.AbsVideoView;
import com.max.xiaoheihe.module.game.a2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchVHBParam.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class z implements cb.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91903l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private Context f91904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private com.max.hbcommon.base.adapter.u<?> f91905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.news.adapter.a.b f91906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private a2 f91907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f91908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private AbsVideoView f91909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private com.max.hbsearch.p f91910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private BannerViewPager<AdsBannerObj> f91911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private String f91912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private com.max.hbsearch.g f91913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private com.max.hbsearch.f f91914k;

    public z(@dl.d Context context, @dl.d com.max.hbcommon.base.adapter.u<?> adapter, @dl.e com.max.xiaoheihe.module.news.adapter.a.b bVar, @dl.e a2 a2Var, boolean z10, @dl.e AbsVideoView absVideoView, @dl.e com.max.hbsearch.p pVar, @dl.e BannerViewPager<AdsBannerObj> bannerViewPager, @dl.e String str, @dl.e com.max.hbsearch.g gVar, @dl.e com.max.hbsearch.f fVar) {
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        this.f91904a = context;
        this.f91905b = adapter;
        this.f91906c = bVar;
        this.f91907d = a2Var;
        this.f91908e = z10;
        this.f91909f = absVideoView;
        this.f91910g = pVar;
        this.f91911h = bannerViewPager;
        this.f91912i = str;
        this.f91913j = gVar;
        this.f91914k = fVar;
    }

    public /* synthetic */ z(Context context, com.max.hbcommon.base.adapter.u uVar, com.max.xiaoheihe.module.news.adapter.a.b bVar, a2 a2Var, boolean z10, AbsVideoView absVideoView, com.max.hbsearch.p pVar, BannerViewPager bannerViewPager, String str, com.max.hbsearch.g gVar, com.max.hbsearch.f fVar, int i10, kotlin.jvm.internal.u uVar2) {
        this(context, uVar, bVar, a2Var, z10, absVideoView, pVar, bannerViewPager, str, (i10 & 512) != 0 ? null : gVar, fVar);
    }

    public static /* synthetic */ z m(z zVar, Context context, com.max.hbcommon.base.adapter.u uVar, com.max.xiaoheihe.module.news.adapter.a.b bVar, a2 a2Var, boolean z10, AbsVideoView absVideoView, com.max.hbsearch.p pVar, BannerViewPager bannerViewPager, String str, com.max.hbsearch.g gVar, com.max.hbsearch.f fVar, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{zVar, context, uVar, bVar, a2Var, new Byte(z10 ? (byte) 1 : (byte) 0), absVideoView, pVar, bannerViewPager, str, gVar, fVar, new Integer(i10), obj}, null, changeQuickRedirect, true, 43418, new Class[]{z.class, Context.class, com.max.hbcommon.base.adapter.u.class, com.max.xiaoheihe.module.news.adapter.a.b.class, a2.class, Boolean.TYPE, AbsVideoView.class, com.max.hbsearch.p.class, BannerViewPager.class, String.class, com.max.hbsearch.g.class, com.max.hbsearch.f.class, Integer.TYPE, Object.class}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        return zVar.l((i10 & 1) != 0 ? zVar.f91904a : context, (i10 & 2) != 0 ? zVar.f91905b : uVar, (i10 & 4) != 0 ? zVar.f91906c : bVar, (i10 & 8) != 0 ? zVar.f91907d : a2Var, (i10 & 16) != 0 ? zVar.f91908e : z10 ? 1 : 0, (i10 & 32) != 0 ? zVar.f91909f : absVideoView, (i10 & 64) != 0 ? zVar.f91910g : pVar, (i10 & 128) != 0 ? zVar.f91911h : bannerViewPager, (i10 & 256) != 0 ? zVar.f91912i : str, (i10 & 512) != 0 ? zVar.f91913j : gVar, (i10 & 1024) != 0 ? zVar.f91914k : fVar);
    }

    public final void A(@dl.e BannerViewPager<AdsBannerObj> bannerViewPager) {
        this.f91911h = bannerViewPager;
    }

    public final void B(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 43415, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f91904a = context;
    }

    public final void C(@dl.e String str) {
        this.f91912i = str;
    }

    public final void D(@dl.e AbsVideoView absVideoView) {
        this.f91909f = absVideoView;
    }

    public final void E(@dl.e com.max.hbsearch.g gVar) {
        this.f91913j = gVar;
    }

    public final void F(@dl.e com.max.hbsearch.f fVar) {
        this.f91914k = fVar;
    }

    public final void G(@dl.e com.max.xiaoheihe.module.news.adapter.a.b bVar) {
        this.f91906c = bVar;
    }

    public final void H(@dl.e com.max.hbsearch.p pVar) {
        this.f91910g = pVar;
    }

    public final void I(boolean z10) {
        this.f91908e = z10;
    }

    @dl.d
    public final Context a() {
        return this.f91904a;
    }

    @dl.e
    public final com.max.hbsearch.g b() {
        return this.f91913j;
    }

    @dl.e
    public final com.max.hbsearch.f c() {
        return this.f91914k;
    }

    @dl.d
    public final com.max.hbcommon.base.adapter.u<?> d() {
        return this.f91905b;
    }

    @dl.e
    public final com.max.xiaoheihe.module.news.adapter.a.b e() {
        return this.f91906c;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43421, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return f0.g(this.f91904a, zVar.f91904a) && f0.g(this.f91905b, zVar.f91905b) && f0.g(this.f91906c, zVar.f91906c) && f0.g(this.f91907d, zVar.f91907d) && this.f91908e == zVar.f91908e && f0.g(this.f91909f, zVar.f91909f) && f0.g(this.f91910g, zVar.f91910g) && f0.g(this.f91911h, zVar.f91911h) && f0.g(this.f91912i, zVar.f91912i) && f0.g(this.f91913j, zVar.f91913j) && f0.g(this.f91914k, zVar.f91914k);
    }

    @dl.e
    public final a2 f() {
        return this.f91907d;
    }

    public final boolean g() {
        return this.f91908e;
    }

    @dl.e
    public final AbsVideoView h() {
        return this.f91909f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v36 */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43420, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = ((this.f91904a.hashCode() * 31) + this.f91905b.hashCode()) * 31;
        com.max.xiaoheihe.module.news.adapter.a.b bVar = this.f91906c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a2 a2Var = this.f91907d;
        int iHashCode3 = (iHashCode2 + (a2Var == null ? 0 : a2Var.hashCode())) * 31;
        boolean z10 = this.f91908e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode3 + r10) * 31;
        AbsVideoView absVideoView = this.f91909f;
        int iHashCode4 = (i10 + (absVideoView == null ? 0 : absVideoView.hashCode())) * 31;
        com.max.hbsearch.p pVar = this.f91910g;
        int iHashCode5 = (iHashCode4 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        BannerViewPager<AdsBannerObj> bannerViewPager = this.f91911h;
        int iHashCode6 = (iHashCode5 + (bannerViewPager == null ? 0 : bannerViewPager.hashCode())) * 31;
        String str = this.f91912i;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        com.max.hbsearch.g gVar = this.f91913j;
        int iHashCode8 = (iHashCode7 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        com.max.hbsearch.f fVar = this.f91914k;
        return iHashCode8 + (fVar != null ? fVar.hashCode() : 0);
    }

    @dl.e
    public final com.max.hbsearch.p i() {
        return this.f91910g;
    }

    @dl.e
    public final BannerViewPager<AdsBannerObj> j() {
        return this.f91911h;
    }

    @dl.e
    public final String k() {
        return this.f91912i;
    }

    @dl.d
    public final z l(@dl.d Context context, @dl.d com.max.hbcommon.base.adapter.u<?> adapter, @dl.e com.max.xiaoheihe.module.news.adapter.a.b bVar, @dl.e a2 a2Var, boolean z10, @dl.e AbsVideoView absVideoView, @dl.e com.max.hbsearch.p pVar, @dl.e BannerViewPager<AdsBannerObj> bannerViewPager, @dl.e String str, @dl.e com.max.hbsearch.g gVar, @dl.e com.max.hbsearch.f fVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, adapter, bVar, a2Var, new Byte(z10 ? (byte) 1 : (byte) 0), absVideoView, pVar, bannerViewPager, str, gVar, fVar}, this, changeQuickRedirect, false, 43417, new Class[]{Context.class, com.max.hbcommon.base.adapter.u.class, com.max.xiaoheihe.module.news.adapter.a.b.class, a2.class, Boolean.TYPE, AbsVideoView.class, com.max.hbsearch.p.class, BannerViewPager.class, String.class, com.max.hbsearch.g.class, com.max.hbsearch.f.class}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        return new z(context, adapter, bVar, a2Var, z10, absVideoView, pVar, bannerViewPager, str, gVar, fVar);
    }

    @dl.d
    public final com.max.hbcommon.base.adapter.u<?> n() {
        return this.f91905b;
    }

    @dl.e
    public final a2 o() {
        return this.f91907d;
    }

    @dl.e
    public final BannerViewPager<AdsBannerObj> p() {
        return this.f91911h;
    }

    @dl.d
    public final Context q() {
        return this.f91904a;
    }

    @dl.e
    public final String r() {
        return this.f91912i;
    }

    @dl.e
    public final AbsVideoView s() {
        return this.f91909f;
    }

    @dl.e
    public final com.max.hbsearch.g t() {
        return this.f91913j;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43419, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchVHBParam(context=" + this.f91904a + ", adapter=" + this.f91905b + ", newsOnClickListener=" + this.f91906c + ", appDownloadController=" + this.f91907d + ", showRecommend=" + this.f91908e + ", lastVideoView=" + this.f91909f + ", searchListener=" + this.f91910g + ", banner=" + this.f91911h + ", keyPoint=" + this.f91912i + ", mFastSearchListener=" + this.f91913j + ", mISearchFilterTag=" + this.f91914k + ')';
    }

    @dl.e
    public final com.max.hbsearch.f u() {
        return this.f91914k;
    }

    @dl.e
    public final com.max.xiaoheihe.module.news.adapter.a.b v() {
        return this.f91906c;
    }

    @dl.e
    public final com.max.hbsearch.p w() {
        return this.f91910g;
    }

    public final boolean x() {
        return this.f91908e;
    }

    public final void y(@dl.d com.max.hbcommon.base.adapter.u<?> uVar) {
        if (PatchProxy.proxy(new Object[]{uVar}, this, changeQuickRedirect, false, 43416, new Class[]{com.max.hbcommon.base.adapter.u.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uVar, "<set-?>");
        this.f91905b = uVar;
    }

    public final void z(@dl.e a2 a2Var) {
        this.f91907d = a2Var;
    }
}
