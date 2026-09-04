package com.max.xiaoheihe.module.bbs.utils;

import com.max.hbutils.bean.Result;
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
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$moveToCollectionFolder$r$1", f = "BBSKtUtils.kt", i = {}, l = {bb.c.b.f30854p3}, m = "invokeSuspend", n = {}, s = {})
public final class BBSKtUtils$Companion$moveToCollectionFolder$r$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super Result<Object>>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f83340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f83341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f83342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BBSKtUtils$Companion$moveToCollectionFolder$r$1(String str, String str2, kotlin.coroutines.c<? super BBSKtUtils$Companion$moveToCollectionFolder$r$1> cVar) {
        super(2, cVar);
        this.f83341c = str;
        this.f83342d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 31163, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new BBSKtUtils$Companion$moveToCollectionFolder$r$1(this.f83341c, this.f83342d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super Result<Object>> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31165, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super Result<Object>> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31164, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((BBSKtUtils$Companion$moveToCollectionFolder$r$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31162, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f83340b;
        if (i10 == 0) {
            t0.n(obj);
            com.max.xiaoheihe.network.b bVarA = CoroutineServiceGenerator.f94823a.a();
            String str = this.f83341c;
            String str2 = this.f83342d;
            Integer numF = kotlin.coroutines.jvm.internal.a.f(1);
            this.f83340b = 1;
            obj = bVarA.M0(str, str2, numF, this);
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
