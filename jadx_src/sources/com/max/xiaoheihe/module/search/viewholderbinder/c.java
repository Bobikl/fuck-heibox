package com.max.xiaoheihe.module.search.viewholderbinder;

import android.view.View;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchBannerVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class c extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91772l = 0;

    /* JADX INFO: compiled from: SearchBannerVHB.kt */
    public static final class a implements com.max.hbcommon.utils.b.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GeneralSearchInfo f91774b;

        a(GeneralSearchInfo generalSearchInfo) {
            this.f91774b = generalSearchInfo;
        }

        @Override // com.max.hbcommon.utils.b.g
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43299, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c.this.g(this.f91774b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43298, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43297, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        viewHolder.itemView.setTag(null);
        AdsBannerObj adsBannerObj = (AdsBannerObj) com.max.hbutils.utils.k.a(data.getInfo(), AdsBannerObj.class);
        if (adsBannerObj != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adsBannerObj);
            View viewI = viewHolder.i(R.id.rv_banner);
            f0.n(viewI, "null cannot be cast to non-null type com.max.hbcustomview.bannerview.BannerViewPager<com.max.hbcommon.bean.AdsBannerObj>");
            com.max.hbcommon.utils.b.i((BannerViewPager) viewI, arrayList, ViewUtils.L(o().q()) - com.max.xiaoheihe.accelworld.l.c(24.0f, m()), 8.0f, 12.0f, false, -1.0f, new a(data));
        }
    }
}
