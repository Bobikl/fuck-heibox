package com.max.xiaoheihe.module.news.viewholderbinder;

import android.widget.ImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.component.BBSNewsItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: NewsNormalVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public class a0 extends h0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91362k = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42748, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        if (data instanceof BBSLinkObj) {
            BBSLinkObj bBSLinkObj = (BBSLinkObj) data;
            BBSNewsItemView news_item = (BBSNewsItemView) viewHolder.i(R.id.news_item);
            if (kotlin.jvm.internal.f0.g("26", bBSLinkObj.getContent_type())) {
                r(viewHolder, data);
                return;
            }
            news_item.c(false);
            x(viewHolder, bBSLinkObj);
            if (kotlin.jvm.internal.f0.g("1", bBSLinkObj.getHas_video())) {
                viewHolder.i(R.id.iv_video_play).setVisibility(0);
            } else {
                viewHolder.i(R.id.iv_video_play).setVisibility(8);
            }
            String str = null;
            if (bBSLinkObj.getThumbs() != null && bBSLinkObj.getThumbs().size() > 0) {
                str = bBSLinkObj.getThumbs().get(0);
            } else if (bBSLinkObj.getImgs() != null && bBSLinkObj.getImgs().size() > 0) {
                str = bBSLinkObj.getImgs().get(0);
            }
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_img);
            if (str != null) {
                com.max.hbimage.b.K(str, imageView);
            }
            kotlin.jvm.internal.f0.o(news_item, "news_item");
            I(news_item, news_item.getIv_not_interested(), bBSLinkObj, q());
            G(news_item.getTv_title(), bBSLinkObj, bBSLinkObj.getTitle());
            E(viewHolder, data);
            news_item.b(bBSLinkObj.getHb_rich_texts());
            news_item.getLl_comment().setVisibility(kotlin.jvm.internal.f0.g("1", bBSLinkObj.getHide_comment()) ? 8 : 0);
        }
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42749, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        BBSNewsItemView bBSNewsItemView = (BBSNewsItemView) viewHolder.i(R.id.news_item);
        bBSNewsItemView.c(false);
        bBSNewsItemView.getIv_not_interested().setVisibility(8);
        bBSNewsItemView.getLl_comment().setVisibility(kotlin.jvm.internal.f0.g("1", data.getHide_comment()) ? 8 : 0);
    }
}
