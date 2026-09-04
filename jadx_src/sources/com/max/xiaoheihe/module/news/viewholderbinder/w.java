package com.max.xiaoheihe.module.news.viewholderbinder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsContentNewsTopicObj;
import com.max.xiaoheihe.bean.news.NewsSubjectObj;
import com.max.xiaoheihe.module.news.SubjectDetailActivity;
import com.max.xiaoheihe.module.news.SubjectListActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: NewsListHSVVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class w extends h0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91514k = 0;

    /* JADX INFO: compiled from: NewsListHSVVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42736, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            w.this.m().startActivity(SubjectListActivity.M1(w.this.m()));
        }
    }

    /* JADX INFO: compiled from: NewsListHSVVHB.kt */
    public static final class b extends com.max.hbcommon.base.adapter.s<NewsSubjectObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: NewsListHSVVHB.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f91517b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ NewsSubjectObj f91518c;

            a(w wVar, NewsSubjectObj newsSubjectObj) {
                this.f91517b = wVar;
                this.f91518c = newsSubjectObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42739, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f91517b.m().startActivity(SubjectDetailActivity.a2(this.f91517b.m(), this.f91518c));
            }
        }

        b(Context context, List<NewsSubjectObj> list) {
            super(context, list, R.layout.item_news_subject_in_feed);
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.e NewsSubjectObj newsSubjectObj) {
            if (PatchProxy.proxy(new Object[]{viewHolder, newsSubjectObj}, this, changeQuickRedirect, false, 42737, new Class[]{com.max.hbcommon.base.adapter.s.e.class, NewsSubjectObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_img);
            TextView textView = (TextView) viewHolder.i(R.id.tv_title);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_desc);
            View viewB = viewHolder.b();
            int iF = ViewUtils.f(w.this.m(), 150.0f);
            int iF2 = ViewUtils.f(w.this.m(), 90.0f);
            ViewGroup.LayoutParams layoutParams = viewB.getLayoutParams();
            if (layoutParams.width != iF) {
                layoutParams.width = iF;
                viewB.setLayoutParams(layoutParams);
            }
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2.width != iF || layoutParams2.height != iF2) {
                layoutParams2.width = iF;
                layoutParams2.height = iF2;
                imageView.setLayoutParams(layoutParams2);
            }
            com.max.hbimage.b.e0(newsSubjectObj != null ? newsSubjectObj.getOuter_img() : null, imageView, ViewUtils.f(w.this.m(), 2.0f), R.drawable.common_default_placeholder_375x210);
            textView.setText(newsSubjectObj != null ? newsSubjectObj.getOuter_title() : null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(newsSubjectObj != null ? newsSubjectObj.getNews_num() : null);
            sb2.append(" 篇新闻");
            textView2.setText(sb2.toString());
            viewB.setOnClickListener(new a(w.this, newsSubjectObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, NewsSubjectObj newsSubjectObj) {
            if (PatchProxy.proxy(new Object[]{eVar, newsSubjectObj}, this, changeQuickRedirect, false, 42738, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, newsSubjectObj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42734, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        FeedsContentNewsTopicObj feedsContentNewsTopicObj = (FeedsContentNewsTopicObj) data;
        ViewGroup.LayoutParams layoutParams = viewHolder.i(R.id.cv_item).getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        ((RecyclerView.LayoutParams) layoutParams).setMargins(0, 0, 0, ViewUtils.f(m(), 10.0f));
        View viewI = viewHolder.i(R.id.cv_item);
        kotlin.jvm.internal.f0.n(viewI, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        ((CardView) viewI).setRadius(0.0f);
        viewHolder.p(R.id.tv_title, "新闻专题");
        ViewGroup.LayoutParams layoutParams2 = viewHolder.i(R.id.tv_title).getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams2).leftMargin = ViewUtils.f(m(), 10.0f);
        viewHolder.i(R.id.vg_layout_all).setOnClickListener(new a());
        RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv);
        if (feedsContentNewsTopicObj.getNews_topics() != null && feedsContentNewsTopicObj.getNews_topics().size() > 0) {
            if (recyclerView.getLayoutManager() == null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(m(), 0, false));
            }
            recyclerView.setPadding(ViewUtils.f(m(), 11.0f), 0, ViewUtils.f(m(), 11.0f), 0);
            recyclerView.setAdapter(new b(m(), feedsContentNewsTopicObj.getNews_topics()));
        }
        E(viewHolder, data);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42735, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
