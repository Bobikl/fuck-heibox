package com.max.xiaoheihe.module.story.comment;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: StoryPostCommentFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@d(c = "com.max.xiaoheihe.module.story.comment.StoryPostCommentFragment$1$onNext$1", f = "StoryPostCommentFragment.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
public final class StoryPostCommentFragment$1$onNext$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f91996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f91997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ StoryPostCommentFragment f91998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Result<BBSLinkTreeObj> f91999e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StoryPostCommentFragment$1$onNext$1(long j10, StoryPostCommentFragment storyPostCommentFragment, Result<BBSLinkTreeObj> result, c<? super StoryPostCommentFragment$1$onNext$1> cVar) {
        super(2, cVar);
        this.f91997c = j10;
        this.f91998d = storyPostCommentFragment;
        this.f91999e = result;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 43679, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new StoryPostCommentFragment$1$onNext$1(this.f91997c, this.f91998d, this.f91999e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 43681, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 43680, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((StoryPostCommentFragment$1$onNext$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43678, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f91996b;
        if (i10 == 0) {
            t0.n(obj);
            long jCurrentTimeMillis = ((long) 300) - (System.currentTimeMillis() - this.f91997c);
            this.f91996b = 1;
            if (DelayKt.b(jCurrentTimeMillis, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        this.f91998d.A4(this.f91999e);
        StoryPostCommentFragment.m7(this.f91998d);
        StoryPostCommentFragment.n7(this.f91998d);
        return b2.f124493a;
    }
}
