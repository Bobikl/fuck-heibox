package com.max.mediaselector.lib.loader.repository;

import com.max.mediaselector.lib.entity.LocalMedia;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import yh.p;

/* JADX INFO: compiled from: GalleryMediaRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
@d(c = "com.max.mediaselector.lib.loader.repository.GalleryMediaRepository$getVideoMediaPagingData$2$1", f = "GalleryMediaRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GalleryMediaRepository$getVideoMediaPagingData$2$1 extends SuspendLambda implements p<LocalMedia, c<? super Boolean>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f75296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f75297c;

    GalleryMediaRepository$getVideoMediaPagingData$2$1(c<? super GalleryMediaRepository$getVideoMediaPagingData$2$1> cVar) {
        super(2, cVar);
    }

    @e
    public final Object a(@dl.d LocalMedia localMedia, @e c<? super Boolean> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMedia, cVar}, this, changeQuickRedirect, false, bb.c.m.F1, new Class[]{LocalMedia.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((GalleryMediaRepository$getVideoMediaPagingData$2$1) create(localMedia, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.E1, new Class[]{Object.class, c.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        GalleryMediaRepository$getVideoMediaPagingData$2$1 galleryMediaRepository$getVideoMediaPagingData$2$1 = new GalleryMediaRepository$getVideoMediaPagingData$2$1(cVar);
        galleryMediaRepository$getVideoMediaPagingData$2$1.f75297c = obj;
        return galleryMediaRepository$getVideoMediaPagingData$2$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(LocalMedia localMedia, c<? super Boolean> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMedia, cVar}, this, changeQuickRedirect, false, bb.c.m.G1, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(localMedia, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.D1, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        b.h();
        if (this.f75296b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        LocalMedia localMedia = (LocalMedia) this.f75297c;
        return a.a(localMedia.L() > 0 && localMedia.getWidth() > 0 && localMedia.getHeight() > 0);
    }
}
