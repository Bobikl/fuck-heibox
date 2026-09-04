package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.Log;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.renderer.RenderSurface;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterSurfaceView extends SurfaceView implements RenderSurface {
    private static final String TAG = "FlutterSurfaceView";

    @p0
    private FlutterRenderer flutterRenderer;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    private boolean isPaused;
    private boolean isSurfaceAvailableForRendering;
    private final boolean renderTransparently;
    private final SurfaceHolder.Callback surfaceCallback;

    public FlutterSurfaceView(@n0 Context context) {
        this(context, null, false);
    }

    public FlutterSurfaceView(@n0 Context context, @n0 AttributeSet attributeSet) {
        this(context, attributeSet, false);
    }

    private FlutterSurfaceView(@n0 Context context, @p0 AttributeSet attributeSet, boolean z10) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isPaused = false;
        this.surfaceCallback = new SurfaceHolder.Callback() { // from class: io.flutter.embedding.android.FlutterSurfaceView.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@n0 SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
                Log.v(FlutterSurfaceView.TAG, "SurfaceHolder.Callback.surfaceChanged()");
                if (FlutterSurfaceView.this.shouldNotify()) {
                    FlutterSurfaceView.this.changeSurfaceSize(i11, i12);
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@n0 SurfaceHolder surfaceHolder) {
                Log.v(FlutterSurfaceView.TAG, "SurfaceHolder.Callback.startRenderingToSurface()");
                FlutterSurfaceView.this.isSurfaceAvailableForRendering = true;
                if (FlutterSurfaceView.this.shouldNotify()) {
                    FlutterSurfaceView.this.connectSurfaceToRenderer();
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@n0 SurfaceHolder surfaceHolder) {
                Log.v(FlutterSurfaceView.TAG, "SurfaceHolder.Callback.stopRenderingToSurface()");
                FlutterSurfaceView.this.isSurfaceAvailableForRendering = false;
                if (FlutterSurfaceView.this.shouldNotify()) {
                    FlutterSurfaceView.this.disconnectSurfaceFromRenderer();
                }
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterSurfaceView.2
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                Log.v(FlutterSurfaceView.TAG, "onFlutterUiDisplayed()");
                FlutterSurfaceView.this.setAlpha(1.0f);
                if (FlutterSurfaceView.this.flutterRenderer != null) {
                    FlutterSurfaceView.this.flutterRenderer.removeIsDisplayingFlutterUiListener(this);
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
            }
        };
        this.renderTransparently = z10;
        init();
    }

    public FlutterSurfaceView(@n0 Context context, boolean z10) {
        this(context, null, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeSurfaceSize(int i10, int i11) {
        if (this.flutterRenderer == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        Log.v(TAG, "Notifying FlutterRenderer that Android surface size has changed to " + i10 + " x " + i11);
        this.flutterRenderer.surfaceChanged(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectSurfaceToRenderer() {
        if (this.flutterRenderer == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.flutterRenderer.startRenderingToSurface(getHolder().getSurface(), this.isPaused);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnectSurfaceFromRenderer() {
        FlutterRenderer flutterRenderer = this.flutterRenderer;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.stopRenderingToSurface();
    }

    private void init() {
        if (this.renderTransparently) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.surfaceCallback);
        setAlpha(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldNotify() {
        return (this.flutterRenderer == null || this.isPaused) ? false : true;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void attachToRenderer(@n0 FlutterRenderer flutterRenderer) {
        Log.v(TAG, "Attaching to FlutterRenderer.");
        if (this.flutterRenderer != null) {
            Log.v(TAG, "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.flutterRenderer.stopRenderingToSurface();
            this.flutterRenderer.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        }
        this.flutterRenderer = flutterRenderer;
        resume();
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void detachFromRenderer() {
        if (this.flutterRenderer == null) {
            Log.w(TAG, "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            Log.v(TAG, "Disconnecting FlutterRenderer from Android surface.");
            disconnectSurfaceFromRenderer();
        }
        setAlpha(0.0f);
        this.flutterRenderer.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        this.flutterRenderer = null;
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], (getRight() + i10) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    @p0
    public FlutterRenderer getAttachedRenderer() {
        return this.flutterRenderer;
    }

    @j1
    boolean isSurfaceAvailableForRendering() {
        return this.isSurfaceAvailableForRendering;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void pause() {
        if (this.flutterRenderer == null) {
            Log.w(TAG, "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.isPaused = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void resume() {
        FlutterRenderer flutterRenderer = this.flutterRenderer;
        if (flutterRenderer == null) {
            Log.w(TAG, "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        flutterRenderer.addIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        if (isSurfaceAvailableForRendering()) {
            Log.v(TAG, "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            connectSurfaceToRenderer();
        }
        this.isPaused = false;
    }
}
