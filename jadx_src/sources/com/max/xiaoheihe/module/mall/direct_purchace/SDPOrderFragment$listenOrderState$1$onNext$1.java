package com.max.xiaoheihe.module.mall.direct_purchace;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: SDPOrderFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.xiaoheihe.module.mall.direct_purchace.SDPOrderFragment$listenOrderState$1$onNext$1", f = "SDPOrderFragment.kt", i = {}, l = {c.b.D2, c.b.E2}, m = "invokeSuspend", n = {}, s = {})
public final class SDPOrderFragment$listenOrderState$1$onNext$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f90597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f90598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SDPOrderFragment f90599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f90600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f90601f;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.direct_purchace.SDPOrderFragment$listenOrderState$1$onNext$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    @d(c = "com.max.xiaoheihe.module.mall.direct_purchace.SDPOrderFragment$listenOrderState$1$onNext$1$1", f = "SDPOrderFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f90602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SDPOrderFragment f90603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f90604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f90605e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SDPOrderFragment sDPOrderFragment, int i10, String str, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f90603c = sDPOrderFragment;
            this.f90604d = i10;
            this.f90605e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 41955, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f90603c, this.f90604d, this.f90605e, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 41957, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 41956, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41954, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            b.h();
            if (this.f90602b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            SDPOrderFragment.P3(this.f90603c, this.f90604d + 1, this.f90605e);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SDPOrderFragment$listenOrderState$1$onNext$1(long j10, SDPOrderFragment sDPOrderFragment, int i10, String str, kotlin.coroutines.c<? super SDPOrderFragment$listenOrderState$1$onNext$1> cVar) {
        super(2, cVar);
        this.f90598c = j10;
        this.f90599d = sDPOrderFragment;
        this.f90600e = i10;
        this.f90601f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 41951, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new SDPOrderFragment$listenOrderState$1$onNext$1(this.f90598c, this.f90599d, this.f90600e, this.f90601f, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 41953, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 41952, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((SDPOrderFragment$listenOrderState$1$onNext$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41950, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f90597b;
        if (i10 != 0) {
            if (i10 == 1) {
                t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        long j10 = this.f90598c;
        this.f90597b = 1;
        if (DelayKt.b(j10, this) == objH) {
            return objH;
        }
        n2 n2VarE = e1.e();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f90599d, this.f90600e, this.f90601f, null);
        this.f90597b = 2;
        if (i.h(n2VarE, anonymousClass1, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
