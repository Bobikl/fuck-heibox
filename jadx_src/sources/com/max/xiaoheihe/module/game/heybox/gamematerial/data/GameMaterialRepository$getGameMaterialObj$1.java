package com.max.xiaoheihe.module.game.heybox.gamematerial.data;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.flow.f;
import yh.p;

/* JADX INFO: compiled from: GameMaterialRepository.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.data.GameMaterialRepository$getGameMaterialObj$1", f = "GameMaterialRepository.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
public final class GameMaterialRepository$getGameMaterialObj$1 extends SuspendLambda implements p<f<? super Result<GameMaterialObj>>, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f87467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f87468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f87469d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameMaterialRepository$getGameMaterialObj$1(String str, c<? super GameMaterialRepository$getGameMaterialObj$1> cVar) {
        super(2, cVar);
        this.f87469d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37534, new Class[]{Object.class, c.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        GameMaterialRepository$getGameMaterialObj$1 gameMaterialRepository$getGameMaterialObj$1 = new GameMaterialRepository$getGameMaterialObj$1(this.f87469d, cVar);
        gameMaterialRepository$getGameMaterialObj$1.f87468c = obj;
        return gameMaterialRepository$getGameMaterialObj$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(f<? super Result<GameMaterialObj>> fVar, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 37536, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(fVar, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d f<? super Result<GameMaterialObj>> fVar, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 37535, new Class[]{f.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GameMaterialRepository$getGameMaterialObj$1) create(fVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37533, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f87467b;
        if (i10 == 0) {
            t0.n(obj);
            f fVar = (f) this.f87468c;
            Result<GameMaterialObj> resultA = i.a().kb(this.f87469d).execute().a();
            if (resultA != null) {
                this.f87467b = 1;
                if (fVar.emit(resultA, this) == objH) {
                    return objH;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
