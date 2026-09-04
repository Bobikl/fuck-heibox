package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import androidx.annotation.n0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.bean.bbs.WikiOrArticleWrapperObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: WikiItemListAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public class a0 extends com.max.hbcommon.base.adapter.u<WikiOrArticleWrapperObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f80308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.max.hbsearch.p f80309c;

    /* JADX INFO: compiled from: WikiItemListAdapter.java */
    public class a extends GridLayoutManager.SpanSizeLookup {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f80310a;

        a(GridLayoutManager gridLayoutManager) {
            this.f80310a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27525, new Class[]{cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if (a0.this.getDataList().get(i10).getItemType() == 1) {
                return 1;
            }
            return this.f80310a.getSpanCount();
        }
    }

    public a0(Context context, List<WikiOrArticleWrapperObj> list) {
        super(context, list);
        this.f80308b = context;
    }

    public a0(Context context, List<WikiOrArticleWrapperObj> list, com.max.hbsearch.p pVar) {
        super(context, list);
        this.f80308b = context;
        this.f80309c = pVar;
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, WikiOrArticleWrapperObj wikiOrArticleWrapperObj) {
        Object[] objArr = {new Integer(i10), wikiOrArticleWrapperObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27523, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, wikiOrArticleWrapperObj);
    }

    public int n(int i10, WikiOrArticleWrapperObj wikiOrArticleWrapperObj) {
        Object[] objArr = {new Integer(i10), wikiOrArticleWrapperObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27521, new Class[]{cls, WikiOrArticleWrapperObj.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : WikiHelper.b().c(wikiOrArticleWrapperObj);
    }

    public void o(com.max.hbcommon.base.adapter.s.e eVar, WikiOrArticleWrapperObj wikiOrArticleWrapperObj) {
        com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.j jVarA;
        if (PatchProxy.proxy(new Object[]{eVar, wikiOrArticleWrapperObj}, this, changeQuickRedirect, false, 27522, new Class[]{com.max.hbcommon.base.adapter.s.e.class, WikiOrArticleWrapperObj.class}, Void.TYPE).isSupported || (jVarA = com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.k.f80702a.a(new com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.i(this.f80308b, this, this.f80309c), eVar.d())) == null) {
            return;
        }
        jVarA.f(eVar, wikiOrArticleWrapperObj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@n0 RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 27520, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager));
        }
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 27524, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        o(eVar, (WikiOrArticleWrapperObj) obj);
    }
}
