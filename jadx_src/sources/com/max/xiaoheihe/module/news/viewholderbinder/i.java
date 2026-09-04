package com.max.xiaoheihe.module.news.viewholderbinder;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsContentRecNewsObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import df.yi;
import java.util.List;

/* JADX INFO: compiled from: NewsExpressVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class i extends h0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91458k = 0;

    /* JADX INFO: compiled from: NewsExpressVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f91460c;

        a(BBSLinkObj bBSLinkObj) {
            this.f91460c = bBSLinkObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42671, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.utils.b.E(i.this.m(), this.f91460c);
        }
    }

    /* JADX INFO: compiled from: NewsExpressVHB.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeedsContentRecNewsObj f91462c;

        b(FeedsContentRecNewsObj feedsContentRecNewsObj) {
            this.f91462c = feedsContentRecNewsObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42672, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(i.this.m(), this.f91462c.getProtocol());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42669, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        FeedsContentRecNewsObj feedsContentRecNewsObj = (FeedsContentRecNewsObj) data;
        LinearLayout linearLayout = (LinearLayout) viewHolder.i(R.id.ll_express_links);
        View viewI = viewHolder.i(R.id.vg_title);
        linearLayout.removeAllViews();
        List<BBSLinkObj> links = feedsContentRecNewsObj.getLinks();
        if (links != null && !links.isEmpty()) {
            z10 = false;
        }
        if (!z10) {
            for (BBSLinkObj bBSLinkObj : feedsContentRecNewsObj.getLinks()) {
                yi yiVarD = yi.d(LayoutInflater.from(m()), linearLayout, false);
                kotlin.jvm.internal.f0.o(yiVarD, "inflate(\n               …  false\n                )");
                yiVarD.f117980c.setText(bBSLinkObj.getFormated_time());
                yiVarD.f117981d.setText(bBSLinkObj.getTitle());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = linearLayout.getChildCount() > 0 ? ViewUtils.f(m(), 16.0f) : 0;
                yiVarD.b().setOnClickListener(new a(bBSLinkObj));
                linearLayout.addView(yiVarD.b(), layoutParams);
            }
        }
        viewI.setOnClickListener(new b(feedsContentRecNewsObj));
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42670, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
