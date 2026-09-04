package com.max.xiaoheihe.module.bbs.post_edit.auto_save;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yh.p;

/* JADX INFO: compiled from: PostEditAutoSaveManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager$tickerEventFlow$1", f = "PostEditAutoSaveManager.kt", i = {0, 1, 2}, l = {47, 50, 52}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
public final class PostEditAutoSaveManager$tickerEventFlow$1 extends SuspendLambda implements p<kotlinx.coroutines.flow.f<? super Long>, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f82903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f82904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PostEditAutoSaveManager<T> f82905d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostEditAutoSaveManager$tickerEventFlow$1(PostEditAutoSaveManager<T> postEditAutoSaveManager, kotlin.coroutines.c<? super PostEditAutoSaveManager$tickerEventFlow$1> cVar) {
        super(2, cVar);
        this.f82905d = postEditAutoSaveManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 30922, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.coroutines.c) patchProxyResultProxy.result;
        }
        PostEditAutoSaveManager$tickerEventFlow$1 postEditAutoSaveManager$tickerEventFlow$1 = new PostEditAutoSaveManager$tickerEventFlow$1(this.f82905d, cVar);
        postEditAutoSaveManager$tickerEventFlow$1.f82904c = obj;
        return postEditAutoSaveManager$tickerEventFlow$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.f<? super Long> fVar, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 30924, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(fVar, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.flow.f<? super Long> fVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 30923, new Class[]{kotlinx.coroutines.flow.f.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PostEditAutoSaveManager$tickerEventFlow$1) create(fVar, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:24:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0097 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0095 -> B:20:0x0062). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0074
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r9
            com.meituan.robust.ChangeQuickRedirect r3 = com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager$tickerEventFlow$1.changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r6[r2] = r4
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r4 = 0
            r5 = 30921(0x78c9, float:4.333E-41)
            r2 = r8
            com.meituan.robust.PatchProxyResult r1 = com.meituan.robust.PatchProxy.proxy(r1, r2, r3, r4, r5, r6, r7)
            boolean r2 = r1.isSupported
            if (r2 == 0) goto L1f
            java.lang.Object r9 = r1.result
            return r9
        L1f:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r8.f82903b
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L48
            if (r2 == r0) goto L2f
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
        L2f:
            java.lang.Object r0 = r8.f82904c
            kotlinx.coroutines.flow.f r0 = (kotlinx.coroutines.flow.f) r0
            kotlin.t0.n(r9)
            goto L61
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3f:
            java.lang.Object r0 = r8.f82904c
            kotlinx.coroutines.flow.f r0 = (kotlinx.coroutines.flow.f) r0
            kotlin.t0.n(r9)
            r9 = r8
            goto L87
        L48:
            kotlin.t0.n(r9)
            java.lang.Object r9 = r8.f82904c
            kotlinx.coroutines.flow.f r9 = (kotlinx.coroutines.flow.f) r9
            com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager<T> r2 = r8.f82905d
            long r5 = com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager.e(r2)
            r8.f82904c = r9
            r8.f82903b = r0
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.b(r5, r8)
            if (r0 != r1) goto L60
            return r1
        L60:
            r0 = r9
        L61:
            r9 = r8
        L62:
            com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager<T> r2 = r9.f82905d
            yh.a r2 = com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager.b(r2)
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L87
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = kotlin.coroutines.jvm.internal.a.g(r5)
            r9.f82904c = r0
            r9.f82903b = r4
            java.lang.Object r2 = r0.emit(r2, r9)
            if (r2 != r1) goto L87
            return r1
        L87:
            com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager<T> r2 = r9.f82905d
            long r5 = com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager.e(r2)
            r9.f82904c = r0
            r9.f82903b = r3
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.b(r5, r9)
            if (r2 != r1) goto L62
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.xiaoheihe.module.bbs.post_edit.auto_save.PostEditAutoSaveManager$tickerEventFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
