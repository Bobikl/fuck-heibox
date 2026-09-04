package com.max.xiaoheihe.accelworld;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: AccelWorldLottie.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.accelworld.AccelWorldLottieKt$getCachedLottieComposition$2", f = "AccelWorldLottie.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
public final class AccelWorldLottieKt$getCachedLottieComposition$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super com.airbnb.lottie.g>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f76449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f76450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f76451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccelWorldLottieKt$getCachedLottieComposition$2(String str, kotlin.coroutines.c<? super AccelWorldLottieKt$getCachedLottieComposition$2> cVar) {
        super(2, cVar);
        this.f76451d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Tw, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AccelWorldLottieKt$getCachedLottieComposition$2(this.f76451d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super com.airbnb.lottie.g> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Vw, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super com.airbnb.lottie.g> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Uw, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AccelWorldLottieKt$getCachedLottieComposition$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Sw, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f76450c;
        if (i10 == 0) {
            t0.n(obj);
            String str = this.f76451d;
            this.f76449b = str;
            this.f76450c = 1;
            final kotlin.coroutines.h hVar = new kotlin.coroutines.h(IntrinsicsKt__IntrinsicsJvmKt.d(this));
            AccelWorldLottieKt.g(str, new yh.l<Throwable, b2>() { // from class: com.max.xiaoheihe.accelworld.AccelWorldLottieKt$getCachedLottieComposition$2$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.m.Xw, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.d Throwable it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.m.Ww, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                    kotlin.coroutines.c<com.airbnb.lottie.g> cVar = hVar;
                    Result.a aVar = Result.f124476c;
                    cVar.resumeWith(Result.b(null));
                }
            }, new yh.l<com.airbnb.lottie.g, b2>() { // from class: com.max.xiaoheihe.accelworld.AccelWorldLottieKt$getCachedLottieComposition$2$1$2
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void a(@dl.d com.airbnb.lottie.g lottieComposition) {
                    if (PatchProxy.proxy(new Object[]{lottieComposition}, this, changeQuickRedirect, false, bb.c.m.Yw, new Class[]{com.airbnb.lottie.g.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(lottieComposition, "lottieComposition");
                    kotlin.coroutines.c<com.airbnb.lottie.g> cVar = hVar;
                    Result.a aVar = Result.f124476c;
                    cVar.resumeWith(Result.b(lottieComposition));
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(com.airbnb.lottie.g gVar) {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.m.Zw, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    a(gVar);
                    return b2.f124493a;
                }
            });
            obj = hVar.a();
            if (obj == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(this);
            }
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return obj;
    }
}
