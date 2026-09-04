package com.max.commentimagepainter;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: AccelWorld.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "com.max.commentimagepainter.AccelWorldKt$fastGetBlurBitmap$bitmap$1", f = "AccelWorld.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AccelWorldKt$fastGetBlurBitmap$bitmap$1 extends SuspendLambda implements p<q0, c<? super Bitmap>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f65100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.bumptech.glide.request.d<Bitmap> f65101c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccelWorldKt$fastGetBlurBitmap$bitmap$1(com.bumptech.glide.request.d<Bitmap> dVar, c<? super AccelWorldKt$fastGetBlurBitmap$bitmap$1> cVar) {
        super(2, cVar);
        this.f65101c = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 1019, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AccelWorldKt$fastGetBlurBitmap$bitmap$1(this.f65101c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super Bitmap> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 1021, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super Bitmap> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 1020, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AccelWorldKt$fastGetBlurBitmap$bitmap$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1018, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f65100b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        return this.f65101c.get();
    }
}
