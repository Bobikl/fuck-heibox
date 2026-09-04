package com.max.xiaoheihe.module.voice.component;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.concurrent.CancellationException;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HeyboxMicService.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.voice.component.HeyboxMicService$handleStopStream$1", f = "HeyboxMicService.kt", i = {}, l = {bb.c.b.O0}, m = "invokeSuspend", n = {}, s = {})
public final class HeyboxMicService$handleStopStream$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ HeyboxMicService f94059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeyboxMicService$handleStopStream$1(HeyboxMicService heyboxMicService, kotlin.coroutines.c<? super HeyboxMicService$handleStopStream$1> cVar) {
        super(2, cVar);
        this.f94059c = heyboxMicService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46766, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new HeyboxMicService$handleStopStream$1(this.f94059c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46768, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46767, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HeyboxMicService$handleStopStream$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46765, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f94058b;
        if (i10 == 0) {
            t0.n(obj);
            this.f94059c.f94019c.h().set(true);
            this.f94059c.f94019c.i().set(true);
            MicAudioManager micAudioManager = this.f94059c.f94026j;
            if (micAudioManager != null) {
                micAudioManager.e();
            }
            com.max.xiaoheihe.module.voice.streaming.a aVar = this.f94059c.f94027k;
            if (aVar != null) {
                aVar.d();
            }
            this.f94058b = 1;
            if (DelayKt.b(1000L, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        d2 d2Var = this.f94059c.f94029m;
        if (d2Var != null) {
            d2Var.e(new CancellationException("handleStopStream"));
        }
        d2 d2Var2 = this.f94059c.f94028l;
        if (d2Var2 == null) {
            return null;
        }
        d2Var2.e(new CancellationException("handleStopStream"));
        return b2.f124493a;
    }
}
