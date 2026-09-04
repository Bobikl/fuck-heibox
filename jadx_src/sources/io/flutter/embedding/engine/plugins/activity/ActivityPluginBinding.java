package io.flutter.embedding.engine.plugins.activity;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.plugin.common.PluginRegistry;

/* JADX INFO: loaded from: classes4.dex */
public interface ActivityPluginBinding {

    public interface OnSaveInstanceStateListener {
        void onRestoreInstanceState(@p0 Bundle bundle);

        void onSaveInstanceState(@n0 Bundle bundle);
    }

    void addActivityResultListener(@n0 PluginRegistry.ActivityResultListener activityResultListener);

    void addOnNewIntentListener(@n0 PluginRegistry.NewIntentListener newIntentListener);

    void addOnSaveStateListener(@n0 OnSaveInstanceStateListener onSaveInstanceStateListener);

    void addOnUserLeaveHintListener(@n0 PluginRegistry.UserLeaveHintListener userLeaveHintListener);

    void addOnWindowFocusChangedListener(@n0 PluginRegistry.WindowFocusChangedListener windowFocusChangedListener);

    void addRequestPermissionsResultListener(@n0 PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener);

    @n0
    Activity getActivity();

    @n0
    Object getLifecycle();

    void removeActivityResultListener(@n0 PluginRegistry.ActivityResultListener activityResultListener);

    void removeOnNewIntentListener(@n0 PluginRegistry.NewIntentListener newIntentListener);

    void removeOnSaveStateListener(@n0 OnSaveInstanceStateListener onSaveInstanceStateListener);

    void removeOnUserLeaveHintListener(@n0 PluginRegistry.UserLeaveHintListener userLeaveHintListener);

    void removeOnWindowFocusChangedListener(@n0 PluginRegistry.WindowFocusChangedListener windowFocusChangedListener);

    void removeRequestPermissionsResultListener(@n0 PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener);
}
