package io.flutter.embedding.engine;

import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterEngineGroupCache {
    private static volatile FlutterEngineGroupCache instance;
    private final Map<String, FlutterEngineGroup> cachedEngineGroups = new HashMap();

    @j1
    FlutterEngineGroupCache() {
    }

    @n0
    public static FlutterEngineGroupCache getInstance() {
        if (instance == null) {
            synchronized (FlutterEngineGroupCache.class) {
                if (instance == null) {
                    instance = new FlutterEngineGroupCache();
                }
            }
        }
        return instance;
    }

    public void clear() {
        this.cachedEngineGroups.clear();
    }

    public boolean contains(@n0 String str) {
        return this.cachedEngineGroups.containsKey(str);
    }

    @p0
    public FlutterEngineGroup get(@n0 String str) {
        return this.cachedEngineGroups.get(str);
    }

    public void put(@n0 String str, @p0 FlutterEngineGroup flutterEngineGroup) {
        if (flutterEngineGroup != null) {
            this.cachedEngineGroups.put(str, flutterEngineGroup);
        } else {
            this.cachedEngineGroups.remove(str);
        }
    }

    public void remove(@n0 String str) {
        put(str, null);
    }
}
