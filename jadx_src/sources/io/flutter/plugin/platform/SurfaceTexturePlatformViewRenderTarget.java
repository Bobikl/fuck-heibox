package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(26)
public class SurfaceTexturePlatformViewRenderTarget implements PlatformViewRenderTarget {
    private static final String TAG = "SurfaceTexturePlatformViewRenderTarget";
    private Surface surface;
    private SurfaceTexture surfaceTexture;
    private final TextureRegistry.SurfaceTextureEntry surfaceTextureEntry;
    private final TextureRegistry.OnTrimMemoryListener trimMemoryListener;
    private int bufferWidth = 0;
    private int bufferHeight = 0;
    private boolean shouldRecreateSurfaceForLowMemory = false;

    public SurfaceTexturePlatformViewRenderTarget(TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = new TextureRegistry.OnTrimMemoryListener() { // from class: io.flutter.plugin.platform.SurfaceTexturePlatformViewRenderTarget.1
            @Override // io.flutter.view.TextureRegistry.OnTrimMemoryListener
            public void onTrimMemory(int i10) {
                if (i10 != 80 || Build.VERSION.SDK_INT < 29) {
                    return;
                }
                SurfaceTexturePlatformViewRenderTarget.this.shouldRecreateSurfaceForLowMemory = true;
            }
        };
        this.trimMemoryListener = onTrimMemoryListener;
        this.surfaceTextureEntry = surfaceTextureEntry;
        this.surfaceTexture = surfaceTextureEntry.surfaceTexture();
        surfaceTextureEntry.setOnTrimMemoryListener(onTrimMemoryListener);
    }

    private void recreateSurfaceIfNeeded() {
        Surface surface = this.surface;
        if (surface == null || this.shouldRecreateSurfaceForLowMemory) {
            if (surface != null) {
                surface.release();
                this.surface = null;
            }
            this.surface = createSurface();
            this.shouldRecreateSurfaceForLowMemory = false;
        }
    }

    protected Surface createSurface() {
        return new Surface(this.surfaceTexture);
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getHeight() {
        return this.bufferHeight;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public long getId() {
        return this.surfaceTextureEntry.id();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public Surface getSurface() {
        recreateSurfaceIfNeeded();
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return this.surface;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getWidth() {
        return this.bufferWidth;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public boolean isReleased() {
        return this.surfaceTexture == null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void release() {
        this.surfaceTexture = null;
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void resize(int i10, int i11) {
        this.bufferWidth = i10;
        this.bufferHeight = i11;
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i10, i11);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public /* synthetic */ void scheduleFrame() {
        g.a(this);
    }
}
