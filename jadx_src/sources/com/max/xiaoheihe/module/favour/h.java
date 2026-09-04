package com.max.xiaoheihe.module.favour;

import androidx.compose.runtime.internal.o;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i0;
import com.max.hbcommon.base.BaseViewModel;
import com.max.hbcommon.base.UiState;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.bbs.CollectionFavTab;
import com.max.xiaoheihe.bean.bbs.CollectionFavTabList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FavourCollectionPageViewModel.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class h extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f83910f = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final i0<UiState<List<CollectionFavTab>>> f83911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final LiveData<UiState<List<CollectionFavTab>>> f83912e;

    /* JADX INFO: compiled from: FavourCollectionPageViewModel.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<CollectionFavTabList>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<Boolean> f83913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f83914c;

        a(yh.a<Boolean> aVar, h hVar) {
            this.f83913b = aVar;
            this.f83914c = hVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31805, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (this.f83913b.invoke().booleanValue()) {
                super.onError(e10);
                this.f83914c.f83911d.r(new UiState.Error(e10));
            }
        }

        public void onNext(@dl.d Result<CollectionFavTabList> result) {
            List listE;
            List<CollectionFavTab> tab_list;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31806, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (this.f83913b.invoke().booleanValue()) {
                CollectionFavTabList result2 = result.getResult();
                if (result2 == null || (tab_list = result2.getTab_list()) == null || (listE = CollectionsKt___CollectionsKt.n2(tab_list)) == null) {
                    listE = CollectionsKt__CollectionsKt.E();
                }
                this.f83914c.f83911d.r(new UiState.Success(listE));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31807, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CollectionFavTabList>) obj);
        }
    }

    public h() {
        i0<UiState<List<CollectionFavTab>>> i0Var = new i0<>(UiState.Loading.f66632b);
        this.f83911d = i0Var;
        this.f83912e = i0Var;
    }

    @dl.d
    public final LiveData<UiState<List<CollectionFavTab>>> h() {
        return this.f83912e;
    }

    public final void i(@dl.d yh.a<Boolean> activeChecker) {
        if (PatchProxy.proxy(new Object[]{activeChecker}, this, changeQuickRedirect, false, 31804, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activeChecker, "activeChecker");
        this.f83911d.o(UiState.Loading.f66632b);
        c((a) com.max.xiaoheihe.network.i.a().n9().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(activeChecker, this)));
    }
}
