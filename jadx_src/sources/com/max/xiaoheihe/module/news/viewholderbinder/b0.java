package com.max.xiaoheihe.module.news.viewholderbinder;

import android.content.Intent;
import android.view.View;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsContentRecHashObj;
import com.max.xiaoheihe.module.bbs.HashtagRankListActivity;
import com.max.xiaoheihe.module.bbs.component.BBSTagRecommendView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: NewsRecHashtagVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class b0 extends h0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91371k = 0;

    /* JADX INFO: compiled from: NewsRecHashtagVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@dl.e View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42752, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b0.this.m().startActivity(new Intent(b0.this.m(), (Class<?>) HashtagRankListActivity.class));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42750, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        BBSTagRecommendView bBSTagRecommendView = (BBSTagRecommendView) viewHolder.i(R.id.tr);
        bBSTagRecommendView.getLsh().setMoreClickListener(new a());
        bBSTagRecommendView.b(((FeedsContentRecHashObj) data).getHashtags());
        E(viewHolder, data);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42751, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
