package com.max.network.config;

import androidx.collection.k;
import bb.c;
import com.max.network.interfaces.ApiService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import okhttp3.u;

/* JADX INFO: compiled from: NetworkConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@t0({"SMAP\nNetworkConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkConfig.kt\ncom/max/network/config/NetworkConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1549#2:40\n1620#2,3:41\n*S KotlinDebug\n*F\n+ 1 NetworkConfig.kt\ncom/max/network/config/NetworkConfig\n*L\n36#1:40\n36#1:41,3\n*E\n"})
public final class NetworkConfig {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final kotlin.reflect.d<? extends ApiService> api;

    @d
    private final String baseUrl;

    @d
    private final ArrayList<u> interceptors;
    private final long timeOut;

    public NetworkConfig(@d kotlin.reflect.d<? extends ApiService> api, @d String baseUrl, long j10) {
        f0.p(api, "api");
        f0.p(baseUrl, "baseUrl");
        this.api = api;
        this.baseUrl = baseUrl;
        this.timeOut = j10;
        this.interceptors = new ArrayList<>();
    }

    public /* synthetic */ NetworkConfig(kotlin.reflect.d dVar, String str, long j10, int i10, kotlin.jvm.internal.u uVar) {
        this(dVar, str, (i10 & 4) != 0 ? 20L : j10);
    }

    public static /* synthetic */ NetworkConfig copy$default(NetworkConfig networkConfig, kotlin.reflect.d dVar, String str, long j10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{networkConfig, dVar, str, new Long(j10), new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.f34887md, new Class[]{NetworkConfig.class, kotlin.reflect.d.class, String.class, Long.TYPE, Integer.TYPE, Object.class}, NetworkConfig.class);
        if (patchProxyResultProxy.isSupported) {
            return (NetworkConfig) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            dVar = networkConfig.api;
        }
        if ((i10 & 2) != 0) {
            str = networkConfig.baseUrl;
        }
        if ((i10 & 4) != 0) {
            j10 = networkConfig.timeOut;
        }
        return networkConfig.copy(dVar, str, j10);
    }

    public final void appendInterceptors(@d List<? extends u> interceptorList) {
        if (PatchProxy.proxy(new Object[]{interceptorList}, this, changeQuickRedirect, false, c.m.f34795id, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(interceptorList, "interceptorList");
        this.interceptors.addAll(interceptorList);
    }

    @d
    public final kotlin.reflect.d<? extends ApiService> component1() {
        return this.api;
    }

    @d
    public final String component2() {
        return this.baseUrl;
    }

    public final long component3() {
        return this.timeOut;
    }

    @d
    public final NetworkConfig copy() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34841kd, new Class[0], NetworkConfig.class);
        if (patchProxyResultProxy.isSupported) {
            return (NetworkConfig) patchProxyResultProxy.result;
        }
        NetworkConfig networkConfig = new NetworkConfig(this.api, this.baseUrl, this.timeOut);
        ArrayList<u> arrayList = this.interceptors;
        ArrayList arrayList2 = new ArrayList(t.Y(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((u) it.next());
        }
        networkConfig.setInterceptors(arrayList2);
        return networkConfig;
    }

    @d
    public final NetworkConfig copy(@d kotlin.reflect.d<? extends ApiService> api, @d String baseUrl, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{api, baseUrl, new Long(j10)}, this, changeQuickRedirect, false, c.m.f34864ld, new Class[]{kotlin.reflect.d.class, String.class, Long.TYPE}, NetworkConfig.class);
        if (patchProxyResultProxy.isSupported) {
            return (NetworkConfig) patchProxyResultProxy.result;
        }
        f0.p(api, "api");
        f0.p(baseUrl, "baseUrl");
        return new NetworkConfig(api, baseUrl, j10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.f34956pd, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkConfig)) {
            return false;
        }
        NetworkConfig networkConfig = (NetworkConfig) obj;
        return f0.g(this.api, networkConfig.api) && f0.g(this.baseUrl, networkConfig.baseUrl) && this.timeOut == networkConfig.timeOut;
    }

    @d
    public final kotlin.reflect.d<? extends ApiService> getApi() {
        return this.api;
    }

    @d
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @d
    public final List<u> getInterceptors() {
        return this.interceptors;
    }

    public final long getTimeOut() {
        return this.timeOut;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34933od, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((this.api.hashCode() * 31) + this.baseUrl.hashCode()) * 31) + k.a(this.timeOut);
    }

    public final void setInterceptors(@d List<? extends u> interceptorList) {
        if (PatchProxy.proxy(new Object[]{interceptorList}, this, changeQuickRedirect, false, c.m.f34818jd, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(interceptorList, "interceptorList");
        this.interceptors.clear();
        this.interceptors.addAll(interceptorList);
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34910nd, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "NetworkConfig(api=" + this.api + ", baseUrl=" + this.baseUrl + ", timeOut=" + this.timeOut + ')';
    }
}
