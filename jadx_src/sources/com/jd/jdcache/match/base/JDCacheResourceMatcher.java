package com.jd.jdcache.match.base;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.Keep;
import androidx.annotation.i;
import androidx.annotation.k1;
import androidx.lifecycle.Lifecycle;
import com.jd.jdcache.JDCacheLoader;
import dl.d;
import dl.e;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: JDCacheResourceMatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public abstract class JDCacheResourceMatcher {

    @d
    private final AtomicBoolean destroyed = new AtomicBoolean(false);

    @e
    private JDCacheLoader loader;

    @d
    protected WebResourceResponse createResponse(@d WebResourceResponse response) {
        f0.p(response, "response");
        Map<String, String> responseHeaders = response.getResponseHeaders();
        if (responseHeaders == null) {
            responseHeaders = new HashMap<>(1);
        }
        response.setResponseHeaders(responseHeaders);
        Map<String, String> responseHeaders2 = response.getResponseHeaders();
        f0.o(responseHeaders2, "getResponseHeaders(...)");
        responseHeaders2.put("JDCache", getName());
        return response;
    }

    @d
    protected WebResourceResponse createResponse(@d String mimeType, @e String str, @e Map<String, String> map, @d InputStream inputStream) {
        f0.p(mimeType, "mimeType");
        f0.p(inputStream, "inputStream");
        return createResponse(new WebResourceResponse(mimeType, str, inputStream));
    }

    @d
    protected WebResourceResponse createResponse(@d String mimeType, @e String str, @e Map<String, String> map, @d String filePath) {
        f0.p(mimeType, "mimeType");
        f0.p(filePath, "filePath");
        return createResponse(mimeType, str, map, new FileInputStream(filePath));
    }

    public final void destroy() {
        if (this.destroyed.compareAndSet(false, true)) {
            onDestroy();
        }
    }

    @d
    protected final AtomicBoolean getDestroyed() {
        return this.destroyed;
    }

    @e
    public final JDCacheLoader getLoader() {
        return this.loader;
    }

    @d
    public abstract String getName();

    @k1
    @e
    public abstract WebResourceResponse match(@d WebResourceRequest webResourceRequest);

    @i
    protected void onDestroy() {
        this.loader = null;
    }

    public void onLifecycleStateChanged(@d Lifecycle.Event event) {
        f0.p(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            destroy();
        }
    }

    public void prepare(@d String url) {
        f0.p(url, "url");
    }

    public final void setLoader(@e JDCacheLoader jDCacheLoader) {
        this.loader = jDCacheLoader;
    }
}
