package com.ss.bytertc.base.media;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.realx.base.RXLogging;

/* JADX INFO: loaded from: classes10.dex */
public class RTCSurfaceTextureListener implements TextureView.SurfaceTextureListener {
    private final String key;
    private long nativeSurfaceHelperHandle;
    private TextureView textureView;

    RTCSurfaceTextureListener(TextureView textureView, final long j10, final String str) {
        this.nativeSurfaceHelperHandle = 0L;
        this.textureView = textureView;
        this.key = str;
        final SurfaceTexture surfaceTexture = textureView != null ? textureView.getSurfaceTexture() : null;
        this.nativeSurfaceHelperHandle = j10;
        if (surfaceTexture == null || j10 == 0) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ss.bytertc.base.media.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f97894b.lambda$new$0(surfaceTexture, j10, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(SurfaceTexture surfaceTexture, long j10, String str) {
        SurfaceTexture surfaceTexture2 = this.textureView.getSurfaceTexture();
        if (surfaceTexture2 == null || surfaceTexture2 != surfaceTexture) {
            return;
        }
        RTCSurfaceHelper.nativeSetRenderTarget(j10, new Surface(surfaceTexture2), str);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.nativeSurfaceHelperHandle != 0) {
            RXLogging.i("RTCSurfaceTextureListener", "onSurfaceTextureAvailable key:" + this.key);
            RTCSurfaceHelper.nativeSetRenderTarget(this.nativeSurfaceHelperHandle, new Surface(surfaceTexture), this.key);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.nativeSurfaceHelperHandle == 0) {
            return true;
        }
        RXLogging.i("RTCSurfaceTextureListener", "onSurfaceTextureDestroyed key:" + this.key);
        RTCSurfaceHelper.nativeSetRenderTarget(this.nativeSurfaceHelperHandle, null, this.key);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void resetCallback() {
        this.nativeSurfaceHelperHandle = 0L;
        TextureView textureView = this.textureView;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
        }
    }
}
