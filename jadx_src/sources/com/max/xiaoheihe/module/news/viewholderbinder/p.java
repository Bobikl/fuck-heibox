package com.max.xiaoheihe.module.news.viewholderbinder;

import android.widget.ImageView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionSmallView;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: NewsFeedsV2VHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public class p extends k {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f91494n = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    public void R(@dl.d QMUIRadiusImageView iv_img, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{iv_img, data}, this, changeQuickRedirect, false, 42707, new Class[]{QMUIRadiusImageView.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(iv_img, "iv_img");
        kotlin.jvm.internal.f0.p(data, "data");
        int iMin = (Math.min(ViewUtils.L(m()), ViewUtils.f(m(), 430.0f)) - ViewUtils.f(m(), 30.0f)) / 3;
        int i10 = (iMin * 66) / 119;
        int i11 = iv_img.getLayoutParams().width;
        iv_img.getLayoutParams().height = i10;
        iv_img.setCornerRadius(ViewUtils.n(m(), iMin, i10, ViewUtils.ViewType.IMAGE));
        String str = null;
        if (data.getThumbs() != null && data.getThumbs().size() > 0) {
            str = data.getThumbs().get(0);
        } else if (data.getImgs() != null && data.getImgs().size() > 0) {
            str = data.getImgs().get(0);
        }
        com.max.hbimage.b.L(str, iv_img, R.drawable.common_default_placeholder_375x210);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.k, com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42706, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
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
    }
}
