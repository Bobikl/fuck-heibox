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
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.voice.component.HeyboxMicService$stopService$1", f = "HeyboxMicService.kt", i = {}, l = {bb.c.b.W5, bb.c.b.Z5, bb.c.b.f30581d6}, m = "invokeSuspend", n = {}, s = {})
public final class HeyboxMicService$stopService$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ HeyboxMicService f94068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeyboxMicService$stopService$1(HeyboxMicService heyboxMicService, kotlin.coroutines.c<? super HeyboxMicService$stopService$1> cVar) {
        super(2, cVar);
        this.f94068c = heyboxMicService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46778, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new HeyboxMicService$stopService$1(this.f94068c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46780, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46779, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HeyboxMicService$stopService$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        d2 d2Var;
        d2 d2Var2;
        d2 d2Var3;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46777, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f94067b;
        if (i10 != 0) {
            if (i10 == 1) {
                t0.n(obj);
            } else if (i10 == 2) {
                t0.n(obj);
                d2Var = this.f94068c.f94028l;
                if (d2Var == null && d2Var.isActive()) {
                    d2Var2 = this.f94068c.f94028l;
                    if (d2Var2 != null) {
                        d2Var2.e(new CancellationException("stopService"));
                    }
                    d2Var3 = this.f94068c.f94028l;
                    if (d2Var3 != null) {
                        this.f94067b = 3;
                        if (d2Var3.g0(this) == objH) {
                            return objH;
                        }
                    }
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        this.f94067b = 1;
        if (DelayKt.b(1000L, this) == objH) {
            return objH;
        }
        d2 d2Var4 = this.f94068c.f94029m;
        if (d2Var4 != null && d2Var4.isActive()) {
            d2 d2Var5 = this.f94068c.f94029m;
            if (d2Var5 != null) {
                d2Var5.e(new CancellationException("stopService"));
            }
            d2 d2Var6 = this.f94068c.f94029m;
            if (d2Var6 != null) {
                this.f94067b = 2;
                if (d2Var6.g0(this) == objH) {
                    return objH;
                }
            }
        }
        d2Var = this.f94068c.f94028l;
        if (d2Var == null && d2Var.isActive()) {
            d2Var2 = this.f94068c.f94028l;
            if (d2Var2 != null) {
                d2Var2.e(new CancellationException("stopService"));
            }
            d2Var3 = this.f94068c.f94028l;
            if (d2Var3 != null) {
                this.f94067b = 3;
                if (d2Var3.g0(this) == objH) {
                    return objH;
                }
            }
        }
        return b2.f124493a;
    }
}
