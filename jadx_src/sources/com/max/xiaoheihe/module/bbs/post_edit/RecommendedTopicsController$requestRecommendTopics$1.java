package com.max.xiaoheihe.module.bbs.post_edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.r3;

/* JADX INFO: compiled from: RecommendedTopicsController.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.RecommendedTopicsController$requestRecommendTopics$1", f = "RecommendedTopicsController.kt", i = {}, l = {bb.c.b.L2, bb.c.b.M2}, m = "invokeSuspend", n = {}, s = {})
public final class RecommendedTopicsController$requestRecommendTopics$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f82762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ RecommendedTopicsController f82763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f82764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f82765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f82766f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecommendedTopicsController$requestRecommendTopics$1(RecommendedTopicsController recommendedTopicsController, String str, String str2, String str3, kotlin.coroutines.c<? super RecommendedTopicsController$requestRecommendTopics$1> cVar) {
        super(2, cVar);
        this.f82763c = recommendedTopicsController;
        this.f82764d = str;
        this.f82765e = str2;
        this.f82766f = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30831, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new RecommendedTopicsController$requestRecommendTopics$1(this.f82763c, this.f82764d, this.f82765e, this.f82766f, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30833, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30832, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((RecommendedTopicsController$requestRecommendTopics$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30830, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f82762b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            RecommendedTopicsController.p(this.f82763c);
            RecommendTopicViewModel recommendTopicViewModel = this.f82763c.f82738b;
            final String str = this.f82764d;
            String str2 = this.f82765e;
            final String str3 = this.f82766f;
            final RecommendedTopicsController recommendedTopicsController = this.f82763c;
            recommendTopicViewModel.i(str, str2, str3, new yh.l<Boolean, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.RecommendedTopicsController$requestRecommendTopics$1.1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(boolean z10) {
                    if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30834, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    if (z10) {
                        recommendedTopicsController.f82744h = str;
                        recommendedTopicsController.f82745i = str3.length();
                    }
                    RecommendedTopicsController.a(recommendedTopicsController);
                }

                /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 30835, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    a(bool.booleanValue());
                    return b2.f124493a;
                }
            });
            return b2.f124493a;
        }
        kotlin.t0.n(obj);
        this.f82762b = 1;
        if (DelayKt.b(3000L, this) == objH) {
            return objH;
        }
        this.f82762b = 2;
        if (r3.a(this) == objH) {
            return objH;
        }
        RecommendedTopicsController.p(this.f82763c);
        RecommendTopicViewModel recommendTopicViewModel2 = this.f82763c.f82738b;
        final String str4 = this.f82764d;
        String str5 = this.f82765e;
        final String str6 = this.f82766f;
        final RecommendedTopicsController recommendedTopicsController2 = this.f82763c;
        recommendTopicViewModel2.i(str4, str5, str6, new yh.l<Boolean, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.RecommendedTopicsController$requestRecommendTopics$1.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(boolean z10) {
                if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30834, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (z10) {
                    recommendedTopicsController2.f82744h = str4;
                    recommendedTopicsController2.f82745i = str6.length();
                }
                RecommendedTopicsController.a(recommendedTopicsController2);
            }

            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 30835, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                a(bool.booleanValue());
                return b2.f124493a;
            }
        });
        return b2.f124493a;
    }
}
