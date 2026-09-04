package com.max.xiaoheihe.router.interceptors;

import android.content.Context;
import com.max.xiaoheihe.bean.game.ShareGameCommentDataObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: PostPathInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.router.interceptors.PostPathInterceptor$loadDrawableSuspend$2$1$onLoadFailed$1", f = "PostPathInterceptor.kt", i = {}, l = {bb.c.b.f30966u4}, m = "invokeSuspend", n = {}, s = {})
public final class PostPathInterceptor$loadDrawableSuspend$2$1$onLoadFailed$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ PostPathInterceptor f94950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f94951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ShareGameCommentDataObj f94952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.p<File> f94953f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PostPathInterceptor$loadDrawableSuspend$2$1$onLoadFailed$1(PostPathInterceptor postPathInterceptor, Context context, ShareGameCommentDataObj shareGameCommentDataObj, kotlinx.coroutines.p<? super File> pVar, kotlin.coroutines.c<? super PostPathInterceptor$loadDrawableSuspend$2$1$onLoadFailed$1> cVar) {
        super(2, cVar);
        this.f94950c = postPathInterceptor;
        this.f94951d = context;
        this.f94952e = shareGameCommentDataObj;
        this.f94953f = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 48187, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new PostPathInterceptor$loadDrawableSuspend$2$1$onLoadFailed$1(this.f94950c, this.f94951d, this.f94952e, this.f94953f, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 48189, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 48188, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PostPathInterceptor$loadDrawableSuspend$2$1$onLoadFailed$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48186, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f94949b;
        if (i10 == 0) {
            t0.n(obj);
            PostPathInterceptor postPathInterceptor = this.f94950c;
            Context context = this.f94951d;
            ShareGameCommentDataObj shareGameCommentDataObj = this.f94952e;
            this.f94949b = 1;
            obj = PostPathInterceptor.c(postPathInterceptor, context, shareGameCommentDataObj, this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        kotlinx.coroutines.p<File> pVar = this.f94953f;
        Result.a aVar = Result.f124476c;
        pVar.resumeWith(Result.b((File) obj));
        return b2.f124493a;
    }
}
