package pl.droidsonroids.gif;

import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* JADX INFO: compiled from: PlaceholderDrawingSurfaceTextureListener.java */
/* JADX INFO: loaded from: classes5.dex */
public class o implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GifTextureView.b f138396b;

    o(GifTextureView.b bVar) {
        this.f138396b = bVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        Surface surface = new Surface(surfaceTexture);
        Canvas canvasLockCanvas = surface.lockCanvas(null);
        this.f138396b.a(canvasLockCanvas);
        surface.unlockCanvasAndPost(canvasLockCanvas);
        surface.release();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
