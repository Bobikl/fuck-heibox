package io.flutter.plugin.platform;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public interface PlatformView {
    void dispose();

    @p0
    View getView();

    @SuppressLint({"NewApi"})
    void onFlutterViewAttached(@n0 View view);

    @SuppressLint({"NewApi"})
    void onFlutterViewDetached();

    @SuppressLint({"NewApi"})
    void onInputConnectionLocked();

    @SuppressLint({"NewApi"})
    void onInputConnectionUnlocked();
}
