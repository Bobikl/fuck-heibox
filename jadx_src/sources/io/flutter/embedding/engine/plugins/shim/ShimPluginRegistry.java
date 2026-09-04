package io.flutter.embedding.engine.plugins.shim;

import androidx.annotation.n0;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.PluginRegistry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class ShimPluginRegistry implements PluginRegistry {
    private static final String TAG = "ShimPluginRegistry";
    private final FlutterEngine flutterEngine;
    private final Map<String, Object> pluginMap = new HashMap();
    private final ShimRegistrarAggregate shimRegistrarAggregate;

    public static class ShimRegistrarAggregate implements FlutterPlugin, ActivityAware {
        private ActivityPluginBinding activityPluginBinding;
        private FlutterPlugin.FlutterPluginBinding flutterPluginBinding;
        private final Set<ShimRegistrar> shimRegistrars;

        private ShimRegistrarAggregate() {
            this.shimRegistrars = new HashSet();
        }

        public void addPlugin(@n0 ShimRegistrar shimRegistrar) {
            this.shimRegistrars.add(shimRegistrar);
            FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.flutterPluginBinding;
            if (flutterPluginBinding != null) {
                shimRegistrar.onAttachedToEngine(flutterPluginBinding);
            }
            ActivityPluginBinding activityPluginBinding = this.activityPluginBinding;
            if (activityPluginBinding != null) {
                shimRegistrar.onAttachedToActivity(activityPluginBinding);
            }
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
        public void onAttachedToActivity(@n0 ActivityPluginBinding activityPluginBinding) {
            this.activityPluginBinding = activityPluginBinding;
            Iterator<ShimRegistrar> it = this.shimRegistrars.iterator();
            while (it.hasNext()) {
                it.next().onAttachedToActivity(activityPluginBinding);
            }
        }

        @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
        public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
            this.flutterPluginBinding = flutterPluginBinding;
            Iterator<ShimRegistrar> it = this.shimRegistrars.iterator();
            while (it.hasNext()) {
                it.next().onAttachedToEngine(flutterPluginBinding);
            }
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
        public void onDetachedFromActivity() {
            Iterator<ShimRegistrar> it = this.shimRegistrars.iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromActivity();
            }
            this.activityPluginBinding = null;
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
        public void onDetachedFromActivityForConfigChanges() {
            Iterator<ShimRegistrar> it = this.shimRegistrars.iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromActivity();
            }
            this.activityPluginBinding = null;
        }

        @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
        public void onDetachedFromEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
            Iterator<ShimRegistrar> it = this.shimRegistrars.iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromEngine(flutterPluginBinding);
            }
            this.flutterPluginBinding = null;
            this.activityPluginBinding = null;
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
        public void onReattachedToActivityForConfigChanges(@n0 ActivityPluginBinding activityPluginBinding) {
            this.activityPluginBinding = activityPluginBinding;
            Iterator<ShimRegistrar> it = this.shimRegistrars.iterator();
            while (it.hasNext()) {
                it.next().onReattachedToActivityForConfigChanges(activityPluginBinding);
            }
        }
    }

    public ShimPluginRegistry(@n0 FlutterEngine flutterEngine) {
        this.flutterEngine = flutterEngine;
        ShimRegistrarAggregate shimRegistrarAggregate = new ShimRegistrarAggregate();
        this.shimRegistrarAggregate = shimRegistrarAggregate;
        flutterEngine.getPlugins().add(shimRegistrarAggregate);
    }

    @Override // io.flutter.plugin.common.PluginRegistry
    public boolean hasPlugin(@n0 String str) {
        return this.pluginMap.containsKey(str);
    }

    @Override // io.flutter.plugin.common.PluginRegistry
    @n0
    public PluginRegistry.Registrar registrarFor(@n0 String str) {
        Log.v(TAG, "Creating plugin Registrar for '" + str + "'");
        if (!this.pluginMap.containsKey(str)) {
            this.pluginMap.put(str, null);
            ShimRegistrar shimRegistrar = new ShimRegistrar(str, this.pluginMap);
            this.shimRegistrarAggregate.addPlugin(shimRegistrar);
            return shimRegistrar;
        }
        throw new IllegalStateException("Plugin key " + str + " is already in use");
    }

    @Override // io.flutter.plugin.common.PluginRegistry
    public <T> T valuePublishedByPlugin(@n0 String str) {
        return (T) this.pluginMap.get(str);
    }
}
