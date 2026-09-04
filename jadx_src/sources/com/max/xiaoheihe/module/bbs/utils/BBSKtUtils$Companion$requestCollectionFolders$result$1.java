package com.max.xiaoheihe.module.bbs.utils;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.bbs.CollectionFolders;
import com.max.xiaoheihe.network.CoroutineServiceGenerator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: BBSKtUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$requestCollectionFolders$result$1", f = "BBSKtUtils.kt", i = {}, l = {bb.c.b.f30919s1}, m = "invokeSuspend", n = {}, s = {})
public final class BBSKtUtils$Companion$requestCollectionFolders$result$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super Result<CollectionFolders>>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f83346b;

    BBSKtUtils$Companion$requestCollectionFolders$result$1(kotlin.coroutines.c<? super BBSKtUtils$Companion$requestCollectionFolders$result$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 31172, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new BBSKtUtils$Companion$requestCollectionFolders$result$1(cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super Result<CollectionFolders>> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31174, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super Result<CollectionFolders>> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31173, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((BBSKtUtils$Companion$requestCollectionFolders$result$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31171, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f83346b;
        if (i10 == 0) {
            t0.n(obj);
            com.max.xiaoheihe.network.b bVarA = CoroutineServiceGenerator.f94823a.a();
            this.f83346b = 1;
            obj = bVarA.w5(this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return obj;
    }
}
