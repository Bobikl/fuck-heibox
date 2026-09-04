package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AuthorCenterButtonObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class AuthorCenterButtonObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String alert_at;

    @e
    private String desc;

    @e
    private String protocol;

    public AuthorCenterButtonObj(@e String str, @e String str2, @e String str3) {
        this.protocol = str;
        this.desc = str2;
        this.alert_at = str3;
    }

    public static /* synthetic */ AuthorCenterButtonObj copy$default(AuthorCenterButtonObj authorCenterButtonObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{authorCenterButtonObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14162, new Class[]{AuthorCenterButtonObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, AuthorCenterButtonObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AuthorCenterButtonObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = authorCenterButtonObj.protocol;
        }
        if ((i10 & 2) != 0) {
            str2 = authorCenterButtonObj.desc;
        }
        if ((i10 & 4) != 0) {
            str3 = authorCenterButtonObj.alert_at;
        }
        return authorCenterButtonObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.protocol;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @e
    public final String component3() {
        return this.alert_at;
    }

    @d
    public final AuthorCenterButtonObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 14161, new Class[]{String.class, String.class, String.class}, AuthorCenterButtonObj.class);
        return patchProxyResultProxy.isSupported ? (AuthorCenterButtonObj) patchProxyResultProxy.result : new AuthorCenterButtonObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14165, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorCenterButtonObj)) {
            return false;
        }
        AuthorCenterButtonObj authorCenterButtonObj = (AuthorCenterButtonObj) obj;
        return f0.g(this.protocol, authorCenterButtonObj.protocol) && f0.g(this.desc, authorCenterButtonObj.desc) && f0.g(this.alert_at, authorCenterButtonObj.alert_at);
    }

    @e
    public final String getAlert_at() {
        return this.alert_at;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14164, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.protocol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.alert_at;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAlert_at(@e String str) {
        this.alert_at = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14163, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AuthorCenterButtonObj(protocol=" + this.protocol + ", desc=" + this.desc + ", alert_at=" + this.alert_at + ')';
    }
}
