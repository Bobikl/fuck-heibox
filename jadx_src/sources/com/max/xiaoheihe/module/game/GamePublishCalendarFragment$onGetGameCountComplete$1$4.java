package com.max.xiaoheihe.module.game;

import com.google.android.material.tabs.TabLayout;
import com.max.xiaoheihe.bean.game.CalendarGameCountObj;
import com.max.xiaoheihe.bean.game.calendar.MonthObj;
import com.max.xiaoheihe.module.game.component.CalendarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.i9;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.GamePublishCalendarFragment$onGetGameCountComplete$1$4", f = "GamePublishCalendarFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GamePublishCalendarFragment$onGetGameCountComplete$1$4 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f84617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ GamePublishCalendarFragment f84618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ CalendarGameCountObj f84619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamePublishCalendarFragment$onGetGameCountComplete$1$4(GamePublishCalendarFragment gamePublishCalendarFragment, CalendarGameCountObj calendarGameCountObj, kotlin.coroutines.c<? super GamePublishCalendarFragment$onGetGameCountComplete$1$4> cVar) {
        super(2, cVar);
        this.f84618c = gamePublishCalendarFragment;
        this.f84619d = calendarGameCountObj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 33455, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new GamePublishCalendarFragment$onGetGameCountComplete$1$4(this.f84618c, this.f84619d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33457, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33456, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GamePublishCalendarFragment$onGetGameCountComplete$1$4) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33454, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f84617b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        this.f84618c.f84575x = false;
        long jG = CalendarUtils.f86571a.g();
        List<MonthObj> count_by_month = this.f84619d.getCount_by_month();
        kotlin.jvm.internal.f0.m(count_by_month);
        int size = count_by_month.size();
        for (int i10 = 0; i10 < size; i10++) {
            List<MonthObj> count_by_month2 = this.f84619d.getCount_by_month();
            kotlin.jvm.internal.f0.m(count_by_month2);
            if (CalendarUtils.f86571a.u(jG, com.max.hbutils.utils.n.r(count_by_month2.get(i10).getMonth_timestamp()))) {
                i9 i9Var = this.f84618c.f84567p;
                i9 i9Var2 = null;
                if (i9Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    i9Var = null;
                }
                TabLayout tabLayout = i9Var.f111694h;
                i9 i9Var3 = this.f84618c.f84567p;
                if (i9Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    i9Var2 = i9Var3;
                }
                tabLayout.R(i9Var2.f111694h.D(i10));
                break;
            }
        }
        this.f84618c.f84575x = true;
        return kotlin.b2.f124493a;
    }
}
