package com.max.hbexpression;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: ExpressionAssetManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbexpression.ExpressionAssetManager$cacheEmoji$2", f = "ExpressionAssetManager.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionAssetManager$cacheEmoji$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f69923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f69924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f69925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressionAssetManager$cacheEmoji$2(String str, String str2, kotlin.coroutines.c<? super ExpressionAssetManager$cacheEmoji$2> cVar) {
        super(2, cVar);
        this.f69924c = str;
        this.f69925d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.f.YB, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new ExpressionAssetManager$cacheEmoji$2(this.f69924c, this.f69925d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.aC, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.ZB, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((ExpressionAssetManager$cacheEmoji$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.f.XB, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f69923b;
        if (i10 == 0) {
            t0.n(obj);
            ExpressionAssetManager expressionAssetManager = ExpressionAssetManager.f69919a;
            String[] strArrN = expressionAssetManager.n(this.f69924c);
            if (!(strArrN != null && strArrN.length == 2)) {
                return b2.f124493a;
            }
            String str = strArrN[0];
            String str2 = strArrN[1];
            String str3 = this.f69925d;
            this.f69923b = 1;
            if (expressionAssetManager.h(str, str2, str3, this) == objH) {
                return objH;
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
