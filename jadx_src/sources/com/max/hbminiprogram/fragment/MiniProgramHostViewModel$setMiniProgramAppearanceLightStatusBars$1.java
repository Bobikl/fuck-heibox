package com.max.hbminiprogram.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: MiniProgramHostViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.hbminiprogram.fragment.MiniProgramHostViewModel$setMiniProgramAppearanceLightStatusBars$1", f = "MiniProgramHostViewModel.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
public final class MiniProgramHostViewModel$setMiniProgramAppearanceLightStatusBars$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f71291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ MiniProgramHostViewModel f71292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f71293d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiniProgramHostViewModel$setMiniProgramAppearanceLightStatusBars$1(MiniProgramHostViewModel miniProgramHostViewModel, boolean z10, kotlin.coroutines.c<? super MiniProgramHostViewModel$setMiniProgramAppearanceLightStatusBars$1> cVar) {
        super(2, cVar);
        this.f71292c = miniProgramHostViewModel;
        this.f71293d = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.i.f33297c1, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new MiniProgramHostViewModel$setMiniProgramAppearanceLightStatusBars$1(this.f71292c, this.f71293d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.i.f33309e1, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.i.f33303d1, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((MiniProgramHostViewModel$setMiniProgramAppearanceLightStatusBars$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.i.f33291b1, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f71291b;
        if (i10 == 0) {
            t0.n(obj);
            j jVar = this.f71292c.f71281f;
            Boolean boolA = kotlin.coroutines.jvm.internal.a.a(this.f71293d);
            this.f71291b = 1;
            if (jVar.emit(boolA, this) == objH) {
                return objH;
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
