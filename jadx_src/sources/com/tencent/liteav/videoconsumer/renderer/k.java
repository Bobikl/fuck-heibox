package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.TXCCloudVideoViewMethodInvoker;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends RenderViewHelperInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    TextureView f100602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f100603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CustomHandler f100604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.tencent.liteav.base.b.b f100605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RenderViewHelperInterface.RenderViewListener f100606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TXCloudVideoView f100607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Size f100608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private GLConstants.GLScaleType f100609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SurfaceTexture f100610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f100611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Matrix f100612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f100613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private SurfaceTexture f100614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Size f100615n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f100616o;

    /* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.k$1, reason: invalid class name */
    public final class AnonymousClass1 implements TextureView.SurfaceTextureListener {
        AnonymousClass1() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            LiteavLog.i(k.this.f100603b, "onSurfaceTextureAvailable, size:" + i10 + "x" + i11 + " surfaceTexture:" + surfaceTexture + " mSavedSurfaceTexture:" + k.this.f100610i);
            k.this.b(k.this.a(surfaceTexture));
            k kVar = k.this;
            kVar.b(kVar.f100602a);
            k.this.f100615n.width = i10;
            k.this.f100615n.height = i11;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            LiteavLog.i(k.this.f100603b, "onSurfaceTextureDestroyed surface:" + surfaceTexture + " mTextureView:" + k.this.f100602a);
            k.this.a();
            if (k.this.f100602a == null) {
                return true;
            }
            k.this.f100610i = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            LiteavLog.i(k.this.f100605d.a("surfaceSizeChanged"), k.this.f100603b, "onSurfaceTextureSizeChanged, size: %dx%d", Integer.valueOf(i10), Integer.valueOf(i11));
            k.this.b(surfaceTexture);
            k kVar = k.this;
            kVar.b(kVar.f100602a);
            if ((k.this.f100615n.width > k.this.f100615n.height) != (i10 > i11)) {
                k.i(k.this);
            }
            k.this.f100615n.width = i10;
            k.this.f100615n.height = i11;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (k.this.f100611j) {
                return;
            }
            k.l(k.this);
            k.this.f100604c.post(r.a(this));
        }
    }

    public k(TextureView textureView, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        String str = "TextureViewRenderHelper_" + hashCode();
        this.f100603b = str;
        CustomHandler customHandler = new CustomHandler(Looper.getMainLooper());
        this.f100604c = customHandler;
        this.f100605d = new com.tencent.liteav.base.b.b();
        this.f100608g = new Size();
        this.f100609h = null;
        this.f100610i = null;
        this.f100611j = false;
        this.f100612k = new Matrix();
        this.f100613l = true;
        this.f100615n = new Size();
        this.f100616o = new AnonymousClass1();
        this.f100606e = renderViewListener;
        this.f100607f = null;
        if (textureView == null) {
            LiteavLog.w(str, "textureView is null.");
            return;
        }
        LiteavLog.i(str, "construct,textureView=".concat(String.valueOf(textureView)));
        this.f100602a = textureView;
        customHandler.post(m.a(this, textureView));
    }

    public k(TXCloudVideoView tXCloudVideoView, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        String str = "TextureViewRenderHelper_" + hashCode();
        this.f100603b = str;
        CustomHandler customHandler = new CustomHandler(Looper.getMainLooper());
        this.f100604c = customHandler;
        this.f100605d = new com.tencent.liteav.base.b.b();
        this.f100608g = new Size();
        this.f100609h = null;
        this.f100610i = null;
        this.f100611j = false;
        this.f100612k = new Matrix();
        this.f100613l = true;
        this.f100615n = new Size();
        this.f100616o = new AnonymousClass1();
        this.f100606e = renderViewListener;
        this.f100607f = tXCloudVideoView;
        if (tXCloudVideoView == null) {
            LiteavLog.w(str, "txCloudVideoView is null.");
            return;
        }
        LiteavLog.i(str, "construct,txCloudVideoView=".concat(String.valueOf(tXCloudVideoView)));
        TextureView textureView = new TextureView(tXCloudVideoView.getContext());
        this.f100602a = textureView;
        customHandler.post(l.a(this, tXCloudVideoView, textureView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SurfaceTexture a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f100610i;
        if (surfaceTexture2 != null && this.f100602a != null && !com.tencent.liteav.base.util.i.a(surfaceTexture, surfaceTexture2)) {
            try {
                this.f100602a.setSurfaceTexture(this.f100610i);
                surfaceTexture = this.f100610i;
            } catch (Throwable th2) {
                LiteavLog.e(this.f100603b, "error setting saved SurfaceTexture.", th2);
            }
            this.f100610i = null;
        }
        return surfaceTexture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f100614m = null;
        RenderViewHelperInterface.RenderViewListener renderViewListener = this.f100606e;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TextureView textureView) {
        if (textureView == null) {
            LiteavLog.w(this.f100603b, "setup,textureView is null.");
            return;
        }
        if (textureView.isAvailable()) {
            Size size = new Size(textureView.getWidth(), textureView.getHeight());
            LiteavLog.i(this.f100603b, "setup,textureView=" + textureView + Constants.ACCEPT_TIME_SEPARATOR_SP + size);
            b(textureView.getSurfaceTexture());
        } else {
            LiteavLog.i(this.f100603b, "setup,textureView not available.");
            checkViewAvailability();
        }
        textureView.setSurfaceTextureListener(this.f100616o);
        b(textureView);
    }

    static /* synthetic */ void a(k kVar) {
        kVar.b(kVar.f100602a);
        kVar.c(kVar.f100602a);
    }

    static /* synthetic */ void a(k kVar, TXCloudVideoView tXCloudVideoView, TextureView textureView) {
        TXCCloudVideoViewMethodInvoker.addView(tXCloudVideoView, textureView);
        kVar.a(textureView);
    }

    static /* synthetic */ void a(k kVar, boolean z10) {
        LiteavLog.i(kVar.f100603b, "release,mTextureView=" + kVar.f100602a);
        if (kVar.f100602a == null) {
            return;
        }
        kVar.a();
        if (kVar.f100602a.getSurfaceTextureListener() == kVar.f100616o) {
            kVar.f100602a.setSurfaceTextureListener(null);
        }
        SurfaceTexture surfaceTexture = kVar.f100610i;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            kVar.f100610i = null;
        }
        if (kVar.f100607f != null) {
            LiteavLog.i(kVar.f100603b, "clearLastImage=" + z10 + ",mHasFirstFrameRendered=" + kVar.f100611j);
            TXCCloudVideoViewMethodInvoker.removeView(kVar.f100607f, kVar.f100602a, z10 | (kVar.f100611j ^ true));
        }
        kVar.f100602a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SurfaceTexture surfaceTexture) {
        if (this.f100614m == surfaceTexture) {
            return;
        }
        this.f100614m = surfaceTexture;
        RenderViewHelperInterface.RenderViewListener renderViewListener = this.f100606e;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceChanged(new Surface(surfaceTexture), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    public synchronized void b(TextureView textureView) {
        double d10;
        if (textureView == null) {
            return;
        }
        if (!this.f100613l) {
            Matrix matrix = new Matrix();
            this.f100612k = matrix;
            textureView.setTransform(matrix);
            textureView.postInvalidate();
            LiteavLog.i(this.f100605d.a("resetTextureViewRenderMatrix"), this.f100603b, "resetTextureViewRenderMatrix", new Object[0]);
            return;
        }
        Size size = new Size(textureView.getWidth(), textureView.getHeight());
        if (this.f100608g.isValid() && size.isValid()) {
            double dAspectRatio = size.aspectRatio();
            double dAspectRatio2 = this.f100608g.aspectRatio();
            double d11 = 1.0d;
            if (dAspectRatio2 < dAspectRatio) {
                GLConstants.GLScaleType gLScaleType = this.f100609h;
                if (gLScaleType == GLConstants.GLScaleType.FIT_CENTER) {
                    double d12 = dAspectRatio2 / dAspectRatio;
                    d10 = 1.0d;
                    d11 = d12;
                } else if (gLScaleType == GLConstants.GLScaleType.CENTER_CROP) {
                    d10 = dAspectRatio / dAspectRatio2;
                } else {
                    d10 = 1.0d;
                }
            } else {
                GLConstants.GLScaleType gLScaleType2 = this.f100609h;
                if (gLScaleType2 == GLConstants.GLScaleType.FIT_CENTER) {
                    d10 = dAspectRatio / dAspectRatio2;
                } else if (gLScaleType2 == GLConstants.GLScaleType.CENTER_CROP) {
                    double d13 = dAspectRatio2 / dAspectRatio;
                    d10 = 1.0d;
                    d11 = d13;
                } else {
                    d10 = 1.0d;
                }
            }
            Matrix matrix2 = new Matrix();
            matrix2.setScale((float) d11, (float) d10, size.width / 2.0f, size.height / 2.0f);
            if (!matrix2.equals(textureView.getTransform(new Matrix()))) {
                textureView.setTransform(matrix2);
                textureView.postInvalidate();
                LiteavLog.i(this.f100605d.a("updateTextureViewMatrix"), this.f100603b, "view: %s, scaleX: %.2f, scaleY: %.2f, frame: %s, view: %s", textureView, Double.valueOf(d11), Double.valueOf(d10), this.f100608g, size);
            }
            this.f100612k = matrix2;
        }
    }

    static /* synthetic */ void b(k kVar) {
        kVar.b(kVar.f100602a);
        kVar.c(kVar.f100602a);
    }

    private synchronized void c(TextureView textureView) {
        if (textureView == null) {
            return;
        }
        if (!this.f100613l) {
            GLConstants.GLScaleType gLScaleType = GLConstants.GLScaleType.FIT_CENTER;
        }
        textureView.setOpaque(false);
    }

    static /* synthetic */ void c(k kVar) {
        TextureView textureView = kVar.f100602a;
        if (textureView == null) {
            LiteavLog.i(kVar.f100603b, "view is not available when textureView is null");
            return;
        }
        if (textureView.isAvailable() && kVar.f100602a.getWidth() != 0 && kVar.f100602a.getHeight() != 0 && kVar.f100602a.isShown()) {
            return;
        }
        String str = kVar.f100603b;
        TextureView textureView2 = kVar.f100602a;
        LiteavLog.i(str, "%s is not available when surface available:%b, isShown:%b", textureView2, Boolean.valueOf(textureView2.isAvailable()), Boolean.valueOf(kVar.f100602a.isShown()));
    }

    static /* synthetic */ void i(k kVar) {
        TextureView textureView;
        Bitmap bitmap;
        if (kVar.f100606e == null || (textureView = kVar.f100602a) == null || (bitmap = textureView.getBitmap()) == null) {
            return;
        }
        kVar.f100606e.onRequestRedraw(bitmap);
    }

    static /* synthetic */ boolean l(k kVar) {
        kVar.f100611j = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void n(k kVar) {
        TextureView textureView;
        TXCloudVideoView tXCloudVideoView = kVar.f100607f;
        if (tXCloudVideoView == null || (textureView = kVar.f100602a) == null) {
            return;
        }
        TXCCloudVideoViewMethodInvoker.removeDeprecatedViews(tXCloudVideoView, textureView);
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void checkViewAvailability() {
        this.f100604c.post(o.a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final synchronized void enableNonUniformScale(boolean z10) {
        if (this.f100613l == z10) {
            return;
        }
        this.f100613l = z10;
        this.f100604c.post(q.a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final Matrix getTransformMatrix(int i10, int i11) {
        Matrix matrix = new Matrix(this.f100612k);
        matrix.postScale(1.0f, -1.0f, i10 / 2.0f, i11 / 2.0f);
        return matrix;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final boolean isUsingTextureView() {
        return true;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void release(boolean z10) {
        this.f100604c.post(n.a(this, z10));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final synchronized void updateVideoFrameInfo(GLConstants.GLScaleType gLScaleType, int i10, int i11, boolean z10) {
        if (this.f100609h == gLScaleType) {
            Size size = this.f100608g;
            if (i10 == size.width && i11 == size.height) {
                return;
            }
        }
        this.f100609h = gLScaleType;
        this.f100608g.set(i10, i11);
        this.f100604c.runOrPost(p.a(this));
    }
}
