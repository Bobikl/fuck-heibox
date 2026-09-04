package com.max.xiaoheihe.accelworld;

import android.app.Activity;
import com.max.xiaoheihe.RouterActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: AccelWorldString.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.accelworld.AccelWorldStringKt$fastDelayExecuteProtocol$1", f = "AccelWorldString.kt", i = {}, l = {53, 55}, m = "invokeSuspend", n = {}, s = {})
public final class AccelWorldStringKt$fastDelayExecuteProtocol$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f76502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f76503c;

    /* JADX INFO: renamed from: com.max.xiaoheihe.accelworld.AccelWorldStringKt$fastDelayExecuteProtocol$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: AccelWorldString.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.accelworld.AccelWorldStringKt$fastDelayExecuteProtocol$1$1", f = "AccelWorldString.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f76504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76505c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f76505c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Ly, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f76505c, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Ny, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.My, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Ky, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f76504b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            Activity activityA = com.max.hbutils.utils.e.b().a();
            if (activityA != null) {
                com.max.xiaoheihe.base.router.b.k0(activityA, this.f76505c);
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccelWorldStringKt$fastDelayExecuteProtocol$1(String str, kotlin.coroutines.c<? super AccelWorldStringKt$fastDelayExecuteProtocol$1> cVar) {
        super(2, cVar);
        this.f76503c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Hy, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AccelWorldStringKt$fastDelayExecuteProtocol$1(this.f76503c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Jy, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Iy, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AccelWorldStringKt$fastDelayExecuteProtocol$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Gy, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f76502b;
        if (i10 == 0 || i10 == 1) {
            t0.n(obj);
            while (com.max.hbutils.utils.e.b().a() instanceof RouterActivity) {
                this.f76502b = 1;
                if (DelayKt.b(10L, this) == objH) {
                    return objH;
                }
            }
            n2 n2VarE = e1.e();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f76503c, null);
            this.f76502b = 2;
            if (kotlinx.coroutines.i.h(n2VarE, anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
