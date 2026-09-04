package com.max.xiaoheihe.utils.imageviewer;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.File;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HBImageLoader.kt */
/* JADX INFO: loaded from: classes13.dex */
@d(c = "com.max.xiaoheihe.utils.imageviewer.HBImageLoader$parseCachedImgQRCode$1", f = "HBImageLoader.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
public final class HBImageLoader$parseCachedImgQRCode$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f95493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f95494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ MediaData f95495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ HBImageLoader f95496e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HBImageLoader$parseCachedImgQRCode$1(View view, MediaData mediaData, HBImageLoader hBImageLoader, c<? super HBImageLoader$parseCachedImgQRCode$1> cVar) {
        super(2, cVar);
        this.f95494c = view;
        this.f95495d = mediaData;
        this.f95496e = hBImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 49185, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new HBImageLoader$parseCachedImgQRCode$1(this.f95494c, this.f95495d, this.f95496e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49187, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49186, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HBImageLoader$parseCachedImgQRCode$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49184, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f95493b;
        if (i10 == 0) {
            t0.n(obj);
            ImageViewerHelper.Companion companion = ImageViewerHelper.f95500a;
            Context context = this.f95494c.getContext();
            f0.o(context, "view.context");
            String strD = this.f95495d.D();
            this.f95493b = 1;
            obj = companion.e(context, strD, this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        File file = (File) obj;
        if (file != null) {
            HBImageLoader hBImageLoader = this.f95496e;
            MediaData mediaData = this.f95495d;
            String path = file.getPath();
            f0.o(path, "it.path");
            hBImageLoader.c(path, mediaData);
        }
        return b2.f124493a;
    }
}
