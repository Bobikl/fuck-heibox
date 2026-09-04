package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import android.view.View;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: Dota2GameDetailFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2GameDetailFragment$refreshBottomButton$1", f = "Dota2GameDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Dota2GameDetailFragment$refreshBottomButton$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f88954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Dota2GameDetailFragment f88955c;

    /* JADX INFO: compiled from: Dota2GameDetailFragment.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Dota2GameDetailFragment f88956b;

        a(Dota2GameDetailFragment dota2GameDetailFragment) {
            this.f88956b = dota2GameDetailFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39084, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Dota2GameDetailFragment.T4(this.f88956b);
        }
    }

    /* JADX INFO: compiled from: Dota2GameDetailFragment.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameOverviewListObj f88957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Dota2GameDetailFragment f88958c;

        b(GameOverviewListObj gameOverviewListObj, Dota2GameDetailFragment dota2GameDetailFragment) {
            this.f88957b = gameOverviewListObj;
            this.f88958c = dota2GameDetailFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39085, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f88957b.setFollow_state("0");
            Dota2GameDetailFragment.d5(this.f88958c);
            Dota2GameDetailFragment.U4(this.f88958c, false);
        }
    }

    /* JADX INFO: compiled from: Dota2GameDetailFragment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameOverviewListObj f88959b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Dota2GameDetailFragment f88960c;

        c(GameOverviewListObj gameOverviewListObj, Dota2GameDetailFragment dota2GameDetailFragment) {
            this.f88959b = gameOverviewListObj;
            this.f88960c = dota2GameDetailFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39086, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f88959b.setFollow_state("1");
            Dota2GameDetailFragment.d5(this.f88960c);
            Dota2GameDetailFragment.U4(this.f88960c, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Dota2GameDetailFragment$refreshBottomButton$1(Dota2GameDetailFragment dota2GameDetailFragment, kotlin.coroutines.c<? super Dota2GameDetailFragment$refreshBottomButton$1> cVar) {
        super(2, cVar);
        this.f88955c = dota2GameDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39081, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new Dota2GameDetailFragment$refreshBottomButton$1(this.f88955c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39083, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39082, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((Dota2GameDetailFragment$refreshBottomButton$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39080, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f88954b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        GameOverviewListObj gameOverviewListObj = this.f88955c.B;
        if (gameOverviewListObj != null) {
            Dota2GameDetailFragment dota2GameDetailFragment = this.f88955c;
            if (com.max.hbcommon.utils.c.x(gameOverviewListObj.getNeed_bind())) {
                dota2GameDetailFragment.h5().f110483e.setIconVisible(false);
                dota2GameDetailFragment.h5().f110483e.setText(com.max.xiaoheihe.utils.d.n0(R.string.bind));
                dota2GameDetailFragment.h5().f110483e.setOnClickListener(new a(dota2GameDetailFragment));
            } else if (com.max.hbcommon.utils.c.x(gameOverviewListObj.getFollow_state())) {
                dota2GameDetailFragment.h5().f110483e.setIconVisible(true);
                dota2GameDetailFragment.h5().f110483e.setIcon(R.drawable.game_like_filled_24x24);
                dota2GameDetailFragment.h5().f110483e.setText(com.max.xiaoheihe.utils.d.n0(R.string.has_followed));
                dota2GameDetailFragment.h5().f110483e.setOnClickListener(new b(gameOverviewListObj, dota2GameDetailFragment));
            } else {
                dota2GameDetailFragment.h5().f110483e.setIconVisible(true);
                dota2GameDetailFragment.h5().f110483e.setIcon(R.drawable.game_like_line_24x24);
                dota2GameDetailFragment.h5().f110483e.setText(com.max.xiaoheihe.utils.d.n0(R.string.follow));
                dota2GameDetailFragment.h5().f110483e.setOnClickListener(new c(gameOverviewListObj, dota2GameDetailFragment));
            }
        }
        return b2.f124493a;
    }
}
