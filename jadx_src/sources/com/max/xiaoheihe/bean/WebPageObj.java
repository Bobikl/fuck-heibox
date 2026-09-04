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

/* JADX INFO: compiled from: WebPageObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class WebPageObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private WebCfgObj webview;

    public WebPageObj(@e WebCfgObj webCfgObj) {
        this.webview = webCfgObj;
    }

    public static /* synthetic */ WebPageObj copy$default(WebPageObj webPageObj, WebCfgObj webCfgObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webPageObj, webCfgObj, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.KN, new Class[]{WebPageObj.class, WebCfgObj.class, Integer.TYPE, Object.class}, WebPageObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebPageObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            webCfgObj = webPageObj.webview;
        }
        return webPageObj.copy(webCfgObj);
    }

    @e
    public final WebCfgObj component1() {
        return this.webview;
    }

    @d
    public final WebPageObj copy(@e WebCfgObj webCfgObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webCfgObj}, this, changeQuickRedirect, false, c.m.JN, new Class[]{WebCfgObj.class}, WebPageObj.class);
        return patchProxyResultProxy.isSupported ? (WebPageObj) patchProxyResultProxy.result : new WebPageObj(webCfgObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.NN, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebPageObj) && f0.g(this.webview, ((WebPageObj) obj).webview);
    }

    @e
    public final WebCfgObj getWebview() {
        return this.webview;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.MN, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        WebCfgObj webCfgObj = this.webview;
        if (webCfgObj == null) {
            return 0;
        }
        return webCfgObj.hashCode();
    }

    public final void setWebview(@e WebCfgObj webCfgObj) {
        this.webview = webCfgObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.LN, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WebPageObj(webview=" + this.webview + ')';
    }
}
