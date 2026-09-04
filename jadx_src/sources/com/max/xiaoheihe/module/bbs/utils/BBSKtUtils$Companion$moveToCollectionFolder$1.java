package com.max.xiaoheihe.module.bbs.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: BBSKtUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion", f = "BBSKtUtils.kt", i = {}, l = {bb.c.b.f30831o3}, m = "moveToCollectionFolder", n = {}, s = {})
public final class BBSKtUtils$Companion$moveToCollectionFolder$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f83337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ BBSKtUtils.Companion f83338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f83339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BBSKtUtils$Companion$moveToCollectionFolder$1(BBSKtUtils.Companion companion, kotlin.coroutines.c<? super BBSKtUtils$Companion$moveToCollectionFolder$1> cVar) {
        super(cVar);
        this.f83338c = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31161, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f83337b = obj;
        this.f83339d |= Integer.MIN_VALUE;
        return BBSKtUtils.Companion.c(this.f83338c, null, null, this);
    }
}
