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
import com.max.xiaoheihe.bean.search.SearchTagListObj;
import com.max.xiaoheihe.bean.search.SearchTagObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: SearchFilterTagVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nSearchFilterTagVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchFilterTagVHB.kt\ncom/max/xiaoheihe/module/search/viewholderbinder/SearchFilterTagVHB\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,120:1\n262#2,2:121\n304#2,2:123\n*S KotlinDebug\n*F\n+ 1 SearchFilterTagVHB.kt\ncom/max/xiaoheihe/module/search/viewholderbinder/SearchFilterTagVHB\n*L\n68#1:121,2\n115#1:123,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class i extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91792l = 0;

    /* JADX INFO: compiled from: SearchFilterTagVHB.kt */
    public static final class a extends com.max.hbcommon.base.adapter.s<SearchTagObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SearchTagListObj f91793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f91794c;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.search.viewholderbinder.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SearchFilterTagVHB.kt */
        public static final class ViewOnClickListenerC0861a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SearchTagListObj f91795b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SearchTagObj f91796c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ i f91797d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f91798e;

            ViewOnClickListenerC0861a(SearchTagListObj searchTagListObj, SearchTagObj searchTagObj, i iVar, a aVar) {
                this.f91795b = searchTagListObj;
                this.f91796c = searchTagObj;
                this.f91797d = iVar;
                this.f91798e = aVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43333, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                try {
                    List<SearchTagObj> filter_tags = this.f91795b.getFilter_tags();
                    Integer numValueOf = filter_tags != null ? Integer.valueOf(filter_tags.indexOf(this.f91796c)) : null;
                    SearchTagListObj searchTagListObj = this.f91795b;
                    com.max.hbsearch.f fVarU = this.f91797d.o().u();
                    int iB = i.B(searchTagListObj, fVarU != null ? fVarU.c() : null);
                    if (numValueOf != null && numValueOf.intValue() == iB) {
                        return;
                    }
                    a aVar = this.f91798e;
                    f0.m(numValueOf);
                    aVar.notifyItemChanged(numValueOf.intValue());
                    this.f91798e.notifyItemChanged(iB);
                    com.max.hbsearch.f fVarU2 = this.f91797d.o().u();
                    if (fVarU2 != null) {
                        fVarU2.b(this.f91796c.getTag());
                    }
                    com.max.hbcommon.utils.k.o();
                    com.max.hbcommon.utils.k.f(this.f91796c.getReport_id(), UiKitSpanObj.TYPE_CLICK, this.f91796c.getCustom_index(), null);
                } catch (Throwable th2) {
                    com.max.heybox.hblog.g.f74531b.v("SearchFilterTagVHB  onError： " + th2.getMessage());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SearchTagListObj searchTagListObj, i iVar, Context context, List<SearchTagObj> list) {
            super(context, list, R.layout.item_search_filter_tag);
            this.f91793b = searchTagListObj;
            this.f91794c = iVar;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e SearchTagObj searchTagObj) {
            if (PatchProxy.proxy(new Object[]{eVar, searchTagObj}, this, changeQuickRedirect, false, 43331, new Class[]{com.max.hbcommon.base.adapter.s.e.class, SearchTagObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            SearchTagListObj searchTagListObj = this.f91793b;
            i iVar = this.f91794c;
            if (searchTagObj != null) {
                searchTagObj.setCustom_index(String.valueOf(eVar.getAbsoluteAdapterPosition()));
                eVar.itemView.setTag(searchTagObj);
                View viewI = eVar.i(R.id.tv_search_filter_tag);
                f0.o(viewI, "searchTagViewHolder.getV….id.tv_search_filter_tag)");
                TextView textView = (TextView) viewI;
                i.C(searchTagListObj, iVar, searchTagObj, textView);
                textView.setOnClickListener(new ViewOnClickListenerC0861a(searchTagListObj, searchTagObj, iVar, this));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, SearchTagObj searchTagObj) {
            if (PatchProxy.proxy(new Object[]{eVar, searchTagObj}, this, changeQuickRedirect, false, 43332, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, searchTagObj);
        }
    }

    /* JADX INFO: compiled from: SearchFilterTagVHB.kt */
    public static final class b extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 43334, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            if (i.this.o().n() instanceof com.max.xiaoheihe.module.search.a) {
                com.max.hbcommon.base.adapter.u<?> uVarN = i.this.o().n();
                f0.n(uVarN, "null cannot be cast to non-null type com.max.xiaoheihe.module.search.MultiTypeAdapter");
                ((com.max.xiaoheihe.module.search.a) uVarN).v(recyclerView);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    public static final /* synthetic */ int B(SearchTagListObj searchTagListObj, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchTagListObj, str}, null, changeQuickRedirect, true, 43330, new Class[]{SearchTagListObj.class, String.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : D(searchTagListObj, str);
    }

    public static final /* synthetic */ void C(SearchTagListObj searchTagListObj, i iVar, SearchTagObj searchTagObj, TextView textView) {
        if (PatchProxy.proxy(new Object[]{searchTagListObj, iVar, searchTagObj, textView}, null, changeQuickRedirect, true, 43329, new Class[]{SearchTagListObj.class, i.class, SearchTagObj.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        E(searchTagListObj, iVar, searchTagObj, textView);
    }

    private static final int D(SearchTagListObj searchTagListObj, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchTagListObj, str}, null, changeQuickRedirect, true, 43326, new Class[]{SearchTagListObj.class, String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<SearchTagObj> filter_tags = searchTagListObj.getFilter_tags();
        f0.m(filter_tags);
        int size = filter_tags.size();
        for (int i10 = 0; i10 < size; i10++) {
            List<SearchTagObj> filter_tags2 = searchTagListObj.getFilter_tags();
            f0.m(filter_tags2);
            if (f0.g(filter_tags2.get(i10).getTag(), str)) {
                return i10;
            }
        }
        return 0;
    }

    private static final void E(SearchTagListObj searchTagListObj, i iVar, SearchTagObj searchTagObj, TextView textView) {
        if (PatchProxy.proxy(new Object[]{searchTagListObj, iVar, searchTagObj, textView}, null, changeQuickRedirect, true, 43327, new Class[]{SearchTagListObj.class, i.class, SearchTagObj.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        List<SearchTagObj> filter_tags = searchTagListObj.getFilter_tags();
        f0.m(filter_tags);
        int iIndexOf = filter_tags.indexOf(searchTagObj);
        com.max.hbsearch.f fVarU = iVar.o().u();
        if (iIndexOf == D(searchTagListObj, fVarU != null ? fVarU.c() : null)) {
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            com.max.xiaoheihe.accelworld.l.q(textView, R.color.background_layer_1_color, 3.0f);
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        } else {
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            com.max.xiaoheihe.accelworld.l.q(textView, R.color.divider_secondary_2_color, 3.0f);
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        }
        textView.setText(searchTagObj.getName());
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43328, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        List dataList;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43325, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        SearchTagListObj searchTagListObj = (SearchTagListObj) com.max.hbutils.utils.k.a(data.getInfo(), SearchTagListObj.class);
        if (searchTagListObj != null) {
            if (o().u() == null || com.max.hbcommon.utils.c.w(searchTagListObj.getFilter_tags())) {
                View view = viewHolder.itemView;
                f0.o(view, "viewHolder.itemView");
                view.setVisibility(8);
                return;
            }
            View viewI = viewHolder.i(R.id.rv_search_filter_tags);
            f0.o(viewI, "viewHolder.getView(R.id.rv_search_filter_tags)");
            RecyclerView recyclerView = (RecyclerView) viewI;
            com.max.hbsearch.f fVarU = o().u();
            if ((fVarU != null ? fVarU.c() : null) != null) {
                Object tag = recyclerView.getTag(R.id.tag);
                com.max.hbsearch.p pVarW = o().w();
                if (f0.g(tag, pVarW != null ? pVarW.r() : null)) {
                    com.max.hbcommon.base.adapter.s sVar = (com.max.hbcommon.base.adapter.s) recyclerView.getAdapter();
                    if (sVar == null || (dataList = sVar.getDataList()) == null) {
                        return;
                    }
                    f0.o(dataList, "dataList");
                    dataList.clear();
                    List<SearchTagObj> filter_tags = searchTagListObj.getFilter_tags();
                    f0.m(filter_tags);
                    dataList.addAll(filter_tags);
                    sVar.notifyDataSetChanged();
                    return;
                }
            }
            com.max.hbsearch.p pVarW2 = o().w();
            recyclerView.setTag(R.id.tag, pVarW2 != null ? pVarW2.r() : null);
            View view2 = viewHolder.itemView;
            f0.o(view2, "viewHolder.itemView");
            view2.setVisibility(0);
            recyclerView.setLayoutManager(new LinearLayoutManager(m(), 0, false));
            if (recyclerView.getItemDecorationCount() == 0) {
                recyclerView.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(m(), 10.0f), ViewUtils.f(m(), 12.0f)));
            }
            recyclerView.setAdapter(new a(searchTagListObj, this, m(), searchTagListObj.getFilter_tags()));
            recyclerView.clearOnScrollListeners();
            recyclerView.addOnScrollListener(new b());
        }
    }
}
