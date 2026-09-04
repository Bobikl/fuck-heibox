package com.max.xiaoheihe.module.news.viewholderbinder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: NewsWideVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class k0 extends h0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91472k = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    private final void M(View view, float f10) {
        if (PatchProxy.proxy(new Object[]{view, new Float(f10)}, this, changeQuickRedirect, false, 42804, new Class[]{View.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        int iL = ViewUtils.L(m()) - ViewUtils.f(m(), 24.0f);
        int i10 = f10 > 0.0f ? (int) (iL / f10) : (iL * 200) / 375;
        if (layoutParams.width == iL && i10 == layoutParams.height) {
            return;
        }
        layoutParams.width = iL;
        layoutParams.height = i10;
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42802, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        BBSLinkObj bBSLinkObj = (BBSLinkObj) data;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) viewHolder.i(R.id.iv_long_img);
        qMUIRadiusImageView.setCornerRadius(ViewUtils.n(p().c(), ViewUtils.L(p().c()), ViewUtils.V(qMUIRadiusImageView), ViewUtils.ViewType.IMAGE));
        if (kotlin.jvm.internal.f0.g("27", bBSLinkObj.getContent_type())) {
            r(viewHolder, data);
            TextView textView = (TextView) viewHolder.i(R.id.tv_desc);
            if (com.max.hbcommon.utils.c.u(bBSLinkObj.getSource())) {
                textView.setVisibility(8);
                return;
            } else {
                textView.setVisibility(0);
                return;
            }
        }
        viewHolder.i(R.id.tv_internal_tag).setVisibility(8);
        x(viewHolder, bBSLinkObj);
        List<String> thumbs = !com.max.hbcommon.utils.c.w(bBSLinkObj.getThumbs()) ? bBSLinkObj.getThumbs() : bBSLinkObj.getImgs();
        if (kotlin.jvm.internal.f0.g("15", bBSLinkObj.getContent_type()) || com.max.hbcommon.utils.c.w(thumbs)) {
            viewHolder.i(R.id.vg_image).setVisibility(8);
        } else {
            viewHolder.i(R.id.vg_image).setVisibility(0);
            if (kotlin.jvm.internal.f0.g("16", bBSLinkObj.getContent_type())) {
                viewHolder.i(R.id.iv_long_img).setVisibility(0);
                viewHolder.i(R.id.vg_multi_img).setVisibility(8);
                View viewI = viewHolder.i(R.id.iv_long_img);
                kotlin.jvm.internal.f0.o(viewI, "viewHolder.getView<View>(R.id.iv_long_img)");
                M(viewI, com.max.hbutils.utils.n.p(bBSLinkObj.getAd_ratio()));
                String str = thumbs.get(0);
                kotlin.jvm.internal.f0.m(str);
                View viewI2 = viewHolder.i(R.id.iv_long_img);
                kotlin.jvm.internal.f0.n(viewI2, "null cannot be cast to non-null type android.widget.ImageView");
                com.max.hbimage.b.K(str, (ImageView) viewI2);
            } else {
                viewHolder.i(R.id.iv_long_img).setVisibility(8);
                viewHolder.i(R.id.vg_multi_img).setVisibility(0);
                ImageView imageView = (ImageView) viewHolder.i(R.id.iv_multi_img_0);
                ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_multi_img_1);
                ImageView imageView3 = (ImageView) viewHolder.i(R.id.iv_multi_img_2);
                String str2 = thumbs.get(0);
                kotlin.jvm.internal.f0.m(str2);
                com.max.hbimage.b.K(str2, imageView);
                if (thumbs.size() > 1) {
                    imageView2.setVisibility(0);
                    String str3 = thumbs.get(1);
                    kotlin.jvm.internal.f0.m(str3);
                    com.max.hbimage.b.K(str3, imageView2);
                    if (thumbs.size() > 2) {
                        imageView3.setVisibility(0);
                        String str4 = thumbs.get(2);
                        kotlin.jvm.internal.f0.m(str4);
                        com.max.hbimage.b.K(str4, imageView3);
                    } else {
                        imageView3.setVisibility(4);
                    }
                } else {
                    imageView2.setVisibility(4);
                    imageView3.setVisibility(4);
                }
            }
        }
        ImageView ivNotInterested = (ImageView) viewHolder.i(R.id.iv_not_interested);
        kotlin.jvm.internal.f0.o(ivNotInterested, "ivNotInterested");
        K(ivNotInterested, bBSLinkObj, q());
        TextView tv_title_wide = (TextView) viewHolder.i(R.id.tv_title);
        kotlin.jvm.internal.f0.o(tv_title_wide, "tv_title_wide");
        G(tv_title_wide, bBSLinkObj, bBSLinkObj.getTitle());
        E(viewHolder, data);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42803, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        String img = data.getImg();
        viewHolder.i(R.id.tv_internal_tag).setVisibility(8);
        viewHolder.i(R.id.ll_comment).setVisibility(8);
        viewHolder.i(R.id.iv_not_interested).setVisibility(8);
        viewHolder.i(R.id.vg_image).setVisibility(0);
        viewHolder.i(R.id.iv_long_img).setVisibility(0);
        viewHolder.i(R.id.vg_multi_img).setVisibility(8);
        View viewI = viewHolder.i(R.id.iv_long_img);
        kotlin.jvm.internal.f0.o(viewI, "viewHolder.getView<View>(R.id.iv_long_img)");
        M(viewI, com.max.hbutils.utils.n.p(data.getAd_ratio()));
        com.max.hbimage.b.K(img, (ImageView) viewHolder.i(R.id.iv_long_img));
    }
}
