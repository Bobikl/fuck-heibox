package com.max.xiaoheihe.module.search.viewholderbinder.recommend;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.HeyBoxContentObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchRecBanner.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class a extends g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f91845f = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@dl.d f param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.recommend.g, cb.c
    public /* bridge */ /* synthetic */ void b(s.e eVar, HeyBoxContentObj heyBoxContentObj) {
        if (PatchProxy.proxy(new Object[]{eVar, heyBoxContentObj}, this, changeQuickRedirect, false, 43429, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, heyBoxContentObj);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.recommend.g
    public void f(@dl.d s.e viewHolder, @dl.d HeyBoxContentObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43428, new Class[]{s.e.class, HeyBoxContentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        l((BannerViewPager) viewHolder.i(R.id.banner));
        Object data2 = data.getData();
        f0.n(data2, "null cannot be cast to non-null type com.max.hbcommon.bean.AdsBannerObj");
        com.max.hbcommon.utils.b.f(h(), kotlin.collections.s.k((AdsBannerObj) data2));
    }
}
