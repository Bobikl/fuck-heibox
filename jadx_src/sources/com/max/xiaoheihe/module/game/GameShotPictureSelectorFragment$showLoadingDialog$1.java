package com.max.xiaoheihe.module.game;

import android.app.Activity;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment$showLoadingDialog$1", f = "GameShotPictureSelectorFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GameShotPictureSelectorFragment$showLoadingDialog$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f84836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ GameShotPictureSelectorFragment f84837c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameShotPictureSelectorFragment$showLoadingDialog$1(GameShotPictureSelectorFragment gameShotPictureSelectorFragment, kotlin.coroutines.c<? super GameShotPictureSelectorFragment$showLoadingDialog$1> cVar) {
        super(2, cVar);
        this.f84837c = gameShotPictureSelectorFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 33777, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new GameShotPictureSelectorFragment$showLoadingDialog$1(this.f84837c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33779, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33778, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GameShotPictureSelectorFragment$showLoadingDialog$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        LoadingDialog loadingDialog;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33776, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f84836b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        if (this.f84837c.f84776m == null) {
            GameShotPictureSelectorFragment gameShotPictureSelectorFragment = this.f84837c;
            Activity mContext = ((com.max.hbcommon.base.d) gameShotPictureSelectorFragment).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            gameShotPictureSelectorFragment.f84776m = new LoadingDialog(mContext, "");
        }
        LoadingDialog loadingDialog2 = this.f84837c.f84776m;
        kotlin.jvm.internal.f0.m(loadingDialog2);
        if (!loadingDialog2.i() && (loadingDialog = this.f84837c.f84776m) != null) {
            loadingDialog.r();
        }
        return kotlin.b2.f124493a;
    }
}
