package com.max.xiaoheihe.module.bbs.post_edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.n7;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.PicPostTopicOrHashtagChooseFragment$initTitleAndSearchView$1$3$afterTextChanged$1", f = "PicPostTopicOrHashtagChooseFragment.kt", i = {0}, l = {151}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class PicPostTopicOrHashtagChooseFragment$initTitleAndSearchView$1$3$afterTextChanged$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f82313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f82314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ n7 f82315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ PicPostTopicOrHashtagChooseFragment f82316e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PicPostTopicOrHashtagChooseFragment$initTitleAndSearchView$1$3$afterTextChanged$1(n7 n7Var, PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment, kotlin.coroutines.c<? super PicPostTopicOrHashtagChooseFragment$initTitleAndSearchView$1$3$afterTextChanged$1> cVar) {
        super(2, cVar);
        this.f82315d = n7Var;
        this.f82316e = picPostTopicOrHashtagChooseFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30092, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.coroutines.c) patchProxyResultProxy.result;
        }
        PicPostTopicOrHashtagChooseFragment$initTitleAndSearchView$1$3$afterTextChanged$1 picPostTopicOrHashtagChooseFragment$initTitleAndSearchView$1$3$afterTextChanged$1 = new PicPostTopicOrHashtagChooseFragment$initTitleAndSearchView$1$3$afterTextChanged$1(this.f82315d, this.f82316e, cVar);
        picPostTopicOrHashtagChooseFragment$initTitleAndSearchView$1$3$afterTextChanged$1.f82314c = obj;
        return picPostTopicOrHashtagChooseFragment$initTitleAndSearchView$1$3$afterTextChanged$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30094, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30093, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PicPostTopicOrHashtagChooseFragment$initTitleAndSearchView$1$3$afterTextChanged$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlinx.coroutines.q0 q0Var;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30091, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f82313b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.q0 q0Var2 = (kotlinx.coroutines.q0) this.f82314c;
            this.f82314c = q0Var2;
            this.f82313b = 1;
            if (DelayKt.b(100L, this) == objH) {
                return objH;
            }
            q0Var = q0Var2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q0Var = (kotlinx.coroutines.q0) this.f82314c;
            kotlin.t0.n(obj);
        }
        String string = this.f82315d.f113716c.getText().toString();
        if (kotlinx.coroutines.r0.k(q0Var)) {
            PicPostTopicOrHashtagChooseFragment picPostTopicOrHashtagChooseFragment = this.f82316e;
            String strM1 = com.max.xiaoheihe.utils.d.M1(string);
            kotlin.jvm.internal.f0.o(strM1, "trimDeeply(searchContent)");
            PicPostTopicOrHashtagChooseFragment.m4(picPostTopicOrHashtagChooseFragment, strM1);
        }
        return b2.f124493a;
    }
}
