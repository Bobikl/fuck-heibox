package io.flutter.embedding.engine.plugins.activity;

import androidx.annotation.n0;

/* JADX INFO: loaded from: classes4.dex */
public interface ActivityAware {
    void onAttachedToActivity(@n0 ActivityPluginBinding activityPluginBinding);

    void onDetachedFromActivity();

    void onDetachedFromActivityForConfigChanges();

    void onReattachedToActivityForConfigChanges(@n0 ActivityPluginBinding activityPluginBinding);
}
