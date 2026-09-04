package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.view.View;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.RecommendBoardObj;
import com.max.xiaoheihe.bean.mall.RecommendBoardItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: RecommendBoardVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.adapter.recommend.binder.RecommendBoardVHB$contentBinding$1", f = "RecommendBoardVHB.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RecommendBoardVHB$contentBinding$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f86077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ GameRecommendBaseObj f86078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ RecommendBoardVHB f86080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecommendBoardVHB$contentBinding$1(GameRecommendBaseObj gameRecommendBaseObj, com.max.hbcommon.base.adapter.s.e eVar, RecommendBoardVHB recommendBoardVHB, kotlin.coroutines.c<? super RecommendBoardVHB$contentBinding$1> cVar) {
        super(2, cVar);
        this.f86078c = gameRecommendBaseObj;
        this.f86079d = eVar;
        this.f86080e = recommendBoardVHB;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 36139, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new RecommendBoardVHB$contentBinding$1(this.f86078c, this.f86079d, this.f86080e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 36141, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 36140, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((RecommendBoardVHB$contentBinding$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 36138, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f86077b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        GameRecommendBaseObj gameRecommendBaseObj = this.f86078c;
        if (gameRecommendBaseObj instanceof RecommendBoardObj) {
            RecommendBoardItem item = ((RecommendBoardObj) gameRecommendBaseObj).getItem();
            if (item != null) {
                RecommendBoardVHB recommendBoardVHB = this.f86080e;
                com.max.hbcommon.base.adapter.s.e eVar = this.f86079d;
                RecommendBoardVHB.a.e(RecommendBoardVHB.f86042h, recommendBoardVHB.v().b(), eVar, item, false, false, null, 56, null);
                View viewI = eVar.i(R.id.divider);
                if (viewI != null) {
                    viewI.setVisibility(8);
                }
            }
            this.f86079d.itemView.setTag(this.f86078c);
        }
        return b2.f124493a;
    }
}
