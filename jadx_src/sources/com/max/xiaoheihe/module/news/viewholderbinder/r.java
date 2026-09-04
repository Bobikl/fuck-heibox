package com.max.xiaoheihe.module.news.viewholderbinder;

import android.widget.ImageView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionSmallView;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: NewsFeedsV4VHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public class r extends q {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f91496p = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.q, com.max.xiaoheihe.module.news.viewholderbinder.p, com.max.xiaoheihe.module.news.viewholderbinder.k, com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42711, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        BBSLinkObj bBSLinkObj = (BBSLinkObj) data;
        BBSUserSectionSmallView vg_user = (BBSUserSectionSmallView) viewHolder.i(R.id.vg_user);
        BBSLinkListBottomBar vg_bottom_bar = (BBSLinkListBottomBar) viewHolder.i(R.id.vg_bottom_bar);
        ExpressionTextView tv_content = (ExpressionTextView) viewHolder.i(R.id.tv_content);
        ExpressionTextView tv_title = (ExpressionTextView) viewHolder.i(R.id.tv_title);
        QMUIRadiusImageView iv_img = (QMUIRadiusImageView) viewHolder.i(R.id.iv_img);
        ImageView iv_link_more = (ImageView) viewHolder.i(R.id.iv_link_more);
        RichStackModelView richStackModelView = (RichStackModelView) viewHolder.i(R.id.rich_text_top);
        kotlin.jvm.internal.f0.o(vg_user, "vg_user");
        Q(vg_user, bBSLinkObj);
        kotlin.jvm.internal.f0.o(iv_link_more, "iv_link_more");
        K(iv_link_more, bBSLinkObj, q());
        kotlin.jvm.internal.f0.o(tv_title, "tv_title");
        G(tv_title, bBSLinkObj, bBSLinkObj.getTitle());
        kotlin.jvm.internal.f0.o(tv_content, "tv_content");
        P(bBSLinkObj, tv_content);
        kotlin.jvm.internal.f0.o(vg_bottom_bar, "vg_bottom_bar");
        O(bBSLinkObj, vg_bottom_bar);
        kotlin.jvm.internal.f0.o(iv_img, "iv_img");
        R(iv_img, bBSLinkObj);
        E(viewHolder, data);
        richStackModelView.setRichStackData(bBSLinkObj.getTop_left_rich_text());
    }
}
