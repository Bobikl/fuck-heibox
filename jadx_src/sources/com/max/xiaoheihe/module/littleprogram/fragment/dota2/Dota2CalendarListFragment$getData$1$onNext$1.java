package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewCalendarListListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: Dota2CalendarListFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2CalendarListFragment$getData$1$onNext$1", f = "Dota2CalendarListFragment.kt", i = {}, l = {bb.c.b.f30528b0}, m = "invokeSuspend", n = {}, s = {})
public final class Dota2CalendarListFragment$getData$1$onNext$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f88912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Dota2CalendarListFragment f88913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Result<GameOverviewCalendarListListObj> f88914d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Dota2CalendarListFragment$getData$1$onNext$1(Dota2CalendarListFragment dota2CalendarListFragment, Result<GameOverviewCalendarListListObj> result, kotlin.coroutines.c<? super Dota2CalendarListFragment$getData$1$onNext$1> cVar) {
        super(2, cVar);
        this.f88913c = dota2CalendarListFragment;
        this.f88914d = result;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39000, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new Dota2CalendarListFragment$getData$1$onNext$1(this.f88913c, this.f88914d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39002, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39001, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((Dota2CalendarListFragment$getData$1$onNext$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38999, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f88912b;
        if (i10 == 0) {
            t0.n(obj);
            long jCurrentTimeMillis = this.f88913c.f88905z > 0 ? System.currentTimeMillis() - this.f88913c.f88905z : 0L;
            this.f88913c.f88905z = -1L;
            this.f88912b = 1;
            if (DelayKt.b(400 - jCurrentTimeMillis, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        if (!this.f88913c.isActive()) {
            return b2.f124493a;
        }
        Dota2CalendarListFragment.W4(this.f88913c, this.f88914d.getResult());
        this.f88913c.a5().f109685c.P();
        this.f88913c.a5().f109685c.w();
        this.f88913c.a5().f109685c.setVisibility(0);
        this.f88913c.J4().f111334f.setVisibility(8);
        return b2.f124493a;
    }
}
