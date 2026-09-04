package com.jd.jdcache.match.impl;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.Keep;
import androidx.annotation.k1;
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

/* JADX INFO: compiled from: HBMapResourceMatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nHBMapResourceMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBMapResourceMatcher.kt\ncom/jd/jdcache/match/impl/HBMapResourceMatcher\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n9#2,4:82\n9#2,4:86\n9#2,4:90\n1#3:94\n*S KotlinDebug\n*F\n+ 1 HBMapResourceMatcher.kt\ncom/jd/jdcache/match/impl/HBMapResourceMatcher\n*L\n46#1:82,4\n52#1:86,4\n59#1:90,4\n*E\n"})
@Keep
public class HBMapResourceMatcher extends JDCacheResourceMatcher {

    @e
    private JDCacheDataSource dataSource;

    @d
    private final String name;

    @e
    private ICancellable readMapTask;

    @d
    private String resKey;

    public HBMapResourceMatcher(@d String resKey) {
        f0.p(resKey, "resKey");
        this.resKey = resKey;
        this.name = "HBMapResourceMatcher";
    }

    private final void readResMapFromJsonFile(String str) {
        this.readMapTask = new CancellableJob(CoroutineHelper.launchCoroutine$default(CoroutineHelper.INSTANCE, this, null, new HBMapResourceMatcher$readResMapFromJsonFile$job$1(str, this, null), 1, null));
    }

    @e
    protected final JDCacheDataSource getDataSource() {
        return this.dataSource;
    }

    @Override // com.jd.jdcache.match.base.JDCacheResourceMatcher
    @d
    public String getName() {
        return this.name;
    }

    @d
    public final String getResKey() {
        return this.resKey;
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
        StringBuilder sb2 = new StringBuilder();
        Context contextA = c.f64138a.a();
        f0.m(contextA);
        sb2.append(contextA.getFilesDir().toString());
        String str = File.separator;
        sb2.append(str);
        sb2.append("jdcache");
        sb2.append(str);
        sb2.append(this.resKey);
        sb2.append(str);
        JDCacheDataSource jDCacheDataSource = new JDCacheDataSource(sb2.toString(), false, null, null, null, 30, null);
        this.dataSource = jDCacheDataSource;
        if (jDCacheDataSource.getLocalFileMap() == null && jDCacheDataSource.getLocalFileDirDetail().exists()) {
            readResMapFromJsonFile(jDCacheDataSource.getLocalFileDirDetail().getPath() + str + "resource.json");
        }
    }

    protected final void setDataSource(@e JDCacheDataSource jDCacheDataSource) {
        this.dataSource = jDCacheDataSource;
    }

    public final void setResKey(@d String str) {
        f0.p(str, "<set-?>");
        this.resKey = str;
    }
}
