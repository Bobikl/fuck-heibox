package com.max.xiaoheihe.module.search.viewholderbinder;

import android.content.Context;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.video.AbsVideoView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.module.game.a2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchViewHolderBinder.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public abstract class a0 extends cb.c<GeneralSearchInfo> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91757k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private z f91758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Context f91759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private com.max.hbcommon.base.adapter.u<?> f91760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.news.adapter.a.b f91761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private a2 f91762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f91763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private AbsVideoView f91764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private com.max.hbsearch.p f91765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private BannerViewPager<AdsBannerObj> f91766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f91767j;

    public a0(@dl.d z param) {
        f0.p(param, "param");
        this.f91758a = param;
        this.f91759b = param.q();
        this.f91760c = this.f91758a.n();
        this.f91761d = this.f91758a.v();
        this.f91762e = this.f91758a.o();
        this.f91763f = this.f91758a.x();
        this.f91764g = this.f91758a.s();
        this.f91765h = this.f91758a.w();
        this.f91766i = this.f91758a.p();
        this.f91767j = this.f91758a.r();
    }

    public final void A(boolean z10) {
        this.f91763f = z10;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43427, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43425, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        viewHolder.itemView.setTag(R.id.search_report_data, data);
    }

    public final void g(@dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 43426, new Class[]{GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        if (com.max.hbcommon.utils.c.u(data.getReport_id())) {
            return;
        }
        com.max.hbcommon.utils.k.f(data.getReport_id(), UiKitSpanObj.TYPE_CLICK, data.getReport_idx(), data.getSuggested_from());
    }

    @dl.d
    public final com.max.hbcommon.base.adapter.u<?> h() {
        return this.f91760c;
    }

    @dl.e
    public final a2 i() {
        return this.f91762e;
    }

    @dl.e
    public final BannerViewPager<AdsBannerObj> j() {
        return this.f91766i;
    }

    @dl.e
    public final String k() {
        return this.f91767j;
    }

    @dl.e
    public final AbsVideoView l() {
        return this.f91764g;
    }

    @dl.d
    public final Context m() {
        return this.f91759b;
    }

    @dl.e
    public final com.max.xiaoheihe.module.news.adapter.a.b n() {
        return this.f91761d;
    }

    @dl.d
    public final z o() {
        return this.f91758a;
    }

    @dl.e
    public final com.max.hbsearch.p p() {
        return this.f91765h;
    }

    public final boolean q() {
        return this.f91763f;
    }

    public final void r(@dl.d com.max.hbcommon.base.adapter.u<?> uVar) {
        if (PatchProxy.proxy(new Object[]{uVar}, this, changeQuickRedirect, false, 43424, new Class[]{com.max.hbcommon.base.adapter.u.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uVar, "<set-?>");
        this.f91760c = uVar;
    }

    public final void s(@dl.e a2 a2Var) {
        this.f91762e = a2Var;
    }

    public final void t(@dl.e BannerViewPager<AdsBannerObj> bannerViewPager) {
        this.f91766i = bannerViewPager;
    }

    public final void u(@dl.e String str) {
        this.f91767j = str;
    }

    public final void v(@dl.e AbsVideoView absVideoView) {
        this.f91764g = absVideoView;
    }

    public final void w(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 43423, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f91759b = context;
    }

    public final void x(@dl.e com.max.xiaoheihe.module.news.adapter.a.b bVar) {
        this.f91761d = bVar;
    }

    public final void y(@dl.d z zVar) {
        if (PatchProxy.proxy(new Object[]{zVar}, this, changeQuickRedirect, false, 43422, new Class[]{z.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(zVar, "<set-?>");
        this.f91758a = zVar;
    }

    public final void z(@dl.e com.max.hbsearch.p pVar) {
        this.f91765h = pVar;
    }
}
