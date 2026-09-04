package com.max.xiaoheihe.utils.imageviewer;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbimage.bean.common.BackimageObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.lang.ref.WeakReference;
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
@d(c = "com.max.xiaoheihe.utils.imageviewer.HBImageLoader$load$2$onLoadFailed$1", f = "HBImageLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HBImageLoader$load$2$onLoadFailed$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f95460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ WeakReference<ImageView> f95461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ BackimageObj f95462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ MediaData f95463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ HBImageLoader f95464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ RecyclerView.ViewHolder f95465g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HBImageLoader$load$2$onLoadFailed$1(WeakReference<ImageView> weakReference, BackimageObj backimageObj, MediaData mediaData, HBImageLoader hBImageLoader, RecyclerView.ViewHolder viewHolder, c<? super HBImageLoader$load$2$onLoadFailed$1> cVar) {
        super(2, cVar);
        this.f95461c = weakReference;
        this.f95462d = backimageObj;
        this.f95463e = mediaData;
        this.f95464f = hBImageLoader;
        this.f95465g = viewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 49158, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new HBImageLoader$load$2$onLoadFailed$1(this.f95461c, this.f95462d, this.f95463e, this.f95464f, this.f95465g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49160, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49159, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HBImageLoader$load$2$onLoadFailed$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49157, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        b.h();
        if (this.f95460b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        ImageView imageView = this.f95461c.get();
        if (imageView != null) {
            BackimageObj backimageObj = this.f95462d;
            MediaData mediaData = this.f95463e;
            HBImageLoader hBImageLoader = this.f95464f;
            RecyclerView.ViewHolder viewHolder = this.f95465g;
            String backup = backimageObj.getBackup();
            if (backup != null) {
                mediaData.H(backup);
                hBImageLoader.e(imageView, mediaData, viewHolder);
            }
        }
        return b2.f124493a;
    }
}
