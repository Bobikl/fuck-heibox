package io.flutter.plugins.urllauncher;

import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.PluginRegistry;

/* JADX INFO: loaded from: classes4.dex */
public final class UrlLauncherPlugin implements FlutterPlugin, ActivityAware {
    private static final String TAG = "UrlLauncherPlugin";

    @p0
    private UrlLauncher urlLauncher;

    public static void registerWith(@n0 PluginRegistry.Registrar registrar) {
        UrlLauncher urlLauncher = new UrlLauncher(registrar.context());
        urlLauncher.setActivity(registrar.activity());
        f.g(registrar.messenger(), urlLauncher);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(@n0 ActivityPluginBinding activityPluginBinding) {
        UrlLauncher urlLauncher = this.urlLauncher;
        if (urlLauncher == null) {
            Log.wtf(TAG, "urlLauncher was never set.");
        } else {
            urlLauncher.setActivity(activityPluginBinding.getActivity());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.urlLauncher = new UrlLauncher(flutterPluginBinding.getApplicationContext());
        f.g(flutterPluginBinding.getBinaryMessenger(), this.urlLauncher);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        UrlLauncher urlLauncher = this.urlLauncher;
        if (urlLauncher == null) {
            Log.wtf(TAG, "urlLauncher was never set.");
        } else {
            urlLauncher.setActivity(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        if (this.urlLauncher == null) {
            Log.wtf(TAG, "Already detached from the engine.");
        } else {
            f.g(flutterPluginBinding.getBinaryMessenger(), null);
            this.urlLauncher = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(@n0 ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
