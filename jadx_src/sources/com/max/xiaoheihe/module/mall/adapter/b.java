package com.max.xiaoheihe.module.mall.adapter;

import android.content.Context;
import android.view.ViewGroup;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallProductAdapterV2.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f89949a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public final void a(@dl.d BannerViewPager<AdsBannerObj> bannerViewPager, @dl.e MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{bannerViewPager, mallProductObj}, this, changeQuickRedirect, false, 41123, new Class[]{BannerViewPager.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bannerViewPager, "bannerViewPager");
        int iL = (int) ((ViewUtils.L(bannerViewPager.getContext()) - ViewUtils.f(bannerViewPager.getContext(), 31.0f)) / 2.0f);
        Context context = bannerViewPager.getContext();
        Context context2 = bannerViewPager.getContext();
        f0.o(context2, "context");
        int iN = ViewUtils.n(context, iL, com.max.accelworld.c.c(72, context2), ViewUtils.ViewType.IMAGE);
        if (mallProductObj != null) {
            List<AdsBannerObj> banners = mallProductObj.getBanners();
            Context context3 = bannerViewPager.getContext();
            f0.o(context3, "context");
            com.max.hbcommon.utils.b.h(bannerViewPager, banners, iL, com.max.accelworld.c.k(iN, context3), 0.0f, false);
        }
        ViewGroup.LayoutParams layoutParams = bannerViewPager.getLayoutParams();
        Context context4 = bannerViewPager.getContext();
        f0.o(context4, "context");
        int iA = ((int) ((iL * 124.0f) / 171.0f)) + ((int) com.max.accelworld.c.a(114.5f, context4));
        if (layoutParams != null) {
            layoutParams.height = iA;
        }
        bannerViewPager.setLayoutParams(layoutParams);
    }
}
