package com.max.xiaoheihe.module.game;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: SteamBindActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.SteamBindActivity$initWebFragment$1$onPageFinished$1$1", f = "SteamBindActivity.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
public final class SteamBindActivity$initWebFragment$1$onPageFinished$1$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f85391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SteamBindActivity f85392c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SteamBindActivity$initWebFragment$1$onPageFinished$1$1(SteamBindActivity steamBindActivity, kotlin.coroutines.c<? super SteamBindActivity$initWebFragment$1$onPageFinished$1$1> cVar) {
        super(2, cVar);
        this.f85392c = steamBindActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 35165, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new SteamBindActivity$initWebFragment$1$onPageFinished$1$1(this.f85392c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 35167, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 35166, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((SteamBindActivity$initWebFragment$1$onPageFinished$1$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35164, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f85391b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            this.f85391b = 1;
            if (DelayKt.b(1000L, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        if (this.f85392c.isActive()) {
            SteamBindActivity.R1(this.f85392c);
        }
        return kotlin.b2.f124493a;
    }
}
