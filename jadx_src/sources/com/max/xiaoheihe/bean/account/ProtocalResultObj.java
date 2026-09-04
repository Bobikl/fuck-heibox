package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ProtocalResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ProtocalResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String protocol;

    public ProtocalResultObj(@e String str) {
        this.protocol = str;
    }

    public static /* synthetic */ ProtocalResultObj copy$default(ProtocalResultObj protocalResultObj, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{protocalResultObj, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 13920, new Class[]{ProtocalResultObj.class, String.class, Integer.TYPE, Object.class}, ProtocalResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProtocalResultObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = protocalResultObj.protocol;
        }
        return protocalResultObj.copy(str);
    }

    @e
    public final String component1() {
        return this.protocol;
    }

    @d
    public final ProtocalResultObj copy(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 13919, new Class[]{String.class}, ProtocalResultObj.class);
        return patchProxyResultProxy.isSupported ? (ProtocalResultObj) patchProxyResultProxy.result : new ProtocalResultObj(str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13923, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProtocalResultObj) && f0.g(this.protocol, ((ProtocalResultObj) obj).protocol);
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13922, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.protocol;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13921, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ProtocalResultObj(protocol=" + this.protocol + ')';
    }
}
