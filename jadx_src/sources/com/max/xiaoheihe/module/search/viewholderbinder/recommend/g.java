package com.max.xiaoheihe.module.search.viewholderbinder.recommend;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.xiaoheihe.bean.HeyBoxContentObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchRecommendViewHolderBinder.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public abstract class g extends cb.c<HeyBoxContentObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f91861e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private f f91862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Context f91863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private u<?> f91864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private BannerViewPager<AdsBannerObj> f91865d;

    public g(@dl.d f param) {
        f0.p(param, "param");
        this.f91862a = param;
        this.f91863b = param.h();
        this.f91864c = this.f91862a.f();
        this.f91865d = this.f91862a.g();
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(s.e eVar, HeyBoxContentObj heyBoxContentObj) {
        if (PatchProxy.proxy(new Object[]{eVar, heyBoxContentObj}, this, changeQuickRedirect, false, 43455, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, heyBoxContentObj);
    }

    public void f(@dl.d s.e viewHolder, @dl.d HeyBoxContentObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43454, new Class[]{s.e.class, HeyBoxContentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
    }

    @dl.d
    public final u<?> g() {
        return this.f91864c;
    }

    @dl.e
    public final BannerViewPager<AdsBannerObj> h() {
        return this.f91865d;
    }

    @dl.d
    public final Context i() {
        return this.f91863b;
    }

    @dl.d
    public final f j() {
        return this.f91862a;
    }

    public final void k(@dl.d u<?> uVar) {
        if (PatchProxy.proxy(new Object[]{uVar}, this, changeQuickRedirect, false, 43453, new Class[]{u.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uVar, "<set-?>");
        this.f91864c = uVar;
    }

    public final void l(@dl.e BannerViewPager<AdsBannerObj> bannerViewPager) {
        this.f91865d = bannerViewPager;
    }

    public final void m(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 43452, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f91863b = context;
    }

    public final void n(@dl.d f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, this, changeQuickRedirect, false, 43451, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fVar, "<set-?>");
        this.f91862a = fVar;
    }
}
