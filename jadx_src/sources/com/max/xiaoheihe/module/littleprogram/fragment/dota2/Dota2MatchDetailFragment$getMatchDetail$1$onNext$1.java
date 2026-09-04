package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.game.dota2.Dota2MatchDetailObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import yh.p;

/* JADX INFO: compiled from: Dota2MatchDetailFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2MatchDetailFragment$getMatchDetail$1$onNext$1", f = "Dota2MatchDetailFragment.kt", i = {0}, l = {bb.c.b.E0}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class Dota2MatchDetailFragment$getMatchDetail$1$onNext$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f89010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f89011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Dota2MatchDetailFragment f89012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Result<Dota2MatchDetailObj> f89013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Dota2MatchDetailFragment$getMatchDetail$1$onNext$1(Dota2MatchDetailFragment dota2MatchDetailFragment, Result<Dota2MatchDetailObj> result, kotlin.coroutines.c<? super Dota2MatchDetailFragment$getMatchDetail$1$onNext$1> cVar) {
        super(2, cVar);
        this.f89012d = dota2MatchDetailFragment;
        this.f89013e = result;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39233, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.coroutines.c) patchProxyResultProxy.result;
        }
        Dota2MatchDetailFragment$getMatchDetail$1$onNext$1 dota2MatchDetailFragment$getMatchDetail$1$onNext$1 = new Dota2MatchDetailFragment$getMatchDetail$1$onNext$1(this.f89012d, this.f89013e, cVar);
        dota2MatchDetailFragment$getMatchDetail$1$onNext$1.f89011c = obj;
        return dota2MatchDetailFragment$getMatchDetail$1$onNext$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39235, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39234, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((Dota2MatchDetailFragment$getMatchDetail$1$onNext$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        q0 q0Var;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39232, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f89010b;
        if (i10 == 0) {
            t0.n(obj);
            q0 q0Var2 = (q0) this.f89011c;
            long jCurrentTimeMillis = this.f89012d.f88997z > 0 ? System.currentTimeMillis() - this.f89012d.f88997z : 0L;
            this.f89012d.f88997z = 0L;
            this.f89011c = q0Var2;
            this.f89010b = 1;
            if (DelayKt.b(400 - jCurrentTimeMillis, this) == objH) {
                return objH;
            }
            q0Var = q0Var2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q0Var = (q0) this.f89011c;
            t0.n(obj);
        }
        if (!r0.k(q0Var)) {
            return b2.f124493a;
        }
        this.f89012d.n5(this.f89013e.getResult());
        if (this.f89012d.e5().f111672c.getTabCount() == 0) {
            Dota2MatchDetailFragment.a5(this.f89012d);
        } else {
            b bVarH5 = this.f89012d.h5();
            if (bVarH5 != null) {
                bVarH5.r2(this.f89012d.g5());
            }
        }
        this.f89012d.e5().f111675f.setVisibility(0);
        this.f89012d.e5().f111674e.setVisibility(0);
        this.f89012d.J4().f111334f.setVisibility(8);
        return b2.f124493a;
    }
}
