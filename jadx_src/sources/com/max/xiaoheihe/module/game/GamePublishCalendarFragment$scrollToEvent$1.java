package com.max.xiaoheihe.module.game;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.bean.game.PublishGameTitle;
import com.max.xiaoheihe.bean.game.calendar.GameEventObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.i9;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.GamePublishCalendarFragment$scrollToEvent$1", f = "GamePublishCalendarFragment.kt", i = {}, l = {bb.c.b.f30726jd}, m = "invokeSuspend", n = {}, s = {})
public final class GamePublishCalendarFragment$scrollToEvent$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f84623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ GamePublishCalendarFragment f84624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f84625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamePublishCalendarFragment$scrollToEvent$1(GamePublishCalendarFragment gamePublishCalendarFragment, int i10, kotlin.coroutines.c<? super GamePublishCalendarFragment$scrollToEvent$1> cVar) {
        super(2, cVar);
        this.f84624c = gamePublishCalendarFragment;
        this.f84625d = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 33464, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new GamePublishCalendarFragment$scrollToEvent$1(this.f84624c, this.f84625d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33466, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33465, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GamePublishCalendarFragment$scrollToEvent$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33463, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f84623b;
        i9 i9Var = null;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            i9 i9Var2 = this.f84624c.f84567p;
            if (i9Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                i9Var2 = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) i9Var2.f111691e.getLayoutManager();
            if (linearLayoutManager != null) {
                int i11 = this.f84625d;
                GamePublishCalendarFragment gamePublishCalendarFragment = this.f84624c;
                if (i11 <= linearLayoutManager.findLastVisibleItemPosition() + 12 && linearLayoutManager.findFirstVisibleItemPosition() + (-12) <= i11) {
                    i9 i9Var3 = gamePublishCalendarFragment.f84567p;
                    if (i9Var3 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        i9Var3 = null;
                    }
                    i9Var3.f111691e.smoothScrollToPosition(i11);
                } else {
                    linearLayoutManager.scrollToPositionWithOffset(i11, 0);
                }
            }
            this.f84623b = 1;
            if (DelayKt.b(200L, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        GameEventObj event = ((PublishGameTitle) this.f84624c.f84569r.get(this.f84625d)).getEvent();
        if (event != null) {
            event.setNeed_shine_bg(kotlin.coroutines.jvm.internal.a.a(true));
        }
        i9 i9Var4 = this.f84624c.f84567p;
        if (i9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            i9Var = i9Var4;
        }
        RecyclerView.Adapter adapter = i9Var.f111691e.getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(this.f84625d);
        }
        return kotlin.b2.f124493a;
    }
}
