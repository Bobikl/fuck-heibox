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

/* JADX INFO: compiled from: WebUrlCheckResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class WebUrlCheckResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private String redirected_url;

    @e
    private String strategy;

    public WebUrlCheckResult(@e String str, @e String str2, @e String str3) {
        this.strategy = str;
        this.desc = str2;
        this.redirected_url = str3;
    }

    public static /* synthetic */ WebUrlCheckResult copy$default(WebUrlCheckResult webUrlCheckResult, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webUrlCheckResult, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.XN, new Class[]{WebUrlCheckResult.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, WebUrlCheckResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebUrlCheckResult) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = webUrlCheckResult.strategy;
        }
        if ((i10 & 2) != 0) {
            str2 = webUrlCheckResult.desc;
        }
        if ((i10 & 4) != 0) {
            str3 = webUrlCheckResult.redirected_url;
        }
        return webUrlCheckResult.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.strategy;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @e
    public final String component3() {
        return this.redirected_url;
    }

    @d
    public final WebUrlCheckResult copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, c.m.WN, new Class[]{String.class, String.class, String.class}, WebUrlCheckResult.class);
        return patchProxyResultProxy.isSupported ? (WebUrlCheckResult) patchProxyResultProxy.result : new WebUrlCheckResult(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.aO, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebUrlCheckResult)) {
            return false;
        }
        WebUrlCheckResult webUrlCheckResult = (WebUrlCheckResult) obj;
        return f0.g(this.strategy, webUrlCheckResult.strategy) && f0.g(this.desc, webUrlCheckResult.desc) && f0.g(this.redirected_url, webUrlCheckResult.redirected_url);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getRedirected_url() {
        return this.redirected_url;
    }

    @e
    public final String getStrategy() {
        return this.strategy;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.ZN, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.strategy;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.redirected_url;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setRedirected_url(@e String str) {
        this.redirected_url = str;
    }

    public final void setStrategy(@e String str) {
        this.strategy = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.YN, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WebUrlCheckResult(strategy=" + this.strategy + ", desc=" + this.desc + ", redirected_url=" + this.redirected_url + ')';
    }
}
