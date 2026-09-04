package com.max.xiaoheihe.module.bbs.post_edit;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.Pair;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: PostTabActivityViewModel.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.PostTabActivityViewModel$notifyGameShotPostToolV2Event$1", f = "PostTabActivityViewModel.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
public final class PostTabActivityViewModel$notifyGameShotPostToolV2Event$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f82640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Pair<Boolean, Uri> f82641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PostTabActivityViewModel f82642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PostTabActivityViewModel$notifyGameShotPostToolV2Event$1(Pair<Boolean, ? extends Uri> pair, PostTabActivityViewModel postTabActivityViewModel, kotlin.coroutines.c<? super PostTabActivityViewModel$notifyGameShotPostToolV2Event$1> cVar) {
        super(2, cVar);
        this.f82641c = pair;
        this.f82642d = postTabActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30669, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new PostTabActivityViewModel$notifyGameShotPostToolV2Event$1(this.f82641c, this.f82642d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30671, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30670, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PostTabActivityViewModel$notifyGameShotPostToolV2Event$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30668, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f82640b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            if (!this.f82641c.e().booleanValue()) {
                this.f82640b = 1;
                if (DelayKt.b(20L, this) == objH) {
                    return objH;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        this.f82642d.f82626m.o(this.f82641c);
        return b2.f124493a;
    }
}
