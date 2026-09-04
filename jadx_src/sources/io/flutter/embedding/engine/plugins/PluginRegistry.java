package io.flutter.embedding.engine.plugins;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public interface PluginRegistry {
    void add(@n0 FlutterPlugin flutterPlugin);

    void add(@n0 Set<FlutterPlugin> set);

    @p0
    FlutterPlugin get(@n0 Class<? extends FlutterPlugin> cls);

    boolean has(@n0 Class<? extends FlutterPlugin> cls);

    void remove(@n0 Class<? extends FlutterPlugin> cls);

    void remove(@n0 Set<Class<? extends FlutterPlugin>> set);

    void removeAll();
}
