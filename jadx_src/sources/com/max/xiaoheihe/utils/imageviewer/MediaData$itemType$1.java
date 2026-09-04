package com.max.xiaoheihe.utils.imageviewer;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: MediaData.kt */
/* JADX INFO: loaded from: classes13.dex */
@d(c = "com.max.xiaoheihe.utils.imageviewer.MediaData$itemType$1", f = "MediaData.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
public final class MediaData$itemType$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f95538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f95539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ MediaData f95540d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaData$itemType$1(MediaData mediaData, c<? super MediaData$itemType$1> cVar) {
        super(2, cVar);
        this.f95540d = mediaData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 49246, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new MediaData$itemType$1(this.f95540d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49248, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49247, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((MediaData$itemType$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        MediaData mediaData;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49245, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f95539c;
        if (i10 == 0) {
            t0.n(obj);
            if (this.f95540d.C()) {
                MediaData mediaData2 = this.f95540d;
                ImageViewerHelper.Companion companion = ImageViewerHelper.f95500a;
                Context contextX = mediaData2.x();
                String strD = this.f95540d.D();
                this.f95538b = mediaData2;
                this.f95539c = 1;
                Object objC = companion.c(contextX, strD, this);
                if (objC == objH) {
                    return objH;
                }
                mediaData = mediaData2;
                obj = objC;
            }
            return b2.f124493a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mediaData = (MediaData) this.f95538b;
        t0.n(obj);
        mediaData.F(((Boolean) obj).booleanValue());
        this.f95540d.G(false);
        return b2.f124493a;
    }
}
