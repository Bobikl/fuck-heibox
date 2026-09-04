package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public interface TextureRegistry {

    @Keep
    public interface GLTextureConsumer {
        @n0
        SurfaceTexture getSurfaceTexture();
    }

    @Keep
    public interface ImageConsumer {
        @p0
        Image acquireLatestImage();
    }

    @Keep
    public interface ImageTextureEntry extends TextureEntry {
        void pushImage(Image image);
    }

    public interface OnFrameConsumedListener {
        void onFrameConsumed();
    }

    public interface OnTrimMemoryListener {
        void onTrimMemory(int i10);
    }

    @Keep
    public interface SurfaceProducer extends TextureEntry {
        int getHeight();

        Surface getSurface();

        int getWidth();

        void scheduleFrame();

        void setSize(int i10, int i11);
    }

    @Keep
    public interface SurfaceTextureEntry extends TextureEntry {
        void setOnFrameConsumedListener(@p0 OnFrameConsumedListener onFrameConsumedListener);

        void setOnTrimMemoryListener(@p0 OnTrimMemoryListener onTrimMemoryListener);

        @n0
        SurfaceTexture surfaceTexture();
    }

    public interface TextureEntry {
        long id();

        void release();
    }

    @n0
    ImageTextureEntry createImageTexture();

    @n0
    SurfaceProducer createSurfaceProducer();

    @n0
    SurfaceTextureEntry createSurfaceTexture();

    void onTrimMemory(int i10);

    @n0
    SurfaceTextureEntry registerSurfaceTexture(@n0 SurfaceTexture surfaceTexture);
}
