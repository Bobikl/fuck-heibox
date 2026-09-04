package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: Dota2HeroDetailFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2HeroDetailFragment$getData$1$onNext$1", f = "Dota2HeroDetailFragment.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
public final class Dota2HeroDetailFragment$getData$1$onNext$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f88974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Dota2HeroDetailFragment f88975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Result<GameOverviewListObj> f88976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Dota2HeroDetailFragment$getData$1$onNext$1(Dota2HeroDetailFragment dota2HeroDetailFragment, Result<GameOverviewListObj> result, kotlin.coroutines.c<? super Dota2HeroDetailFragment$getData$1$onNext$1> cVar) {
        super(2, cVar);
        this.f88975c = dota2HeroDetailFragment;
        this.f88976d = result;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39109, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new Dota2HeroDetailFragment$getData$1$onNext$1(this.f88975c, this.f88976d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39111, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39110, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((Dota2HeroDetailFragment$getData$1$onNext$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39108, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f88974b;
        if (i10 == 0) {
            t0.n(obj);
            long jCurrentTimeMillis = this.f88975c.E > 0 ? System.currentTimeMillis() - this.f88975c.E : 0L;
            this.f88975c.E = -1L;
            this.f88974b = 1;
            if (DelayKt.b(400 - jCurrentTimeMillis, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        if (!this.f88975c.isActive()) {
            return b2.f124493a;
        }
        Dota2HeroDetailFragment dota2HeroDetailFragment = this.f88975c;
        GameOverviewListObj result = this.f88976d.getResult();
        Dota2HeroDetailFragment.X4(dota2HeroDetailFragment, result != null ? result.getData_list() : null);
        Dota2HeroDetailFragment dota2HeroDetailFragment2 = this.f88975c;
        GameOverviewListObj result2 = this.f88976d.getResult();
        dota2HeroDetailFragment2.B = result2 != null ? result2.getMatch_id() : null;
        Dota2HeroDetailFragment dota2HeroDetailFragment3 = this.f88975c;
        GameOverviewListObj result3 = this.f88976d.getResult();
        dota2HeroDetailFragment3.C = result3 != null ? result3.getMmr() : null;
        Dota2HeroDetailFragment dota2HeroDetailFragment4 = this.f88975c;
        GameOverviewListObj result4 = this.f88976d.getResult();
        dota2HeroDetailFragment4.D = result4 != null ? result4.getCount() : null;
        this.f88975c.e5().f110860c.P();
        this.f88975c.e5().f110860c.w();
        this.f88975c.e5().f110859b.setVisibility(0);
        this.f88975c.J4().f111334f.setVisibility(8);
        return b2.f124493a;
    }
}
