package io.flutter.embedding.android;

import androidx.annotation.n0;

/* JADX INFO: loaded from: classes4.dex */
public interface ExclusiveAppComponent<T> {
    void detachFromFlutterEngine();

    @n0
    T getAppComponent();
}
