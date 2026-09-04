package com.ss.bytertc.base.media;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.realx.base.RXLogging;

/* JADX INFO: loaded from: classes10.dex */
public class RTCSurfaceViewListener implements SurfaceHolder.Callback {
    private final String key;
    private long nativeSurfaceHelperHandle;
    private SurfaceView surfaceView;

    RTCSurfaceViewListener(SurfaceView surfaceView, final long j10, final String str) {
        SurfaceHolder holder;
        Surface surface;
        this.nativeSurfaceHelperHandle = j10;
        this.surfaceView = surfaceView;
        this.key = str;
        final Surface surface2 = (surfaceView == null || surfaceView.getHolder() == null || (holder = this.surfaceView.getHolder()) == null || holder.getSurface() == null || (surface = holder.getSurface()) == null || !surface.isValid()) ? null : holder.getSurface();
        if (surface2 == null || this.nativeSurfaceHelperHandle == 0) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ss.bytertc.base.media.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f97898b.lambda$new$0(surface2, j10, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Surface surface, long j10, String str) {
        Surface surface2 = this.surfaceView.getHolder().getSurface();
        if (surface2 != null && surface2.isValid() && surface2 == surface) {
            RTCSurfaceHelper.nativeSetRenderTarget(j10, surface2, str);
        }
    }

    public void resetCallback() {
        this.nativeSurfaceHelperHandle = 0L;
        SurfaceView surfaceView = this.surfaceView;
        if (surfaceView != null) {
            surfaceView.getHolder().removeCallback(this);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.nativeSurfaceHelperHandle == 0 || surfaceHolder == null || surfaceHolder.getSurface() == null || !surfaceHolder.getSurface().isValid()) {
            return;
        }
        RXLogging.i("RTCSurfaceViewListener", "surfaceCreated key:" + this.key);
        RTCSurfaceHelper.nativeSetRenderTarget(this.nativeSurfaceHelperHandle, surfaceHolder.getSurface(), this.key);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.nativeSurfaceHelperHandle != 0) {
            RXLogging.i("RTCSurfaceViewListener", "surfaceDestroyed key:" + this.key);
            RTCSurfaceHelper.nativeSetRenderTarget(this.nativeSurfaceHelperHandle, null, this.key);
        }
    }
}
