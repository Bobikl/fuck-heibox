package com.max.xiaoheihe.module.search.page;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.t;
import com.max.hbsearch.y0;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.news.TopicsSearchResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchChannelFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class a extends y0 {
    public static final int K = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final ArrayList<BBSTopicObj> I = new ArrayList<>();

    @dl.e
    private t J;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.search.page.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SearchChannelFragment.kt */
    public static final class C0853a extends com.max.hbcommon.network.d<Result<TopicsSearchResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f91636c;

        C0853a(String str, a aVar) {
            this.f91635b = str;
            this.f91636c = aVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42923, new Class[0], Void.TYPE).isSupported && f0.g(this.f91635b, a.N5(this.f91636c)) && this.f91636c.isActive()) {
                super.onComplete();
                a.K5(this.f91636c, this.f91635b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 42922, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(this.f91635b, a.N5(this.f91636c)) && this.f91636c.isActive()) {
                super.onError(e10);
                a.K5(this.f91636c, this.f91635b);
            }
        }

        public void onNext(@dl.d Result<TopicsSearchResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42924, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (f0.g(this.f91635b, a.N5(this.f91636c)) && this.f91636c.isActive()) {
                super.onNext(result);
                if (result.getResult() != null) {
                    TopicsSearchResult result2 = result.getResult();
                    f0.m(result2);
                    if (!com.max.hbcommon.utils.c.w(result2.getTopics())) {
                        this.f91636c.I.clear();
                        ArrayList arrayList = this.f91636c.I;
                        TopicsSearchResult result3 = result.getResult();
                        f0.m(result3);
                        arrayList.addAll(result3.getTopics().get(0).getChildren());
                    }
                }
                a.O5(this.f91636c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42925, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TopicsSearchResult>) obj);
        }
    }

    /* JADX INFO: compiled from: SearchChannelFragment.kt */
    public static final class b extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 42926, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(outRect, "outRect");
            f0.p(view, "view");
            f0.p(parent, "parent");
            f0.p(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            int iF = ViewUtils.f(((com.max.hbcommon.base.d) a.this).mContext, 10.0f);
            if (childAdapterPosition % 3 == 2) {
                outRect.set(0, iF, 0, 0);
            } else {
                outRect.set(0, iF, iF, 0);
            }
        }
    }

    public static final /* synthetic */ void K5(a aVar, String str) {
        if (PatchProxy.proxy(new Object[]{aVar, str}, null, changeQuickRedirect, true, 42920, new Class[]{a.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.Q3(str);
    }

    public static final /* synthetic */ String N5(a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 42919, new Class[]{a.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : aVar.d4();
    }

    public static final /* synthetic */ void O5(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 42921, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.P5();
    }

    private final void P5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42917, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t tVar = this.J;
        f0.m(tVar);
        tVar.notifyDataSetChanged();
        if (this.I.isEmpty()) {
            y4();
        } else {
            E5(true);
            N4().setVisibility(8);
        }
    }

    private final void Q5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42916, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().h8(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0853a(str, this)));
    }

    @Override // com.max.hbsearch.y0
    public void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42912, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.J = new t(new com.max.xiaoheihe.module.news.adapter.b(this.mContext, this.I, null));
    }

    @Override // com.max.hbsearch.y0
    public void a5() {
    }

    @Override // com.max.hbsearch.y0
    public void h5(@dl.d String q10, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{q10, str}, this, changeQuickRedirect, false, 42914, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(q10, "q");
        Q5(q10);
    }

    @Override // com.max.hbsearch.k
    public int i4() {
        return 17;
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    @dl.d
    public String j4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42918, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.hint_search_channel_name);
        f0.o(strN0, "getString(R.string.hint_search_channel_name)");
        return strN0;
    }

    @Override // com.max.hbsearch.y0
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42913, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        P4().setLayoutManager(new GridLayoutManager(this.mContext, 3));
        P4().setPadding(ViewUtils.f(this.mContext, 12.0f), 0, ViewUtils.f(this.mContext, 12.0f), 0);
        P4().addItemDecoration(new b());
        P4().setAdapter(this.J);
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    public void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42915, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E5(true);
        N4().setVisibility(8);
    }
}
