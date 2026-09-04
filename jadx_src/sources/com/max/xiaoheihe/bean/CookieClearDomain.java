package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CookieClearDomain.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CookieClearDomain implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String domain;

    public CookieClearDomain(@e String str) {
        this.domain = str;
    }

    public static /* synthetic */ CookieClearDomain copy$default(CookieClearDomain cookieClearDomain, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cookieClearDomain, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.PL, new Class[]{CookieClearDomain.class, String.class, Integer.TYPE, Object.class}, CookieClearDomain.class);
        if (patchProxyResultProxy.isSupported) {
            return (CookieClearDomain) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = cookieClearDomain.domain;
        }
        return cookieClearDomain.copy(str);
    }

    @e
    public final String component1() {
        return this.domain;
    }

    @d
    public final CookieClearDomain copy(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.OL, new Class[]{String.class}, CookieClearDomain.class);
        return patchProxyResultProxy.isSupported ? (CookieClearDomain) patchProxyResultProxy.result : new CookieClearDomain(str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.SL, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof CookieClearDomain) && f0.g(this.domain, ((CookieClearDomain) obj).domain);
    }

    @e
    public final String getDomain() {
        return this.domain;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.RL, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.domain;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setDomain(@e String str) {
        this.domain = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.QL, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CookieClearDomain(domain=" + this.domain + ')';
    }
}
