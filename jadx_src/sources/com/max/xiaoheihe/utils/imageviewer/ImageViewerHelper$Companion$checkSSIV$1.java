package com.max.xiaoheihe.utils.imageviewer;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: ImageViewerHelper.kt */
/* JADX INFO: loaded from: classes13.dex */
@d(c = "com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper$Companion", f = "ImageViewerHelper.kt", i = {0, 0, 0, 0}, l = {68}, m = "checkSSIV", n = {"this", com.umeng.analytics.pro.d.R, "url", "useSSIV"}, s = {"L$0", "L$1", "L$2", "I$0"})
public final class ImageViewerHelper$Companion$checkSSIV$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f95502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f95503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f95504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f95505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f95506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ ImageViewerHelper.Companion f95507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f95508h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageViewerHelper$Companion$checkSSIV$1(ImageViewerHelper.Companion companion, c<? super ImageViewerHelper$Companion$checkSSIV$1> cVar) {
        super(cVar);
        this.f95507g = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49208, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f95506f = obj;
        this.f95508h |= Integer.MIN_VALUE;
        return this.f95507g.c(null, null, this);
    }
}
