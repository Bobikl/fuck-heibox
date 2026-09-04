package io.flutter.plugin.platform;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.embedding.android.FlutterImageView;

/* JADX INFO: loaded from: classes4.dex */
public class PlatformOverlayView extends FlutterImageView {

    @p0
    private AccessibilityEventsDelegate accessibilityDelegate;

    public PlatformOverlayView(@n0 Context context) {
        this(context, 1, 1, null);
    }

    public PlatformOverlayView(@n0 Context context, int i10, int i11, @n0 AccessibilityEventsDelegate accessibilityEventsDelegate) {
        super(context, i10, i11, FlutterImageView.SurfaceKind.overlay);
        this.accessibilityDelegate = accessibilityEventsDelegate;
    }

    public PlatformOverlayView(@n0 Context context, @n0 AttributeSet attributeSet) {
        this(context, 1, 1, null);
    }

    @Override // android.view.View
    public boolean onHoverEvent(@n0 MotionEvent motionEvent) {
        AccessibilityEventsDelegate accessibilityEventsDelegate = this.accessibilityDelegate;
        if (accessibilityEventsDelegate == null || !accessibilityEventsDelegate.onAccessibilityHoverEvent(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }
}
