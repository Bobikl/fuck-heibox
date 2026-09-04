package com.max.hbexpression;

import com.max.hbexpression.bean.ExpressionObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: ExpressionAssetManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbexpression.ExpressionAssetManager$cacheEmoji$1", f = "ExpressionAssetManager.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionAssetManager$cacheEmoji$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f69921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ExpressionObj f69922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressionAssetManager$cacheEmoji$1(ExpressionObj expressionObj, kotlin.coroutines.c<? super ExpressionAssetManager$cacheEmoji$1> cVar) {
        super(2, cVar);
        this.f69922c = expressionObj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.f.UB, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new ExpressionAssetManager$cacheEmoji$1(this.f69922c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.WB, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.VB, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((ExpressionAssetManager$cacheEmoji$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.f.TB, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f69921b;
        if (i10 == 0) {
            t0.n(obj);
            ExpressionAssetManager expressionAssetManager = ExpressionAssetManager.f69919a;
            String emoji_key = this.f69922c.getEmoji_key();
            f0.o(emoji_key, "getEmoji_key(...)");
            String[] strArrN = expressionAssetManager.n(emoji_key);
            if (strArrN != null) {
                ExpressionObj expressionObj = this.f69922c;
                if (strArrN.length == 2) {
                    String str = strArrN[0];
                    String str2 = strArrN[1];
                    String url = expressionObj.getUrl();
                    this.f69921b = 1;
                    if (expressionAssetManager.h(str, str2, url, this) == objH) {
                        return objH;
                    }
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
