package io.flutter.plugin.platform;

import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.view.AccessibilityBridge;

/* JADX INFO: loaded from: classes4.dex */
public interface PlatformViewsAccessibilityDelegate {
    void attachAccessibilityBridge(@n0 AccessibilityBridge accessibilityBridge);

    void detachAccessibilityBridge();

    @p0
    View getPlatformViewById(int i10);

    boolean usesVirtualDisplay(int i10);
}
