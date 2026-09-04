package com.max.xiaoheihe.module.news.viewholderbinder;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.EventListExposureObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.events.EventObj;
import com.max.xiaoheihe.bean.news.events.FeedsEventListObj;
import com.max.xiaoheihe.module.news.adapter.EventsHorAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: EventListVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class b extends h0 implements com.max.xiaoheihe.module.news.adapter.a.InterfaceC0842a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91363l = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private RecyclerView.OnScrollListener f91364k;

    /* JADX INFO: compiled from: EventListVHB.kt */
    public static final class a extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView f91365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<EventObj> f91366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<EventObj> f91367d;

        a(RecyclerView recyclerView, List<EventObj> list, List<EventObj> list2) {
            this.f91365b = recyclerView;
            this.f91366c = list;
            this.f91367d = list2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42607, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
            com.max.xiaoheihe.utils.d.q1(this.f91365b, this.f91366c, this.f91367d, EventObj.class);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.news.viewholderbinder.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EventListVHB.kt */
    public static final class C0846b extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView f91368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<EventObj> f91369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<EventObj> f91370d;

        C0846b(RecyclerView recyclerView, List<EventObj> list, List<EventObj> list2) {
            this.f91368b = recyclerView;
            this.f91369c = list;
            this.f91370d = list2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42608, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
            if (ViewUtils.f0(this.f91368b) || com.max.hbcommon.utils.c.w(this.f91369c)) {
                com.max.xiaoheihe.utils.d.q1(this.f91368b, this.f91369c, this.f91370d, EventObj.class);
            } else {
                com.max.xiaoheihe.utils.d.o1(this.f91369c, this.f91370d);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a.InterfaceC0842a
    public void a(@dl.d RecyclerView recyclerView, int i10, int i11) {
        Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42606, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
        RecyclerView.OnScrollListener onScrollListener = this.f91364k;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(recyclerView, i10, i11);
        }
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42604, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        if (data instanceof FeedsEventListObj) {
            FeedsEventListObj feedsEventListObj = (FeedsEventListObj) data;
            if (com.max.hbcommon.utils.c.w(feedsEventListObj.getEvent_list())) {
                return;
            }
            RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv_event);
            recyclerView.setLayoutManager(new LinearLayoutManager(p().c(), 0, false));
            if (recyclerView.getItemDecorationCount() == 0) {
                Context context = recyclerView.getContext();
                kotlin.jvm.internal.f0.o(context, "context");
                int iC = com.max.xiaoheihe.accelworld.l.c(6.0f, context);
                Context context2 = recyclerView.getContext();
                kotlin.jvm.internal.f0.o(context2, "context");
                recyclerView.addItemDecoration(new com.max.hbcustomview.d(iC, com.max.xiaoheihe.accelworld.l.c(12.0f, context2)));
            }
            Context contextC = p().c();
            List<EventObj> event_list = feedsEventListObj.getEvent_list();
            kotlin.jvm.internal.f0.m(event_list);
            recyclerView.setAdapter(new EventsHorAdapter(contextC, event_list));
            Object tag = viewHolder.itemView.getTag(R.id.tag_viewholder);
            if (!(tag instanceof EventListExposureObj)) {
                tag = new EventListExposureObj(new ArrayList(), new ArrayList());
                viewHolder.itemView.setTag(R.id.tag_viewholder, tag);
            }
            EventListExposureObj eventListExposureObj = (EventListExposureObj) tag;
            List<EventObj> show = eventListExposureObj.getShow();
            List<EventObj> disappear = eventListExposureObj.getDisappear();
            recyclerView.clearOnScrollListeners();
            recyclerView.addOnScrollListener(new a(recyclerView, show, disappear));
            this.f91364k = new C0846b(recyclerView, show, disappear);
        }
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42605, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
