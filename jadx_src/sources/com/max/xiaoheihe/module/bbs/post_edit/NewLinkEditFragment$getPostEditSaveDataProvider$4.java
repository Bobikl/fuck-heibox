package com.max.xiaoheihe.module.bbs.post_edit;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: NewLinkEditFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class NewLinkEditFragment$getPostEditSaveDataProvider$4 extends FunctionReferenceImpl implements yh.a<KeyDescObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    NewLinkEditFragment$getPostEditSaveDataProvider$4(Object obj) {
        super(0, obj, NewLinkEditFragment.class, "getSelectPostPlan", "getSelectPostPlan()Lcom/max/hbcommon/bean/KeyDescObj;", 0);
    }

    @dl.e
    public final KeyDescObj i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29925, new Class[0], KeyDescObj.class);
        return patchProxyResultProxy.isSupported ? (KeyDescObj) patchProxyResultProxy.result : NewLinkEditFragment.T4((NewLinkEditFragment) this.receiver);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.max.hbcommon.bean.KeyDescObj, java.lang.Object] */
    @Override // yh.a
    public /* bridge */ /* synthetic */ KeyDescObj invoke() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29926, new Class[0], Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i();
    }
}
