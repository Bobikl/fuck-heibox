package com.max.xiaoheihe.module.webview.interceptrequest;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Map;

/* JADX INFO: compiled from: WriteHandlingWebResourceRequest.java */
/* JADX INFO: loaded from: classes12.dex */
public class c implements WebResourceRequest {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f94710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebResourceRequest f94711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f94712c;

    c(WebResourceRequest webResourceRequest, String str, Uri uri) {
        this.f94711b = webResourceRequest;
        this.f94712c = str;
        if (uri != null) {
            this.f94710a = uri;
        } else {
            this.f94710a = webResourceRequest.getUrl();
        }
    }

    public String a() {
        return this.f94712c;
    }

    public WebResourceRequest b() {
        return this.f94711b;
    }

    public boolean c() {
        return this.f94712c != null;
    }

    @Override // android.webkit.WebResourceRequest
    public String getMethod() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47583, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f94711b.getMethod();
    }

    @Override // android.webkit.WebResourceRequest
    public Map<String, String> getRequestHeaders() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47584, new Class[0], Map.class);
        return patchProxyResultProxy.isSupported ? (Map) patchProxyResultProxy.result : this.f94711b.getRequestHeaders();
    }

    @Override // android.webkit.WebResourceRequest
    public Uri getUrl() {
        return this.f94710a;
    }

    @Override // android.webkit.WebResourceRequest
    public boolean hasGesture() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47582, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f94711b.hasGesture();
    }

    @Override // android.webkit.WebResourceRequest
    public boolean isForMainFrame() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47580, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f94711b.isForMainFrame();
    }

    @Override // android.webkit.WebResourceRequest
    public boolean isRedirect() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47581, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        throw new UnsupportedOperationException();
    }
}
