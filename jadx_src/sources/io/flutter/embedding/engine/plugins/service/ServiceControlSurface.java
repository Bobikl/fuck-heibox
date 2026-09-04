package io.flutter.embedding.engine.plugins.service;

import android.app.Service;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes4.dex */
public interface ServiceControlSurface {
    void attachToService(@n0 Service service, @p0 Lifecycle lifecycle, boolean z10);

    void detachFromService();

    void onMoveToBackground();

    void onMoveToForeground();
}
