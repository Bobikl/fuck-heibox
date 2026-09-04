package com.max.hbstory;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: StoryPlayerFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbstory.StoryPlayerFragment$syncList$1", f = "StoryPlayerFragment.kt", i = {}, l = {bb.c.b.f30919s1}, m = "invokeSuspend", n = {}, s = {})
public final class StoryPlayerFragment$syncList$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f72829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ StoryPlayerFragment f72830c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StoryPlayerFragment$syncList$1(StoryPlayerFragment storyPlayerFragment, kotlin.coroutines.c<? super StoryPlayerFragment$syncList$1> cVar) {
        super(2, cVar);
        this.f72830c = storyPlayerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.k.f33912vc, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new StoryPlayerFragment$syncList$1(this.f72830c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.f33956xc, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.f33934wc, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((StoryPlayerFragment$syncList$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.f33890uc, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f72829b;
        if (i10 == 0) {
            t0.n(obj);
            this.f72829b = 1;
            if (DelayKt.b(50L, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        g gVar = this.f72830c.f72781b;
        g gVar2 = null;
        if (gVar == null) {
            f0.S("mStoryViewModel");
            gVar = null;
        }
        Integer numF = gVar.n().f();
        if (numF == null) {
            numF = kotlin.coroutines.jvm.internal.a.f(0);
        }
        if (numF.intValue() <= 0) {
            g gVar3 = this.f72830c.f72781b;
            if (gVar3 == null) {
                f0.S("mStoryViewModel");
            } else {
                gVar2 = gVar3;
            }
            gVar2.W(0);
        }
        return b2.f124493a;
    }
}
