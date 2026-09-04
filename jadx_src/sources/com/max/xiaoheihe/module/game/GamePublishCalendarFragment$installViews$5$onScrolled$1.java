package com.max.xiaoheihe.module.game;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.max.xiaoheihe.bean.game.PublishGameTitle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.i9;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.jvm.internal.t0({"SMAP\nGamePublishCalendarFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GamePublishCalendarFragment.kt\ncom/max/xiaoheihe/module/game/GamePublishCalendarFragment$installViews$5$onScrolled$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,989:1\n260#2:990\n*S KotlinDebug\n*F\n+ 1 GamePublishCalendarFragment.kt\ncom/max/xiaoheihe/module/game/GamePublishCalendarFragment$installViews$5$onScrolled$1\n*L\n182#1:990\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.GamePublishCalendarFragment$installViews$5$onScrolled$1", f = "GamePublishCalendarFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GamePublishCalendarFragment$installViews$5$onScrolled$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f84605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ GamePublishCalendarFragment f84606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamePublishCalendarFragment$installViews$5$onScrolled$1(GamePublishCalendarFragment gamePublishCalendarFragment, kotlin.coroutines.c<? super GamePublishCalendarFragment$installViews$5$onScrolled$1> cVar) {
        super(2, cVar);
        this.f84606c = gamePublishCalendarFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 33446, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new GamePublishCalendarFragment$installViews$5$onScrolled$1(this.f84606c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33448, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 33447, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GamePublishCalendarFragment$installViews$5$onScrolled$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33445, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f84605b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        i9 i9Var = this.f84606c.f84567p;
        if (i9Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var = null;
        }
        RecyclerView.LayoutManager layoutManager = i9Var.f111691e.getLayoutManager();
        kotlin.jvm.internal.f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition >= 0 && iFindFirstVisibleItemPosition < this.f84606c.f84569r.size()) {
            i9 i9Var2 = this.f84606c.f84567p;
            if (i9Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                i9Var2 = null;
            }
            LinearLayout linearLayout = i9Var2.f111703q;
            kotlin.jvm.internal.f0.o(linearLayout, "binding.vgSingleDay");
            if (!(linearLayout.getVisibility() == 0)) {
                i9 i9Var3 = this.f84606c.f84567p;
                if (i9Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    i9Var3 = null;
                }
                int tabCount = i9Var3.f111694h.getTabCount();
                for (int i10 = 0; i10 < tabCount; i10++) {
                    i9 i9Var4 = this.f84606c.f84567p;
                    if (i9Var4 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        i9Var4 = null;
                    }
                    TabLayout.h hVarD = i9Var4.f111694h.D(i10);
                    if (kotlin.jvm.internal.f0.g(hVarD != null ? hVarD.m() : null, ((PublishGameTitle) this.f84606c.f84569r.get(iFindFirstVisibleItemPosition)).getMonth_timestamp())) {
                        this.f84606c.f84575x = false;
                        if (hVarD != null) {
                            hVarD.r();
                        }
                        this.f84606c.f84575x = true;
                        break;
                    }
                }
            }
        }
        return kotlin.b2.f124493a;
    }
}
