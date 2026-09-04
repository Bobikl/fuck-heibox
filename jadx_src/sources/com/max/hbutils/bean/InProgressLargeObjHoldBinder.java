package com.max.hbutils.bean;

import bb.c;
import com.max.hbutils.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: InProgressLargeObjHoldBinder.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class InProgressLargeObjHoldBinder extends b.AbstractBinderC0589b {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final SoftReference<Object> objHoldRef;

    public InProgressLargeObjHoldBinder(@e Object obj) {
        this.objHoldRef = new SoftReference<>(obj);
    }

    @e
    public final Object getHoldObj() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Fn, new Class[0], Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : this.objHoldRef.get();
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Gn, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return super.toString() + "\nisBinderAlive: " + isBinderAlive();
    }
}
