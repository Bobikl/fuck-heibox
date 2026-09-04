package com.max.xiaoheihe.module.bbs.post_edit.auto_save;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import yh.q;

/* JADX INFO: compiled from: PostEditAutoSaveManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager$collectPostEditSaveData$2", f = "PostEditAutoSaveManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PostEditAutoSaveManager$collectPostEditSaveData$2 extends SuspendLambda implements q<kotlinx.coroutines.flow.f<? super Long>, Throwable, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f82899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f82900c;

    PostEditAutoSaveManager$collectPostEditSaveData$2(kotlin.coroutines.c<? super PostEditAutoSaveManager$collectPostEditSaveData$2> cVar) {
        super(3, cVar);
    }

    @Override // yh.q
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.f<? super Long> fVar, Throwable th2, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, th2, cVar}, this, changeQuickRedirect, false, 30917, new Class[]{Object.class, Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(fVar, th2, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.flow.f<? super Long> fVar, @dl.e Throwable th2, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, th2, cVar}, this, changeQuickRedirect, false, 30916, new Class[]{kotlinx.coroutines.flow.f.class, Throwable.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        PostEditAutoSaveManager$collectPostEditSaveData$2 postEditAutoSaveManager$collectPostEditSaveData$2 = new PostEditAutoSaveManager$collectPostEditSaveData$2(cVar);
        postEditAutoSaveManager$collectPostEditSaveData$2.f82900c = th2;
        return postEditAutoSaveManager$collectPostEditSaveData$2.invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30915, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f82899b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        Throwable th2 = (Throwable) this.f82900c;
        if (th2 instanceof PostEditAutoSaveManager.DiscardDataCancelSignal) {
            PostEditAutoSaveManager.f82868h.a();
        }
        Log.d(PostEditAutoSaveManager.f82870j, "[onCompletion tickerEventFlow] onCompletion, cause: " + th2 + ", thread: " + Thread.currentThread());
        return b2.f124493a;
    }
}
