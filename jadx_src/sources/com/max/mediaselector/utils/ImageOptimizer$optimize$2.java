package com.max.mediaselector.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import com.max.heybox.hblog.g;
import com.max.mediaselector.lib.config.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.File;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import yh.p;

/* JADX INFO: compiled from: ImageOptimizer.kt */
/* JADX INFO: loaded from: classes2.dex */
@d(c = "com.max.mediaselector.utils.ImageOptimizer$optimize$2", f = "ImageOptimizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ImageOptimizer$optimize$2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super Uri>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f75656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f75657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f75658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Uri f75659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f75660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f75661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f75662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f75663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f75664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f75665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ int f75666l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ boolean f75667m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageOptimizer$optimize$2(Context context, Uri uri, float f10, float f11, boolean z10, boolean z11, int i10, int i11, int i12, boolean z12, kotlin.coroutines.c<? super ImageOptimizer$optimize$2> cVar) {
        super(2, cVar);
        this.f75658d = context;
        this.f75659e = uri;
        this.f75660f = f10;
        this.f75661g = f11;
        this.f75662h = z10;
        this.f75663i = z11;
        this.f75664j = i10;
        this.f75665k = i11;
        this.f75666l = i12;
        this.f75667m = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.f34817jc, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.coroutines.c) patchProxyResultProxy.result;
        }
        ImageOptimizer$optimize$2 imageOptimizer$optimize$2 = new ImageOptimizer$optimize$2(this.f75658d, this.f75659e, this.f75660f, this.f75661g, this.f75662h, this.f75663i, this.f75664j, this.f75665k, this.f75666l, this.f75667m, cVar);
        imageOptimizer$optimize$2.f75657c = obj;
        return imageOptimizer$optimize$2;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super Uri> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f34863lc, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super Uri> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f34840kc, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((ImageOptimizer$optimize$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Bitmap bitmapH;
        String strD;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f34794ic, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f75656b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        q0 q0Var = (q0) this.f75657c;
        ImageOptimizer imageOptimizer = ImageOptimizer.f75653a;
        BitmapFactory.Options optionsE = ImageOptimizer.e(imageOptimizer, this.f75658d, this.f75659e);
        String strR = imageOptimizer.r(optionsE);
        if (!f.f75143v.equals(strR)) {
            if (!(strR != null ? StringsKt__StringsKt.W2(strR, "gif", false, 2, null) : false)) {
                File fileI = ImageOptimizer.i(imageOptimizer, this.f75659e, this.f75660f, this.f75661g, strR);
                if (fileI.exists()) {
                    g.f74531b.q("ImageOptimizer, compress file has exist");
                    if (this.f75662h) {
                        return Uri.fromFile(new File(fileI.getAbsolutePath()));
                    }
                    fileI.delete();
                }
                float fB = ImageOptimizer.b(imageOptimizer, optionsE, this.f75663i, this.f75660f, this.f75661g);
                ImageOptimizer.k(imageOptimizer, optionsE, fB);
                Matrix matrixA = ImageOptimizer.a(imageOptimizer, this.f75658d, this.f75659e, fB, optionsE);
                if (matrixA == null || (bitmapH = ImageOptimizer.h(imageOptimizer, this.f75658d, this.f75659e, optionsE, matrixA)) == null) {
                    return null;
                }
                int width = bitmapH.getWidth();
                int height = bitmapH.getHeight();
                g.f74531b.q("ImageOptimizer, newBitmapWidth = " + width + ", newBitmapHeight = " + height);
                boolean zL = ImageOptimizer.l(imageOptimizer, width, height, this.f75664j, this.f75665k);
                float f10 = (float) width;
                float f11 = (float) height;
                float fC = ImageOptimizer.c(imageOptimizer, f10, f11, this.f75660f, this.f75661g, this.f75664j, this.f75665k, zL);
                Bitmap bitmapJ = ImageOptimizer.j(imageOptimizer, bitmapH, ImageOptimizer.g(imageOptimizer, f10, fC), ImageOptimizer.f(imageOptimizer, f11, fC), fC, zL);
                if (r0.k(q0Var) && (strD = ImageOptimizer.d(imageOptimizer, bitmapJ, fileI, this.f75666l, this.f75667m)) != null) {
                    return Uri.fromFile(new File(strD));
                }
                return null;
            }
        }
        g.f74531b.q("ImageOptimizer, ignore gif");
        return null;
    }
}
