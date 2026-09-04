package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BindGameDetailProtocolObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class BindGameDetailProtocolObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String protocol;

    @e
    private String type;

    public BindGameDetailProtocolObj(@e String str, @e String str2) {
        this.type = str;
        this.protocol = str2;
    }

    public static /* synthetic */ BindGameDetailProtocolObj copy$default(BindGameDetailProtocolObj bindGameDetailProtocolObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bindGameDetailProtocolObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.HO, new Class[]{BindGameDetailProtocolObj.class, String.class, String.class, Integer.TYPE, Object.class}, BindGameDetailProtocolObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BindGameDetailProtocolObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = bindGameDetailProtocolObj.type;
        }
        if ((i10 & 2) != 0) {
            str2 = bindGameDetailProtocolObj.protocol;
        }
        return bindGameDetailProtocolObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.type;
    }

    @e
    public final String component2() {
        return this.protocol;
    }

    @d
    public final BindGameDetailProtocolObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.m.GO, new Class[]{String.class, String.class}, BindGameDetailProtocolObj.class);
        return patchProxyResultProxy.isSupported ? (BindGameDetailProtocolObj) patchProxyResultProxy.result : new BindGameDetailProtocolObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.KO, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindGameDetailProtocolObj)) {
            return false;
        }
        BindGameDetailProtocolObj bindGameDetailProtocolObj = (BindGameDetailProtocolObj) obj;
        return f0.g(this.type, bindGameDetailProtocolObj.type) && f0.g(this.protocol, bindGameDetailProtocolObj.protocol);
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.JO, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.protocol;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.IO, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BindGameDetailProtocolObj(type=" + this.type + ", protocol=" + this.protocol + ')';
    }
}
