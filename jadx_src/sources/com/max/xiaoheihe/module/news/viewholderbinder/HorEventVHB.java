package com.max.xiaoheihe.module.news.viewholderbinder;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.events.EventObj;
import com.max.xiaoheihe.bean.news.events.FeedsEventObj;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import df.dj;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: HorEventVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nHorEventVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HorEventVHB.kt\ncom/max/xiaoheihe/module/news/viewholderbinder/HorEventVHB\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,92:1\n262#2,2:93\n*S KotlinDebug\n*F\n+ 1 HorEventVHB.kt\ncom/max/xiaoheihe/module/news/viewholderbinder/HorEventVHB\n*L\n73#1:93,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class HorEventVHB extends h0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91342k = 0;

    /* JADX INFO: compiled from: HorEventVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EventObj f91344c;

        a(EventObj eventObj) {
            this.f91344c = eventObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42613, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(HorEventVHB.this.p().c(), this.f91344c.getProtocol());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorEventVHB(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    public void M(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42611, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        super.d(viewHolder, data);
        FeedsEventObj feedsEventObj = data instanceof FeedsEventObj ? (FeedsEventObj) data : null;
        if (feedsEventObj == null || feedsEventObj.isShowTracked()) {
            return;
        }
        feedsEventObj.setShowTracked(true);
        EventObj event = feedsEventObj.getEvent();
        com.max.xiaoheihe.utils.d.c(event != null ? event.getReport_extra() : null);
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void d(com.max.hbcommon.base.adapter.s.e eVar, FeedsContentBaseObj feedsContentBaseObj) {
        if (PatchProxy.proxy(new Object[]{eVar, feedsContentBaseObj}, this, changeQuickRedirect, false, 42612, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        M(eVar, feedsContentBaseObj);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        EventObj event;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42609, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        FeedsEventObj feedsEventObj = data instanceof FeedsEventObj ? (FeedsEventObj) data : null;
        if (feedsEventObj == null || (event = feedsEventObj.getEvent()) == null) {
            return;
        }
        View view = viewHolder.itemView;
        view.setTag(data);
        view.setOnClickListener(new a(event));
        dj djVarA = dj.a(viewHolder.itemView);
        final WeakReference weakReference = new WeakReference(djVarA.f109817d);
        final WeakReference weakReference2 = new WeakReference(djVarA.f109816c);
        com.max.hbimage.b.Y(p().c(), event.getImage(), new com.max.hbimage.b.q() { // from class: com.max.xiaoheihe.module.news.viewholderbinder.HorEventVHB$contentBinding$1$2$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbimage.b.q
            public void a(@dl.e Drawable drawable) {
                if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 42614, new Class[]{Drawable.class}, Void.TYPE).isSupported || drawable == null) {
                    return;
                }
                QMUIRadiusImageView qMUIRadiusImageView = weakReference.get();
                if (qMUIRadiusImageView != null) {
                    qMUIRadiusImageView.setImageDrawable(drawable);
                }
                ImageView imageView = weakReference2.get();
                if (imageView != null) {
                    kotlinx.coroutines.k.f(r0.a(e1.c()), null, null, new HorEventVHB$contentBinding$1$2$1$onResourceReady$2$1(drawable, this, imageView, null), 3, null);
                }
            }

            @Override // com.max.hbimage.b.q
            public /* synthetic */ void b(Drawable drawable) {
                com.max.hbimage.d.a(this, drawable);
            }

            @Override // com.max.hbimage.b.q
            public void onLoadFailed(@dl.e Drawable drawable) {
            }
        });
        String main_color = event.getMain_color();
        int iD = main_color != null ? com.max.hbutils.utils.a.d(main_color) : -1;
        djVarA.f109815b.setCardBackgroundColor(iD);
        float[] fArr = {0.0f, 0.0f, 0.0f};
        Color.colorToHSV(iD, fArr);
        fArr[2] = Math.min(1.0f, fArr[2] + 0.4f);
        djVarA.f109820g.setBackgroundColor(Color.HSVToColor(178, fArr));
        djVarA.f109819f.setText(event.getTitle());
        djVarA.f109818e.setText(event.getDesc());
        HBUiKitView contentBinding$lambda$3$lambda$2$lambda$1 = djVarA.f109821h;
        kotlin.jvm.internal.f0.o(contentBinding$lambda$3$lambda$2$lambda$1, "contentBinding$lambda$3$lambda$2$lambda$1");
        contentBinding$lambda$3$lambda$2$lambda$1.setVisibility(event.getUikit() != null ? 0 : 8);
        contentBinding$lambda$3$lambda$2$lambda$1.setDataToCreate(event.getUikit());
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42610, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
