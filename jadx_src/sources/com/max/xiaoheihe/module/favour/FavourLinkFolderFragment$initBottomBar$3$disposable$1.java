package com.max.xiaoheihe.module.favour;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class FavourLinkFolderFragment$initBottomBar$3$disposable$1 extends FunctionReferenceImpl implements yh.a<Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;

    FavourLinkFolderFragment$initBottomBar$3$disposable$1(Object obj) {
        super(0, obj, FavourLinkFolderFragment.class, "isActive", "isActive()Z", 0);
    }

    @dl.d
    public final Boolean i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31922, new Class[0], Boolean.class);
        return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : Boolean.valueOf(((FavourLinkFolderFragment) this.receiver).isActive());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
    @Override // yh.a
    public /* bridge */ /* synthetic */ Boolean invoke() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31923, new Class[0], Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i();
    }
}
