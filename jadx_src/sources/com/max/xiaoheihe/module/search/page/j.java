package com.max.xiaoheihe.module.search.page;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.max.hbsearch.bean.SearchHotwordObj;
import com.max.hbsearch.y0;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.bean.mall.MallProductsObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchStoreFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class j extends y0 {
    public static final int K = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final ArrayList<MallProductObj> I = new ArrayList<>();

    @dl.e
    private com.max.xiaoheihe.module.mall.e J;

    /* JADX INFO: compiled from: SearchStoreFragment.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<MallProductsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f91686c;

        a(String str, j jVar) {
            this.f91685b = str;
            this.f91686c = jVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43140, new Class[0], Void.TYPE).isSupported && f0.g(this.f91685b, j.O5(this.f91686c)) && this.f91686c.isActive()) {
                super.onComplete();
                j.K5(this.f91686c, null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43139, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(this.f91685b, j.O5(this.f91686c)) && this.f91686c.isActive()) {
                super.onError(e10);
                j.K5(this.f91686c, null);
            }
        }

        public void onNext(@dl.d Result<MallProductsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43141, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (f0.g(this.f91685b, j.O5(this.f91686c)) && this.f91686c.isActive()) {
                super.onNext(result);
                if (result.getResult() != null) {
                    MallProductsObj result2 = result.getResult();
                    f0.m(result2);
                    if (result2.getItems() != null) {
                        if (j.N5(this.f91686c) == 0) {
                            this.f91686c.I.clear();
                        }
                        ArrayList arrayList = this.f91686c.I;
                        MallProductsObj result3 = result.getResult();
                        f0.m(result3);
                        arrayList.addAll(result3.getItems());
                    }
                }
                j.P5(this.f91686c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43142, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallProductsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SearchStoreFragment.kt */
    public static final class b extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f91687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f91688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f91689d;

        b(j jVar) {
            this.f91687b = ViewUtils.f(((com.max.hbcommon.base.d) jVar).mContext, 12.0f);
            this.f91688c = ViewUtils.f(((com.max.hbcommon.base.d) jVar).mContext, 10.0f);
            this.f91689d = ViewUtils.f(((com.max.hbcommon.base.d) jVar).mContext, 4.0f);
        }

        public final int a() {
            return this.f91687b;
        }

        public final int b() {
            return this.f91688c;
        }

        public final int c() {
            return this.f91689d;
        }

        public final void d(int i10) {
            this.f91687b = i10;
        }

        public final void e(int i10) {
            this.f91688c = i10;
        }

        public final void f(int i10) {
            this.f91689d = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 43143, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
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
            int i10 = childAdapterPosition > 1 ? this.f91688c : 0;
            if (spanIndex % 2 == 0) {
                outRect.set(this.f91687b, i10, this.f91688c / 2, this.f91689d);
            } else {
                outRect.set(this.f91688c / 2, i10, this.f91687b, this.f91689d);
            }
        }
    }

    public static final /* synthetic */ void K5(j jVar, String str) {
        if (PatchProxy.proxy(new Object[]{jVar, str}, null, changeQuickRedirect, true, 43136, new Class[]{j.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        jVar.Q3(str);
    }

    public static final /* synthetic */ int N5(j jVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jVar}, null, changeQuickRedirect, true, 43137, new Class[]{j.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : jVar.c4();
    }

    public static final /* synthetic */ String O5(j jVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jVar}, null, changeQuickRedirect, true, 43135, new Class[]{j.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : jVar.d4();
    }

    public static final /* synthetic */ void P5(j jVar) {
        if (PatchProxy.proxy(new Object[]{jVar}, null, changeQuickRedirect, true, 43138, new Class[]{j.class}, Void.TYPE).isSupported) {
            return;
        }
        jVar.Q5();
    }

    private final void Q5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43132, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.mall.e eVar = this.J;
        f0.m(eVar);
        eVar.notifyDataSetChanged();
        if (this.I.isEmpty()) {
            y4();
        } else {
            E5(true);
            N4().setVisibility(8);
        }
    }

    private final void R5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43131, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().i0(str, c4(), a4(), T4()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(str, this)));
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    @dl.e
    public List<SearchHotwordObj> Z3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43133, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : com.max.hbsearch.o.f72357a.e();
    }

    @Override // com.max.hbsearch.y0
    public void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43128, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.J = new com.max.xiaoheihe.module.mall.e(this.mContext, this.I);
    }

    @Override // com.max.hbsearch.y0
    public void a5() {
    }

    @Override // com.max.hbsearch.y0
    public void h5(@dl.d String q10, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{q10, str}, this, changeQuickRedirect, false, 43130, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(q10, "q");
        R5(q10);
    }

    @Override // com.max.hbsearch.k
    public int i4() {
        return 11;
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    @dl.d
    public String j4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43134, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.search_store);
        f0.o(strN0, "getString(R.string.search_store)");
        return strN0;
    }

    @Override // com.max.hbsearch.y0
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43129, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        P4().setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        P4().addItemDecoration(new b(this));
        P4().setAdapter(this.J);
        com.max.xiaoheihe.module.mall.e eVar = this.J;
        if (eVar != null) {
            eVar.o();
        }
    }
}
