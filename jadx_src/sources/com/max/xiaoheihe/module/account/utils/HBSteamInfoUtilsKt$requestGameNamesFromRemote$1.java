package com.max.xiaoheihe.module.account.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: HBSteamInfoUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.account.utils.HBSteamInfoUtilsKt", f = "HBSteamInfoUtils.kt", i = {}, l = {bb.c.b.f30918s0}, m = "requestGameNamesFromRemote", n = {}, s = {})
public final class HBSteamInfoUtilsKt$requestGameNamesFromRemote$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f79286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f79287c;

    HBSteamInfoUtilsKt$requestGameNamesFromRemote$1(kotlin.coroutines.c<? super HBSteamInfoUtilsKt$requestGameNamesFromRemote$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25381, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f79286b = obj;
        this.f79287c |= Integer.MIN_VALUE;
        return HBSteamInfoUtilsKt.c(null, this);
    }
}
