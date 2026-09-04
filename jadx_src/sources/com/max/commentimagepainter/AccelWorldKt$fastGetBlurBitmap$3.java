package com.max.commentimagepainter;

import android.content.Context;
import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: AccelWorld.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "com.max.commentimagepainter.AccelWorldKt$fastGetBlurBitmap$3", f = "AccelWorld.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AccelWorldKt$fastGetBlurBitmap$3 extends SuspendLambda implements p<q0, c<? super Bitmap>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f65094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Bitmap f65095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f65096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f65097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Context f65098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f65099g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccelWorldKt$fastGetBlurBitmap$3(Bitmap bitmap, int i10, int i11, Context context, float f10, c<? super AccelWorldKt$fastGetBlurBitmap$3> cVar) {
        super(2, cVar);
        this.f65095c = bitmap;
        this.f65096d = i10;
        this.f65097e = i11;
        this.f65098f = context;
        this.f65099g = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 1015, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AccelWorldKt$fastGetBlurBitmap$3(this.f65095c, this.f65096d, this.f65097e, this.f65098f, this.f65099g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super Bitmap> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 1017, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super Bitmap> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 1016, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AccelWorldKt$fastGetBlurBitmap$3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1014, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f65094b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        int height = this.f65095c.getHeight();
        int i10 = this.f65096d;
        if (height <= i10) {
            i10 = height;
        }
        if (this.f65095c.getHeight() <= 0 || this.f65095c.getWidth() <= 0 || i10 < 0) {
            return null;
        }
        Bitmap bitmap = this.f65095c;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, height - i10, bitmap.getWidth(), i10);
        f0.o(bitmapCreateBitmap, "createBitmap(...)");
        zb.b bVar = new zb.b();
        bVar.f141959a = this.f65095c.getWidth();
        bVar.f141960b = i10;
        bVar.f141962d = 6;
        bVar.f141963e = this.f65097e;
        Bitmap bitmapB = zb.a.b(this.f65098f, bitmapCreateBitmap, bVar);
        f0.m(bitmapB);
        return AccelWorldKt.a(bitmapB, 255.0f, this.f65099g);
    }
}
