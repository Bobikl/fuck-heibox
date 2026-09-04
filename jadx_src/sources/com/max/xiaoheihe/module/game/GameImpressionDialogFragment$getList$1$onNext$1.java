package com.max.xiaoheihe.module.game;

import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.game.vote.VoteQuestionListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: GameImpressionDialogFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.GameImpressionDialogFragment$getList$1$onNext$1", f = "GameImpressionDialogFragment.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
public final class GameImpressionDialogFragment$getList$1$onNext$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f84481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ GameImpressionDialogFragment f84482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Result<VoteQuestionListObj> f84483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameImpressionDialogFragment$getList$1$onNext$1(GameImpressionDialogFragment gameImpressionDialogFragment, Result<VoteQuestionListObj> result, kotlin.coroutines.c<? super GameImpressionDialogFragment$getList$1$onNext$1> cVar) {
        super(2, cVar);
        this.f84482c = gameImpressionDialogFragment;
        this.f84483d = result;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 33193, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new GameImpressionDialogFragment$getList$1$onNext$1(this.f84482c, this.f84483d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33195, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33194, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GameImpressionDialogFragment$getList$1$onNext$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33192, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f84481b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            long jMax = Math.max(0L, ((long) 250) - (System.currentTimeMillis() - this.f84482c.c4()));
            this.f84481b = 1;
            if (DelayKt.b(jMax, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        CircularProgressIndicator circularProgressIndicator = this.f84482c.f84474m;
        if (circularProgressIndicator == null) {
            kotlin.jvm.internal.f0.S("loading_progress");
            circularProgressIndicator = null;
        }
        circularProgressIndicator.j();
        GameImpressionDialogFragment gameImpressionDialogFragment = this.f84482c;
        VoteQuestionListObj result = this.f84483d.getResult();
        GameImpressionDialogFragment.V3(gameImpressionDialogFragment, result != null ? result.getQuestion_list() : null);
        return kotlin.b2.f124493a;
    }
}
