package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes4.dex */
public final class SurfaceTextureSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.GLTextureConsumer {

    @n0
    private final FlutterJNI flutterJNI;

    @n0
    private final Handler handler;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f119450id;
    private boolean released;
    private int requestBufferWidth;
    private int requestedBufferHeight;

    @p0
    private Surface surface;

    @n0
    private final TextureRegistry.SurfaceTextureEntry texture;

    SurfaceTextureSurfaceProducer(long j10, @n0 Handler handler, @n0 FlutterJNI flutterJNI, @n0 TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        this.f119450id = j10;
        this.handler = handler;
        this.flutterJNI = flutterJNI;
        this.texture = surfaceTextureEntry;
    }

    protected void finalize() throws Throwable {
        try {
            if (this.released) {
                return;
            }
            release();
            this.handler.post(new FlutterRenderer.TextureFinalizerRunnable(this.f119450id, this.flutterJNI));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public int getHeight() {
        return this.requestedBufferHeight;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public Surface getSurface() {
        if (this.surface == null) {
            this.surface = new Surface(this.texture.surfaceTexture());
        }
        return this.surface;
    }

    @Override // io.flutter.view.TextureRegistry.GLTextureConsumer
    @n0
    public SurfaceTexture getSurfaceTexture() {
        return this.texture.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public int getWidth() {
        return this.requestBufferWidth;
    }

    @Override // io.flutter.view.TextureRegistry.TextureEntry
    public long id() {
        return this.f119450id;
    }

    @Override // io.flutter.view.TextureRegistry.TextureEntry
    public void release() {
        this.texture.release();
        this.released = true;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void scheduleFrame() {
        this.flutterJNI.markTextureFrameAvailable(this.f119450id);
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void setSize(int i10, int i11) {
        this.requestBufferWidth = i10;
        this.requestedBufferHeight = i11;
        getSurfaceTexture().setDefaultBufferSize(i10, i11);
    }
}
