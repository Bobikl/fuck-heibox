package io.flutter.embedding.engine.plugins.service;

import android.app.Service;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public interface ServicePluginBinding {
    void addOnModeChangeListener(@n0 ServiceAware.OnModeChangeListener onModeChangeListener);

    @p0
    Object getLifecycle();

    @n0
    Service getService();

    void removeOnModeChangeListener(@n0 ServiceAware.OnModeChangeListener onModeChangeListener);
}
