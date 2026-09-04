package com.max.xiaoheihe.utils.imageviewer;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: ImageViewerHelper.kt */
/* JADX INFO: loaded from: classes13.dex */
@d(c = "com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper$Companion$getFileFromCache$2", f = "ImageViewerHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ImageViewerHelper$Companion$getFileFromCache$2 extends SuspendLambda implements p<q0, c<? super File>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f95509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f95510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f95511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageViewerHelper$Companion$getFileFromCache$2(Context context, String str, c<? super ImageViewerHelper$Companion$getFileFromCache$2> cVar) {
        super(2, cVar);
        this.f95510c = context;
        this.f95511d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 49210, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new ImageViewerHelper$Companion$getFileFromCache$2(this.f95510c, this.f95511d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super File> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49212, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super File> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49211, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((ImageViewerHelper$Companion$getFileFromCache$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49209, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        b.h();
        if (this.f95509b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        return Glide.F(this.f95510c).u().r0(true).B0(Integer.MIN_VALUE, Integer.MIN_VALUE).load(this.f95511d).V1().get(500L, TimeUnit.MILLISECONDS);
    }
}
