package com.max.xiaoheihe.module.mall.recommendboard;

import androidx.compose.runtime.internal.o;
import androidx.lifecycle.i0;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.base.mvvm.BaseDisplayState;
import com.max.xiaoheihe.base.mvvm.BaseViewModel;
import com.max.xiaoheihe.bean.mall.RecommendBoardItem;
import com.max.xiaoheihe.bean.mall.RecommendBoardList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.b0;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.z;

/* JADX INFO: compiled from: RecommendBoardFragmentVM.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class RecommendBoardFragmentVM extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f91034r = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f91035k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f91038n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f91036l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d
    private final ArrayList<RecommendBoardItem> f91037m = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @d
    private final i0<RecommendBoardList> f91039o = new i0<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @d
    private final i0<Boolean> f91040p = new i0<>(Boolean.FALSE);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @d
    private final z f91041q = b0.c(new yh.a<b>() { // from class: com.max.xiaoheihe.module.mall.recommendboard.RecommendBoardFragmentVM$repository$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        public final b a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42152, new Class[0], b.class);
            return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : new b();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.mall.recommendboard.b, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ b invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42153, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: compiled from: RecommendBoardFragmentVM.kt */
    public static final class a implements com.max.xiaoheihe.base.mvvm.repository.a<Result<RecommendBoardList>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f91043b;

        a(yh.a<b2> aVar) {
            this.f91043b = aVar;
        }

        public void a(@d Result<RecommendBoardList> t10) {
            List<RecommendBoardItem> items;
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 42146, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            if (f0.g(RecommendBoardFragmentVM.this.m().f(), Boolean.TRUE)) {
                RecommendBoardFragmentVM.this.k().r(BaseDisplayState.CONTENT);
                RecommendBoardList result = t10.getResult();
                if (result != null && (items = result.getItems()) != null) {
                    RecommendBoardFragmentVM recommendBoardFragmentVM = RecommendBoardFragmentVM.this;
                    if (recommendBoardFragmentVM.t() == 0) {
                        recommendBoardFragmentVM.r().clear();
                    }
                    recommendBoardFragmentVM.r().addAll(items);
                    recommendBoardFragmentVM.v().r(t10.getResult());
                    recommendBoardFragmentVM.x().r(Boolean.FALSE);
                }
                RecommendBoardFragmentVM.this.B(false);
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42148, new Class[0], Void.TYPE).isSupported && f0.g(RecommendBoardFragmentVM.this.m().f(), Boolean.TRUE)) {
                RecommendBoardFragmentVM.this.k().r(BaseDisplayState.CONTENT);
                RecommendBoardFragmentVM.this.x().r(Boolean.FALSE);
                RecommendBoardFragmentVM.this.B(false);
                this.f91043b.invoke();
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onError(@d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 42147, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(RecommendBoardFragmentVM.this.m().f(), Boolean.TRUE)) {
                RecommendBoardFragmentVM.this.k().r(BaseDisplayState.ERROR);
                RecommendBoardFragmentVM.this.x().r(Boolean.FALSE);
                RecommendBoardFragmentVM.this.B(false);
                this.f91043b.invoke();
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public /* bridge */ /* synthetic */ void onNext(Result<RecommendBoardList> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42149, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(result);
        }
    }

    private final void p(yh.a<b2> aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 42145, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        u().b(this.f91035k, this.f91036l, new a(aVar));
    }

    public final void A() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42142, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f91040p.r(Boolean.TRUE);
        this.f91035k = 0;
        p(new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.recommendboard.RecommendBoardFragmentVM$refresh$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42151, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        });
    }

    public final void B(boolean z10) {
        this.f91038n = z10;
    }

    public final void C(int i10) {
        this.f91035k = i10;
    }

    @Override // com.max.xiaoheihe.base.mvvm.a
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42141, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k().r(BaseDisplayState.LOADING);
        A();
    }

    @d
    public final ArrayList<RecommendBoardItem> r() {
        return this.f91037m;
    }

    public final int s() {
        return this.f91036l;
    }

    public final int t() {
        return this.f91035k;
    }

    @d
    public final b u() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42140, new Class[0], b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : (b) this.f91041q.getValue();
    }

    @d
    public final i0<RecommendBoardList> v() {
        return this.f91039o;
    }

    public final boolean w() {
        return this.f91038n;
    }

    @d
    public final i0<Boolean> x() {
        return this.f91040p;
    }

    public final void y() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42143, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        z(false, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.recommendboard.RecommendBoardFragmentVM$loadMore$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42150, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        });
    }

    public final void z(boolean z10, @d yh.a<b2> action) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), action}, this, changeQuickRedirect, false, 42144, new Class[]{Boolean.TYPE, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(action, "action");
        if (this.f91038n) {
            return;
        }
        this.f91038n = true;
        if (z10) {
            this.f91040p.r(Boolean.TRUE);
        }
        this.f91035k += this.f91036l;
        p(action);
    }
}
