package com.max.xiaoheihe.module.news.viewholderbinder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.FeedsContentRecSwitchObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: NewsRecSwitchVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class c0 extends h0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91374k = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42753, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        FeedsContentRecSwitchObj feedsContentRecSwitchObj = (FeedsContentRecSwitchObj) data;
        View viewI = viewHolder.i(R.id.iv_img);
        kotlin.jvm.internal.f0.o(viewI, "viewHolder.getView(R.id.iv_img)");
        ImageView imageView = (ImageView) viewI;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iL = (int) ((((ViewUtils.L(m()) - ViewUtils.f(m(), 24.0f)) * 100.0f) / 351.0f) + 0.5f);
        if (layoutParams.height != iL) {
            layoutParams.height = iL;
            imageView.setLayoutParams(layoutParams);
        }
        com.max.hbimage.b.L(feedsContentRecSwitchObj.getImg(), imageView, R.drawable.common_default_placeholder_375x210);
        E(viewHolder, data);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42754, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
