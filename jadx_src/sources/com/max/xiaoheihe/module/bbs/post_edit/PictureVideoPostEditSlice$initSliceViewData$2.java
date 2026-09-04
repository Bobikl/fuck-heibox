package com.max.xiaoheihe.module.bbs.post_edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: PictureVideoPostEditSlice.kt */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class PictureVideoPostEditSlice$initSliceViewData$2 extends FunctionReferenceImpl implements yh.a<Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;

    PictureVideoPostEditSlice$initSliceViewData$2(Object obj) {
        super(0, obj, PictureVideoEditPostFragment.class, "isActive", "isActive()Z", 0);
    }

    @dl.d
    public final Boolean i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30532, new Class[0], Boolean.class);
        return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : Boolean.valueOf(((PictureVideoEditPostFragment) this.receiver).isActive());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
    @Override // yh.a
    public /* bridge */ /* synthetic */ Boolean invoke() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30533, new Class[0], Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i();
    }
}
