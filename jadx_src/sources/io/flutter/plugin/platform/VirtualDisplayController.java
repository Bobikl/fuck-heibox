package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.j1;
import androidx.annotation.n0;

/* JADX INFO: loaded from: classes4.dex */
public class VirtualDisplayController {
    private static String TAG = "VirtualDisplayController";
    private static VirtualDisplay.Callback callback = new VirtualDisplay.Callback() { // from class: io.flutter.plugin.platform.VirtualDisplayController.1
        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onPaused() {
        }

        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onResumed() {
        }
    };
    private final AccessibilityEventsDelegate accessibilityEventsDelegate;
    private final Context context;
    private final int densityDpi;
    private final View.OnFocusChangeListener focusChangeListener;

    @j1
    SingleViewPresentation presentation;
    private final PlatformViewRenderTarget renderTarget;
    private final int viewId;
    private VirtualDisplay virtualDisplay;

    public static class OneTimeOnDrawListener implements ViewTreeObserver.OnDrawListener {
        Runnable mOnDrawRunnable;
        final View mView;

        OneTimeOnDrawListener(View view, Runnable runnable) {
            this.mView = view;
            this.mOnDrawRunnable = runnable;
        }

        static void schedule(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new OneTimeOnDrawListener(view, runnable));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.mOnDrawRunnable;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.mOnDrawRunnable = null;
            this.mView.post(new Runnable() { // from class: io.flutter.plugin.platform.VirtualDisplayController.OneTimeOnDrawListener.1
                @Override // java.lang.Runnable
                public void run() {
                    OneTimeOnDrawListener.this.mView.getViewTreeObserver().removeOnDrawListener(OneTimeOnDrawListener.this);
                }
            });
        }
    }

    private VirtualDisplayController(Context context, AccessibilityEventsDelegate accessibilityEventsDelegate, VirtualDisplay virtualDisplay, PlatformView platformView, PlatformViewRenderTarget platformViewRenderTarget, View.OnFocusChangeListener onFocusChangeListener, int i10, Object obj) {
        this.context = context;
        this.accessibilityEventsDelegate = accessibilityEventsDelegate;
        this.renderTarget = platformViewRenderTarget;
        this.focusChangeListener = onFocusChangeListener;
        this.viewId = i10;
        this.virtualDisplay = virtualDisplay;
        this.densityDpi = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context, this.virtualDisplay.getDisplay(), platformView, accessibilityEventsDelegate, i10, onFocusChangeListener);
        this.presentation = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static VirtualDisplayController create(Context context, AccessibilityEventsDelegate accessibilityEventsDelegate, PlatformView platformView, PlatformViewRenderTarget platformViewRenderTarget, int i10, int i11, int i12, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        if (i10 == 0 || i11 == 0) {
            return null;
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        platformViewRenderTarget.resize(i10, i11);
        VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay("flutter-vd#" + i12, i10, i11, displayMetrics.densityDpi, platformViewRenderTarget.getSurface(), 0, callback, null);
        if (virtualDisplayCreateVirtualDisplay == null) {
            return null;
        }
        return new VirtualDisplayController(context, accessibilityEventsDelegate, virtualDisplayCreateVirtualDisplay, platformView, platformViewRenderTarget, onFocusChangeListener, i12, obj);
    }

    @TargetApi(31)
    private void resize31(View view, int i10, int i11, Runnable runnable) {
        this.renderTarget.resize(i10, i11);
        this.virtualDisplay.resize(i10, i11, this.densityDpi);
        this.virtualDisplay.setSurface(this.renderTarget.getSurface());
        view.postDelayed(runnable, 0L);
    }

    public void clearSurface() {
        this.virtualDisplay.setSurface(null);
    }

    public void dispatchTouchEvent(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null) {
            return;
        }
        singleViewPresentation.dispatchTouchEvent(motionEvent);
    }

    public void dispose() {
        this.presentation.cancel();
        this.presentation.detachState();
        this.virtualDisplay.release();
        this.renderTarget.release();
    }

    public int getRenderTargetHeight() {
        PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget != null) {
            return platformViewRenderTarget.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget != null) {
            return platformViewRenderTarget.getWidth();
        }
        return 0;
    }

    public View getView() {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }

    void onFlutterViewAttached(@n0 View view) {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.presentation.getView().onFlutterViewAttached(view);
    }

    void onFlutterViewDetached() {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.presentation.getView().onFlutterViewDetached();
    }

    void onInputConnectionLocked() {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.presentation.getView().onInputConnectionLocked();
    }

    void onInputConnectionUnlocked() {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.presentation.getView().onInputConnectionUnlocked();
    }

    public void resetSurface() {
        int renderTargetWidth = getRenderTargetWidth();
        int renderTargetHeight = getRenderTargetHeight();
        boolean zIsFocused = getView().isFocused();
        SingleViewPresentation.PresentationState presentationStateDetachState = this.presentation.detachState();
        this.virtualDisplay.setSurface(null);
        this.virtualDisplay.release();
        this.virtualDisplay = ((DisplayManager) this.context.getSystemService("display")).createVirtualDisplay("flutter-vd#" + this.viewId, renderTargetWidth, renderTargetHeight, this.densityDpi, this.renderTarget.getSurface(), 0, callback, null);
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.context, this.virtualDisplay.getDisplay(), this.accessibilityEventsDelegate, presentationStateDetachState, this.focusChangeListener, zIsFocused);
        singleViewPresentation.show();
        this.presentation.cancel();
        this.presentation = singleViewPresentation;
    }

    public void resize(int i10, int i11, final Runnable runnable) {
        if (i10 == getRenderTargetWidth() && i11 == getRenderTargetHeight()) {
            getView().postDelayed(runnable, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            resize31(getView(), i10, i11, runnable);
            return;
        }
        boolean zIsFocused = getView().isFocused();
        SingleViewPresentation.PresentationState presentationStateDetachState = this.presentation.detachState();
        this.virtualDisplay.setSurface(null);
        this.virtualDisplay.release();
        DisplayManager displayManager = (DisplayManager) this.context.getSystemService("display");
        this.renderTarget.resize(i10, i11);
        this.virtualDisplay = displayManager.createVirtualDisplay("flutter-vd#" + this.viewId, i10, i11, this.densityDpi, this.renderTarget.getSurface(), 0, callback, null);
        final View view = getView();
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: io.flutter.plugin.platform.VirtualDisplayController.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
                OneTimeOnDrawListener.schedule(view, new Runnable() { // from class: io.flutter.plugin.platform.VirtualDisplayController.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        view.postDelayed(runnable, 128L);
                    }
                });
                view.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
            }
        });
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.context, this.virtualDisplay.getDisplay(), this.accessibilityEventsDelegate, presentationStateDetachState, this.focusChangeListener, zIsFocused);
        singleViewPresentation.show();
        this.presentation.cancel();
        this.presentation = singleViewPresentation;
    }
}
