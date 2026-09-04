package com.max.xiaoheihe.module.search.viewholderbinder;

import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.news.viewholderbinder.g0;
import com.max.xiaoheihe.module.news.viewholderbinder.h0;
import com.max.xiaoheihe.module.news.viewholderbinder.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchFeedsVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class h extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91791l = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43324, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43323, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        FeedsContentBaseObj feedsData = (FeedsContentBaseObj) com.max.hbutils.utils.k.a(data.getInfo(), FeedsContentBaseObj.class);
        feedsData.setReport_id(data.getReport_id());
        feedsData.setCustom_index(data.getReport_idx());
        feedsData.setCustom_suggested_from(data.getSuggested_from());
        feedsData.setShowDivider(data.getShowDivider());
        h0 h0VarA = i0.f91463a.a(new g0(m(), h(), n(), i(), q(), l(), null, 64, null), viewHolder.d());
        if (h0VarA != null) {
            f0.o(feedsData, "feedsData");
            h0VarA.g(viewHolder, feedsData);
        }
    }
}
