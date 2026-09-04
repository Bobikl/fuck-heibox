package com.max.xiaoheihe.module.news.viewholderbinder;

import android.view.View;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.component.BBSNewsItemView;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionSmallView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: NewsWithTopUserVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nNewsWithTopUserVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewsWithTopUserVHB.kt\ncom/max/xiaoheihe/module/news/viewholderbinder/NewsWithTopUserVHB\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,40:1\n262#2,2:41\n262#2,2:43\n*S KotlinDebug\n*F\n+ 1 NewsWithTopUserVHB.kt\ncom/max/xiaoheihe/module/news/viewholderbinder/NewsWithTopUserVHB\n*L\n19#1:41,2\n20#1:43,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class l0 extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91474l = 0;

    /* JADX INFO: compiled from: NewsWithTopUserVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f91475b;

        a(com.max.hbcommon.base.adapter.s.e eVar) {
            this.f91475b = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42807, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f91475b.itemView.performClick();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.a0, com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42805, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        data.setShowDivider(false);
        super.i(viewHolder, data);
        BBSNewsItemView bBSNewsItemView = (BBSNewsItemView) viewHolder.i(R.id.news_item);
        if (bBSNewsItemView != null) {
            bBSNewsItemView.getDivider().setVisibility(8);
            bBSNewsItemView.getIv_not_interested().setVisibility(8);
            bBSNewsItemView.setOnClickListener(new a(viewHolder));
        }
        BBSUserSectionSmallView bBSUserSectionSmallView = (BBSUserSectionSmallView) viewHolder.i(R.id.vg_user);
        if (bBSUserSectionSmallView != null) {
            TextView tv_name = bBSUserSectionSmallView.getTv_name();
            tv_name.setTextColor(com.max.xiaoheihe.accelworld.l.h(m(), R.color.text_primary_1_color));
            tv_name.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            BBSLinkObj bBSLinkObj = data instanceof BBSLinkObj ? (BBSLinkObj) data : null;
            if (bBSLinkObj != null) {
                k.f91467l.a(m(), bBSUserSectionSmallView, bBSLinkObj);
            }
        }
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void j(@dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 42806, new Class[]{BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
