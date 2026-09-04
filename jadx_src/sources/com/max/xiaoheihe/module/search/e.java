package com.max.xiaoheihe.module.search;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.xiaoheihe.bean.HeyBoxContentObj;
import com.max.xiaoheihe.module.search.viewholderbinder.recommend.SearchRecHelper;
import com.max.xiaoheihe.module.search.viewholderbinder.recommend.f;
import com.max.xiaoheihe.module.search.viewholderbinder.recommend.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchRecommendListAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class e extends u<HeyBoxContentObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f91631e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Context f91632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private ArrayList<HeyBoxContentObj> f91633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private BannerViewPager<AdsBannerObj> f91634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@dl.d Context mContext, @dl.d ArrayList<HeyBoxContentObj> mRecommendList, @dl.e BannerViewPager<AdsBannerObj> bannerViewPager) {
        super(mContext, mRecommendList);
        f0.p(mContext, "mContext");
        f0.p(mRecommendList, "mRecommendList");
        this.f91632b = mContext;
        this.f91633c = mRecommendList;
        this.f91634d = bannerViewPager;
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, HeyBoxContentObj heyBoxContentObj) {
        Object[] objArr = {new Integer(i10), heyBoxContentObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42910, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, heyBoxContentObj);
    }

    public int n(int i10, @dl.d HeyBoxContentObj data) {
        Object[] objArr = {new Integer(i10), data};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42908, new Class[]{cls, HeyBoxContentObj.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(data, "data");
        return SearchRecHelper.f91841a.a().c(data);
    }

    @dl.e
    public final BannerViewPager<AdsBannerObj> o() {
        return this.f91634d;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 42911, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        r(eVar, (HeyBoxContentObj) obj);
    }

    @dl.d
    public final Context p() {
        return this.f91632b;
    }

    @dl.d
    public final ArrayList<HeyBoxContentObj> q() {
        return this.f91633c;
    }

    public void r(@dl.d s.e viewHolder, @dl.d HeyBoxContentObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42909, new Class[]{s.e.class, HeyBoxContentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        g gVarA = com.max.xiaoheihe.module.search.viewholderbinder.recommend.e.f91855a.a(new f(this.f91632b, this, this.f91634d), data);
        if (gVarA != null) {
            gVarA.f(viewHolder, data);
        }
    }

    public final void s(@dl.e BannerViewPager<AdsBannerObj> bannerViewPager) {
        this.f91634d = bannerViewPager;
    }

    public final void t(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 42906, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f91632b = context;
    }

    public final void u(@dl.d ArrayList<HeyBoxContentObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 42907, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arrayList, "<set-?>");
        this.f91633c = arrayList;
    }
}
