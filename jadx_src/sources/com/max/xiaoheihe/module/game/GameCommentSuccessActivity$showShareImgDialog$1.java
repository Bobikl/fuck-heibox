package com.max.xiaoheihe.module.game;

import com.max.xiaoheihe.utils.ShareViewUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: GameCommentSuccessActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.GameCommentSuccessActivity$showShareImgDialog$1", f = "GameCommentSuccessActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GameCommentSuccessActivity$showShareImgDialog$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f84139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ GameCommentSuccessActivity f84140c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameCommentSuccessActivity$showShareImgDialog$1(GameCommentSuccessActivity gameCommentSuccessActivity, kotlin.coroutines.c<? super GameCommentSuccessActivity$showShareImgDialog$1> cVar) {
        super(2, cVar);
        this.f84140c = gameCommentSuccessActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 32538, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new GameCommentSuccessActivity$showShareImgDialog$1(this.f84140c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 32540, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 32539, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GameCommentSuccessActivity$showShareImgDialog$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32537, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f84139b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        GameCommentSuccessActivity gameCommentSuccessActivity = this.f84140c;
        ShareViewUtil.h(gameCommentSuccessActivity, gameCommentSuccessActivity.O, com.max.xiaoheihe.utils.i0.j(), this.f84140c.P);
        return kotlin.b2.f124493a;
    }
}
