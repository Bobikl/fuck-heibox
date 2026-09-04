package com.max.hbcommon.analytics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.AnalyticsConfig;
import java.io.File;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: AccelWorldFile.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.analytics.AccelWorldFileKt$fastRefreshFile$1$1$1", f = "AccelWorldFile.kt", i = {0}, l = {20, 24}, m = "invokeSuspend", n = {AnalyticsConfig.RTD_START_TIME}, s = {"J$0"})
public final class AccelWorldFileKt$fastRefreshFile$1$1$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f66491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f66492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f66493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ n.a f66494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f66495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f66496g;

    /* JADX INFO: renamed from: com.max.hbcommon.analytics.AccelWorldFileKt$fastRefreshFile$1$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: AccelWorldFile.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.analytics.AccelWorldFileKt$fastRefreshFile$1$1$1$1", f = "AccelWorldFile.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f66497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n.a f66498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f66499d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f66500e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f66501f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(n.a aVar, long j10, String str, String str2, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f66498c = aVar;
            this.f66499d = j10;
            this.f66500e = str;
            this.f66501f = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.b.mr, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f66498c, this.f66499d, this.f66500e, this.f66501f, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.or, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.nr, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.lr, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f66497b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            this.f66498c.a(this.f66499d, this.f66500e, this.f66501f);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccelWorldFileKt$fastRefreshFile$1$1$1(String str, n.a aVar, long j10, String str2, kotlin.coroutines.c<? super AccelWorldFileKt$fastRefreshFile$1$1$1> cVar) {
        super(2, cVar);
        this.f66493d = str;
        this.f66494e = aVar;
        this.f66495f = j10;
        this.f66496g = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.b.ir, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AccelWorldFileKt$fastRefreshFile$1$1$1(this.f66493d, this.f66494e, this.f66495f, this.f66496g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.kr, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.jr, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AccelWorldFileKt$fastRefreshFile$1$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0069 -> B:22:0x006c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        long jCurrentTimeMillis;
        File file;
        AccelWorldFileKt$fastRefreshFile$1$1$1 accelWorldFileKt$fastRefreshFile$1$1$1;
        n2 n2VarE;
        AnonymousClass1 anonymousClass1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.hr, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f66492c;
        if (i10 == 0) {
            t0.n(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            file = new File(this.f66493d);
            accelWorldFileKt$fastRefreshFile$1$1$1 = this;
            if (file.exists()) {
            }
            if (file.exists()) {
                n2VarE = e1.e();
                anonymousClass1 = new AnonymousClass1(accelWorldFileKt$fastRefreshFile$1$1$1.f66494e, accelWorldFileKt$fastRefreshFile$1$1$1.f66495f, accelWorldFileKt$fastRefreshFile$1$1$1.f66496g, accelWorldFileKt$fastRefreshFile$1$1$1.f66493d, null);
                accelWorldFileKt$fastRefreshFile$1$1$1.f66492c = 2;
                if (kotlinx.coroutines.i.h(n2VarE, anonymousClass1, accelWorldFileKt$fastRefreshFile$1$1$1) == objH) {
                    return objH;
                }
            }
        } else if (i10 == 1) {
            jCurrentTimeMillis = this.f66491b;
            t0.n(obj);
            accelWorldFileKt$fastRefreshFile$1$1$1 = this;
            file = new File(accelWorldFileKt$fastRefreshFile$1$1$1.f66493d);
            if (file.exists() && System.currentTimeMillis() - jCurrentTimeMillis < 300) {
                accelWorldFileKt$fastRefreshFile$1$1$1.f66491b = jCurrentTimeMillis;
                accelWorldFileKt$fastRefreshFile$1$1$1.f66492c = 1;
                if (DelayKt.b(1L, accelWorldFileKt$fastRefreshFile$1$1$1) == objH) {
                    return objH;
                }
                file = new File(accelWorldFileKt$fastRefreshFile$1$1$1.f66493d);
                if (file.exists()) {
                }
                if (file.exists()) {
                    n2VarE = e1.e();
                    anonymousClass1 = new AnonymousClass1(accelWorldFileKt$fastRefreshFile$1$1$1.f66494e, accelWorldFileKt$fastRefreshFile$1$1$1.f66495f, accelWorldFileKt$fastRefreshFile$1$1$1.f66496g, accelWorldFileKt$fastRefreshFile$1$1$1.f66493d, null);
                    accelWorldFileKt$fastRefreshFile$1$1$1.f66492c = 2;
                    if (kotlinx.coroutines.i.h(n2VarE, anonymousClass1, accelWorldFileKt$fastRefreshFile$1$1$1) == objH) {
                        return objH;
                    }
                }
            } else if (file.exists()) {
                n2VarE = e1.e();
                anonymousClass1 = new AnonymousClass1(accelWorldFileKt$fastRefreshFile$1$1$1.f66494e, accelWorldFileKt$fastRefreshFile$1$1$1.f66495f, accelWorldFileKt$fastRefreshFile$1$1$1.f66496g, accelWorldFileKt$fastRefreshFile$1$1$1.f66493d, null);
                accelWorldFileKt$fastRefreshFile$1$1$1.f66492c = 2;
                if (kotlinx.coroutines.i.h(n2VarE, anonymousClass1, accelWorldFileKt$fastRefreshFile$1$1$1) == objH) {
                    return objH;
                }
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
