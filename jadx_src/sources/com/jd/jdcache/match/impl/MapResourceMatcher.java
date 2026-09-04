package com.jd.jdcache.match.impl;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.Keep;
import androidx.annotation.k1;
import com.jd.jdcache.JDCacheParamsProvider;
import com.jd.jdcache.c;
import com.jd.jdcache.entity.JDCacheDataSource;
import com.jd.jdcache.entity.JDCacheLocalResp;
import com.jd.jdcache.entity.JDCacheLocalRespKt;
import com.jd.jdcache.match.base.JDCacheResourceMatcher;
import com.jd.jdcache.util.CancellableJob;
import com.jd.jdcache.util.CoroutineHelper;
import com.jd.jdcache.util.ICancellable;
import com.jd.jdcache.util.JDCacheLog;
import com.jd.jdcache.util.UrlHelper;
import dl.d;
import dl.e;
import java.io.File;
import java.util.HashMap;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: MapResourceMatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nMapResourceMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapResourceMatcher.kt\ncom/jd/jdcache/match/impl/MapResourceMatcher\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n9#2,4:84\n9#2,4:88\n9#2,4:92\n1#3:96\n*S KotlinDebug\n*F\n+ 1 MapResourceMatcher.kt\ncom/jd/jdcache/match/impl/MapResourceMatcher\n*L\n48#1:84,4\n54#1:88,4\n61#1:92,4\n*E\n"})
@Keep
public class MapResourceMatcher extends JDCacheResourceMatcher {

    @e
    private JDCacheDataSource dataSource;

    @d
    private final String name = "MapResourceMatcher";

    @e
    private ICancellable readMapTask;

    private final void readResMapFromJsonFile(String str) {
        this.readMapTask = new CancellableJob(CoroutineHelper.launchCoroutine$default(CoroutineHelper.INSTANCE, this, null, new MapResourceMatcher$readResMapFromJsonFile$job$1(str, this, null), 1, null));
    }

    @e
    protected final JDCacheDataSource getDataSource() {
        return this.dataSource;
    }

    @e
    public JDCacheDataSource getDataSource(@d String url) {
        f0.p(url, "url");
        JDCacheParamsProvider jDCacheParamsProviderD = c.f64138a.d();
        if (jDCacheParamsProviderD != null) {
            return jDCacheParamsProviderD.sourceWithUrl(url, getLoader());
        }
        return null;
    }

    @Override // com.jd.jdcache.match.base.JDCacheResourceMatcher
    @d
    public String getName() {
        return this.name;
    }

    @Override // com.jd.jdcache.match.base.JDCacheResourceMatcher
    @k1
    @e
    public WebResourceResponse match(@d WebResourceRequest request) {
        JDCacheLocalResp jDCacheLocalResp;
        f0.p(request, "request");
        JDCacheDataSource jDCacheDataSource = this.dataSource;
        if (jDCacheDataSource == null) {
            return null;
        }
        JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
        if (jDCacheLog.getCanLog()) {
            jDCacheLog.d("zzzzjdcache", "request.url == " + request.getUrl());
        }
        HashMap<String, JDCacheLocalResp> localFileMap = jDCacheDataSource.getLocalFileMap();
        if (localFileMap != null) {
            UrlHelper urlHelper = UrlHelper.INSTANCE;
            Uri url = request.getUrl();
            f0.o(url, "getUrl(...)");
            jDCacheLocalResp = localFileMap.get(urlHelper.urlToKey(url));
        } else {
            jDCacheLocalResp = null;
        }
        if (jDCacheLocalResp == null) {
            if (jDCacheLog.getCanLog()) {
                jDCacheLog.d("zzzzjdcache", "[Web-Match] " + getName() + " cannot find local file config for url[" + request.getUrl() + "], may search config in next matcher if exists.");
            }
            return null;
        }
        if (jDCacheLog.getCanLog()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("file match!!! key  == ");
            UrlHelper urlHelper2 = UrlHelper.INSTANCE;
            Uri url2 = request.getUrl();
            f0.o(url2, "getUrl(...)");
            sb2.append(urlHelper2.urlToKey(url2));
            jDCacheLog.d("zzzzjdcache", sb2.toString());
        }
        WebResourceResponse webResourceResponseCreateResponse = JDCacheLocalRespKt.createResponse(jDCacheLocalResp, jDCacheDataSource.getLocalFileDirDetail().getPath());
        if (webResourceResponseCreateResponse != null) {
            return createResponse(webResourceResponseCreateResponse);
        }
        return null;
    }

    @Override // com.jd.jdcache.match.base.JDCacheResourceMatcher
    protected void onDestroy() {
        super.onDestroy();
        ICancellable iCancellable = this.readMapTask;
        if (iCancellable != null) {
            ICancellable.a.a(iCancellable, null, 1, null);
        }
    }

    @Override // com.jd.jdcache.match.base.JDCacheResourceMatcher
    public void prepare(@d String url) {
        f0.p(url, "url");
        JDCacheDataSource dataSource = getDataSource(url);
        this.dataSource = dataSource;
        if (dataSource != null && dataSource.getLocalFileMap() == null && dataSource.getLocalFileDirDetail().exists()) {
            readResMapFromJsonFile(dataSource.getLocalFileDirDetail().getPath() + File.separator + "resource.json");
        }
    }

    protected final void setDataSource(@e JDCacheDataSource jDCacheDataSource) {
        this.dataSource = jDCacheDataSource;
    }
}
