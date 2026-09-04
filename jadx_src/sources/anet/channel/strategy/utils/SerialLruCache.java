package anet.channel.strategy.utils;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class SerialLruCache<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29980a;

    public SerialLruCache(int i10) {
        super(i10 + 1, 1.0f, true);
        this.f29980a = i10;
    }

    @Deprecated
    public SerialLruCache(LinkedHashMap<K, V> linkedHashMap) {
        this(linkedHashMap, 256);
    }

    public SerialLruCache(LinkedHashMap<K, V> linkedHashMap, int i10) {
        super(linkedHashMap);
        this.f29980a = i10;
    }

    public boolean entryRemoved(Map.Entry<K, V> entry) {
        return true;
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.f29980a) {
            return entryRemoved(entry);
        }
        return false;
    }
}
