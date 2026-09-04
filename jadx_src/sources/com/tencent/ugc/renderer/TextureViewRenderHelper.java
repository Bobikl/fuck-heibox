package com.tencent.ugc.renderer;

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
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.videobase.videobase.TXCCloudVideoViewMethodInvoker;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class TextureViewRenderHelper extends RenderViewHelperInterface {
    private final Size mFrameSize;
    private boolean mHasFirstFrameRendered;
    private SurfaceTexture mLastSurfaceTexture;
    private final RenderViewHelperInterface.RenderViewListener mListener;
    private SurfaceTexture mSavedSurfaceTexture;
    private GLConstants.GLScaleType mScaleType;
    private final Size mSurfaceTextureSize;
    private final String mTAG;
    private final TXCloudVideoView mTXCloudVideoView;
    private TextureView mTextureView;
    private final TextureView.SurfaceTextureListener mTextureViewListener;
    private final com.tencent.liteav.base.b.b mThrottlerManager;
    private Matrix mTransformMatrix;
    private final CustomHandler mUIHandler;

    /* JADX INFO: renamed from: com.tencent.ugc.renderer.TextureViewRenderHelper$1, reason: invalid class name */
    public final class AnonymousClass1 implements TextureView.SurfaceTextureListener {
        AnonymousClass1() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            LiteavLog.i(TextureViewRenderHelper.this.mThrottlerManager.a("surfaceCreate"), TextureViewRenderHelper.this.mTAG, "onSurfaceTextureAvailable, size: %dx%d", Integer.valueOf(i10), Integer.valueOf(i11));
            TextureViewRenderHelper.this.notifySurfaceChanged(TextureViewRenderHelper.this.setSavedSurfaceTextureToTextureView(surfaceTexture));
            TextureViewRenderHelper textureViewRenderHelper = TextureViewRenderHelper.this;
            textureViewRenderHelper.updateTextureViewRenderMatrix(textureViewRenderHelper.mTextureView);
            TextureViewRenderHelper.this.mSurfaceTextureSize.width = i10;
            TextureViewRenderHelper.this.mSurfaceTextureSize.height = i11;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            LiteavLog.i(TextureViewRenderHelper.this.mTAG, "onSurfaceTextureDestroyed");
            TextureViewRenderHelper.this.notifySurfaceDestroy();
            if (TextureViewRenderHelper.this.mTextureView == null) {
                return true;
            }
            TextureViewRenderHelper.this.mSavedSurfaceTexture = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            LiteavLog.i(TextureViewRenderHelper.this.mThrottlerManager.a("surfaceSizeChanged"), TextureViewRenderHelper.this.mTAG, "onSurfaceTextureSizeChanged, size: %dx%d", Integer.valueOf(i10), Integer.valueOf(i11));
            TextureViewRenderHelper.this.notifySurfaceChanged(surfaceTexture);
            TextureViewRenderHelper textureViewRenderHelper = TextureViewRenderHelper.this;
            textureViewRenderHelper.updateTextureViewRenderMatrix(textureViewRenderHelper.mTextureView);
            if ((TextureViewRenderHelper.this.mSurfaceTextureSize.width > TextureViewRenderHelper.this.mSurfaceTextureSize.height) != (i10 > i11)) {
                TextureViewRenderHelper.this.notifyRequestRedraw();
            }
            TextureViewRenderHelper.this.mSurfaceTextureSize.width = i10;
            TextureViewRenderHelper.this.mSurfaceTextureSize.height = i11;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (TextureViewRenderHelper.this.mHasFirstFrameRendered) {
                return;
            }
            TextureViewRenderHelper.this.mHasFirstFrameRendered = true;
            TextureViewRenderHelper.this.mUIHandler.post(m.a(this));
        }
    }

    public TextureViewRenderHelper(TextureView textureView, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        String str = "TextureViewRenderHelper_" + hashCode();
        this.mTAG = str;
        CustomHandler customHandler = new CustomHandler(Looper.getMainLooper());
        this.mUIHandler = customHandler;
        this.mThrottlerManager = new com.tencent.liteav.base.b.b();
        this.mFrameSize = new Size();
        this.mScaleType = null;
        this.mSavedSurfaceTexture = null;
        this.mHasFirstFrameRendered = false;
        this.mTransformMatrix = new Matrix();
        this.mSurfaceTextureSize = new Size();
        this.mTextureViewListener = new AnonymousClass1();
        this.mListener = renderViewListener;
        this.mTXCloudVideoView = null;
        if (textureView == null) {
            LiteavLog.w(str, "textureView is null.");
            return;
        }
        LiteavLog.i(str, "construct,textureView=".concat(String.valueOf(textureView)));
        this.mTextureView = textureView;
        customHandler.post(i.a(this, textureView));
    }

    public TextureViewRenderHelper(TXCloudVideoView tXCloudVideoView, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        String str = "TextureViewRenderHelper_" + hashCode();
        this.mTAG = str;
        CustomHandler customHandler = new CustomHandler(Looper.getMainLooper());
        this.mUIHandler = customHandler;
        this.mThrottlerManager = new com.tencent.liteav.base.b.b();
        this.mFrameSize = new Size();
        this.mScaleType = null;
        this.mSavedSurfaceTexture = null;
        this.mHasFirstFrameRendered = false;
        this.mTransformMatrix = new Matrix();
        this.mSurfaceTextureSize = new Size();
        this.mTextureViewListener = new AnonymousClass1();
        this.mListener = renderViewListener;
        this.mTXCloudVideoView = tXCloudVideoView;
        if (tXCloudVideoView == null) {
            LiteavLog.w(str, "txCloudVideoView is null.");
            return;
        }
        LiteavLog.i(str, "construct,txCloudVideoView=".concat(String.valueOf(tXCloudVideoView)));
        TextureView textureView = new TextureView(tXCloudVideoView.getContext());
        this.mTextureView = textureView;
        customHandler.post(h.a(this, tXCloudVideoView, textureView));
    }

    static /* synthetic */ void lambda$checkViewAvailability$3(TextureViewRenderHelper textureViewRenderHelper) {
        TextureView textureView = textureViewRenderHelper.mTextureView;
        if (textureView == null) {
            LiteavLog.i(textureViewRenderHelper.mTAG, "view is not available when textureView is null");
            return;
        }
        if (textureView.isAvailable() && textureViewRenderHelper.mTextureView.getWidth() != 0 && textureViewRenderHelper.mTextureView.getHeight() != 0 && textureViewRenderHelper.mTextureView.isShown()) {
            return;
        }
        String str = textureViewRenderHelper.mTAG;
        TextureView textureView2 = textureViewRenderHelper.mTextureView;
        LiteavLog.i(str, "%s is not available when surface available:%b, isShown:%b", textureView2, Boolean.valueOf(textureView2.isAvailable()), Boolean.valueOf(textureViewRenderHelper.mTextureView.isShown()));
    }

    static /* synthetic */ void lambda$new$0(TextureViewRenderHelper textureViewRenderHelper, TXCloudVideoView tXCloudVideoView, TextureView textureView) {
        TXCCloudVideoViewMethodInvoker.addView(tXCloudVideoView, textureView);
        textureViewRenderHelper.setup(textureView);
    }

    static /* synthetic */ void lambda$release$2(TextureViewRenderHelper textureViewRenderHelper, boolean z10) {
        LiteavLog.i(textureViewRenderHelper.mTAG, "release,mTextureView=" + textureViewRenderHelper.mTextureView);
        if (textureViewRenderHelper.mTextureView == null) {
            return;
        }
        textureViewRenderHelper.notifySurfaceDestroy();
        if (textureViewRenderHelper.mTextureView.getSurfaceTextureListener() == textureViewRenderHelper.mTextureViewListener) {
            textureViewRenderHelper.mTextureView.setSurfaceTextureListener(null);
        }
        SurfaceTexture surfaceTexture = textureViewRenderHelper.mSavedSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            textureViewRenderHelper.mSavedSurfaceTexture = null;
        }
        if (textureViewRenderHelper.mTXCloudVideoView != null) {
            LiteavLog.i(textureViewRenderHelper.mTAG, "clearLastImage=" + z10 + ",mHasFirstFrameRendered=" + textureViewRenderHelper.mHasFirstFrameRendered);
            TXCCloudVideoViewMethodInvoker.removeView(textureViewRenderHelper.mTXCloudVideoView, textureViewRenderHelper.mTextureView, z10 | (textureViewRenderHelper.mHasFirstFrameRendered ^ true));
        }
        textureViewRenderHelper.mTextureView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyFirstFrameRendered() {
        TextureView textureView;
        TXCloudVideoView tXCloudVideoView = this.mTXCloudVideoView;
        if (tXCloudVideoView == null || (textureView = this.mTextureView) == null) {
            return;
        }
        TXCCloudVideoViewMethodInvoker.removeDeprecatedViews(tXCloudVideoView, textureView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyRequestRedraw() {
        TextureView textureView;
        Bitmap bitmap;
        if (this.mListener == null || (textureView = this.mTextureView) == null || (bitmap = textureView.getBitmap()) == null) {
            return;
        }
        this.mListener.onRequestRedraw(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySurfaceChanged(SurfaceTexture surfaceTexture) {
        if (this.mLastSurfaceTexture == surfaceTexture) {
            return;
        }
        this.mLastSurfaceTexture = surfaceTexture;
        RenderViewHelperInterface.RenderViewListener renderViewListener = this.mListener;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceChanged(new Surface(surfaceTexture), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySurfaceDestroy() {
        this.mLastSurfaceTexture = null;
        RenderViewHelperInterface.RenderViewListener renderViewListener = this.mListener;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SurfaceTexture setSavedSurfaceTextureToTextureView(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.mSavedSurfaceTexture;
        if (surfaceTexture2 == null || this.mTextureView == null || com.tencent.liteav.base.util.i.a(surfaceTexture, surfaceTexture2)) {
            return surfaceTexture;
        }
        this.mTextureView.setSurfaceTexture(this.mSavedSurfaceTexture);
        SurfaceTexture surfaceTexture3 = this.mSavedSurfaceTexture;
        this.mSavedSurfaceTexture = null;
        return surfaceTexture3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setup(TextureView textureView) {
        if (textureView == null) {
            LiteavLog.w(this.mTAG, "setup,textureView is null.");
            return;
        }
        if (textureView.isAvailable()) {
            Size size = new Size(textureView.getWidth(), textureView.getHeight());
            LiteavLog.i(this.mTAG, "setup,textureView=" + textureView + Constants.ACCEPT_TIME_SEPARATOR_SP + size);
            notifySurfaceChanged(textureView.getSurfaceTexture());
        } else {
            LiteavLog.i(this.mTAG, "setup,textureView not available.");
        }
        textureView.setSurfaceTextureListener(this.mTextureViewListener);
        updateTextureViewRenderMatrix(textureView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    public synchronized void updateTextureViewRenderMatrix(TextureView textureView) {
        double d10;
        if (textureView == null) {
            return;
        }
        Size size = new Size(textureView.getWidth(), textureView.getHeight());
        if (this.mFrameSize.isValid() && size.isValid()) {
            double dAspectRatio = size.aspectRatio();
            double dAspectRatio2 = this.mFrameSize.aspectRatio();
            double d11 = 1.0d;
            if (dAspectRatio2 < dAspectRatio) {
                GLConstants.GLScaleType gLScaleType = this.mScaleType;
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
                GLConstants.GLScaleType gLScaleType2 = this.mScaleType;
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
            Matrix matrix = new Matrix();
            matrix.setScale((float) d11, (float) d10, size.width / 2.0f, size.height / 2.0f);
            if (!matrix.equals(textureView.getTransform(new Matrix()))) {
                textureView.setTransform(matrix);
                textureView.postInvalidate();
                LiteavLog.i(this.mThrottlerManager.a("updateTextureViewMatrix"), this.mTAG, "view: %s, scaleX: %.2f, scaleY: %.2f, frame: %s, view: %s", textureView, Double.valueOf(d11), Double.valueOf(d10), this.mFrameSize, size);
            }
            this.mTransformMatrix = matrix;
        }
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public void checkViewAvailability() {
        this.mUIHandler.post(k.a(this));
    }

    public TextureView getTextureView() {
        return this.mTextureView;
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public Matrix getTransformMatrix(int i10, int i11) {
        Matrix matrix = new Matrix(this.mTransformMatrix);
        matrix.postScale(1.0f, -1.0f, i10 / 2.0f, i11 / 2.0f);
        return matrix;
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public boolean isUsingTextureView() {
        return true;
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public void release(boolean z10) {
        this.mUIHandler.post(j.a(this, z10));
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public synchronized void updateVideoFrameInfo(GLConstants.GLScaleType gLScaleType, int i10, int i11, boolean z10) {
        if (this.mScaleType == gLScaleType) {
            Size size = this.mFrameSize;
            if (i10 == size.width && i11 == size.height) {
                return;
            }
        }
        this.mScaleType = gLScaleType;
        this.mFrameSize.set(i10, i11);
        this.mUIHandler.runOrPost(l.a(this));
    }
}
