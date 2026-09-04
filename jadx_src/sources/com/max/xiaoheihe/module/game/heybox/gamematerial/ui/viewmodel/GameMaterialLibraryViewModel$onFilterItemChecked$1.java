package com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: GameMaterialLibraryViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameMaterialLibraryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMaterialLibraryViewModel.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/viewmodel/GameMaterialLibraryViewModel$onFilterItemChecked$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,131:1\n230#2,5:132\n*S KotlinDebug\n*F\n+ 1 GameMaterialLibraryViewModel.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/viewmodel/GameMaterialLibraryViewModel$onFilterItemChecked$1\n*L\n73#1:132,5\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialLibraryViewModel$onFilterItemChecked$1", f = "GameMaterialLibraryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GameMaterialLibraryViewModel$onFilterItemChecked$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f87631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ GameMaterialLibraryViewModel f87632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f87633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f87634e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameMaterialLibraryViewModel$onFilterItemChecked$1(GameMaterialLibraryViewModel gameMaterialLibraryViewModel, int i10, int i11, kotlin.coroutines.c<? super GameMaterialLibraryViewModel$onFilterItemChecked$1> cVar) {
        super(2, cVar);
        this.f87632c = gameMaterialLibraryViewModel;
        this.f87633d = i10;
        this.f87634e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37806, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new GameMaterialLibraryViewModel$onFilterItemChecked$1(this.f87632c, this.f87633d, this.f87634e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37808, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37807, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GameMaterialLibraryViewModel$onFilterItemChecked$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object value;
        List listT5;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37805, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f87631b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        j jVar = this.f87632c.f87626k;
        int i10 = this.f87633d;
        int i11 = this.f87634e;
        do {
            value = jVar.getValue();
            List list = (List) value;
            listT5 = list != null ? CollectionsKt___CollectionsKt.T5(list) : null;
            if (listT5 != null) {
            }
        } while (!jVar.compareAndSet(value, listT5 != null ? CollectionsKt___CollectionsKt.Q5(listT5) : null));
        return b2.f124493a;
    }
}
