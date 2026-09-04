package com.max.xiaoheihe.module.news.viewholderbinder;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.game.GameScreenshotObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsContentGameObj;
import com.max.xiaoheihe.module.game.a2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: NewsMobileImgVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class y extends h0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91520k = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    private final void M(com.max.hbcommon.base.adapter.s.e eVar, FeedsContentGameObj feedsContentGameObj) {
        if (PatchProxy.proxy(new Object[]{eVar, feedsContentGameObj}, this, changeQuickRedirect, false, 42744, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentGameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_screenshot);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
        com.max.hbimage.b.d0(feedsContentGameObj.getGame().getAppicon(), imageView, ViewUtils.f(m(), 4.0f));
        if (!com.max.hbcommon.utils.c.w(feedsContentGameObj.getGame().getScreenshots())) {
            GameScreenshotObj gameScreenshotObj = feedsContentGameObj.getGame().getScreenshots().get(0);
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            int iL = (int) ((((ViewUtils.L(m()) - ViewUtils.f(m(), 24.0f)) * 177.0f) / 351.0f) + 0.5f);
            if (layoutParams.height != iL) {
                layoutParams.height = iL;
                imageView2.setLayoutParams(layoutParams);
            }
            com.max.hbimage.b.K(gameScreenshotObj.getThumbnail(), imageView2);
        }
        textView.setText(feedsContentGameObj.getGame().getName());
        textView2.setText(feedsContentGameObj.getGame().getShort_desc());
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42742, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        if (kotlin.jvm.internal.f0.g("29", data.getContent_type())) {
            viewHolder.i(R.id.tv_title).setVisibility(0);
            viewHolder.i(R.id.tv_download).setVisibility(8);
            r(viewHolder, data);
            return;
        }
        viewHolder.i(R.id.tv_title).setVisibility(8);
        viewHolder.i(R.id.tv_title).setVisibility(8);
        viewHolder.i(R.id.tv_internal_tag).setVisibility(8);
        FeedsContentGameObj feedsContentGameObj = (FeedsContentGameObj) data;
        M(viewHolder, feedsContentGameObj);
        a2 a2VarL = l();
        if (a2VarL != null) {
            a2VarL.d(viewHolder, feedsContentGameObj.getGame(), true);
        }
        E(viewHolder, data);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42743, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        String img = data.getImg();
        viewHolder.i(R.id.tv_internal_tag).setVisibility(8);
        if (data.getAuthor() != null) {
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_icon);
            ((TextView) viewHolder.i(R.id.tv_name)).setText(data.getAuthor().getNickname());
            com.max.hbimage.b.K(data.getAuthor().getAvatar(), imageView);
            com.max.hbimage.b.K(img, (ImageView) viewHolder.i(R.id.iv_screenshot));
        }
    }
}
