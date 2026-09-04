package com.max.xiaoheihe.module.news.viewholderbinder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbcommon.component.MoreButton;
import com.max.hbstory.bean.KeyDescObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsContentTopicEntryObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: TopicEntryVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class n0 extends h0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91486k = 0;

    /* JADX INFO: compiled from: TopicEntryVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f91487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0 f91488c;

        a(KeyDescObj keyDescObj, n0 n0Var) {
            this.f91487b = keyDescObj;
            this.f91488c = n0Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42815, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f91487b.getProtocol())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(this.f91488c.p().c(), this.f91487b.getProtocol());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        List<KeyDescObj> topic_list;
        KeyDescObj keyDescObj;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42813, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        if ((data instanceof FeedsContentTopicEntryObj ? (FeedsContentTopicEntryObj) data : null) != null && (topic_list = ((FeedsContentTopicEntryObj) data).getTopic_list()) != null && (keyDescObj = (KeyDescObj) CollectionsKt___CollectionsKt.R2(topic_list, 0)) != null) {
            View viewI = viewHolder.i(R.id.vg_content);
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_icon);
            TextView textView = (TextView) viewHolder.i(R.id.tv_title);
            MoreButton moreButton = (MoreButton) viewHolder.i(R.id.f76247mb);
            com.max.xiaoheihe.accelworld.l.q(viewI, R.color.background_layer_1_color, 5.0f);
            viewI.setOnClickListener(new a(keyDescObj, this));
            com.max.hbimage.b.L(keyDescObj.getImg(), imageView, R.drawable.default_game_avatar_351x351);
            textView.setText(keyDescObj.getTitle());
            moreButton.setText(keyDescObj.getText());
            moreButton.getTv_more().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        }
        data.setShowDivider(false);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42814, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
