package com.max.xiaoheihe.accelworld;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import com.max.xiaoheihe.module.account.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: AccelWorldScreenShot.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.accelworld.AccelWorldScreenShotKt$fastHandleScreenShot$1$1", f = "AccelWorldScreenShot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AccelWorldScreenShotKt$fastHandleScreenShot$1$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f76458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Activity f76459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f76460d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccelWorldScreenShotKt$fastHandleScreenShot$1$1(Activity activity, String str, kotlin.coroutines.c<? super AccelWorldScreenShotKt$fastHandleScreenShot$1$1> cVar) {
        super(2, cVar);
        this.f76459c = activity;
        this.f76460d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Kx, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AccelWorldScreenShotKt$fastHandleScreenShot$1$1(this.f76459c, this.f76460d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Mx, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Lx, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AccelWorldScreenShotKt$fastHandleScreenShot$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Jx, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f76458b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        if (!this.f76459c.isFinishing()) {
            ComponentCallbacks2 componentCallbacks2 = this.f76459c;
            f0.n(componentCallbacks2, "null cannot be cast to non-null type com.max.xiaoheihe.module.account.SystemScreenShotListener");
            ((p0) componentCallbacks2).P1(this.f76460d);
        }
        return b2.f124493a;
    }
}
