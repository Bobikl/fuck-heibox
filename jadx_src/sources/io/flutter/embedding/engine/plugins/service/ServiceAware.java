package io.flutter.embedding.engine.plugins.service;

import androidx.annotation.n0;

/* JADX INFO: loaded from: classes4.dex */
public interface ServiceAware {

    public interface OnModeChangeListener {
        void onMoveToBackground();

        void onMoveToForeground();
    }

    void onAttachedToService(@n0 ServicePluginBinding servicePluginBinding);

    void onDetachedFromService();
}
