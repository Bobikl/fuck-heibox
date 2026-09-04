package com.max.xiaoheihe.module.voice.component;

import com.max.hbutils.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.s0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HeyboxMicService.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.voice.component.HeyboxMicService$handleSeekbarProgressChanged$1", f = "HeyboxMicService.kt", i = {}, l = {bb.c.b.f30987v3}, m = "invokeSuspend", n = {}, s = {})
public final class HeyboxMicService$handleSeekbarProgressChanged$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ HeyboxMicService f94040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f94041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeyboxMicService$handleSeekbarProgressChanged$1(HeyboxMicService heyboxMicService, int i10, kotlin.coroutines.c<? super HeyboxMicService$handleSeekbarProgressChanged$1> cVar) {
        super(2, cVar);
        this.f94040c = heyboxMicService;
        this.f94041d = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46746, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new HeyboxMicService$handleSeekbarProgressChanged$1(this.f94040c, this.f94041d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46748, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46747, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HeyboxMicService$handleSeekbarProgressChanged$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46745, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f94039b;
        if (i10 == 0) {
            t0.n(obj);
            HeyboxMicService heyboxMicService = this.f94040c;
            String strP = k.p(s0.W(c1.a("type", a.f94101q), c1.a("value", kotlin.coroutines.jvm.internal.a.f(this.f94041d))));
            f0.o(strP, "serialize(\n             …      )\n                )");
            this.f94039b = 1;
            if (HeyboxMicService.p(heyboxMicService, strP, this) == objH) {
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
