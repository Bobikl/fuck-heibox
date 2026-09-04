package com.starlightc.ucropplus.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: UCropPlusFragment.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusFragment$initViews$2$doAction$1", f = "UCropPlusFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UCropPlusFragment$initViews$2$doAction$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ Object $param;
    int label;
    final /* synthetic */ UCropPlusFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UCropPlusFragment$initViews$2$doAction$1(Object obj, UCropPlusFragment uCropPlusFragment, kotlin.coroutines.c<? super UCropPlusFragment$initViews$2$doAction$1> cVar) {
        super(2, cVar);
        this.$param = obj;
        this.this$0 = uCropPlusFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 50829, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new UCropPlusFragment$initViews$2$doAction$1(this.$param, this.this$0, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50831, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 50830, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((UCropPlusFragment$initViews$2$doAction$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50828, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        Object obj2 = this.$param;
        if ((obj2 instanceof Float) && !kotlin.jvm.internal.f0.e((Float) obj2, 0.0f)) {
            UCropPlusFragment.access$checkRatio(this.this$0, (Float) this.$param);
        }
        return b2.f124493a;
    }
}
