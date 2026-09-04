package com.max.xiaoheihe.router.interceptors;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PostPathInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.router.interceptors.PostPathInterceptor", f = "PostPathInterceptor.kt", i = {0, 0}, l = {bb.c.b.f30810n5}, m = "getGameCommentFile", n = {"this", "contentView"}, s = {"L$0", "L$1"})
public final class PostPathInterceptor$getGameCommentFile$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f94922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f94923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f94924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ PostPathInterceptor f94925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f94926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostPathInterceptor$getGameCommentFile$1(PostPathInterceptor postPathInterceptor, kotlin.coroutines.c<? super PostPathInterceptor$getGameCommentFile$1> cVar) {
        super(cVar);
        this.f94925e = postPathInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48174, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f94924d = obj;
        this.f94926f |= Integer.MIN_VALUE;
        return PostPathInterceptor.c(this.f94925e, null, null, this);
    }
}
