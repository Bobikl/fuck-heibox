package com.max.xiaoheihe.module.search.viewholderbinder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.search.SearchFeedbackV2Item;
import com.max.xiaoheihe.bean.search.SearchFeedbackV2List;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ix;
import df.kx;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;

/* JADX INFO: compiled from: SearchFeedbackV2VHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class SearchFeedbackV2VHB extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91739l = 0;

    /* JADX INFO: compiled from: SearchFeedbackV2VHB.kt */
    public static final class a extends com.max.hbcommon.base.adapter.s<SearchFeedbackV2Item> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f91740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f91741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SearchFeedbackV2VHB f91742d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SearchFeedbackV2List f91743e;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.search.viewholderbinder.SearchFeedbackV2VHB$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SearchFeedbackV2VHB.kt */
        public static final class ViewOnClickListenerC0859a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ yh.a<b2> f91744b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SearchFeedbackV2Item f91745c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f91746d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ SearchFeedbackV2VHB f91747e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ SearchFeedbackV2List f91748f;

            ViewOnClickListenerC0859a(yh.a<b2> aVar, SearchFeedbackV2Item searchFeedbackV2Item, com.max.hbcommon.base.adapter.s.e eVar, SearchFeedbackV2VHB searchFeedbackV2VHB, SearchFeedbackV2List searchFeedbackV2List) {
                this.f91744b = aVar;
                this.f91745c = searchFeedbackV2Item;
                this.f91746d = eVar;
                this.f91747e = searchFeedbackV2VHB;
                this.f91748f = searchFeedbackV2List;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43314, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f91744b.invoke();
                com.max.hbcommon.utils.k.f(this.f91745c.getReport_id(), UiKitSpanObj.TYPE_CLICK, String.valueOf(this.f91746d.getAbsoluteAdapterPosition()), null);
                com.max.xiaoheihe.base.router.b.j0(this.f91747e.o().q(), this.f91745c.getProtocol());
                String after_feedback_desc = this.f91748f.getAfter_feedback_desc();
                if (after_feedback_desc != null) {
                    String str = after_feedback_desc.length() > 0 ? after_feedback_desc : null;
                    if (str != null) {
                        com.max.hbutils.utils.c.f(str);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, yh.a<b2> aVar, SearchFeedbackV2VHB searchFeedbackV2VHB, SearchFeedbackV2List searchFeedbackV2List, Context context, List<SearchFeedbackV2Item> list) {
            super(context, list, R.layout.item_search_feedback_2_item);
            this.f91740b = i10;
            this.f91741c = aVar;
            this.f91742d = searchFeedbackV2VHB;
            this.f91743e = searchFeedbackV2List;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e SearchFeedbackV2Item searchFeedbackV2Item) {
            if (PatchProxy.proxy(new Object[]{eVar, searchFeedbackV2Item}, this, changeQuickRedirect, false, 43312, new Class[]{com.max.hbcommon.base.adapter.s.e.class, SearchFeedbackV2Item.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            int i10 = this.f91740b;
            yh.a<b2> aVar = this.f91741c;
            SearchFeedbackV2VHB searchFeedbackV2VHB = this.f91742d;
            SearchFeedbackV2List searchFeedbackV2List = this.f91743e;
            if (searchFeedbackV2Item != null) {
                TextView textView = ix.a(eVar.itemView).f111905b;
                textView.getLayoutParams().width = i10;
                textView.setText(searchFeedbackV2Item.getText());
                com.max.xiaoheihe.accelworld.l.q(textView, R.color.divider_secondary_1_color, 3.0f);
                textView.setOnClickListener(new ViewOnClickListenerC0859a(aVar, searchFeedbackV2Item, eVar, searchFeedbackV2VHB, searchFeedbackV2List));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, SearchFeedbackV2Item searchFeedbackV2Item) {
            if (PatchProxy.proxy(new Object[]{eVar, searchFeedbackV2Item}, this, changeQuickRedirect, false, 43313, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, searchFeedbackV2Item);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFeedbackV2VHB(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43311, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d final com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d final GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43310, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.search.viewholderbinder.SearchFeedbackV2VHB$bindView$hideFeedback$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @dl.e
            public final b2 a() {
                com.max.xiaoheihe.module.news.adapter.a.b bVarR;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43315, new Class[0], b2.class);
                if (patchProxyResultProxy.isSupported) {
                    return (b2) patchProxyResultProxy.result;
                }
                List<?> dataList = this.f91749b.h().getDataList();
                f0.o(dataList, "adapter.dataList");
                w0.a(dataList).remove(data);
                this.f91749b.h().notifyItemRemoved(viewHolder.getAbsoluteAdapterPosition());
                com.max.hbcommon.base.adapter.u<?> uVarH = this.f91749b.h();
                com.max.xiaoheihe.module.search.a aVar2 = uVarH instanceof com.max.xiaoheihe.module.search.a ? (com.max.xiaoheihe.module.search.a) uVarH : null;
                if (aVar2 == null || (bVarR = aVar2.r()) == null) {
                    return null;
                }
                bVarR.B3(viewHolder.getAbsoluteAdapterPosition());
                return b2.f124493a;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43316, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        };
        SearchFeedbackV2List searchFeedbackV2List = (SearchFeedbackV2List) com.max.hbutils.utils.k.a(data.getInfo(), SearchFeedbackV2List.class);
        if (searchFeedbackV2List != null) {
            kx kxVarA = kx.a(viewHolder.itemView);
            kxVarA.f112758c.setText(searchFeedbackV2List.getFeedback_title());
            RecyclerView recyclerView = kxVarA.f112757b;
            Context context = recyclerView.getContext();
            f0.o(context, "context");
            int iC = com.max.xiaoheihe.accelworld.l.c(8.0f, context);
            Context context2 = recyclerView.getContext();
            f0.o(context2, "context");
            int iC2 = com.max.xiaoheihe.accelworld.l.c(12.0f, context2);
            if (recyclerView.getItemDecorationCount() == 0) {
                recyclerView.addItemDecoration(new com.max.hbcustomview.d(iC, iC2));
            }
            int iL = ViewUtils.L(recyclerView.getContext()) - (iC2 * 2);
            List<SearchFeedbackV2Item> items = searchFeedbackV2List.getItems();
            int size = iL - (iC * ((items != null ? items.size() : 1) - 1));
            List<SearchFeedbackV2Item> items2 = searchFeedbackV2List.getItems();
            int iMax = size / Math.max(1, items2 != null ? items2.size() : 1);
            recyclerView.setLayoutManager(new LinearLayoutManager(o().q(), 0, false));
            recyclerView.setAdapter(new a(iMax, aVar, this, searchFeedbackV2List, o().q(), searchFeedbackV2List.getItems()));
        }
    }
}
