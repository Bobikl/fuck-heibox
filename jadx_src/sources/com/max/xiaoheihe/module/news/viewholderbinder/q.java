package com.max.xiaoheihe.module.news.viewholderbinder;

import android.widget.ImageView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionSmallView;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.module.news.NewsHelper;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: NewsFeedsV3VHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public class q extends p {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f91495o = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.k
    public void O(@dl.d BBSLinkObj linkData, @dl.d BBSLinkListBottomBar vg_bottom_bar) {
        if (PatchProxy.proxy(new Object[]{linkData, vg_bottom_bar}, this, changeQuickRedirect, false, 42710, new Class[]{BBSLinkObj.class, BBSLinkListBottomBar.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(linkData, "linkData");
        kotlin.jvm.internal.f0.p(vg_bottom_bar, "vg_bottom_bar");
        NewsHelper.f91207a.a().e(vg_bottom_bar, linkData);
        vg_bottom_bar.getLikeComment().setVisibility(0);
        vg_bottom_bar.getTv_desc().setVisibility(8);
        vg_bottom_bar.setType(BBSUserSectionView.BBSUserSectionType.Link);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.k
    public void Q(@dl.d com.max.xiaoheihe.module.bbs.component.a vgUser, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{vgUser, data}, this, changeQuickRedirect, false, 42709, new Class[]{com.max.xiaoheihe.module.bbs.component.a.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(vgUser, "vgUser");
        kotlin.jvm.internal.f0.p(data, "data");
        super.Q(vgUser, data);
        vgUser.getAvartar().setVisibility(8);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.p, com.max.xiaoheihe.module.news.viewholderbinder.k, com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42708, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
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
