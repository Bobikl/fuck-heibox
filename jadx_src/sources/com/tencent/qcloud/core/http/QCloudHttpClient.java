package com.tencent.qcloud.core.http;

import androidx.annotation.n0;
import com.tencent.qcloud.core.auth.QCloudCredentialProvider;
import com.tencent.qcloud.core.logger.QCloudLogger;
import com.tencent.qcloud.core.task.QCloudTask;
import com.tencent.qcloud.core.task.RetryStrategy;
import com.tencent.qcloud.core.task.TaskManager;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import okhttp3.e;
import okhttp3.o;
import okhttp3.p;
import okhttp3.z;

/* JADX INFO: loaded from: classes4.dex */
public final class QCloudHttpClient {
    public static final String HTTP_LOG_TAG = "QCloudHttp";
    public static final String QUIC_LOG_TAG = "QCloudQuic";
    private static volatile QCloudHttpClient gDefault;
    private static Map<Integer, NetworkClient> networkClientMap = new HashMap(2);
    private final ConnectionRepository connectionRepository;
    private boolean dnsCache;
    private final Map<String, List<InetAddress>> dnsMap;
    private final HttpLogger httpLogger;
    private o mDns;
    private p.c mEventListenerFactory;
    private HostnameVerifier mHostnameVerifier;
    private String networkClientType;
    private final TaskManager taskManager;
    private final Set<String> verifiedHost;

    public static final class Builder {
        z.a mBuilder;
        NetworkClient networkClient;
        QCloudHttpRetryHandler qCloudHttpRetryHandler;
        RetryStrategy retryStrategy;
        int connectionTimeout = 15000;
        int socketTimeout = 30000;
        boolean enableDebugLog = false;
        List<String> prefetchHost = new LinkedList();
        boolean dnsCache = false;

        public Builder addPrefetchHost(String str) {
            this.prefetchHost.add(str);
            return this;
        }

        public QCloudHttpClient build() {
            if (this.retryStrategy == null) {
                this.retryStrategy = RetryStrategy.DEFAULT;
            }
            QCloudHttpRetryHandler qCloudHttpRetryHandler = this.qCloudHttpRetryHandler;
            if (qCloudHttpRetryHandler != null) {
                this.retryStrategy.setRetryHandler(qCloudHttpRetryHandler);
            }
            if (this.mBuilder == null) {
                this.mBuilder = new z.a();
            }
            return new QCloudHttpClient(this);
        }

        public Builder dnsCache(boolean z10) {
            this.dnsCache = z10;
            return this;
        }

        public Builder enableDebugLog(boolean z10) {
            this.enableDebugLog = z10;
            return this;
        }

        public Builder setConnectionTimeout(int i10) {
            if (i10 < 3000) {
                throw new IllegalArgumentException("connection timeout must be larger than 3 seconds.");
            }
            this.connectionTimeout = i10;
            return this;
        }

        public Builder setInheritBuilder(z.a aVar) {
            this.mBuilder = aVar;
            return this;
        }

        public Builder setNetworkClient(NetworkClient networkClient) {
            this.networkClient = networkClient;
            return this;
        }

        public Builder setQCloudHttpRetryHandler(QCloudHttpRetryHandler qCloudHttpRetryHandler) {
            this.qCloudHttpRetryHandler = qCloudHttpRetryHandler;
            return this;
        }

        public Builder setRetryStrategy(RetryStrategy retryStrategy) {
            this.retryStrategy = retryStrategy;
            return this;
        }

        public Builder setSocketTimeout(int i10) {
            if (i10 < 3000) {
                throw new IllegalArgumentException("socket timeout must be larger than 3 seconds.");
            }
            this.socketTimeout = i10;
            return this;
        }
    }

    private QCloudHttpClient(Builder builder) {
        this.networkClientType = OkHttpClientImpl.class.getName();
        this.dnsCache = true;
        this.mHostnameVerifier = new HostnameVerifier() { // from class: com.tencent.qcloud.core.http.QCloudHttpClient.1
            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str, SSLSession sSLSession) {
                if (QCloudHttpClient.this.verifiedHost.size() > 0) {
                    Iterator it = QCloudHttpClient.this.verifiedHost.iterator();
                    while (it.hasNext()) {
                        if (HttpsURLConnection.getDefaultHostnameVerifier().verify((String) it.next(), sSLSession)) {
                            return true;
                        }
                    }
                }
                return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
            }
        };
        this.mDns = new o() { // from class: com.tencent.qcloud.core.http.QCloudHttpClient.2
            @Override // okhttp3.o
            public List<InetAddress> lookup(String str) throws UnknownHostException {
                List<InetAddress> listLookup = QCloudHttpClient.this.dnsMap.containsKey(str) ? (List) QCloudHttpClient.this.dnsMap.get(str) : null;
                if (listLookup == null) {
                    try {
                        listLookup = o.f132626a.lookup(str);
                    } catch (UnknownHostException unused) {
                        QCloudLogger.w(QCloudHttpClient.HTTP_LOG_TAG, "system dns failed, retry cache dns records.", new Object[0]);
                    }
                }
                if (listLookup == null && !QCloudHttpClient.this.dnsCache) {
                    throw new UnknownHostException("can not resolve host name " + str);
                }
                if (listLookup == null) {
                    try {
                        listLookup = QCloudHttpClient.this.connectionRepository.getDnsRecord(str);
                    } catch (UnknownHostException unused2) {
                        QCloudLogger.w(QCloudHttpClient.HTTP_LOG_TAG, "Not found dns in cache records.", new Object[0]);
                    }
                }
                if (listLookup == null) {
                    throw new UnknownHostException(str);
                }
                ConnectionRepository.getInstance().insertDnsRecordCache(str, listLookup);
                return listLookup;
            }
        };
        this.mEventListenerFactory = new p.c() { // from class: com.tencent.qcloud.core.http.QCloudHttpClient.3
            @Override // okhttp3.p.c
            public p create(e eVar) {
                return new CallMetricsListener(eVar);
            }
        };
        this.verifiedHost = new HashSet(5);
        this.dnsMap = new HashMap(3);
        this.taskManager = TaskManager.getInstance();
        ConnectionRepository connectionRepository = ConnectionRepository.getInstance();
        this.connectionRepository = connectionRepository;
        HttpLogger httpLogger = new HttpLogger(false);
        this.httpLogger = httpLogger;
        setDebuggable(false);
        NetworkClient okHttpClientImpl = builder.networkClient;
        okHttpClientImpl = okHttpClientImpl == null ? new OkHttpClientImpl() : okHttpClientImpl;
        String name = okHttpClientImpl.getClass().getName();
        this.networkClientType = name;
        int iHashCode = name.hashCode();
        if (!networkClientMap.containsKey(Integer.valueOf(iHashCode))) {
            okHttpClientImpl.init(builder, hostnameVerifier(), this.mDns, httpLogger);
            networkClientMap.put(Integer.valueOf(iHashCode), okHttpClientImpl);
        }
        connectionRepository.addPrefetchHosts(builder.prefetchHost);
        connectionRepository.init();
    }

    public static QCloudHttpClient getDefault() {
        if (gDefault == null) {
            synchronized (QCloudHttpClient.class) {
                if (gDefault == null) {
                    gDefault = new Builder().build();
                }
            }
        }
        return gDefault;
    }

    private <T> HttpTask<T> handleRequest(HttpRequest<T> httpRequest, QCloudCredentialProvider qCloudCredentialProvider) {
        return new HttpTask<>(httpRequest, qCloudCredentialProvider, networkClientMap.get(Integer.valueOf(this.networkClientType.hashCode())));
    }

    private HostnameVerifier hostnameVerifier() {
        return this.mHostnameVerifier;
    }

    public void addDnsRecord(@n0 String str, @n0 String[] strArr) throws UnknownHostException {
        if (strArr.length > 0) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str2 : strArr) {
                arrayList.add(InetAddress.getByName(str2));
            }
            this.dnsMap.put(str, arrayList);
        }
    }

    public void addVerifiedHost(String str) {
        if (str != null) {
            this.verifiedHost.add(str);
        }
    }

    public List<HttpTask> getTasksByTag(String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        for (QCloudTask qCloudTask : this.taskManager.snapshot()) {
            if ((qCloudTask instanceof HttpTask) && str.equals(qCloudTask.getTag())) {
                arrayList.add((HttpTask) qCloudTask);
            }
        }
        return arrayList;
    }

    public <T> HttpTask<T> resolveRequest(HttpRequest<T> httpRequest) {
        return handleRequest(httpRequest, null);
    }

    public <T> HttpTask<T> resolveRequest(QCloudHttpRequest<T> qCloudHttpRequest, QCloudCredentialProvider qCloudCredentialProvider) {
        return handleRequest(qCloudHttpRequest, qCloudCredentialProvider);
    }

    public void setDebuggable(boolean z10) {
        this.httpLogger.setDebug(z10 || QCloudLogger.isLoggableOnLogcat(3, HTTP_LOG_TAG));
    }

    public void setNetworkClientType(Builder builder) {
        NetworkClient networkClient = builder.networkClient;
        if (networkClient != null) {
            String name = networkClient.getClass().getName();
            int iHashCode = name.hashCode();
            if (!networkClientMap.containsKey(Integer.valueOf(iHashCode))) {
                networkClient.init(builder, hostnameVerifier(), this.mDns, this.httpLogger);
                networkClientMap.put(Integer.valueOf(iHashCode), networkClient);
            }
            this.networkClientType = name;
        }
    }
}
