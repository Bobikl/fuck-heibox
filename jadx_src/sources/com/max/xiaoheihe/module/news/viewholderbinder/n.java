package com.max.xiaoheihe.module.news.viewholderbinder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.basebbs.bean.video.VideoInfoObj;
import com.max.basebbs.utils.AccelWorldBBSKt;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkImagePositionObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.component.BBSLinkImageContentView;
import com.max.xiaoheihe.module.bbs.component.BBSLinkImageContentViewV2;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.module.news.NewsHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: NewsFeedsLinkVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class n extends com.max.xiaoheihe.module.news.viewholderbinder.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91483l = 0;

    /* JADX INFO: compiled from: NewsFeedsLinkVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f91485c;

        a(BBSUserInfoObj bBSUserInfoObj) {
            this.f91485c = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42700, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.T(n.this.m(), this.f91485c.getUserid()).A();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    private final void N(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 42699, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) eVar.i(R.id.vg_user);
        if (bBSLinkObj.getUser() == null) {
            bBSUserSectionView.setVisibility(8);
            return;
        }
        bBSUserSectionView.setVisibility(0);
        BBSUserInfoObj user = bBSLinkObj.getUser();
        a aVar = new a(user);
        bBSUserSectionView.setName(user.getUsername());
        bBSUserSectionView.getTv_name().setOnClickListener(aVar);
        bBSUserSectionView.setExtraTag(bBSLinkObj.getLink_extra_tag(), bBSLinkObj.getLink_extra_tag_v2());
        bBSUserSectionView.getAvartar().setAvatar(user.getAvartar(), user.getAvatar_decoration());
        bBSUserSectionView.getAvartar().setOnClickListener(aVar);
        AccountDetailObj accountDetailObjV1 = com.max.xiaoheihe.utils.d.V1(user);
        bBSUserSectionView.a(accountDetailObjV1.getBbs_medal(), accountDetailObjV1.getMedals(), accountDetailObjV1.getUserid());
        if (bBSLinkObj.getUser().getLevel_info() == null) {
            bBSUserSectionView.getUserLevel().setVisibility(8);
        } else {
            bBSUserSectionView.getUserLevel().setVisibility(0);
            bBSUserSectionView.setLevel(com.max.hbutils.utils.n.q(bBSLinkObj.getUser().getLevel_info().getLevel()));
        }
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.a, com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        boolean z10;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42697, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        BBSUserSectionView vg_user = (BBSUserSectionView) viewHolder.i(R.id.vg_user);
        BBSLinkListBottomBar vg_bottom_bar = (BBSLinkListBottomBar) viewHolder.i(R.id.vg_bottom_bar);
        BBSUserSectionView.BBSUserSectionType bBSUserSectionType = BBSUserSectionView.BBSUserSectionType.Link;
        vg_user.setType(bBSUserSectionType);
        if (kotlin.jvm.internal.f0.g("28", data.getContent_type())) {
            kotlin.jvm.internal.f0.o(vg_user, "vg_user");
            s(vg_user, viewHolder, data);
            return;
        }
        viewHolder.i(R.id.tv_internal_tag).setVisibility(8);
        BBSLinkObj bBSLinkObj = data instanceof BBSLinkObj ? (BBSLinkObj) data : null;
        if (bBSLinkObj == null) {
            return;
        }
        N(viewHolder, bBSLinkObj);
        NewsHelper newsHelperA = NewsHelper.f91207a.a();
        kotlin.jvm.internal.f0.o(vg_bottom_bar, "vg_bottom_bar");
        newsHelperA.e(vg_bottom_bar, bBSLinkObj);
        vg_bottom_bar.getLikeComment().setVisibility(0);
        vg_bottom_bar.getTv_desc().setRichStackData(bBSLinkObj.getBottom_rich_text());
        vg_bottom_bar.setType(bBSUserSectionType);
        View viewI = viewHolder.i(R.id.vg_thumb);
        ImageView imageView = (ImageView) viewHolder.i(R.id.iv_thumb);
        BBSLinkImageContentView bBSLinkImageContentView = (BBSLinkImageContentView) viewHolder.i(R.id.ll_img);
        BBSLinkImageContentViewV2 bBSLinkImageContentViewV2 = (BBSLinkImageContentViewV2) viewHolder.i(R.id.ll_img_v2);
        LinearLayout linearLayout = (LinearLayout) viewHolder.i(R.id.vg_bottom_sub);
        if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getImg_text_margin())) {
            ViewGroup.LayoutParams layoutParams = viewI.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ViewUtils.f(m(), com.max.hbutils.utils.n.p(bBSLinkObj.getImg_text_margin()));
            ViewGroup.LayoutParams layoutParams2 = bBSLinkImageContentView.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = ViewUtils.f(m(), com.max.hbutils.utils.n.p(bBSLinkObj.getImg_text_margin()));
            ViewGroup.LayoutParams layoutParams3 = bBSLinkImageContentViewV2.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = ViewUtils.f(m(), com.max.hbutils.utils.n.p(bBSLinkObj.getImg_text_margin()));
        }
        if (kotlin.jvm.internal.f0.g("1", bBSLinkObj.getHas_video())) {
            Context contextM = m();
            VideoInfoObj video_info = bBSLinkObj.getVideo_info();
            int width = video_info != null ? video_info.getWidth() : 0;
            VideoInfoObj video_info2 = bBSLinkObj.getVideo_info();
            AccelWorldBBSKt.d(contextM, viewI, width, video_info2 != null ? video_info2.getHeight() : 0);
            int iM = ViewUtils.m(p().c(), viewI.getLayoutParams().width, viewI.getLayoutParams().height);
            viewI.setVisibility(0);
            bBSLinkImageContentView.setVisibility(8);
            bBSLinkImageContentViewV2.setVisibility(8);
            com.max.hbimage.b.e0(bBSLinkObj.getVideo_thumb(), imageView, iM, R.drawable.common_default_placeholder_375x210);
            ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_video_play);
            imageView2.setBackground(com.max.hbutils.utils.q.o(p().c(), R.color.text_primary_1_color_alpha60, ViewUtils.h0(p().c(), ViewUtils.p(p().c(), imageView2, ViewUtils.ViewType.BUTTON))));
            TextView textView = (TextView) viewHolder.i(R.id.tv_video_duration);
            if (textView != null) {
                BBSLinkObj bBSLinkObj2 = (BBSLinkObj) data;
                if (bBSLinkObj2.getVideo_info() == null || bBSLinkObj2.getVideo_info().getDuration() == null) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    textView.setText(bBSLinkObj2.getVideo_info().getDuration());
                }
            }
            z10 = true;
        } else {
            viewI.setVisibility(8);
            z10 = true;
            List<String> thumbs = !com.max.hbcommon.utils.c.w(bBSLinkObj.getThumbs()) ? bBSLinkObj.getThumbs() : bBSLinkObj.getImgs();
            if (com.max.hbcommon.utils.c.w(thumbs)) {
                bBSLinkImageContentView.setVisibility(8);
                bBSLinkImageContentViewV2.setVisibility(8);
            } else {
                BBSLinkObj bBSLinkObj3 = (BBSLinkObj) data;
                if (bBSLinkObj3.getPositions() != null) {
                    bBSLinkImageContentViewV2.setVisibility(0);
                    bBSLinkImageContentView.setVisibility(8);
                    BBSLinkImagePositionObj positions = bBSLinkObj3.getPositions();
                    kotlin.jvm.internal.f0.o(positions, "data.positions");
                    bBSLinkImageContentViewV2.setImages(positions, thumbs, com.max.hbcommon.utils.c.x(bBSLinkObj.getDisable_image_click()));
                } else {
                    bBSLinkImageContentView.setVisibility(0);
                    bBSLinkImageContentViewV2.setVisibility(8);
                    bBSLinkImageContentView.setImages(thumbs, com.max.xiaoheihe.module.bbs.utils.b.f83401f, com.max.hbcommon.utils.c.x(bBSLinkObj.getDisable_image_click()));
                }
            }
        }
        K(vg_user.getIv_more(), bBSLinkObj, q());
        View viewI2 = viewHolder.i(R.id.tv_title);
        kotlin.jvm.internal.f0.n(viewI2, "null cannot be cast to non-null type android.widget.TextView");
        G((TextView) viewI2, bBSLinkObj, bBSLinkObj.getTitle());
        ExpressionTextView expressionTextView = (ExpressionTextView) viewHolder.i(R.id.tv_content);
        if (expressionTextView != null) {
            if (com.max.hbcommon.utils.c.u(bBSLinkObj.getTitle())) {
                expressionTextView.setMaxLines(4);
            } else {
                expressionTextView.setMaxLines(3);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
            h0.f91435i.c(bBSLinkObj, spannableStringBuilder, m());
            expressionTextView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            if (spannableStringBuilder.length() > 0 ? z10 : false) {
                expressionTextView.setVisibility(0);
                expressionTextView.setText(spannableStringBuilder);
            } else {
                expressionTextView.setVisibility(8);
            }
        }
        M(linearLayout, viewHolder, bBSLinkObj);
        E(viewHolder, data);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.a, com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42698, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        viewHolder.i(R.id.tv_content).setVisibility(8);
        viewHolder.i(R.id.tv_internal_tag).setVisibility(8);
        BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) viewHolder.i(R.id.vg_user);
        BBSLinkListBottomBar bBSLinkListBottomBar = (BBSLinkListBottomBar) viewHolder.i(R.id.vg_bottom_bar);
        bBSLinkListBottomBar.setType(BBSUserSectionView.BBSUserSectionType.Link);
        bBSLinkListBottomBar.getTv_desc().setRichStackData(data.getBottom_rich_text());
        bBSLinkListBottomBar.getLikeComment().setVisibility(8);
        bBSUserSectionView.getIv_more().setVisibility(8);
        bBSUserSectionView.getIv_not_interested().setVisibility(8);
        bBSUserSectionView.getLikeComment().setVisibility(4);
        bBSUserSectionView.getRl_medal_level().setVisibility(8);
        bBSUserSectionView.setName(data.getAuthor().getNickname());
        bBSUserSectionView.setExtraTag(data.getLink_extra_tag(), data.getLink_extra_tag_v2());
        bBSUserSectionView.getTv_name().setOnClickListener(null);
        bBSUserSectionView.getAvartar().setAvatar(data.getAuthor().getAvatar(), (AvatarDecorationObj) null);
        bBSUserSectionView.getAvartar().setOnClickListener(null);
        BBSLinkImageContentView bBSLinkImageContentView = (BBSLinkImageContentView) viewHolder.i(R.id.ll_img);
        ((BBSLinkImageContentViewV2) viewHolder.i(R.id.ll_img_v2)).setVisibility(8);
        if (com.max.hbcommon.utils.c.w(data.getImgs())) {
            bBSLinkImageContentView.setVisibility(8);
        } else {
            bBSLinkImageContentView.setVisibility(0);
            bBSLinkImageContentView.setImages(data.getImgs(), com.max.xiaoheihe.module.bbs.utils.b.f83401f, com.max.hbcommon.utils.c.x(data.getDisable_image_click()));
        }
    }
}
