package com.max.xiaoheihe.utils.imageviewer;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.h;
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
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HBImageLoader.kt */
/* JADX INFO: loaded from: classes13.dex */
@d(c = "com.max.xiaoheihe.utils.imageviewer.HBImageLoader$loadedCheck$file$1", f = "HBImageLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HBImageLoader$loadedCheck$file$1 extends SuspendLambda implements p<q0, c<? super File>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f95490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f95491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f95492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HBImageLoader$loadedCheck$file$1(Context context, String str, c<? super HBImageLoader$loadedCheck$file$1> cVar) {
        super(2, cVar);
        this.f95491c = context;
        this.f95492d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 49181, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new HBImageLoader$loadedCheck$file$1(this.f95491c, this.f95492d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super File> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49183, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super File> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49182, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HBImageLoader$loadedCheck$file$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49180, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        b.h();
        if (this.f95490b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        return Glide.F(this.f95491c).u().load(this.f95492d).i(new h().r0(true)).V1().get();
    }
}
