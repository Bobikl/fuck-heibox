package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.Log;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.RenderSurface;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterTextureView extends TextureView implements RenderSurface {
    private static final String TAG = "FlutterTextureView";

    @p0
    private FlutterRenderer flutterRenderer;
    private boolean isPaused;
    private boolean isSurfaceAvailableForRendering;

    @p0
    private Surface renderSurface;
    private final TextureView.SurfaceTextureListener surfaceTextureListener;

    public FlutterTextureView(@n0 Context context) {
        this(context, null);
    }

    public FlutterTextureView(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isPaused = false;
        this.surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: io.flutter.embedding.android.FlutterTextureView.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
                Log.v(FlutterTextureView.TAG, "SurfaceTextureListener.onSurfaceTextureAvailable()");
                FlutterTextureView.this.isSurfaceAvailableForRendering = true;
                if (FlutterTextureView.this.shouldNotify()) {
                    FlutterTextureView.this.connectSurfaceToRenderer();
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(@n0 SurfaceTexture surfaceTexture) {
                Log.v(FlutterTextureView.TAG, "SurfaceTextureListener.onSurfaceTextureDestroyed()");
                FlutterTextureView.this.isSurfaceAvailableForRendering = false;
                if (FlutterTextureView.this.shouldNotify()) {
                    FlutterTextureView.this.disconnectSurfaceFromRenderer();
                }
                if (FlutterTextureView.this.renderSurface == null) {
                    return true;
                }
                FlutterTextureView.this.renderSurface.release();
                FlutterTextureView.this.renderSurface = null;
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(@n0 SurfaceTexture surfaceTexture, int i10, int i11) {
                Log.v(FlutterTextureView.TAG, "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
                if (FlutterTextureView.this.shouldNotify()) {
                    FlutterTextureView.this.changeSurfaceSize(i10, i11);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(@n0 SurfaceTexture surfaceTexture) {
            }
        };
        init();
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
        if (this.flutterRenderer == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.renderSurface;
        if (surface != null) {
            surface.release();
            this.renderSurface = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.renderSurface = surface2;
        this.flutterRenderer.startRenderingToSurface(surface2, this.isPaused);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnectSurfaceFromRenderer() {
        FlutterRenderer flutterRenderer = this.flutterRenderer;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.stopRenderingToSurface();
        Surface surface = this.renderSurface;
        if (surface != null) {
            surface.release();
            this.renderSurface = null;
        }
    }

    private void init() {
        setSurfaceTextureListener(this.surfaceTextureListener);
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
        this.flutterRenderer = null;
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
        if (this.flutterRenderer == null) {
            Log.w(TAG, "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (isSurfaceAvailableForRendering()) {
            Log.v(TAG, "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            connectSurfaceToRenderer();
        }
        this.isPaused = false;
    }

    @j1
    public void setRenderSurface(Surface surface) {
        this.renderSurface = surface;
    }
}
