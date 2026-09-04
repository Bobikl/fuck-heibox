package com.max.xiaoheihe.module.littleprogram.fragment.pubg;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.StateObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.va;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGGameDataV2Fragment$getDataUpdateState$1$onNext$1", f = "PUBGGameDataV2Fragment.kt", i = {}, l = {bb.c.b.J4, 404}, m = "invokeSuspend", n = {}, s = {})
public final class PUBGGameDataV2Fragment$getDataUpdateState$1$onNext$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f89251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f89252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PUBGGameDataV2Fragment f89253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Result<StateObj> f89254e;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGGameDataV2Fragment$getDataUpdateState$1$onNext$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    @d(c = "com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGGameDataV2Fragment$getDataUpdateState$1$onNext$1$1", f = "PUBGGameDataV2Fragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f89255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Result<StateObj> f89256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PUBGGameDataV2Fragment f89257d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Result<StateObj> result, PUBGGameDataV2Fragment pUBGGameDataV2Fragment, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f89256c = result;
            this.f89257d = pUBGGameDataV2Fragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39553, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f89256c, this.f89257d, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39555, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39554, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            String btn_desc;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39552, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f89255b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            StateObj result = this.f89256c.getResult();
            va vaVar = null;
            if (result == null || (btn_desc = result.getBtn_desc()) == null) {
                return null;
            }
            va vaVar2 = this.f89257d.K;
            if (vaVar2 == null) {
                f0.S("binding");
            } else {
                vaVar = vaVar2;
            }
            vaVar.f116748p.setText(btn_desc);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PUBGGameDataV2Fragment$getDataUpdateState$1$onNext$1(int i10, PUBGGameDataV2Fragment pUBGGameDataV2Fragment, Result<StateObj> result, kotlin.coroutines.c<? super PUBGGameDataV2Fragment$getDataUpdateState$1$onNext$1> cVar) {
        super(2, cVar);
        this.f89252c = i10;
        this.f89253d = pUBGGameDataV2Fragment;
        this.f89254e = result;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39549, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new PUBGGameDataV2Fragment$getDataUpdateState$1$onNext$1(this.f89252c, this.f89253d, this.f89254e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39551, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39550, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PUBGGameDataV2Fragment$getDataUpdateState$1$onNext$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39548, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f89251b;
        if (i10 != 0) {
            if (i10 == 1) {
                t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            PUBGGameDataV2Fragment.Y4(this.f89253d, this.f89252c + 1);
            return b2.f124493a;
        }
        t0.n(obj);
        n2 n2VarE = e1.e();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f89254e, this.f89253d, null);
        this.f89251b = 1;
        if (i.h(n2VarE, anonymousClass1, this) == objH) {
            return objH;
        }
        long j10 = this.f89252c < 2 ? 1000L : 2000L;
        this.f89251b = 2;
        if (DelayKt.b(j10, this) == objH) {
            return objH;
        }
        PUBGGameDataV2Fragment.Y4(this.f89253d, this.f89252c + 1);
        return b2.f124493a;
    }
}
