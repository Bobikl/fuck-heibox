package com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel;

import com.max.hbcommon.base.UiState;
import com.max.hbutils.bean.Result;
import com.max.heybox.hblog.g;
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
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.q0;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: GameMaterialListViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialListViewModel$loadMore$1", f = "GameMaterialListViewModel.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
public final class GameMaterialListViewModel$loadMore$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f87666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ GameMaterialListViewModel f87667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f87668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f87669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f87670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f87671g;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialListViewModel$loadMore$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: GameMaterialListViewModel.kt */
    @t0({"SMAP\nGameMaterialListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMaterialListViewModel.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/viewmodel/GameMaterialListViewModel$loadMore$1$1\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,254:1\n30#2:255\n5#2,2:256\n22#2:258\n7#2:259\n*S KotlinDebug\n*F\n+ 1 GameMaterialListViewModel.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/viewmodel/GameMaterialListViewModel$loadMore$1$1\n*L\n134#1:255\n134#1:256,2\n134#1:258\n134#1:259\n*E\n"})
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialListViewModel$loadMore$1$1", f = "GameMaterialListViewModel.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements q<kotlinx.coroutines.flow.f<? super Result<GameMaterialListObj>>, Throwable, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f87672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f87673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f87674d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ GameMaterialListViewModel f87675e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GameMaterialListViewModel gameMaterialListViewModel, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.f87675e = gameMaterialListViewModel;
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.f<? super Result<GameMaterialListObj>> fVar, Throwable th2, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, th2, cVar}, this, changeQuickRedirect, false, 37848, new Class[]{Object.class, Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(fVar, th2, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.flow.f<? super Result<GameMaterialListObj>> fVar, @dl.d Throwable th2, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, th2, cVar}, this, changeQuickRedirect, false, 37847, new Class[]{kotlinx.coroutines.flow.f.class, Throwable.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f87675e, cVar);
            anonymousClass1.f87673c = fVar;
            anonymousClass1.f87674d = th2;
            return anonymousClass1.invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            String name;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37846, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f87672b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                String str = "loadMore, error, it = " + ((Throwable) this.f87674d);
                g.a aVar = g.f74531b;
                StringBuilder sb2 = new StringBuilder();
                if (kotlinx.coroutines.flow.f.class.isAnonymousClass()) {
                    name = kotlinx.coroutines.flow.f.class.getName();
                    f0.m(name);
                } else {
                    name = kotlinx.coroutines.flow.f.class.getSimpleName();
                    f0.m(name);
                }
                sb2.append(name);
                sb2.append(", ");
                sb2.append(str);
                aVar.v(sb2.toString());
                i iVar = this.f87675e.f87645f;
                Boolean boolA = kotlin.coroutines.jvm.internal.a.a(true);
                this.f87673c = null;
                this.f87672b = 1;
                if (iVar.emit(boolA, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    /* JADX INFO: compiled from: GameMaterialListViewModel.kt */
    @t0({"SMAP\nGameMaterialListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMaterialListViewModel.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/viewmodel/GameMaterialListViewModel$loadMore$1$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,254:1\n230#2,5:255\n*S KotlinDebug\n*F\n+ 1 GameMaterialListViewModel.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/viewmodel/GameMaterialListViewModel$loadMore$1$2\n*L\n137#1:255,5\n*E\n"})
    public static final class a implements kotlinx.coroutines.flow.f<Result<GameMaterialListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameMaterialListViewModel f87676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f87677c;

        a(GameMaterialListViewModel gameMaterialListViewModel, int i10) {
            this.f87676b = gameMaterialListViewModel;
            this.f87677c = i10;
        }

        @dl.e
        public final Object a(@dl.d Result<GameMaterialListObj> result, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            Object value;
            UiState success;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result, cVar}, this, changeQuickRedirect, false, 37849, new Class[]{Result.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            j jVar = this.f87676b.f87654o;
            int i10 = this.f87677c;
            do {
                value = jVar.getValue();
                success = (UiState) value;
                if (success instanceof UiState.Success) {
                    ArrayList arrayList = new ArrayList();
                    UiState.Success success2 = (UiState.Success) success;
                    List<GameMaterialItem> listH = ((c) success2.d()).h();
                    if (listH == null) {
                        listH = CollectionsKt__CollectionsKt.E();
                    }
                    arrayList.addAll(listH);
                    List materialList = result.getResult().getMaterialList();
                    if (materialList == null) {
                        materialList = CollectionsKt__CollectionsKt.E();
                    }
                    arrayList.addAll(materialList);
                    int i11 = i10 + 30;
                    Boolean hasMore = result.getResult().getHasMore();
                    success = new UiState.Success(new c(arrayList, hasMore != null ? hasMore.booleanValue() : true, i11, false, ((c) success2.d()).j(), 8, null));
                }
            } while (!jVar.compareAndSet(value, success));
            Object objEmit = this.f87676b.f87645f.emit(kotlin.coroutines.jvm.internal.a.a(true), cVar);
            return objEmit == kotlin.coroutines.intrinsics.b.h() ? objEmit : b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Result<GameMaterialListObj> result, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result, cVar}, this, changeQuickRedirect, false, 37850, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(result, cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameMaterialListViewModel$loadMore$1(GameMaterialListViewModel gameMaterialListViewModel, String str, String str2, String str3, String str4, kotlin.coroutines.c<? super GameMaterialListViewModel$loadMore$1> cVar) {
        super(2, cVar);
        this.f87667c = gameMaterialListViewModel;
        this.f87668d = str;
        this.f87669e = str2;
        this.f87670f = str3;
        this.f87671g = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37843, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new GameMaterialListViewModel$loadMore$1(this.f87667c, this.f87668d, this.f87669e, this.f87670f, this.f87671g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37845, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37844, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GameMaterialListViewModel$loadMore$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37842, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f87666b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            UiState uiState = (UiState) this.f87667c.f87654o.getValue();
            int iK = uiState instanceof UiState.Success ? ((c) ((UiState.Success) uiState).d()).k() : 0;
            kotlinx.coroutines.flow.e eVarU = kotlinx.coroutines.flow.g.u(this.f87667c.u().b(this.f87668d, this.f87669e, this.f87670f, this.f87671g, iK, 30), new AnonymousClass1(this.f87667c, null));
            a aVar = new a(this.f87667c, iK);
            this.f87666b = 1;
            if (eVarU.a(aVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return b2.f124493a;
    }
}
