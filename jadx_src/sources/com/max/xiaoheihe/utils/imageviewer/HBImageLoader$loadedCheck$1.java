package com.max.xiaoheihe.utils.imageviewer;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: HBImageLoader.kt */
/* JADX INFO: loaded from: classes13.dex */
@d(c = "com.max.xiaoheihe.utils.imageviewer.HBImageLoader", f = "HBImageLoader.kt", i = {}, l = {c.b.E0}, m = "loadedCheck", n = {}, s = {})
public final class HBImageLoader$loadedCheck$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f95487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ HBImageLoader f95488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f95489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HBImageLoader$loadedCheck$1(HBImageLoader hBImageLoader, kotlin.coroutines.c<? super HBImageLoader$loadedCheck$1> cVar) {
        super(cVar);
        this.f95488c = hBImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49179, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f95487b = obj;
        this.f95489d |= Integer.MIN_VALUE;
        return this.f95488c.d(null, null, this);
    }
}
