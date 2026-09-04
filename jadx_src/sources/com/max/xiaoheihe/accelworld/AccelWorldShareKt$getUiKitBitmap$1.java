package com.max.xiaoheihe.accelworld;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AccelWorldShare.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.accelworld.AccelWorldShareKt", f = "AccelWorldShare.kt", i = {0}, l = {bb.c.b.f31009w3}, m = "getUiKitBitmap", n = {"contentView"}, s = {"L$0"})
public final class AccelWorldShareKt$getUiKitBitmap$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f76487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f76488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f76489d;

    AccelWorldShareKt$getUiKitBitmap$1(kotlin.coroutines.c<? super AccelWorldShareKt$getUiKitBitmap$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.ny, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f76488c = obj;
        this.f76489d |= Integer.MIN_VALUE;
        return AccelWorldShareKt.a(null, null, null, this);
    }
}
