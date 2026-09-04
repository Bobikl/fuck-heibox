package io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.view.AccessibilityBridge;

/* JADX INFO: loaded from: classes4.dex */
public class AccessibilityEventsDelegate {
    private AccessibilityBridge accessibilityBridge;

    AccessibilityEventsDelegate() {
    }

    public boolean onAccessibilityHoverEvent(MotionEvent motionEvent, boolean z10) {
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null) {
            return false;
        }
        return accessibilityBridge.onAccessibilityHoverEvent(motionEvent, z10);
    }

    public boolean requestSendAccessibilityEvent(@n0 View view, @n0 View view2, @n0 AccessibilityEvent accessibilityEvent) {
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null) {
            return false;
        }
        return accessibilityBridge.externalViewRequestSendAccessibilityEvent(view, view2, accessibilityEvent);
    }

    void setAccessibilityBridge(@p0 AccessibilityBridge accessibilityBridge) {
        this.accessibilityBridge = accessibilityBridge;
    }
}
