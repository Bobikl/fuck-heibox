package com.max.hbminiprogram.bean;

import bb.c;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ScreenStyleInfoObj.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ScreenStyleInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private KeyDescObj bottom;

    public ScreenStyleInfoObj(@e KeyDescObj keyDescObj) {
        this.bottom = keyDescObj;
    }

    public static /* synthetic */ ScreenStyleInfoObj copy$default(ScreenStyleInfoObj screenStyleInfoObj, KeyDescObj keyDescObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{screenStyleInfoObj, keyDescObj, new Integer(i10), obj}, null, changeQuickRedirect, true, c.h.R, new Class[]{ScreenStyleInfoObj.class, KeyDescObj.class, Integer.TYPE, Object.class}, ScreenStyleInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ScreenStyleInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            keyDescObj = screenStyleInfoObj.bottom;
        }
        return screenStyleInfoObj.copy(keyDescObj);
    }

    @e
    public final KeyDescObj component1() {
        return this.bottom;
    }

    @d
    public final ScreenStyleInfoObj copy(@e KeyDescObj keyDescObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, c.h.Q, new Class[]{KeyDescObj.class}, ScreenStyleInfoObj.class);
        return patchProxyResultProxy.isSupported ? (ScreenStyleInfoObj) patchProxyResultProxy.result : new ScreenStyleInfoObj(keyDescObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.h.U, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScreenStyleInfoObj) && f0.g(this.bottom, ((ScreenStyleInfoObj) obj).bottom);
    }

    @e
    public final KeyDescObj getBottom() {
        return this.bottom;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.T, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        KeyDescObj keyDescObj = this.bottom;
        if (keyDescObj == null) {
            return 0;
        }
        return keyDescObj.hashCode();
    }

    public final void setBottom(@e KeyDescObj keyDescObj) {
        this.bottom = keyDescObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.S, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ScreenStyleInfoObj(bottom=" + this.bottom + ')';
    }
}
