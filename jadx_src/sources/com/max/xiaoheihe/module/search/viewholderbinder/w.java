package com.max.xiaoheihe.module.search.viewholderbinder;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.search.SearchLinkListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchTopicLinkListVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class w extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f91880m = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private RecyclerView.OnScrollListener f91881l;

    /* JADX INFO: compiled from: SearchTopicLinkListVHB.kt */
    public static final class a extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 43387, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            if (w.this.o().n() instanceof com.max.xiaoheihe.module.search.a) {
                com.max.hbcommon.base.adapter.u<?> uVarN = w.this.o().n();
                f0.n(uVarN, "null cannot be cast to non-null type com.max.xiaoheihe.module.search.MultiTypeAdapter");
                ((com.max.xiaoheihe.module.search.a) uVarN).v(recyclerView);
            }
        }
    }

    /* JADX INFO: compiled from: SearchTopicLinkListVHB.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SearchLinkListObj f91884c;

        b(SearchLinkListObj searchLinkListObj) {
            this.f91884c = searchLinkListObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43388, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(w.this.o().q(), this.f91884c.getMore_prot());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    @dl.e
    public final RecyclerView.OnScrollListener B() {
        return this.f91881l;
    }

    public final void C(@dl.e RecyclerView.OnScrollListener onScrollListener) {
        this.f91881l = onScrollListener;
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43386, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43385, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        SearchLinkListObj searchLinkListObj = (SearchLinkListObj) com.max.hbutils.utils.k.a(data.getInfo(), SearchLinkListObj.class);
        List<BBSLinkObj> link_list = searchLinkListObj.getLink_list();
        if (link_list != null) {
            RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv_link);
            recyclerView.setLayoutManager(new LinearLayoutManager(o().q(), 0, false));
            if (recyclerView.getItemDecorationCount() <= 0) {
                recyclerView.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(o().q(), 10.0f), ViewUtils.f(o().q(), 12.0f), 0));
            }
            int size = link_list.size();
            for (int i10 = 0; i10 < size; i10++) {
                link_list.get(i10).setCustom_index(String.valueOf(i10));
            }
            com.max.hbcommon.base.adapter.w wVar = new com.max.hbcommon.base.adapter.w(o().q(), new com.max.xiaoheihe.module.search.viewholderbinder.a(o().q(), link_list), new b(searchLinkListObj));
            wVar.G(!com.max.hbcommon.utils.c.u(searchLinkListObj.getMore_prot()));
            wVar.J(-1);
            wVar.H(R.color.transparent);
            recyclerView.setAdapter(wVar);
            RecyclerView.OnScrollListener onScrollListener = this.f91881l;
            if (onScrollListener == null) {
                this.f91881l = new a();
            } else {
                f0.m(onScrollListener);
                recyclerView.removeOnScrollListener(onScrollListener);
            }
            RecyclerView.OnScrollListener onScrollListener2 = this.f91881l;
            f0.m(onScrollListener2);
            recyclerView.addOnScrollListener(onScrollListener2);
        }
    }
}
