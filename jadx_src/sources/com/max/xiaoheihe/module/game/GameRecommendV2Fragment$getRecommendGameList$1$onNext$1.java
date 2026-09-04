package com.max.xiaoheihe.module.game;

import com.max.hbcommon.base.adapter.BigBrotherAdapterWrapper;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendV2Result;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: GameRecommendV2Fragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.GameRecommendV2Fragment$getRecommendGameList$1$onNext$1", f = "GameRecommendV2Fragment.kt", i = {}, l = {253}, m = "invokeSuspend", n = {}, s = {})
public final class GameRecommendV2Fragment$getRecommendGameList$1$onNext$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f84653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ GameRecommendV2Fragment f84654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f84655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Result<GameRecommendV2Result> f84656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f84657f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameRecommendV2Fragment$getRecommendGameList$1$onNext$1(GameRecommendV2Fragment gameRecommendV2Fragment, boolean z10, Result<GameRecommendV2Result> result, boolean z11, kotlin.coroutines.c<? super GameRecommendV2Fragment$getRecommendGameList$1$onNext$1> cVar) {
        super(2, cVar);
        this.f84654c = gameRecommendV2Fragment;
        this.f84655d = z10;
        this.f84656e = result;
        this.f84657f = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 33522, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new GameRecommendV2Fragment$getRecommendGameList$1$onNext$1(this.f84654c, this.f84655d, this.f84656e, this.f84657f, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33524, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33523, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GameRecommendV2Fragment$getRecommendGameList$1$onNext$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33521, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f84653b;
        try {
            if (i10 == 0) {
                kotlin.t0.n(obj);
                GameRecommendV2Fragment gameRecommendV2Fragment = this.f84654c;
                boolean z10 = this.f84655d;
                Result<GameRecommendV2Result> result = this.f84656e;
                boolean z11 = this.f84657f;
                this.f84653b = 1;
                if (gameRecommendV2Fragment.q4(z10, result, z11, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
        } catch (Exception e10) {
            com.max.heybox.hblog.g.f74531b.w("GameRecommendV2Fragment", e10);
            GameRecommendV2Fragment.i4(this.f84654c);
            BigBrotherAdapterWrapper bigBrotherAdapterWrapper = this.f84654c.f84634d;
            if (bigBrotherAdapterWrapper == null) {
                kotlin.jvm.internal.f0.S("mBBAdapter");
                bigBrotherAdapterWrapper = null;
            }
            bigBrotherAdapterWrapper.F();
        }
        GameRecommendV2Fragment.N3(this.f84654c);
        return kotlin.b2.f124493a;
    }
}
