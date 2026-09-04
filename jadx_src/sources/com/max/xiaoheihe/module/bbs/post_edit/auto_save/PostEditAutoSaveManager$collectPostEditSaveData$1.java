package com.max.xiaoheihe.module.bbs.post_edit.auto_save;

import android.util.Log;
import com.max.xiaoheihe.bean.bbs.PostEditAutoSaveData;
import com.max.xiaoheihe.bean.bbs.PostEditAutoSaveDataWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n2;
import yh.p;

/* JADX INFO: compiled from: PostEditAutoSaveManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager$collectPostEditSaveData$1", f = "PostEditAutoSaveManager.kt", i = {0}, l = {61}, m = "invokeSuspend", n = {"triggerSaveTimeMs"}, s = {"J$0"})
public final class PostEditAutoSaveManager$collectPostEditSaveData$1 extends SuspendLambda implements p<Long, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f82894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ long f82895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PostEditAutoSaveManager<T> f82896d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostEditAutoSaveManager$collectPostEditSaveData$1(PostEditAutoSaveManager<T> postEditAutoSaveManager, kotlin.coroutines.c<? super PostEditAutoSaveManager$collectPostEditSaveData$1> cVar) {
        super(2, cVar);
        this.f82896d = postEditAutoSaveManager;
    }

    @dl.e
    public final Object a(long j10, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10), cVar}, this, changeQuickRedirect, false, 30909, new Class[]{Long.TYPE, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PostEditAutoSaveManager$collectPostEditSaveData$1) create(Long.valueOf(j10), cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30908, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.coroutines.c) patchProxyResultProxy.result;
        }
        PostEditAutoSaveManager$collectPostEditSaveData$1 postEditAutoSaveManager$collectPostEditSaveData$1 = new PostEditAutoSaveManager$collectPostEditSaveData$1(this.f82896d, cVar);
        postEditAutoSaveManager$collectPostEditSaveData$1.f82895c = ((Number) obj).longValue();
        return postEditAutoSaveManager$collectPostEditSaveData$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(Long l10, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{l10, cVar}, this, changeQuickRedirect, false, 30910, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(l10.longValue(), cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        long j10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30907, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f82894b;
        if (i10 == 0) {
            t0.n(obj);
            long j11 = this.f82895c;
            n2 n2VarE = e1.e();
            PostEditAutoSaveManager$collectPostEditSaveData$1$collectEditData$1 postEditAutoSaveManager$collectPostEditSaveData$1$collectEditData$1 = new PostEditAutoSaveManager$collectPostEditSaveData$1$collectEditData$1(this.f82896d, null);
            this.f82895c = j11;
            this.f82894b = 1;
            obj = i.h(n2VarE, postEditAutoSaveManager$collectPostEditSaveData$1$collectEditData$1, this);
            if (obj == objH) {
                return objH;
            }
            j10 = j11;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f82895c;
            t0.n(obj);
        }
        PostEditAutoSaveData postEditAutoSaveData = (PostEditAutoSaveData) obj;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (postEditAutoSaveData != null) {
            PostEditAutoSaveManager<T> postEditAutoSaveManager = this.f82896d;
            c cVar = ((PostEditAutoSaveManager) postEditAutoSaveManager).f82877d;
            if ((cVar != null && cVar.d(((PostEditAutoSaveManager) postEditAutoSaveManager).f82878e, postEditAutoSaveData) ? postEditAutoSaveData : null) != null) {
                PostEditAutoSaveManager<T> postEditAutoSaveManager2 = this.f82896d;
                booleanRef.f124884b = true;
                ((PostEditAutoSaveManager) postEditAutoSaveManager2).f82878e = postEditAutoSaveData;
                c cVar2 = ((PostEditAutoSaveManager) postEditAutoSaveManager2).f82877d;
                PostEditAutoSaveManager.f82868h.e(new PostEditAutoSaveDataWrapper(cVar2 != null ? cVar2.a() : null, kotlin.coroutines.jvm.internal.a.a(false), kotlin.coroutines.jvm.internal.a.a(false), postEditAutoSaveData));
            }
        }
        Log.d(PostEditAutoSaveManager.f82870j, "[onEach tickerEventFlow]\nhasChanged: " + booleanRef.f124884b + ", triggerSaveTimeMs: " + j10 + ", thread: " + Thread.currentThread() + "\nprovider: " + ((PostEditAutoSaveManager) this.f82896d).f82877d);
        return b2.f124493a;
    }
}
