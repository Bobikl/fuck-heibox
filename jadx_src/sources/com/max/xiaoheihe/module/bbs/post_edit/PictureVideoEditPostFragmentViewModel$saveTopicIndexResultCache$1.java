package com.max.xiaoheihe.module.bbs.post_edit;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.bbs.BBSTopicIndexObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PictureVideoEditPostFragmentViewModel.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragmentViewModel$saveTopicIndexResultCache$1", f = "PictureVideoEditPostFragmentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PictureVideoEditPostFragmentViewModel$saveTopicIndexResultCache$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f82507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f82508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Result<BBSTopicIndexObj> f82509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PictureVideoEditPostFragmentViewModel$saveTopicIndexResultCache$1(Result<BBSTopicIndexObj> result, kotlin.coroutines.c<? super PictureVideoEditPostFragmentViewModel$saveTopicIndexResultCache$1> cVar) {
        super(2, cVar);
        this.f82509d = result;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30461, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.coroutines.c) patchProxyResultProxy.result;
        }
        PictureVideoEditPostFragmentViewModel$saveTopicIndexResultCache$1 pictureVideoEditPostFragmentViewModel$saveTopicIndexResultCache$1 = new PictureVideoEditPostFragmentViewModel$saveTopicIndexResultCache$1(this.f82509d, cVar);
        pictureVideoEditPostFragmentViewModel$saveTopicIndexResultCache$1.f82508c = obj;
        return pictureVideoEditPostFragmentViewModel$saveTopicIndexResultCache$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30463, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30462, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PictureVideoEditPostFragmentViewModel$saveTopicIndexResultCache$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30460, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f82507b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        Result<BBSTopicIndexObj> result = this.f82509d;
        try {
            kotlin.Result.a aVar = kotlin.Result.f124476c;
            final String strP = com.max.hbutils.utils.k.p(result.getResult());
            com.max.hbmmkv.c.b(null, new yh.l<com.max.hbmmkv.b, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragmentViewModel$saveTopicIndexResultCache$1$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d com.max.hbmmkv.b withMMKV) {
                    if (PatchProxy.proxy(new Object[]{withMMKV}, this, changeQuickRedirect, false, 30464, new Class[]{com.max.hbmmkv.b.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    kotlin.jvm.internal.f0.p(withMMKV, "$this$withMMKV");
                    withMMKV.m("cache_key_topic_index_result", strP, true);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(com.max.hbmmkv.b bVar) {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 30465, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    a(bVar);
                    return b2.f124493a;
                }
            }, 1, null);
            kotlin.Result.b(b2.f124493a);
        } catch (Throwable th2) {
            kotlin.Result.a aVar2 = kotlin.Result.f124476c;
            kotlin.Result.b(kotlin.t0.a(th2));
        }
        return b2.f124493a;
    }
}
