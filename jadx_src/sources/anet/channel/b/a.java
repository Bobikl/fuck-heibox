package anet.channel.b;

import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import anetwork.channel.cache.Cache;
import com.taobao.alivfssdk.cache.AVFSCache;
import com.taobao.alivfssdk.cache.AVFSCacheConfig;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.IAVFSCache;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a implements Cache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f29614a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Object f29615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Object f29616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Object f29617d;

    static {
        try {
            Class.forName("com.taobao.alivfssdk.cache.AVFSCacheManager");
            f29615b = new b();
            f29616c = new c();
            f29617d = new d();
        } catch (ClassNotFoundException unused) {
            f29614a = false;
            ALog.w("anet.AVFSCacheImpl", "no alivfs sdk!", null, new Object[0]);
        }
    }

    private IAVFSCache b() {
        AVFSCache aVFSCacheCacheForModule = AVFSCacheManager.getInstance().cacheForModule("networksdk.httpcache");
        if (aVFSCacheCacheForModule != null) {
            return aVFSCacheCacheForModule.getFileCache();
        }
        return null;
    }

    public void a() {
        AVFSCache aVFSCacheCacheForModule;
        if (f29614a && (aVFSCacheCacheForModule = AVFSCacheManager.getInstance().cacheForModule("networksdk.httpcache")) != null) {
            AVFSCacheConfig aVFSCacheConfig = new AVFSCacheConfig();
            aVFSCacheConfig.limitSize = 5242880L;
            aVFSCacheConfig.fileMemMaxSize = 1048576L;
            aVFSCacheCacheForModule.moduleConfig(aVFSCacheConfig);
        }
    }

    @Override // anetwork.channel.cache.Cache
    public void clear() {
        if (f29614a) {
            try {
                IAVFSCache iAVFSCacheB = b();
                if (iAVFSCacheB != null) {
                    iAVFSCacheB.removeAllObject((IAVFSCache.OnAllObjectRemoveCallback) f29617d);
                }
            } catch (Exception e10) {
                ALog.e("anet.AVFSCacheImpl", "clear cache failed", null, e10, new Object[0]);
            }
        }
    }

    @Override // anetwork.channel.cache.Cache
    public Cache.Entry get(String str) {
        if (!f29614a) {
            return null;
        }
        try {
            IAVFSCache iAVFSCacheB = b();
            if (iAVFSCacheB != null) {
                return (Cache.Entry) iAVFSCacheB.objectForKey(StringUtils.md5ToHex(str));
            }
        } catch (Exception e10) {
            ALog.e("anet.AVFSCacheImpl", "get cache failed", null, e10, new Object[0]);
        }
        return null;
    }

    @Override // anetwork.channel.cache.Cache
    public void put(String str, Cache.Entry entry) {
        if (f29614a) {
            try {
                IAVFSCache iAVFSCacheB = b();
                if (iAVFSCacheB != null) {
                    iAVFSCacheB.setObjectForKey(StringUtils.md5ToHex(str), entry, (IAVFSCache.OnObjectSetCallback) f29615b);
                }
            } catch (Exception e10) {
                ALog.e("anet.AVFSCacheImpl", "put cache failed", null, e10, new Object[0]);
            }
        }
    }

    @Override // anetwork.channel.cache.Cache
    public void remove(String str) {
        if (f29614a) {
            try {
                IAVFSCache iAVFSCacheB = b();
                if (iAVFSCacheB != null) {
                    iAVFSCacheB.removeObjectForKey(StringUtils.md5ToHex(str), (IAVFSCache.OnObjectRemoveCallback) f29616c);
                }
            } catch (Exception e10) {
                ALog.e("anet.AVFSCacheImpl", "remove cache failed", null, e10, new Object[0]);
            }
        }
    }
}
