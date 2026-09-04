package com.max.xiaoheihe.module.story.widget.ui.root;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: StoryTitleBarTopRootWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@d(c = "com.max.xiaoheihe.module.story.widget.ui.root.StoryTitleBarTopRootWidget$getLinkTree$1$onError$1", f = "StoryTitleBarTopRootWidget.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StoryTitleBarTopRootWidget$getLinkTree$1$onError$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f92165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ StoryTitleBarTopRootWidget.AnonymousClass1 f92166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Throwable f92167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ StoryTitleBarTopRootWidget f92168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StoryTitleBarTopRootWidget$getLinkTree$1$onError$1(StoryTitleBarTopRootWidget.AnonymousClass1 anonymousClass1, Throwable th2, StoryTitleBarTopRootWidget storyTitleBarTopRootWidget, c<? super StoryTitleBarTopRootWidget$getLinkTree$1$onError$1> cVar) {
        super(2, cVar);
        this.f92166c = anonymousClass1;
        this.f92167d = th2;
        this.f92168e = storyTitleBarTopRootWidget;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 43920, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new StoryTitleBarTopRootWidget$getLinkTree$1$onError$1(this.f92166c, this.f92167d, this.f92168e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 43922, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 43921, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((StoryTitleBarTopRootWidget$getLinkTree$1$onError$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43919, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        b.h();
        if (this.f92165b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        StoryTitleBarTopRootWidget.AnonymousClass1.a(this.f92166c, this.f92167d);
        StoryTitleBarTopRootWidget.i0(this.f92168e);
        return b2.f124493a;
    }
}
