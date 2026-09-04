package com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel;

import com.max.hbcommon.base.UiState;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialItem;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.q0;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: GameMaterialListViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialListViewModel$requestData$1", f = "GameMaterialListViewModel.kt", i = {0, 1}, l = {87, 89, 95}, m = "invokeSuspend", n = {"havaList", "havaList"}, s = {"I$0", "I$0"})
public final class GameMaterialListViewModel$requestData$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f87685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f87686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ GameMaterialListViewModel f87687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f87688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f87689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f87690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f87691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f87692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f87693j;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialListViewModel$requestData$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: GameMaterialListViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialListViewModel$requestData$1$1", f = "GameMaterialListViewModel.kt", i = {}, l = {93, 94}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements q<kotlinx.coroutines.flow.f<? super Result<GameMaterialListObj>>, Throwable, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f87694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f87695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameMaterialListViewModel f87696d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GameMaterialListViewModel gameMaterialListViewModel, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.f87696d = gameMaterialListViewModel;
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.f<? super Result<GameMaterialListObj>> fVar, Throwable th2, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, th2, cVar}, this, changeQuickRedirect, false, 37866, new Class[]{Object.class, Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(fVar, th2, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.flow.f<? super Result<GameMaterialListObj>> fVar, @dl.d Throwable th2, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, th2, cVar}, this, changeQuickRedirect, false, 37865, new Class[]{kotlinx.coroutines.flow.f.class, Throwable.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f87696d, cVar);
            anonymousClass1.f87695c = th2;
            return anonymousClass1.invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37864, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f87694b;
            if (i10 != 0) {
                if (i10 == 1) {
                    t0.n(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                return b2.f124493a;
            }
            t0.n(obj);
            Throwable th2 = (Throwable) this.f87695c;
            j jVar = this.f87696d.f87654o;
            UiState.Error error = new UiState.Error(th2);
            this.f87694b = 1;
            if (jVar.emit(error, this) == objH) {
                return objH;
            }
            i iVar = this.f87696d.f87645f;
            Boolean boolA = kotlin.coroutines.jvm.internal.a.a(true);
            this.f87694b = 2;
            if (iVar.emit(boolA, this) == objH) {
                return objH;
            }
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialListViewModel$requestData$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: GameMaterialListViewModel.kt */
    public static final class AnonymousClass2 implements kotlinx.coroutines.flow.f<Result<GameMaterialListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameMaterialListViewModel f87697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f87698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f87699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f87700e;

        AnonymousClass2(GameMaterialListViewModel gameMaterialListViewModel, int i10, int i11, boolean z10) {
            this.f87697b = gameMaterialListViewModel;
            this.f87698c = i10;
            this.f87699d = i11;
            this.f87700e = z10;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003f  */
        @dl.e
        public final Object a(@dl.d Result<GameMaterialListObj> result, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
            GameMaterialListViewModel$requestData$1$2$emit$1 gameMaterialListViewModel$requestData$1$2$emit$1;
            AnonymousClass2 anonymousClass2;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result, cVar}, this, changeQuickRedirect, false, 37867, new Class[]{Result.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            if (cVar instanceof GameMaterialListViewModel$requestData$1$2$emit$1) {
                gameMaterialListViewModel$requestData$1$2$emit$1 = (GameMaterialListViewModel$requestData$1$2$emit$1) cVar;
                int i10 = gameMaterialListViewModel$requestData$1$2$emit$1.f87704e;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    gameMaterialListViewModel$requestData$1$2$emit$1.f87704e = i10 - Integer.MIN_VALUE;
                } else {
                    gameMaterialListViewModel$requestData$1$2$emit$1 = new GameMaterialListViewModel$requestData$1$2$emit$1(this, cVar);
                }
            } else {
                gameMaterialListViewModel$requestData$1$2$emit$1 = new GameMaterialListViewModel$requestData$1$2$emit$1(this, cVar);
            }
            Object obj = gameMaterialListViewModel$requestData$1$2$emit$1.f87702c;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = gameMaterialListViewModel$requestData$1$2$emit$1.f87704e;
            if (i11 != 0) {
                if (i11 == 1) {
                    anonymousClass2 = (AnonymousClass2) gameMaterialListViewModel$requestData$1$2$emit$1.f87701b;
                    t0.n(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                return b2.f124493a;
            }
            t0.n(obj);
            j jVar = this.f87697b.f87654o;
            ArrayList arrayList = new ArrayList();
            List materialList = result.getResult().getMaterialList();
            if (materialList == null) {
                materialList = CollectionsKt__CollectionsKt.E();
            }
            arrayList.addAll(materialList);
            Boolean hasMore = result.getResult().getHasMore();
            UiState.Success success = new UiState.Success(new c(arrayList, hasMore != null ? hasMore.booleanValue() : true, this.f87698c + this.f87699d, this.f87700e, result.getResult().getHashTag()));
            gameMaterialListViewModel$requestData$1$2$emit$1.f87701b = this;
            gameMaterialListViewModel$requestData$1$2$emit$1.f87704e = 1;
            if (jVar.emit(success, gameMaterialListViewModel$requestData$1$2$emit$1) == objH) {
                return objH;
            }
            anonymousClass2 = this;
            i iVar = anonymousClass2.f87697b.f87645f;
            Boolean boolA = kotlin.coroutines.jvm.internal.a.a(true);
            gameMaterialListViewModel$requestData$1$2$emit$1.f87701b = null;
            gameMaterialListViewModel$requestData$1$2$emit$1.f87704e = 2;
            if (iVar.emit(boolA, gameMaterialListViewModel$requestData$1$2$emit$1) == objH) {
                return objH;
            }
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Result<GameMaterialListObj> result, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result, cVar}, this, changeQuickRedirect, false, 37868, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(result, cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameMaterialListViewModel$requestData$1(GameMaterialListViewModel gameMaterialListViewModel, String str, String str2, String str3, String str4, int i10, int i11, kotlin.coroutines.c<? super GameMaterialListViewModel$requestData$1> cVar) {
        super(2, cVar);
        this.f87687d = gameMaterialListViewModel;
        this.f87688e = str;
        this.f87689f = str2;
        this.f87690g = str3;
        this.f87691h = str4;
        this.f87692i = i10;
        this.f87693j = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37861, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new GameMaterialListViewModel$requestData$1(this.f87687d, this.f87688e, this.f87689f, this.f87690g, this.f87691h, this.f87692i, this.f87693j, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37863, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37862, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GameMaterialListViewModel$requestData$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        int i10;
        List<GameMaterialItem> listH;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37860, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = this.f87686c;
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2) {
                i10 = this.f87685b;
                t0.n(obj);
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        UiState<c> value = this.f87687d.v().getValue();
        i10 = (!(value instanceof UiState.Success) || (listH = ((c) ((UiState.Success) value).d()).h()) == null) ? 0 : !listH.isEmpty() ? 1 : 0;
        if (i10 != 0) {
            i iVar = this.f87687d.f87647h;
            Boolean boolA = kotlin.coroutines.jvm.internal.a.a(true);
            this.f87685b = i10;
            this.f87686c = 1;
            if (iVar.emit(boolA, this) == objH) {
                return objH;
            }
        } else {
            j jVar = this.f87687d.f87654o;
            UiState.Loading loading = UiState.Loading.f66632b;
            this.f87685b = i10;
            this.f87686c = 2;
            if (jVar.emit(loading, this) == objH) {
                return objH;
            }
        }
        kotlinx.coroutines.flow.e eVarU = g.u(this.f87687d.u().b(this.f87688e, this.f87689f, this.f87690g, this.f87691h, this.f87692i, this.f87693j), new AnonymousClass1(this.f87687d, null));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f87687d, this.f87692i, this.f87693j, i10 != 0);
        this.f87686c = 3;
        if (eVarU.a(anonymousClass2, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
