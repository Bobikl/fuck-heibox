package com.max.xiaoheihe.module.search.viewholderbinder;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchMallVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class p extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91824l = 0;

    /* JADX INFO: compiled from: SearchMallVHB.kt */
    public static final class a extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f91825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f91826c;

        a(p pVar) {
            this.f91825b = ViewUtils.f(pVar.m(), 12.0f);
            this.f91826c = ViewUtils.f(pVar.m(), 9.0f);
        }

        public final int a() {
            return this.f91825b;
        }

        public final int b() {
            return this.f91826c;
        }

        public final void c(int i10) {
            this.f91825b = i10;
        }

        public final void d(int i10) {
            this.f91826c = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 43361, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(outRect, "outRect");
            f0.p(view, "view");
            f0.p(parent, "parent");
            f0.p(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) layoutParams).getSpanIndex();
            int i10 = childAdapterPosition < 2 ? this.f91826c : 0;
            if (childAdapterPosition < 0) {
                outRect.set(0, 0, 0, 0);
                return;
            }
            if (spanIndex % 2 != 0) {
                int i11 = this.f91826c;
                outRect.set(i11 / 2, i10, this.f91825b, i11);
            } else {
                int i12 = this.f91825b;
                int i13 = this.f91826c;
                outRect.set(i12, i10, i13 / 2, i13);
            }
        }
    }

    /* JADX INFO: compiled from: SearchMallVHB.kt */
    public static final class b extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 43362, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            com.max.hbcommon.utils.d.b("generalSearchReport", "SearchMallVHB onScrolled");
            super.onScrolled(recyclerView, i10, i11);
            if (p.this.o().n() instanceof com.max.xiaoheihe.module.search.a) {
                com.max.hbcommon.base.adapter.u<?> uVarN = p.this.o().n();
                f0.n(uVarN, "null cannot be cast to non-null type com.max.xiaoheihe.module.search.MultiTypeAdapter");
                ((com.max.xiaoheihe.module.search.a) uVarN).v(recyclerView);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43360, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43359, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        List<MallProductObj> listB = com.max.hbutils.utils.k.b(data.getInfo(), MallProductObj.class);
        RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv_item);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        recyclerView.setNestedScrollingEnabled(false);
        if (recyclerView.getItemDecorationCount() < 1) {
            recyclerView.addItemDecoration(new a(this));
        }
        ArrayList arrayList = new ArrayList();
        for (MallProductObj mallProductObj : listB) {
            mallProductObj.setCustom_index(String.valueOf(listB.indexOf(mallProductObj)));
            arrayList.add(mallProductObj);
        }
        recyclerView.setAdapter(new com.max.xiaoheihe.module.mall.e(m(), arrayList));
        recyclerView.clearOnScrollListeners();
        recyclerView.addOnScrollListener(new b());
    }
}
