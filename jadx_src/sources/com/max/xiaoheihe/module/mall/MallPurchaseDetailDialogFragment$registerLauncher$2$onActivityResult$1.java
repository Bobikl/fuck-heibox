package com.max.xiaoheihe.module.mall;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment$registerLauncher$2$onActivityResult$1", f = "MallPurchaseDetailDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MallPurchaseDetailDialogFragment$registerLauncher$2$onActivityResult$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f89786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ MallPurchaseDetailDialogFragment f89787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MallPurchaseDetailDialogFragment$registerLauncher$2$onActivityResult$1(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, kotlin.coroutines.c<? super MallPurchaseDetailDialogFragment$registerLauncher$2$onActivityResult$1> cVar) {
        super(2, cVar);
        this.f89787c = mallPurchaseDetailDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 40602, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new MallPurchaseDetailDialogFragment$registerLauncher$2$onActivityResult$1(this.f89787c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 40604, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 40603, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((MallPurchaseDetailDialogFragment$registerLauncher$2$onActivityResult$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40601, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f89786b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        if (this.f89787c.f89697w != null) {
            MallPurchaseDetailDialogFragment.K4(this.f89787c);
        }
        return b2.f124493a;
    }
}
