package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.view.Surface;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(29)
public class SurfaceProducerPlatformViewRenderTarget implements PlatformViewRenderTarget {
    private static final String TAG = "SurfaceProducerRenderTarget";
    private TextureRegistry.SurfaceProducer producer;

    public SurfaceProducerPlatformViewRenderTarget(TextureRegistry.SurfaceProducer surfaceProducer) {
        this.producer = surfaceProducer;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getHeight() {
        return this.producer.getHeight();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public long getId() {
        return this.producer.id();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public Surface getSurface() {
        return this.producer.getSurface();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getWidth() {
        return this.producer.getWidth();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public boolean isReleased() {
        return this.producer == null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void release() {
        this.producer.release();
        this.producer = null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void resize(int i10, int i11) {
        this.producer.setSize(i10, i11);
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void scheduleFrame() {
        this.producer.scheduleFrame();
    }
}
