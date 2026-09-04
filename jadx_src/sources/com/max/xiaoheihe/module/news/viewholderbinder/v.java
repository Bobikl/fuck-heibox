package com.max.xiaoheihe.module.news.viewholderbinder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: NewsLargeVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class v extends h0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91513k = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42732, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        BBSLinkObj bBSLinkObj = (BBSLinkObj) data;
        viewHolder.i(R.id.rl_bg).getLayoutParams().height = (int) (((double) (ViewUtils.L(m()) - ViewUtils.f(m(), 24.0f))) / 1.8d);
        ViewGroup.LayoutParams layoutParams = viewHolder.i(R.id.cv_root).getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        ((RecyclerView.LayoutParams) layoutParams).setMargins(0, 0, 0, 0);
        viewHolder.p(R.id.tv_title, bBSLinkObj.getTitle());
        String strT = com.max.xiaoheihe.module.bbs.utils.b.t(m(), bBSLinkObj);
        if (com.max.hbcommon.utils.c.u(strT)) {
            viewHolder.i(R.id.tv_visits).setVisibility(8);
        } else {
            viewHolder.p(R.id.tv_visits, strT);
            viewHolder.i(R.id.tv_visits).setVisibility(0);
        }
        String str = null;
        if (bBSLinkObj.getImgs() != null && bBSLinkObj.getImgs().size() > 0) {
            str = bBSLinkObj.getImgs().get(0);
        }
        kotlin.jvm.internal.f0.m(str);
        View viewI = viewHolder.i(R.id.iv_img);
        kotlin.jvm.internal.f0.n(viewI, "null cannot be cast to non-null type android.widget.ImageView");
        com.max.hbimage.b.K(str, (ImageView) viewI);
        E(viewHolder, data);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42733, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
