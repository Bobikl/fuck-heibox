package com.max.hbexpression;

import com.max.hbexpression.bean.EmojisListResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: ExpressionAssetManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nExpressionAssetManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressionAssetManager.kt\ncom/max/hbexpression/ExpressionAssetManager$cacheEmojis$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,300:1\n1855#2:301\n1855#2,2:302\n1856#2:304\n*S KotlinDebug\n*F\n+ 1 ExpressionAssetManager.kt\ncom/max/hbexpression/ExpressionAssetManager$cacheEmojis$2\n*L\n136#1:301\n138#1:302,2\n136#1:304\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbexpression.ExpressionAssetManager$cacheEmojis$2", f = "ExpressionAssetManager.kt", i = {0, 0}, l = {139, 141}, m = "invokeSuspend", n = {"it", "group_code"}, s = {"L$1", "L$2"})
public final class ExpressionAssetManager$cacheEmojis$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f69930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f69931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f69932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f69933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f69934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ EmojisListResultObj f69935g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressionAssetManager$cacheEmojis$2(EmojisListResultObj emojisListResultObj, kotlin.coroutines.c<? super ExpressionAssetManager$cacheEmojis$2> cVar) {
        super(2, cVar);
        this.f69935g = emojisListResultObj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.f.gC, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new ExpressionAssetManager$cacheEmojis$2(this.f69935g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.iC, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.hC, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((ExpressionAssetManager$cacheEmojis$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:22:0x0088->B:35:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d1 -> B:18:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.hbexpression.ExpressionAssetManager$cacheEmojis$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
