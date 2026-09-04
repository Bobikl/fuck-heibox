package com.max.xiaoheihe.module.news.viewholderbinder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.gson.JsonObject;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionSmallView;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.b2;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: NewsFeedsConfigVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nNewsFeedsConfigVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewsFeedsConfigVHB.kt\ncom/max/xiaoheihe/module/news/viewholderbinder/NewsFeedsConfigVHB\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,411:1\n262#2,2:412\n262#2,2:414\n262#2,2:416\n262#2,2:418\n*S KotlinDebug\n*F\n+ 1 NewsFeedsConfigVHB.kt\ncom/max/xiaoheihe/module/news/viewholderbinder/NewsFeedsConfigVHB\n*L\n136#1:412,2\n139#1:414,2\n334#1:416,2\n337#1:418,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class j extends k {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f91465n = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void R(LinearLayout linearLayout, BBSLinkObj bBSLinkObj, boolean z10) {
        b2 b2Var;
        if (PatchProxy.proxy(new Object[]{linearLayout, bBSLinkObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42678, new Class[]{LinearLayout.class, BBSLinkObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String bottom_view_type = bBSLinkObj.getBottom_view_type();
        if (bottom_view_type != null) {
            switch (bottom_view_type.hashCode()) {
                case 50:
                    if (bottom_view_type.equals("2")) {
                        if (z10) {
                            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_bottom_view_2, (ViewGroup) linearLayout, true);
                        }
                        BBSUserSectionSmallView vg_user = (BBSUserSectionSmallView) linearLayout.findViewById(R.id.vg_user);
                        BBSLinkListBottomBar vg_bottom_bar = (BBSLinkListBottomBar) linearLayout.findViewById(R.id.vg_bottom_bar);
                        kotlin.jvm.internal.f0.o(vg_user, "vg_user");
                        Q(vg_user, bBSLinkObj);
                        vg_user.getAvartar().setVisibility(8);
                        kotlin.jvm.internal.f0.o(vg_bottom_bar, "vg_bottom_bar");
                        O(bBSLinkObj, vg_bottom_bar);
                        vg_bottom_bar.getTv_desc().setVisibility(8);
                        return;
                    }
                    break;
                case 51:
                    if (bottom_view_type.equals("3")) {
                        if (z10) {
                            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_bottom_view_3, (ViewGroup) linearLayout, true);
                        }
                        BBSLinkListBottomBar vg_bottom_bar2 = (BBSLinkListBottomBar) linearLayout.findViewById(R.id.vg_bottom_bar);
                        kotlin.jvm.internal.f0.o(vg_bottom_bar2, "vg_bottom_bar");
                        O(bBSLinkObj, vg_bottom_bar2);
                        return;
                    }
                    break;
                case 52:
                    if (bottom_view_type.equals("4")) {
                        if (z10) {
                            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_bottom_view_3, (ViewGroup) linearLayout, true);
                        }
                        BBSLinkListBottomBar vg_bottom_bar3 = (BBSLinkListBottomBar) linearLayout.findViewById(R.id.vg_bottom_bar);
                        if (bBSLinkObj.getBottom_rich_text() == null) {
                            vg_bottom_bar3.setVisibility(8);
                            return;
                        }
                        kotlin.jvm.internal.f0.o(vg_bottom_bar3, "vg_bottom_bar");
                        O(bBSLinkObj, vg_bottom_bar3);
                        vg_bottom_bar3.getLikeComment().setVisibility(8);
                        return;
                    }
                    break;
                case 53:
                    if (bottom_view_type.equals("5")) {
                        if (z10) {
                            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_bottom_view_4, (ViewGroup) linearLayout, true);
                        }
                        HBUiKitView vg_bottom_uikit = (HBUiKitView) linearLayout.findViewById(R.id.v_bottom_uikit);
                        UiKitViewObj bottom_uikit = bBSLinkObj.getBottom_uikit();
                        if (bottom_uikit != null) {
                            kotlin.jvm.internal.f0.o(vg_bottom_uikit, "vg_bottom_uikit");
                            vg_bottom_uikit.setVisibility(0);
                            vg_bottom_uikit.setDataToCreate(bottom_uikit);
                            b2Var = b2.f124493a;
                        } else {
                            b2Var = null;
                        }
                        if (b2Var == null) {
                            kotlin.jvm.internal.f0.o(vg_bottom_uikit, "vg_bottom_uikit");
                            vg_bottom_uikit.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        if (z10) {
            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_bottom_view_1, (ViewGroup) linearLayout, true);
        }
        BBSLinkListBottomBar vg_bottom_bar4 = (BBSLinkListBottomBar) linearLayout.findViewById(R.id.vg_bottom_bar);
        ImageView iv_link_more = (ImageView) linearLayout.findViewById(R.id.iv_link_more);
        kotlin.jvm.internal.f0.o(vg_bottom_bar4, "vg_bottom_bar");
        O(bBSLinkObj, vg_bottom_bar4);
        vg_bottom_bar4.getTv_desc().setVisibility(8);
        kotlin.jvm.internal.f0.o(iv_link_more, "iv_link_more");
        I(linearLayout, iv_link_more, bBSLinkObj, q());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void S(LinearLayout linearLayout, BBSLinkObj bBSLinkObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{linearLayout, bBSLinkObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42676, new Class[]{LinearLayout.class, BBSLinkObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String content_view_type = bBSLinkObj.getContent_view_type();
        if (content_view_type != null) {
            switch (content_view_type.hashCode()) {
                case 50:
                    if (content_view_type.equals("2")) {
                        if (z10) {
                            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_content_view_2, (ViewGroup) linearLayout, true);
                        }
                        ExpressionTextView tv_content = (ExpressionTextView) linearLayout.findViewById(R.id.tv_content);
                        ExpressionTextView tv_title = (ExpressionTextView) linearLayout.findViewById(R.id.tv_title);
                        QMUIRadiusImageView iv_img = (QMUIRadiusImageView) linearLayout.findViewById(R.id.iv_img);
                        kotlin.jvm.internal.f0.o(tv_title, "tv_title");
                        kotlin.jvm.internal.f0.o(tv_content, "tv_content");
                        Z(tv_title, tv_content);
                        G(tv_title, bBSLinkObj, bBSLinkObj.getTitle());
                        P(bBSLinkObj, tv_content);
                        kotlin.jvm.internal.f0.o(iv_img, "iv_img");
                        X(iv_img, bBSLinkObj);
                        return;
                    }
                    break;
                case 51:
                    if (content_view_type.equals("3")) {
                        if (z10) {
                            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_content_view_3, (ViewGroup) linearLayout, true);
                        }
                        ExpressionTextView tv_content2 = (ExpressionTextView) linearLayout.findViewById(R.id.tv_content);
                        ExpressionTextView tv_title2 = (ExpressionTextView) linearLayout.findViewById(R.id.tv_title);
                        QMUIRadiusImageView iv_img2 = (QMUIRadiusImageView) linearLayout.findViewById(R.id.iv_img);
                        kotlin.jvm.internal.f0.o(tv_title2, "tv_title");
                        kotlin.jvm.internal.f0.o(tv_content2, "tv_content");
                        Z(tv_title2, tv_content2);
                        G(tv_title2, bBSLinkObj, bBSLinkObj.getTitle());
                        P(bBSLinkObj, tv_content2);
                        kotlin.jvm.internal.f0.o(iv_img2, "iv_img");
                        Y(iv_img2, bBSLinkObj);
                        return;
                    }
                    break;
                case 52:
                    if (content_view_type.equals("4")) {
                        if (z10) {
                            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_content_view_4, (ViewGroup) linearLayout, true);
                        }
                        ExpressionTextView tv_content3 = (ExpressionTextView) linearLayout.findViewById(R.id.tv_content);
                        ExpressionTextView tv_title3 = (ExpressionTextView) linearLayout.findViewById(R.id.tv_title);
                        QMUIRadiusImageView iv_img3 = (QMUIRadiusImageView) linearLayout.findViewById(R.id.iv_img);
                        kotlin.jvm.internal.f0.o(tv_title3, "tv_title");
                        kotlin.jvm.internal.f0.o(tv_content3, "tv_content");
                        Z(tv_title3, tv_content3);
                        G(tv_title3, bBSLinkObj, bBSLinkObj.getTitle());
                        P(bBSLinkObj, tv_content3);
                        kotlin.jvm.internal.f0.o(iv_img3, "iv_img");
                        Y(iv_img3, bBSLinkObj);
                        int iL = ViewUtils.L(m());
                        int i10 = 4;
                        int iF = (iL - ViewUtils.f(m(), 30.0f)) / 3;
                        if (iL >= ViewUtils.f(m(), 414.0f)) {
                            i10 = 5;
                            if (iL >= ViewUtils.f(m(), 430.0f)) {
                                iF = ViewUtils.f(m(), 400.0f) / 3;
                            }
                        }
                        int iF2 = (iL - ViewUtils.f(m(), 32.0f)) - iF;
                        iv_img3.getLayoutParams().width = iF;
                        iv_img3.getLayoutParams().height = (int) ((iF * 100.0f) / 113.0f);
                        tv_content3.setMaxLines(i10 - Math.min(2, com.max.xiaoheihe.utils.e0.i(tv_title3, iF2)));
                        return;
                    }
                    break;
                case 53:
                    if (content_view_type.equals("5")) {
                        if (z10) {
                            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_content_view_5, (ViewGroup) linearLayout, true);
                        }
                        ExpressionTextView tv_content4 = (ExpressionTextView) linearLayout.findViewById(R.id.tv_content);
                        com.max.hbresource.a aVar = com.max.hbresource.a.f71893a;
                        tv_content4.setTypeface(aVar.a(com.max.hbresource.a.f71894b));
                        ExpressionTextView tv_title4 = (ExpressionTextView) linearLayout.findViewById(R.id.tv_title);
                        tv_title4.setTypeface(aVar.a(com.max.hbresource.a.f71895c));
                        QMUIRadiusImageView iv_img4 = (QMUIRadiusImageView) linearLayout.findViewById(R.id.iv_img);
                        kotlin.jvm.internal.f0.o(tv_title4, "tv_title");
                        G(tv_title4, bBSLinkObj, bBSLinkObj.getTitle());
                        kotlin.jvm.internal.f0.o(tv_content4, "tv_content");
                        P(bBSLinkObj, tv_content4);
                        kotlin.jvm.internal.f0.o(iv_img4, "iv_img");
                        Y(iv_img4, bBSLinkObj);
                        return;
                    }
                    break;
                case 54:
                    if (content_view_type.equals("6")) {
                        if (z10) {
                            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_content_view_6, (ViewGroup) linearLayout, true);
                        }
                        TextView textView = (TextView) linearLayout.findViewById(R.id.tv_invalid_tip);
                        if (textView != null) {
                            textView.setText(bBSLinkObj.getDescription());
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        if (z10) {
            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_content_view_1, (ViewGroup) linearLayout, true);
        }
        ExpressionTextView tv_content5 = (ExpressionTextView) linearLayout.findViewById(R.id.tv_content);
        ViewGroup vg_img = (ViewGroup) linearLayout.findViewById(R.id.vg_img);
        ExpressionTextView tv_title5 = (ExpressionTextView) linearLayout.findViewById(R.id.tv_title);
        kotlin.jvm.internal.f0.o(tv_title5, "tv_title");
        kotlin.jvm.internal.f0.o(tv_content5, "tv_content");
        Z(tv_title5, tv_content5);
        G(tv_title5, bBSLinkObj, bBSLinkObj.getTitle());
        P(bBSLinkObj, tv_content5);
        kotlin.jvm.internal.f0.o(vg_img, "vg_img");
        M(bBSLinkObj, vg_img, tv_content5);
    }

    private final void T(LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 42682, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        kb.c.d(p().c()).inflate(R.layout.search_divider_4dp, (ViewGroup) linearLayout, true).setId(R.id.divider);
    }

    private final void U(LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 42681, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        linearLayout.addView(new View(p().c()), new ViewGroup.LayoutParams(-1, ViewUtils.f(p().c(), 14.0f)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void V(LinearLayout linearLayout, BBSLinkObj bBSLinkObj, boolean z10) {
        b2 b2Var;
        if (PatchProxy.proxy(new Object[]{linearLayout, bBSLinkObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42675, new Class[]{LinearLayout.class, BBSLinkObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String top_view_type = bBSLinkObj.getTop_view_type();
        if (top_view_type != null) {
            switch (top_view_type.hashCode()) {
                case 50:
                    if (top_view_type.equals("2")) {
                        if (z10) {
                            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_top_view_2, (ViewGroup) linearLayout, true);
                        }
                        RichStackModelView richStackModelView = (RichStackModelView) linearLayout.findViewById(R.id.rich_text_top);
                        ImageView iv_link_more = (ImageView) linearLayout.findViewById(R.id.iv_link_more);
                        richStackModelView.setRichStackData(bBSLinkObj.getTop_left_rich_text());
                        kotlin.jvm.internal.f0.o(iv_link_more, "iv_link_more");
                        I(linearLayout, iv_link_more, bBSLinkObj, q());
                        return;
                    }
                    break;
                case 51:
                    if (top_view_type.equals("3")) {
                        if (z10) {
                            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_top_view_3, (ViewGroup) linearLayout, true);
                        }
                        ((RichStackModelView) linearLayout.findViewById(R.id.rich_text_top)).setRichStackData(bBSLinkObj.getTop_left_rich_text());
                        return;
                    }
                    break;
                case 52:
                    if (top_view_type.equals("4")) {
                        if (z10) {
                            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_top_view_4, (ViewGroup) linearLayout, true);
                        }
                        BBSUserSectionSmallView vg_user = (BBSUserSectionSmallView) linearLayout.findViewById(R.id.vg_user);
                        ImageView iv_link_more2 = (ImageView) linearLayout.findViewById(R.id.iv_link_more);
                        kotlin.jvm.internal.f0.o(vg_user, "vg_user");
                        Q(vg_user, bBSLinkObj);
                        kotlin.jvm.internal.f0.o(iv_link_more2, "iv_link_more");
                        I(linearLayout, iv_link_more2, bBSLinkObj, q());
                        return;
                    }
                    break;
                case 53:
                    if (top_view_type.equals("5")) {
                        if (z10) {
                            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_top_view_5, (ViewGroup) linearLayout, true);
                        }
                        BBSUserSectionView vg_user2 = (BBSUserSectionView) linearLayout.findViewById(R.id.vg_user);
                        ImageView iv_link_more3 = (ImageView) linearLayout.findViewById(R.id.iv_link_more);
                        kotlin.jvm.internal.f0.o(vg_user2, "vg_user");
                        Q(vg_user2, bBSLinkObj);
                        kotlin.jvm.internal.f0.o(iv_link_more3, "iv_link_more");
                        I(linearLayout, iv_link_more3, bBSLinkObj, q());
                        return;
                    }
                    break;
                case 54:
                    if (top_view_type.equals("6")) {
                        if (z10) {
                            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_top_view_6, (ViewGroup) linearLayout, true);
                        }
                        HBUiKitView vg_top_uikit = (HBUiKitView) linearLayout.findViewById(R.id.v_top_uikit);
                        UiKitViewObj top_uikit = bBSLinkObj.getTop_uikit();
                        if (top_uikit != null) {
                            kotlin.jvm.internal.f0.o(vg_top_uikit, "vg_top_uikit");
                            vg_top_uikit.setVisibility(0);
                            vg_top_uikit.setDataToCreate(top_uikit);
                            b2Var = b2.f124493a;
                        } else {
                            b2Var = null;
                        }
                        if (b2Var == null) {
                            kotlin.jvm.internal.f0.o(vg_top_uikit, "vg_top_uikit");
                            vg_top_uikit.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        if (z10) {
            kb.c.d(p().c()).inflate(R.layout.layout_feeds_config_top_view_1, (ViewGroup) linearLayout, true);
        }
        BBSUserSectionSmallView vg_user3 = (BBSUserSectionSmallView) linearLayout.findViewById(R.id.vg_user);
        RichStackModelView richStackModelView2 = (RichStackModelView) linearLayout.findViewById(R.id.rich_text_top);
        kotlin.jvm.internal.f0.o(vg_user3, "vg_user");
        Q(vg_user3, bBSLinkObj);
        vg_user3.getAvartar().setVisibility(8);
        richStackModelView2.setRichStackData(bBSLinkObj.getTop_left_rich_text());
    }

    private final void W(LinearLayout linearLayout, BBSLinkObj bBSLinkObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{linearLayout, bBSLinkObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42674, new Class[]{LinearLayout.class, BBSLinkObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V(linearLayout, bBSLinkObj, z10);
        S(linearLayout, bBSLinkObj, z10);
        R(linearLayout, bBSLinkObj, z10);
        if (z10) {
            U(linearLayout);
            if (kotlin.jvm.internal.f0.g(p().f(), Boolean.TRUE)) {
                T(linearLayout);
            }
        }
    }

    private final void X(QMUIRadiusImageView qMUIRadiusImageView, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{qMUIRadiusImageView, bBSLinkObj}, this, changeQuickRedirect, false, 42679, new Class[]{QMUIRadiusImageView.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        int iMin = (Math.min(ViewUtils.L(m()), ViewUtils.f(m(), 430.0f)) - ViewUtils.f(m(), 30.0f)) / 3;
        int i10 = (iMin * 66) / 119;
        int i11 = qMUIRadiusImageView.getLayoutParams().width;
        qMUIRadiusImageView.getLayoutParams().height = i10;
        qMUIRadiusImageView.setCornerRadius(ViewUtils.n(m(), iMin, i10, ViewUtils.ViewType.IMAGE));
        String str = null;
        if (bBSLinkObj.getThumbs() != null && bBSLinkObj.getThumbs().size() > 0) {
            str = bBSLinkObj.getThumbs().get(0);
        } else if (bBSLinkObj.getImgs() != null && bBSLinkObj.getImgs().size() > 0) {
            str = bBSLinkObj.getImgs().get(0);
        }
        com.max.hbimage.b.L(str, qMUIRadiusImageView, R.drawable.common_default_placeholder_375x210);
    }

    private final void Y(QMUIRadiusImageView qMUIRadiusImageView, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{qMUIRadiusImageView, bBSLinkObj}, this, changeQuickRedirect, false, 42680, new Class[]{QMUIRadiusImageView.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        qMUIRadiusImageView.setCornerRadius(ViewUtils.p(m(), qMUIRadiusImageView, ViewUtils.ViewType.IMAGE));
        String str = null;
        if (bBSLinkObj.getThumbs() != null && bBSLinkObj.getThumbs().size() > 0) {
            str = bBSLinkObj.getThumbs().get(0);
        } else if (bBSLinkObj.getImgs() != null && bBSLinkObj.getImgs().size() > 0) {
            str = bBSLinkObj.getImgs().get(0);
        }
        com.max.hbimage.b.L(str, qMUIRadiusImageView, R.drawable.common_default_placeholder_375x210);
    }

    private final void Z(ExpressionTextView expressionTextView, ExpressionTextView expressionTextView2) {
        if (PatchProxy.proxy(new Object[]{expressionTextView, expressionTextView2}, this, changeQuickRedirect, false, 42677, new Class[]{ExpressionTextView.class, ExpressionTextView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (ViewUtils.h0(m(), ViewUtils.L(m())) < 390) {
            expressionTextView.setTextSize(1, 16.0f);
            expressionTextView.setCustomLineHeight(ViewUtils.f(m(), 25.0f));
            expressionTextView2.setTextSize(1, 14.0f);
            expressionTextView2.setCustomLineHeight(ViewUtils.f(m(), 22.0f));
            return;
        }
        expressionTextView.setTextSize(1, 17.0f);
        expressionTextView.setCustomLineHeight(ViewUtils.f(m(), 26.0f));
        expressionTextView2.setTextSize(1, 14.0f);
        expressionTextView2.setCustomLineHeight(ViewUtils.f(m(), 22.0f));
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.k, com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42673, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        if (!(data instanceof BBSLinkObj)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("vhb_class_name", j.class.getSimpleName());
            jsonObject.addProperty("data_class_name", data.getClass().getSimpleName());
            try {
                jsonObject.addProperty("data_json", com.max.hbutils.utils.k.p(data));
            } catch (Throwable th2) {
                jsonObject.addProperty("error_msg", th2.getMessage());
            }
            com.max.hbcommon.analytics.d.d("3", lb.d.f131259t5, null, jsonObject);
            return;
        }
        BBSLinkObj bBSLinkObj = (BBSLinkObj) data;
        boolean z10 = !bBSLinkObj.isSameViewType((BBSLinkObj) viewHolder.itemView.getTag(R.id.feeds_item_data));
        LinearLayout ll_container = (LinearLayout) viewHolder.i(R.id.ll_container);
        if (z10) {
            ll_container.removeAllViews();
        }
        kotlin.jvm.internal.f0.o(ll_container, "ll_container");
        W(ll_container, bBSLinkObj, z10);
        E(viewHolder, data);
        viewHolder.itemView.setTag(R.id.feeds_item_data, bBSLinkObj);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.k, com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42683, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
