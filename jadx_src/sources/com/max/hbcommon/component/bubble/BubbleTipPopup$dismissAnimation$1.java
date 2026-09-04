package com.max.hbcommon.component.bubble;

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
import yh.p;

/* JADX INFO: compiled from: BubbleTipPopup.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.component.bubble.BubbleTipPopup$dismissAnimation$1", f = "BubbleTipPopup.kt", i = {}, l = {bb.c.b.G7, bb.c.b.H7}, m = "invokeSuspend", n = {}, s = {})
public final class BubbleTipPopup$dismissAnimation$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f67345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f67346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ BubbleTipPopup f67347d;

    /* JADX INFO: renamed from: com.max.hbcommon.component.bubble.BubbleTipPopup$dismissAnimation$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: BubbleTipPopup.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.component.bubble.BubbleTipPopup$dismissAnimation$1$1", f = "BubbleTipPopup.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f67348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BubbleTipPopup f67349c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BubbleTipPopup bubbleTipPopup, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f67349c = bubbleTipPopup;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.d.Al, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f67349c, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.d.Cl, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.d.Bl, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.d.zl, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f67348b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            this.f67349c.G();
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BubbleTipPopup$dismissAnimation$1(long j10, BubbleTipPopup bubbleTipPopup, kotlin.coroutines.c<? super BubbleTipPopup$dismissAnimation$1> cVar) {
        super(2, cVar);
        this.f67346c = j10;
        this.f67347d = bubbleTipPopup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.d.wl, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new BubbleTipPopup$dismissAnimation$1(this.f67346c, this.f67347d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.d.yl, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.d.xl, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((BubbleTipPopup$dismissAnimation$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.d.vl, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f67345b;
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
        long j10 = this.f67346c;
        this.f67345b = 1;
        if (DelayKt.b(j10, this) == objH) {
            return objH;
        }
        n2 n2VarE = e1.e();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f67347d, null);
        this.f67345b = 2;
        if (kotlinx.coroutines.i.h(n2VarE, anonymousClass1, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
