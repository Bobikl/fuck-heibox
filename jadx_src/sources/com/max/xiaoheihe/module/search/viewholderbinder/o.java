package com.max.xiaoheihe.module.search.viewholderbinder;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.bean.search.SearchMallListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchMallListVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class o extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f91819m = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private RecyclerView.OnScrollListener f91820l;

    /* JADX INFO: compiled from: SearchMallListVHB.kt */
    public static final class a extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 43357, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            if (o.this.o().n() instanceof com.max.xiaoheihe.module.search.a) {
                com.max.hbcommon.base.adapter.u<?> uVarN = o.this.o().n();
                f0.n(uVarN, "null cannot be cast to non-null type com.max.xiaoheihe.module.search.MultiTypeAdapter");
                ((com.max.xiaoheihe.module.search.a) uVarN).v(recyclerView);
            }
        }
    }

    /* JADX INFO: compiled from: SearchMallListVHB.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SearchMallListObj f91823c;

        b(SearchMallListObj searchMallListObj) {
            this.f91823c = searchMallListObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43358, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(o.this.o().q(), this.f91823c.getMore_prot());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    @dl.e
    public final RecyclerView.OnScrollListener B() {
        return this.f91820l;
    }

    public final void C(@dl.e RecyclerView.OnScrollListener onScrollListener) {
        this.f91820l = onScrollListener;
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43356, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43355, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        SearchMallListObj searchMallListObj = (SearchMallListObj) com.max.hbutils.utils.k.a(data.getInfo(), SearchMallListObj.class);
        RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv_mall_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(o().q(), 0, false));
        if (recyclerView.getItemDecorationCount() <= 0) {
            recyclerView.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(o().q(), 6.0f), ViewUtils.f(o().q(), 12.0f), 0));
        }
        if (!com.max.hbcommon.utils.c.w(searchMallListObj.getMall_list())) {
            List<MallProductObj> mall_list = searchMallListObj.getMall_list();
            f0.m(mall_list);
            int size = mall_list.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<MallProductObj> mall_list2 = searchMallListObj.getMall_list();
                f0.m(mall_list2);
                mall_list2.get(i10).setCustom_index(String.valueOf(i10));
            }
        }
        com.max.hbcommon.base.adapter.w wVar = new com.max.hbcommon.base.adapter.w(o().q(), new com.max.xiaoheihe.module.mall.k(o().q(), searchMallListObj.getMall_list()), new b(searchMallListObj));
        wVar.G(!com.max.hbcommon.utils.c.u(searchMallListObj.getMore_prot()));
        wVar.J(-1);
        wVar.H(R.color.transparent);
        recyclerView.setAdapter(wVar);
        RecyclerView.OnScrollListener onScrollListener = this.f91820l;
        if (onScrollListener == null) {
            this.f91820l = new a();
        } else {
            f0.m(onScrollListener);
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        RecyclerView.OnScrollListener onScrollListener2 = this.f91820l;
        f0.m(onScrollListener2);
        recyclerView.addOnScrollListener(onScrollListener2);
    }
}
