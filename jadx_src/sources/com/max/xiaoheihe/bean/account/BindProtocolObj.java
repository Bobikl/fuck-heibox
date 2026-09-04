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

/* JADX INFO: compiled from: BindProtocolObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class BindProtocolObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String login_protocol;

    public BindProtocolObj(@e String str) {
        this.login_protocol = str;
    }

    public static /* synthetic */ BindProtocolObj copy$default(BindProtocolObj bindProtocolObj, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bindProtocolObj, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.TO, new Class[]{BindProtocolObj.class, String.class, Integer.TYPE, Object.class}, BindProtocolObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BindProtocolObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = bindProtocolObj.login_protocol;
        }
        return bindProtocolObj.copy(str);
    }

    @e
    public final String component1() {
        return this.login_protocol;
    }

    @d
    public final BindProtocolObj copy(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.SO, new Class[]{String.class}, BindProtocolObj.class);
        return patchProxyResultProxy.isSupported ? (BindProtocolObj) patchProxyResultProxy.result : new BindProtocolObj(str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.WO, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof BindProtocolObj) && f0.g(this.login_protocol, ((BindProtocolObj) obj).login_protocol);
    }

    @e
    public final String getLogin_protocol() {
        return this.login_protocol;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.VO, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.login_protocol;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setLogin_protocol(@e String str) {
        this.login_protocol = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.UO, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BindProtocolObj(login_protocol=" + this.login_protocol + ')';
    }
}
