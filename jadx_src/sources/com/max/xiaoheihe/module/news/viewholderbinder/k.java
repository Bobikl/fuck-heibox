package com.max.xiaoheihe.module.news.viewholderbinder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
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
import com.max.xiaoheihe.module.bbs.component.BBSLinkImageContentViewV2;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionSmallView;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.module.news.NewsHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: NewsFeedsLinkV2VHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public class k extends h0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final a f91467l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f91468m = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private Drawable f91469k;

    /* JADX INFO: compiled from: NewsFeedsLinkV2VHB.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.news.viewholderbinder.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NewsFeedsLinkV2VHB.kt */
        public static final class ViewOnClickListenerC0849a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f91470b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BBSUserInfoObj f91471c;

            ViewOnClickListenerC0849a(Context context, BBSUserInfoObj bBSUserInfoObj) {
                this.f91470b = context;
                this.f91471c = bBSUserInfoObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42692, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.T(this.f91470b, this.f91471c.getUserid()).A();
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final void a(@dl.d Context mContext, @dl.d com.max.xiaoheihe.module.bbs.component.a vgUser, @dl.d BBSLinkObj data) {
            if (PatchProxy.proxy(new Object[]{mContext, vgUser, data}, this, changeQuickRedirect, false, 42691, new Class[]{Context.class, com.max.xiaoheihe.module.bbs.component.a.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(mContext, "mContext");
            kotlin.jvm.internal.f0.p(vgUser, "vgUser");
            kotlin.jvm.internal.f0.p(data, "data");
            if (data.getUser() == null) {
                View view = vgUser instanceof View ? (View) vgUser : null;
                if (view == null) {
                    return;
                }
                view.setVisibility(8);
                return;
            }
            View view2 = vgUser instanceof View ? (View) vgUser : null;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            BBSUserInfoObj user = data.getUser();
            ViewOnClickListenerC0849a viewOnClickListenerC0849a = new ViewOnClickListenerC0849a(mContext, user);
            vgUser.setName(user.getUsername());
            vgUser.setExtraTag(data.getLink_extra_tag(), data.getLink_extra_tag_v2());
            vgUser.getTv_name().setOnClickListener(viewOnClickListenerC0849a);
            vgUser.getAvartar().setAvatar(user.getAvartar(), user.getAvatar_decoration());
            vgUser.getAvartar().setOnClickListener(viewOnClickListenerC0849a);
            AccountDetailObj accountDetailObjV1 = com.max.xiaoheihe.utils.d.V1(user);
            vgUser.a(accountDetailObjV1.getBbs_medal(), accountDetailObjV1.getMedals(), accountDetailObjV1.getUserid());
            if (data.getUser().getLevel_info() != null) {
                vgUser.b(true);
                vgUser.setLevel(com.max.hbutils.utils.n.q(data.getUser().getLevel_info().getLevel()));
            } else {
                vgUser.b(false);
            }
            BBSUserSectionView bBSUserSectionView = vgUser instanceof BBSUserSectionView ? (BBSUserSectionView) vgUser : null;
            if (bBSUserSectionView != null) {
                bBSUserSectionView.setType(BBSUserSectionView.BBSUserSectionType.Link);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    public final void M(@dl.d BBSLinkObj linkData, @dl.d View vg_img, @dl.d View tv_content) {
        if (PatchProxy.proxy(new Object[]{linkData, vg_img, tv_content}, this, changeQuickRedirect, false, 42685, new Class[]{BBSLinkObj.class, View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(linkData, "linkData");
        kotlin.jvm.internal.f0.p(vg_img, "vg_img");
        kotlin.jvm.internal.f0.p(tv_content, "tv_content");
        View viewFindViewById = vg_img.findViewById(R.id.vg_thumb);
        ImageView imageView = (ImageView) vg_img.findViewById(R.id.iv_thumb);
        ImageView imageView2 = (ImageView) vg_img.findViewById(R.id.iv_video_play);
        BBSLinkImageContentViewV2 bBSLinkImageContentViewV2 = (BBSLinkImageContentViewV2) vg_img.findViewById(R.id.ll_img_v2);
        TextView textView = (TextView) vg_img.findViewById(R.id.tv_video_duration);
        vg_img.setVisibility(0);
        if (!kotlin.jvm.internal.f0.g("1", linkData.getHas_video())) {
            viewFindViewById.setVisibility(8);
            List<String> thumbs = !com.max.hbcommon.utils.c.w(linkData.getThumbs()) ? linkData.getThumbs() : linkData.getImgs();
            if (com.max.hbcommon.utils.c.w(thumbs) || linkData.getPositions() == null) {
                vg_img.setVisibility(8);
                return;
            }
            bBSLinkImageContentViewV2.setVisibility(0);
            BBSLinkImagePositionObj positions = linkData.getPositions();
            kotlin.jvm.internal.f0.o(positions, "linkData.positions");
            bBSLinkImageContentViewV2.setImages(positions, thumbs, com.max.hbcommon.utils.c.x(linkData.getDisable_image_click()));
            return;
        }
        Context contextM = m();
        VideoInfoObj video_info = linkData.getVideo_info();
        int width = video_info != null ? video_info.getWidth() : 0;
        VideoInfoObj video_info2 = linkData.getVideo_info();
        AccelWorldBBSKt.d(contextM, viewFindViewById, width, video_info2 != null ? video_info2.getHeight() : 0);
        int iM = ViewUtils.m(p().c(), viewFindViewById.getLayoutParams().width, viewFindViewById.getLayoutParams().height);
        viewFindViewById.setVisibility(0);
        bBSLinkImageContentViewV2.setVisibility(8);
        com.max.hbimage.b.e0(linkData.getVideo_thumb(), imageView, iM, R.drawable.common_default_placeholder_375x210);
        if (this.f91469k == null) {
            this.f91469k = com.max.hbutils.utils.q.o(m(), R.color.text_primary_1_color_alpha65, ViewUtils.h0(m(), ViewUtils.o(m(), imageView2)));
        }
        imageView2.setBackground(this.f91469k);
        tv_content.setVisibility(8);
        if (textView != null) {
            if (linkData.getVideo_info() == null || com.max.hbcommon.utils.c.u(linkData.getVideo_info().getDuration())) {
                textView.setVisibility(8);
            } else {
                textView.setText(linkData.getVideo_info().getDuration());
                textView.setVisibility(0);
            }
        }
    }

    public final void N(@dl.d BBSLinkObj data, @dl.d BBSUserSectionSmallView vg_user, @dl.d BBSLinkListBottomBar vg_bottom_bar, @dl.d BBSLinkImageContentViewV2 ll_img_v2) {
        if (PatchProxy.proxy(new Object[]{data, vg_user, vg_bottom_bar, ll_img_v2}, this, changeQuickRedirect, false, 42689, new Class[]{BBSLinkObj.class, BBSUserSectionSmallView.class, BBSLinkListBottomBar.class, BBSLinkImageContentViewV2.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(data, "data");
        kotlin.jvm.internal.f0.p(vg_user, "vg_user");
        kotlin.jvm.internal.f0.p(vg_bottom_bar, "vg_bottom_bar");
        kotlin.jvm.internal.f0.p(ll_img_v2, "ll_img_v2");
        vg_bottom_bar.setType(BBSUserSectionView.BBSUserSectionType.Link);
        vg_bottom_bar.getTv_desc().setRichStackData(data.getBottom_rich_text());
        vg_bottom_bar.getLikeComment().setVisibility(8);
        vg_user.getRl_medal_level().setVisibility(8);
        vg_user.setName(data.getAuthor().getNickname());
        vg_user.getTv_name().setOnClickListener(null);
        vg_user.getAvartar().setAvatar(data.getAuthor().getAvatar(), (AvatarDecorationObj) null);
        vg_user.getAvartar().setOnClickListener(null);
        List<String> thumbs = !com.max.hbcommon.utils.c.w(data.getThumbs()) ? data.getThumbs() : data.getImgs();
        if (com.max.hbcommon.utils.c.w(thumbs)) {
            ll_img_v2.setVisibility(8);
            return;
        }
        ll_img_v2.setVisibility(0);
        BBSLinkImagePositionObj positions = data.getPositions();
        kotlin.jvm.internal.f0.o(positions, "data.positions");
        ll_img_v2.setImages(positions, thumbs, com.max.hbcommon.utils.c.x(data.getDisable_image_click()));
    }

    public void O(@dl.d BBSLinkObj linkData, @dl.d BBSLinkListBottomBar vg_bottom_bar) {
        if (PatchProxy.proxy(new Object[]{linkData, vg_bottom_bar}, this, changeQuickRedirect, false, 42687, new Class[]{BBSLinkObj.class, BBSLinkListBottomBar.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(linkData, "linkData");
        kotlin.jvm.internal.f0.p(vg_bottom_bar, "vg_bottom_bar");
        NewsHelper.f91207a.a().e(vg_bottom_bar, linkData);
        vg_bottom_bar.getLikeComment().setVisibility(0);
        vg_bottom_bar.getTv_desc().setRichStackData(linkData.getBottom_rich_text());
        vg_bottom_bar.setType(BBSUserSectionView.BBSUserSectionType.Link);
    }

    public final void P(@dl.d BBSLinkObj linkData, @dl.d ExpressionTextView tv_content) {
        if (PatchProxy.proxy(new Object[]{linkData, tv_content}, this, changeQuickRedirect, false, 42686, new Class[]{BBSLinkObj.class, ExpressionTextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(linkData, "linkData");
        kotlin.jvm.internal.f0.p(tv_content, "tv_content");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        h0.f91435i.c(linkData, spannableStringBuilder, m());
        tv_content.setTextColor(com.max.hbcommon.utils.l.a(R.color.text_primary_1_color));
        if (!(spannableStringBuilder.length() > 0)) {
            tv_content.setVisibility(8);
        } else {
            tv_content.setVisibility(0);
            tv_content.setText(spannableStringBuilder);
        }
    }

    public void Q(@dl.d com.max.xiaoheihe.module.bbs.component.a vgUser, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{vgUser, data}, this, changeQuickRedirect, false, 42690, new Class[]{com.max.xiaoheihe.module.bbs.component.a.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(vgUser, "vgUser");
        kotlin.jvm.internal.f0.p(data, "data");
        f91467l.a(m(), vgUser, data);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42684, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        BBSUserSectionSmallView vg_user = (BBSUserSectionSmallView) viewHolder.i(R.id.vg_user);
        BBSLinkListBottomBar vg_bottom_bar = (BBSLinkListBottomBar) viewHolder.i(R.id.vg_bottom_bar);
        ExpressionTextView tv_content = (ExpressionTextView) viewHolder.i(R.id.tv_content);
        ExpressionTextView tv_title = (ExpressionTextView) viewHolder.i(R.id.tv_title);
        ImageView iv_link_more = (ImageView) viewHolder.i(R.id.iv_link_more);
        View vg_img = viewHolder.i(R.id.vg_img);
        BBSLinkObj bBSLinkObj = (BBSLinkObj) data;
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
        kotlin.jvm.internal.f0.o(vg_img, "vg_img");
        M(bBSLinkObj, vg_img, tv_content);
        E(viewHolder, data);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42688, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        viewHolder.i(R.id.tv_content).setVisibility(8);
        BBSUserSectionSmallView vg_user = (BBSUserSectionSmallView) viewHolder.i(R.id.vg_user);
        BBSLinkListBottomBar vg_bottom_bar = (BBSLinkListBottomBar) viewHolder.i(R.id.vg_bottom_bar);
        BBSLinkImageContentViewV2 ll_img_v2 = (BBSLinkImageContentViewV2) viewHolder.i(R.id.ll_img_v2);
        kotlin.jvm.internal.f0.o(vg_user, "vg_user");
        kotlin.jvm.internal.f0.o(vg_bottom_bar, "vg_bottom_bar");
        kotlin.jvm.internal.f0.o(ll_img_v2, "ll_img_v2");
        N(data, vg_user, vg_bottom_bar, ll_img_v2);
    }
}
