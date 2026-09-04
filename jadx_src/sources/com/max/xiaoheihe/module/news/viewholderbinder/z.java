package com.max.xiaoheihe.module.news.viewholderbinder;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsContentGameObj;
import com.max.xiaoheihe.module.game.a2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.NotImplementedError;

/* JADX INFO: compiled from: NewsMobileVideoVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class z extends h0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91521k = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    private final void M(com.max.hbcommon.base.adapter.s.e eVar, FeedsContentGameObj feedsContentGameObj) {
        if (PatchProxy.proxy(new Object[]{eVar, feedsContentGameObj}, this, changeQuickRedirect, false, 42747, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentGameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewI = eVar.i(R.id.vg_screenshots);
        AbsVideoView absVideoView = (AbsVideoView) eVar.i(R.id.video_view);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_video_scrim);
        View viewI2 = eVar.i(R.id.vg_game_desc);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
        if (!com.max.hbcommon.utils.c.w(feedsContentGameObj.getGame().getScreenshots())) {
            feedsContentGameObj.getGame().getScreenshots().get(0);
            ViewGroup.LayoutParams layoutParams = viewI.getLayoutParams();
            int iL = ViewUtils.L(m()) - ViewUtils.f(m(), 24.0f);
            int i10 = (int) (((iL * 155.0f) / 351.0f) + 0.5f);
            if (layoutParams.height != i10) {
                layoutParams.height = i10;
                viewI.setLayoutParams(layoutParams);
            }
            absVideoView.setVisibility(0);
            imageView.setBackgroundDrawable(ViewUtils.v(iL, ViewUtils.V(imageView), GradientDrawable.Orientation.BOTTOM_TOP, com.max.xiaoheihe.utils.d.e1(feedsContentGameObj.getOverlay_color()), m().getResources().getColor(R.color.transparent)));
            viewI2.setBackgroundColor(com.max.xiaoheihe.utils.d.e1(feedsContentGameObj.getOverlay_color()));
            absVideoView.setTag(feedsContentGameObj);
        }
        textView.setText(feedsContentGameObj.getGame().getName());
        textView2.setText(feedsContentGameObj.getGame().getShort_desc());
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42745, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        FeedsContentGameObj feedsContentGameObj = (FeedsContentGameObj) data;
        M(viewHolder, feedsContentGameObj);
        a2 a2VarL = l();
        if (a2VarL != null) {
            a2VarL.d(viewHolder, feedsContentGameObj.getGame(), false);
        }
        E(viewHolder, data);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42746, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
