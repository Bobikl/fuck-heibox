package io.flutter.embedding.engine;

import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterEngineCache {
    private static FlutterEngineCache instance;
    private final Map<String, FlutterEngine> cachedEngines = new HashMap();

    @j1
    FlutterEngineCache() {
    }

    @n0
    public static FlutterEngineCache getInstance() {
        if (instance == null) {
            instance = new FlutterEngineCache();
        }
        return instance;
    }

    public void clear() {
        this.cachedEngines.clear();
    }

    public boolean contains(@n0 String str) {
        return this.cachedEngines.containsKey(str);
    }

    @p0
    public FlutterEngine get(@n0 String str) {
        return this.cachedEngines.get(str);
    }

    public void put(@n0 String str, @p0 FlutterEngine flutterEngine) {
        if (flutterEngine != null) {
            this.cachedEngines.put(str, flutterEngine);
        } else {
            this.cachedEngines.remove(str);
        }
    }

    public void remove(@n0 String str) {
        put(str, null);
    }
}
