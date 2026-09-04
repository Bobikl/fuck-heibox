package com.max.xiaoheihe.module.bbs.post_edit.auto_save;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: PostEditAutoSaveManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager$collectPostEditSaveData$1$collectEditData$1", f = "PostEditAutoSaveManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PostEditAutoSaveManager$collectPostEditSaveData$1$collectEditData$1<T> extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super T>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f82897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ PostEditAutoSaveManager<T> f82898c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostEditAutoSaveManager$collectPostEditSaveData$1$collectEditData$1(PostEditAutoSaveManager<T> postEditAutoSaveManager, kotlin.coroutines.c<? super PostEditAutoSaveManager$collectPostEditSaveData$1$collectEditData$1> cVar) {
        super(2, cVar);
        this.f82898c = postEditAutoSaveManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30912, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new PostEditAutoSaveManager$collectPostEditSaveData$1$collectEditData$1(this.f82898c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, obj}, this, changeQuickRedirect, false, 30914, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke(q0Var, (kotlin.coroutines.c) obj);
    }

    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super T> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 30913, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PostEditAutoSaveManager$collectPostEditSaveData$1$collectEditData$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30911, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f82897b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        c cVar = ((PostEditAutoSaveManager) this.f82898c).f82877d;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }
}
