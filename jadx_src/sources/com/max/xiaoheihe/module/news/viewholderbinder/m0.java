package com.max.xiaoheihe.module.news.viewholderbinder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.max.hbstory.bean.KeyDescObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsContentTopicEntryObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: TopicEntryListVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class m0 extends h0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91477k = 0;

    /* JADX INFO: compiled from: TopicEntryListVHB.kt */
    public static final class a extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f91478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeedsContentBaseObj f91479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ RecyclerView f91480d;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.news.viewholderbinder.m0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TopicEntryListVHB.kt */
        public static final class ViewOnClickListenerC0850a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KeyDescObj f91481b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m0 f91482c;

            ViewOnClickListenerC0850a(KeyDescObj keyDescObj, m0 m0Var) {
                this.f91481b = keyDescObj;
                this.f91482c = m0Var;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42812, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f91481b.getProtocol())) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.j0(this.f91482c.p().c(), this.f91481b.getProtocol());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<KeyDescObj> list, m0 m0Var, FeedsContentBaseObj feedsContentBaseObj, RecyclerView recyclerView, Context context) {
            super(context, list, R.layout.item_topic_entry_in_list);
            this.f91478b = m0Var;
            this.f91479c = feedsContentBaseObj;
            this.f91480d = recyclerView;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e KeyDescObj keyDescObj) {
            Number numberValueOf;
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 42810, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            m0 m0Var = this.f91478b;
            FeedsContentBaseObj feedsContentBaseObj = this.f91479c;
            RecyclerView recyclerView = this.f91480d;
            if (keyDescObj != null) {
                View viewI = eVar.i(R.id.vg_content);
                ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
                TextView textView = (TextView) eVar.i(R.id.tv_title);
                com.max.xiaoheihe.accelworld.l.q(viewI, R.color.background_layer_1_color, 5.0f);
                viewI.setOnClickListener(new ViewOnClickListenerC0850a(keyDescObj, m0Var));
                com.max.hbimage.b.L(keyDescObj.getImg(), imageView, R.drawable.default_game_avatar_351x351);
                textView.setText(keyDescObj.getTitle());
                ViewGroup.LayoutParams layoutParams = viewI.getLayoutParams();
                FeedsContentTopicEntryObj feedsContentTopicEntryObj = (FeedsContentTopicEntryObj) feedsContentBaseObj;
                List<KeyDescObj> topic_list = feedsContentTopicEntryObj.getTopic_list();
                if ((topic_list != null ? topic_list.size() : 0) > 2) {
                    numberValueOf = -2;
                } else {
                    float fL = ViewUtils.L(m0Var.p().c());
                    Context context = viewI.getContext();
                    kotlin.jvm.internal.f0.o(context, "context");
                    numberValueOf = Float.valueOf((fL - com.max.accelworld.c.a(31.0f, context)) / 2);
                }
                layoutParams.width = numberValueOf.intValue();
                kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int absoluteAdapterPosition = eVar.getAbsoluteAdapterPosition();
                List<KeyDescObj> topic_list2 = feedsContentTopicEntryObj.getTopic_list();
                marginLayoutParams.rightMargin = absoluteAdapterPosition == (topic_list2 != null ? topic_list2.size() : 0) - 1 ? 0 : com.max.xiaoheihe.accelworld.l.c(6.0f, m0Var.p().c());
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                kotlin.jvm.internal.f0.n(layoutManager, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager");
                List<KeyDescObj> topic_list3 = feedsContentTopicEntryObj.getTopic_list();
                marginLayoutParams.topMargin = (topic_list3 != null ? topic_list3.size() : 0) > 2 ? com.max.xiaoheihe.accelworld.l.c(6.0f, m0Var.p().c()) : 0;
                viewI.setLayoutParams(layoutParams);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 42811, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        List<KeyDescObj> topic_list;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42808, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        if ((data instanceof FeedsContentTopicEntryObj ? (FeedsContentTopicEntryObj) data : null) != null && (topic_list = ((FeedsContentTopicEntryObj) data).getTopic_list()) != null) {
            RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv);
            recyclerView.setLayoutManager(new FlexboxLayoutManager(p().c()));
            recyclerView.setAdapter(new a(topic_list, this, data, recyclerView, m()));
        }
        data.setShowDivider(false);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42809, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
