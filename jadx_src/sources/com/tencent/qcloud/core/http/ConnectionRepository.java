package com.tencent.qcloud.core.http;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.qcloud.core.util.ContextHolder;
import com.tencent.qcloud.core.util.QCloudUtils;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import okhttp3.o;

/* JADX INFO: loaded from: classes4.dex */
public class ConnectionRepository {
    private static volatile ConnectionRepository instance;
    private LocalDnsCache localDnsCache = new LocalDnsCache(ContextHolder.getAppContext());
    private DnsFetcher dnsFetcher = new DnsFetcher();
    private Map<String, List<InetAddress>> dnsRecords = new ConcurrentHashMap();
    private Executor singleExecutor = Executors.newSingleThreadExecutor();

    public interface AsyncExecuteCompleteListener {
        void onComplete();
    }

    public static class DnsFetcher {
        private int maxRetry = 2;
        private List<String> hosts = new LinkedList();

        DnsFetcher() {
        }

        private List<InetAddress> fetch(String str, int i10) {
            if (i10 < 0) {
                return null;
            }
            try {
                return o.f132626a.lookup(str);
            } catch (UnknownHostException e10) {
                e10.printStackTrace();
                return fetch(str, i10 - 1);
            }
        }

        void addHost(String str) {
            this.hosts.add(str);
        }

        void addHosts(List<String> list) {
            this.hosts.addAll(list);
        }

        Map<String, List<InetAddress>> fetchAll() {
            List<InetAddress> listFetch;
            HashMap map = new HashMap();
            for (String str : this.hosts) {
                if (!TextUtils.isEmpty(str) && (listFetch = fetch(str, this.maxRetry)) != null) {
                    map.put(str, listFetch);
                }
            }
            return map;
        }
    }

    public static class LocalDnsCache {
        private String cacheFilePath;

        LocalDnsCache(Context context) {
            if (context != null) {
                this.cacheFilePath = context.getCacheDir().getAbsolutePath().concat("/cosSdkDnsCache.db");
            }
        }

        Map<String, List<InetAddress>> loadFromLocal() {
            byte[] bytesFromFile;
            String str = this.cacheFilePath;
            if (str != null && (bytesFromFile = QCloudUtils.readBytesFromFile(str)) != null) {
                Object object = QCloudUtils.toObject(bytesFromFile);
                if (object instanceof Map) {
                    return (Map) object;
                }
            }
            return null;
        }

        void save2Local(Map<String, List<InetAddress>> map) throws Throwable {
            if (this.cacheFilePath == null) {
                return;
            }
            QCloudUtils.writeToFile(this.cacheFilePath, QCloudUtils.toBytes(map));
        }
    }

    private ConnectionRepository() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDnsRecordsMap(Map<String, List<InetAddress>> map) {
        if (map != null) {
            this.dnsRecords.putAll(map);
        }
    }

    public static ConnectionRepository getInstance() {
        if (instance == null) {
            synchronized (ConnectionRepository.class) {
                if (instance == null) {
                    instance = new ConnectionRepository();
                }
            }
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean sameInetAddresses(List<InetAddress> list, List<InetAddress> list2) {
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!list.get(i10).getHostAddress().equals(list2.get(i10).getHostAddress())) {
                return false;
            }
        }
        return true;
    }

    public void addPrefetchHosts(List<String> list) {
        this.dnsFetcher.addHosts(list);
    }

    public List<InetAddress> getDnsRecord(String str) throws UnknownHostException {
        if (this.dnsRecords.containsKey(str)) {
            return this.dnsRecords.get(str);
        }
        throw new UnknownHostException(str);
    }

    public void init() {
        init(null);
    }

    void init(final AsyncExecuteCompleteListener asyncExecuteCompleteListener) {
        this.singleExecutor.execute(new Runnable() { // from class: com.tencent.qcloud.core.http.ConnectionRepository.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                ConnectionRepository connectionRepository = ConnectionRepository.this;
                connectionRepository.addDnsRecordsMap(connectionRepository.localDnsCache.loadFromLocal());
                ConnectionRepository connectionRepository2 = ConnectionRepository.this;
                connectionRepository2.addDnsRecordsMap(connectionRepository2.dnsFetcher.fetchAll());
                ConnectionRepository.this.localDnsCache.save2Local(ConnectionRepository.this.dnsRecords);
                AsyncExecuteCompleteListener asyncExecuteCompleteListener2 = asyncExecuteCompleteListener;
                if (asyncExecuteCompleteListener2 != null) {
                    asyncExecuteCompleteListener2.onComplete();
                }
            }
        });
    }

    public void insertDnsRecordCache(String str, List<InetAddress> list) {
        insertDnsRecordCache(str, list, null);
    }

    void insertDnsRecordCache(final String str, final List<InetAddress> list, final AsyncExecuteCompleteListener asyncExecuteCompleteListener) {
        this.singleExecutor.execute(new Runnable() { // from class: com.tencent.qcloud.core.http.ConnectionRepository.2
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                if (!ConnectionRepository.this.sameInetAddresses((List) ConnectionRepository.this.dnsRecords.get(str), list)) {
                    ConnectionRepository.this.dnsRecords.put(str, list);
                    ConnectionRepository.this.localDnsCache.save2Local(ConnectionRepository.this.dnsRecords);
                }
                AsyncExecuteCompleteListener asyncExecuteCompleteListener2 = asyncExecuteCompleteListener;
                if (asyncExecuteCompleteListener2 != null) {
                    asyncExecuteCompleteListener2.onComplete();
                }
            }
        });
    }
}
