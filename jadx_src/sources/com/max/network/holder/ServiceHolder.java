package com.max.network.holder;

import bb.c;
import com.max.hbutils.utils.k;
import com.max.network.HBNetworkManager;
import com.max.network.HttpLogger;
import com.max.network.config.InvalidConfigGroupException;
import com.max.network.config.NetworkConfig;
import com.max.network.interfaces.ApiService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.f;
import retrofit2.t;
import xh.m;
import yh.a;

/* JADX INFO: compiled from: ServiceHolder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceHolder {

    @d
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private static final z<okhttp3.z> client$delegate;

    @d
    private static final z<ServiceHolder> instance$delegate;

    @d
    private ConcurrentHashMap<Integer, okhttp3.z> apiClientCache;

    @d
    private final HttpLogger httpLogger;

    @d
    private ConcurrentHashMap<Integer, t> retrofitCache;

    @d
    private ConcurrentHashMap<Integer, ApiService> serviceCache;

    /* JADX INFO: compiled from: ServiceHolder.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static final /* synthetic */ okhttp3.z access$getClient(Companion companion) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{companion}, null, changeQuickRedirect, true, c.m.Xd, new Class[]{Companion.class}, okhttp3.z.class);
            return patchProxyResultProxy.isSupported ? (okhttp3.z) patchProxyResultProxy.result : companion.getClient();
        }

        private final okhttp3.z getClient() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Wd, new Class[0], okhttp3.z.class);
            return patchProxyResultProxy.isSupported ? (okhttp3.z) patchProxyResultProxy.result : (okhttp3.z) ServiceHolder.client$delegate.getValue();
        }

        @m
        private static /* synthetic */ void getClient$annotations() {
        }

        @m
        public static /* synthetic */ void getInstance$annotations() {
        }

        @d
        public final ServiceHolder getInstance() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Vd, new Class[0], ServiceHolder.class);
            return patchProxyResultProxy.isSupported ? (ServiceHolder) patchProxyResultProxy.result : (ServiceHolder) ServiceHolder.instance$delegate.getValue();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        instance$delegate = b0.b(lazyThreadSafetyMode, new a<ServiceHolder>() { // from class: com.max.network.holder.ServiceHolder$Companion$instance$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @d
            public final ServiceHolder invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34611ae, new Class[0], ServiceHolder.class);
                return patchProxyResultProxy.isSupported ? (ServiceHolder) patchProxyResultProxy.result : new ServiceHolder(null);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.max.network.holder.ServiceHolder, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ ServiceHolder invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34634be, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
        client$delegate = b0.b(lazyThreadSafetyMode, new a<okhttp3.z>() { // from class: com.max.network.holder.ServiceHolder$Companion$client$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, okhttp3.z] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ okhttp3.z invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Zd, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @d
            public final okhttp3.z invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Yd, new Class[0], okhttp3.z.class);
                return patchProxyResultProxy.isSupported ? (okhttp3.z) patchProxyResultProxy.result : new okhttp3.z();
            }
        });
    }

    private ServiceHolder() {
        this.apiClientCache = new ConcurrentHashMap<>();
        this.retrofitCache = new ConcurrentHashMap<>();
        this.serviceCache = new ConcurrentHashMap<>();
        this.httpLogger = new HttpLogger();
    }

    public /* synthetic */ ServiceHolder(u uVar) {
        this();
    }

    private final okhttp3.z buildClient(okhttp3.z zVar, NetworkConfig networkConfig) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{zVar, networkConfig}, this, changeQuickRedirect, false, c.m.Pd, new Class[]{okhttp3.z.class, NetworkConfig.class}, okhttp3.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (okhttp3.z) patchProxyResultProxy.result;
        }
        okhttp3.z.a aVarE0 = zVar.e0();
        long timeOut = networkConfig.getTimeOut();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVarE0.k(timeOut, timeUnit).j0(networkConfig.getTimeOut(), timeUnit).R0(networkConfig.getTimeOut(), timeUnit);
        Iterator<okhttp3.u> it = networkConfig.getInterceptors().iterator();
        while (it.hasNext()) {
            aVarE0.c(it.next());
        }
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(this.httpLogger);
        httpLoggingInterceptor.d(HttpLoggingInterceptor.Level.BODY);
        aVarE0.c(httpLoggingInterceptor);
        return aVarE0.f();
    }

    private final f.a createConvertor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Rd, new Class[0], f.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (f.a) patchProxyResultProxy.result;
        }
        nb.a aVarA = nb.a.a(k.c());
        f0.o(aVarA, "create(...)");
        return aVarA;
    }

    private static final okhttp3.z getClient() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.Ud, new Class[0], okhttp3.z.class);
        return patchProxyResultProxy.isSupported ? (okhttp3.z) patchProxyResultProxy.result : Companion.access$getClient(Companion);
    }

    @d
    public static final ServiceHolder getInstance() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.Td, new Class[0], ServiceHolder.class);
        return patchProxyResultProxy.isSupported ? (ServiceHolder) patchProxyResultProxy.result : Companion.getInstance();
    }

    private final okhttp3.z getOkHttpClient(int i10, NetworkConfig networkConfig) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), networkConfig}, this, changeQuickRedirect, false, c.m.Od, new Class[]{Integer.TYPE, NetworkConfig.class}, okhttp3.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (okhttp3.z) patchProxyResultProxy.result;
        }
        if (this.apiClientCache.get(Integer.valueOf(i10)) == null) {
            this.apiClientCache.put(Integer.valueOf(i10), buildClient(Companion.access$getClient(Companion), networkConfig));
        }
        okhttp3.z zVar = this.apiClientCache.get(Integer.valueOf(i10));
        f0.m(zVar);
        return zVar;
    }

    private final t getRetrofit(int i10, NetworkConfig networkConfig) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), networkConfig}, this, changeQuickRedirect, false, c.m.Qd, new Class[]{Integer.TYPE, NetworkConfig.class}, t.class);
        if (patchProxyResultProxy.isSupported) {
            return (t) patchProxyResultProxy.result;
        }
        if (this.retrofitCache.get(Integer.valueOf(i10)) == null) {
            this.retrofitCache.put(Integer.valueOf(i10), new t.b().j(getOkHttpClient(i10, networkConfig)).b(createConvertor()).e(okhttp3.t.INSTANCE.h(networkConfig.getBaseUrl())).f());
        }
        t tVar = this.retrofitCache.get(Integer.valueOf(i10));
        f0.m(tVar);
        return tVar;
    }

    @d
    public final <T extends ApiService> T getApiService(@d String group) throws InvalidConfigGroupException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{group}, this, changeQuickRedirect, false, c.m.Sd, new Class[]{String.class}, ApiService.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        f0.p(group, "group");
        NetworkConfig config = HBNetworkManager.Companion.getInstance().getConfig(group);
        int iHashCode = config.hashCode();
        if (this.serviceCache.get(Integer.valueOf(iHashCode)) == null) {
            this.serviceCache.put(Integer.valueOf(iHashCode), (ApiService) getRetrofit(iHashCode, config).g(xh.a.e(config.getApi())));
        }
        ApiService apiService = this.serviceCache.get(Integer.valueOf(iHashCode));
        f0.n(apiService, "null cannot be cast to non-null type T of com.max.network.holder.ServiceHolder.getApiService");
        return (T) apiService;
    }
}
