package com.max.xiaoheihe.module.search;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbsearch.f;
import com.max.hbsearch.g;
import com.max.hbsearch.p;
import com.max.hbutils.utils.k;
import com.max.video.AbsVideoView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.game.a2;
import com.max.xiaoheihe.module.news.viewholderbinder.g0;
import com.max.xiaoheihe.module.news.viewholderbinder.h0;
import com.max.xiaoheihe.module.news.viewholderbinder.i0;
import com.max.xiaoheihe.module.search.viewholderbinder.a0;
import com.max.xiaoheihe.module.search.viewholderbinder.y;
import com.max.xiaoheihe.module.search.viewholderbinder.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MultiTypeAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class a extends u<GeneralSearchInfo> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91603l = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Context f91604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private p f91605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private BannerViewPager<AdsBannerObj> f91606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private g f91607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private f f91608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.news.adapter.a.b f91609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f91610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private AbsVideoView f91611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private a2 f91612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private ArrayList<String> f91613k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@dl.d Context context, @dl.d ArrayList<GeneralSearchInfo> dataList, @dl.d p mSearchListener, @dl.e BannerViewPager<AdsBannerObj> bannerViewPager, @dl.e g gVar, @dl.e f fVar, @dl.e com.max.xiaoheihe.module.news.adapter.a.b bVar) {
        super(context, dataList);
        f0.p(context, "context");
        f0.p(dataList, "dataList");
        f0.p(mSearchListener, "mSearchListener");
        this.f91604b = context;
        this.f91605c = mSearchListener;
        this.f91606d = bannerViewPager;
        this.f91607e = gVar;
        this.f91608f = fVar;
        this.f91609g = bVar;
        this.f91610h = true;
        this.f91612j = new a2();
    }

    public /* synthetic */ a(Context context, ArrayList arrayList, p pVar, BannerViewPager bannerViewPager, g gVar, f fVar, com.max.xiaoheihe.module.news.adapter.a.b bVar, int i10, kotlin.jvm.internal.u uVar) {
        this(context, arrayList, pVar, bannerViewPager, (i10 & 16) != 0 ? null : gVar, fVar, (i10 & 64) != 0 ? null : bVar);
    }

    public final void A(@dl.d p pVar) {
        if (PatchProxy.proxy(new Object[]{pVar}, this, changeQuickRedirect, false, 42879, new Class[]{p.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(pVar, "<set-?>");
        this.f91605c = pVar;
    }

    public final void B(@dl.e ArrayList<String> arrayList) {
        this.f91613k = arrayList;
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, GeneralSearchInfo generalSearchInfo) {
        Object[] objArr = {new Integer(i10), generalSearchInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42885, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : o(i10, generalSearchInfo);
    }

    public final void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42882, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        a2 a2Var = this.f91612j;
        f0.m(a2Var);
        a2Var.f();
    }

    public int o(int i10, @dl.e GeneralSearchInfo generalSearchInfo) {
        Object[] objArr = {new Integer(i10), generalSearchInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42881, new Class[]{cls, GeneralSearchInfo.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return generalSearchInfo != null ? SearchHelper.f91573a.a().g(generalSearchInfo) : R.layout.empty_layout;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 42884, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        u(eVar, (GeneralSearchInfo) obj);
    }

    @dl.e
    public final BannerViewPager<AdsBannerObj> p() {
        return this.f91606d;
    }

    @dl.e
    public final g q() {
        return this.f91607e;
    }

    @dl.e
    public final com.max.xiaoheihe.module.news.adapter.a.b r() {
        return this.f91609g;
    }

    @dl.e
    public final f s() {
        return this.f91608f;
    }

    @dl.d
    public final p t() {
        return this.f91605c;
    }

    public void u(@dl.d s.e viewHolder, @dl.e GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{viewHolder, generalSearchInfo}, this, changeQuickRedirect, false, 42880, new Class[]{s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        if (generalSearchInfo != null) {
            if (!f0.g(generalSearchInfo.getType(), "link") && !f0.g(generalSearchInfo.getType(), SearchHelper.F)) {
                a0 a0VarA = y.f91901a.a(new z(this.f91604b, this, null, this.f91612j, this.f91610h, this.f91611i, this.f91605c, this.f91606d, null, this.f91607e, this.f91608f), generalSearchInfo.getType());
                if (a0VarA != null) {
                    a0VarA.f(viewHolder, generalSearchInfo);
                }
                return;
            }
            h0 h0VarA = i0.f91463a.a(new g0(this.f91604b, this, this.f91609g, this.f91612j, true, this.f91611i, Boolean.FALSE), viewHolder.d());
            if (h0VarA != null) {
                FeedsContentBaseObj basedata = (FeedsContentBaseObj) k.a(generalSearchInfo.getInfo(), FeedsContentBaseObj.class);
                basedata.setReport_id(generalSearchInfo.getReport_id());
                basedata.setCustom_index(generalSearchInfo.getReport_idx());
                basedata.setCustom_suggested_from(generalSearchInfo.getSuggested_from());
                f0.o(basedata, "basedata");
                h0VarA.g(viewHolder, basedata);
                viewHolder.itemView.setBackgroundResource(R.drawable.list_item_bg);
            }
        }
    }

    public final void v(@dl.d RecyclerView rv) {
        if (PatchProxy.proxy(new Object[]{rv}, this, changeQuickRedirect, false, 42883, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rv, "rv");
        ArrayList<String> arrayList = this.f91613k;
        if (arrayList != null) {
            SearchHelper.f91573a.a().i(rv, arrayList, "general");
        }
    }

    public final void w(@dl.e BannerViewPager<AdsBannerObj> bannerViewPager) {
        this.f91606d = bannerViewPager;
    }

    public final void x(@dl.e g gVar) {
        this.f91607e = gVar;
    }

    public final void y(@dl.e com.max.xiaoheihe.module.news.adapter.a.b bVar) {
        this.f91609g = bVar;
    }

    public final void z(@dl.e f fVar) {
        this.f91608f = fVar;
    }
}
