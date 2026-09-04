package com.max.xiaoheihe.module.game.dota2;

import android.util.Log;
import com.max.hbapkinstaller.g;
import com.max.xiaoheihe.utils.l0;
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

/* JADX INFO: compiled from: ImageCacheManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.xiaoheihe.module.game.dota2.ImageCacheManager$downloadImageCacheZip$1$2$onNext$1", f = "ImageCacheManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ImageCacheManager$downloadImageCacheZip$1$2$onNext$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f87370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ File f87371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ l0.g f87372d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageCacheManager$downloadImageCacheZip$1$2$onNext$1(File file, l0.g gVar, c<? super ImageCacheManager$downloadImageCacheZip$1$2$onNext$1> cVar) {
        super(2, cVar);
        this.f87371c = file;
        this.f87372d = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37464, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new ImageCacheManager$downloadImageCacheZip$1$2$onNext$1(this.f87371c, this.f87372d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37466, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37465, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((ImageCacheManager$downloadImageCacheZip$1$2$onNext$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37463, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        b.h();
        if (this.f87370b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        Log.d(ImageCacheManager.f87357d, "unZip start: " + this.f87371c.getAbsolutePath());
        g gVar = g.f65809a;
        String absolutePath = this.f87371c.getAbsolutePath();
        f0.o(absolutePath, "file.absolutePath");
        if (gVar.f(absolutePath, ImageCacheManager.f87355b.a())) {
            l0.g gVar2 = this.f87372d;
            if (gVar2 != null) {
                gVar2.a();
            }
            Log.d(ImageCacheManager.f87357d, "unZip success");
        } else {
            Log.e(ImageCacheManager.f87357d, "unZip fail");
        }
        try {
            this.f87371c.delete();
        } catch (Exception unused) {
        }
        return b2.f124493a;
    }
}
