package com.max.xiaoheihe.module.bbs.post_edit.post_setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: PostSettingDialogFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class PostSettingDialogFragment$initViewModel$3 extends FunctionReferenceImpl implements yh.a<Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;

    PostSettingDialogFragment$initViewModel$3(Object obj) {
        super(0, obj, PostSettingDialogFragment.class, "isActive", "isActive()Z", 0);
    }

    @d
    public final Boolean i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31077, new Class[0], Boolean.class);
        return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : Boolean.valueOf(((PostSettingDialogFragment) this.receiver).isActive());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
    @Override // yh.a
    public /* bridge */ /* synthetic */ Boolean invoke() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31078, new Class[0], Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i();
    }
}
