package com.tencent.ugc.decoder;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.view.Surface;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.egl.EGLCore;
import com.tencent.ugc.videobase.egl.EGLException;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import com.tencent.ugc.videobase.frame.TextureHolderPool;
import com.tencent.ugc.videobase.utils.HardwareDecoderMediaFormatBuilder;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class MediaCodecOutputOESTextureDecoder extends MediaCodecDecoder implements SurfaceTexture.OnFrameAvailableListener {
    private EGLCore mEGLCore;
    private GLTexturePool mGLTexturePool;
    private int mOESTextureId;
    private Surface mOutputSurface;
    private PixelFrameRenderer mPixelFrameRenderer;
    private SurfaceTexture mSurfaceTexture;
    private TextureHolderPool mTextureHolderPool;

    public MediaCodecOutputOESTextureDecoder(HardwareDecoderMediaFormatBuilder hardwareDecoderMediaFormatBuilder, Size size, boolean z10, MediaCodecDecoder.MediaCodecDecoderListener mediaCodecDecoderListener, CustomHandler customHandler) {
        super(hardwareDecoderMediaFormatBuilder, size, z10, mediaCodecDecoderListener, customHandler);
        this.mOESTextureId = -1;
        this.mTAG = "MediaCodecOutputOESTextureDecoder" + hashCode();
    }

    private PixelFrame convertOESFrameToTexture2DFrame(PixelFrame pixelFrame) {
        int width = pixelFrame.getWidth();
        int height = pixelFrame.getHeight();
        PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRenderer;
        if (pixelFrameRenderer != null) {
            Size outputSize = pixelFrameRenderer.getOutputSize();
            if (outputSize.width != width || outputSize.height != height) {
                this.mPixelFrameRenderer.uninitialize();
                this.mPixelFrameRenderer = null;
            }
        }
        if (this.mPixelFrameRenderer == null) {
            this.mPixelFrameRenderer = new PixelFrameRenderer(width, height);
        }
        if (this.mGLTexturePool == null) {
            this.mGLTexturePool = new GLTexturePool();
        }
        OpenGlUtils.glViewport(0, 0, width, height);
        GLTexture gLTextureObtain = this.mGLTexturePool.obtain(width, height);
        gLTextureObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
        this.mPixelFrameRenderer.renderFrame(pixelFrame, GLConstants.GLScaleType.CENTER_CROP, gLTextureObtain);
        PixelFrame pixelFrameWrap = gLTextureObtain.wrap(this.mEGLCore.getEglContext());
        GLES20.glFinish();
        gLTextureObtain.release();
        pixelFrame.release();
        return pixelFrameWrap;
    }

    private boolean initializeGLComponents(Object obj) {
        if (this.mEGLCore != null) {
            LiteavLog.w(this.mTAG, "Decoder already started.");
            return true;
        }
        EGLCore eGLCore = new EGLCore();
        this.mEGLCore = eGLCore;
        try {
            eGLCore.initialize(obj, null, 128, 128);
            this.mEGLCore.makeCurrent();
            this.mOESTextureId = OpenGlUtils.generateTextureOES();
            this.mTextureHolderPool = new TextureHolderPool(1);
            try {
                this.mSurfaceTexture = new SurfaceTexture(this.mOESTextureId);
                this.mOutputSurface = new Surface(this.mSurfaceTexture);
                this.mSurfaceTexture.setOnFrameAvailableListener(this);
                LiteavLog.i(this.mThrottlers.a("initGL"), this.mTAG, "initialize gl components", new Object[0]);
                return true;
            } catch (Surface.OutOfResourcesException e10) {
                LiteavLog.e(this.mThrottlers.a("surface"), this.mTAG, "create SurfaceTexture failed.", e10);
                MediaCodecDecoder.MediaCodecDecoderListener mediaCodecDecoderListener = this.mListener;
                if (mediaCodecDecoderListener != null) {
                    mediaCodecDecoderListener.onDecoderError();
                }
                return false;
            }
        } catch (EGLException e11) {
            LiteavLog.e(this.mThrottlers.a("initGL"), this.mTAG, "create EGLCore failed.", e11);
            MediaCodecDecoder.MediaCodecDecoderListener mediaCodecDecoderListener2 = this.mListener;
            if (mediaCodecDecoderListener2 != null) {
                mediaCodecDecoderListener2.onDecoderError();
            }
            return false;
        }
    }

    static /* synthetic */ void lambda$onFrameAvailable$0(MediaCodecOutputOESTextureDecoder mediaCodecOutputOESTextureDecoder, SurfaceTexture surfaceTexture) throws InterruptedException {
        SurfaceTexture surfaceTexture2 = mediaCodecOutputOESTextureDecoder.mSurfaceTexture;
        if (surfaceTexture2 == null || surfaceTexture != surfaceTexture2) {
            return;
        }
        mediaCodecOutputOESTextureDecoder.makeCurrent();
        TextureHolderPool.TextureHolder textureHolderObtain = null;
        try {
            textureHolderObtain = mediaCodecOutputOESTextureDecoder.mTextureHolderPool.obtain();
        } catch (InterruptedException unused) {
            LiteavLog.w(mediaCodecOutputOESTextureDecoder.mTAG, "textureholderpool obtain interrupted.");
        }
        int i10 = mediaCodecOutputOESTextureDecoder.mOESTextureId;
        Size size = mediaCodecOutputOESTextureDecoder.mResolution;
        textureHolderObtain.updateTexture(36197, i10, size.width, size.height);
        textureHolderObtain.setColorFormat(GLConstants.ColorRange.VIDEO_RANGE, GLConstants.ColorSpace.BT601);
        PixelFrame pixelFrameWrap = textureHolderObtain.wrap(mediaCodecOutputOESTextureDecoder.mEGLCore.getEglContext());
        if (pixelFrameWrap.getMatrix() == null) {
            pixelFrameWrap.setMatrix(new float[16]);
        }
        try {
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(pixelFrameWrap.getMatrix());
        } catch (Throwable th2) {
            LiteavLog.w(mediaCodecOutputOESTextureDecoder.mThrottlers.a("updateImage"), mediaCodecOutputOESTextureDecoder.mTAG, "updateTexImage exception: ".concat(String.valueOf(th2)), new Object[0]);
        }
        long millis = TimeUnit.NANOSECONDS.toMillis(surfaceTexture.getTimestamp());
        if (millis == 0) {
            millis = TimeUnit.MICROSECONDS.toMillis(mediaCodecOutputOESTextureDecoder.mBufferInfo.presentationTimeUs);
        }
        PixelFrame pixelFrameConvertOESFrameToTexture2DFrame = mediaCodecOutputOESTextureDecoder.convertOESFrameToTexture2DFrame(pixelFrameWrap);
        pixelFrameConvertOESFrameToTexture2DFrame.setTimestamp(millis);
        mediaCodecOutputOESTextureDecoder.mListener.onDecodeFrame(pixelFrameConvertOESFrameToTexture2DFrame, false);
        textureHolderObtain.release();
        pixelFrameConvertOESFrameToTexture2DFrame.release();
    }

    private boolean makeCurrent() {
        try {
            EGLCore eGLCore = this.mEGLCore;
            if (eGLCore == null) {
                return true;
            }
            eGLCore.makeCurrent();
            return true;
        } catch (EGLException e10) {
            LiteavLog.e(this.mThrottlers.a("makeCurrent"), this.mTAG, "makeCurrent failed.", e10);
            return false;
        }
    }

    private void uninitializeGLComponents() {
        LiteavLog.i(this.mTAG, "uninitialize gl components");
        if (makeCurrent()) {
            TextureHolderPool textureHolderPool = this.mTextureHolderPool;
            if (textureHolderPool != null) {
                textureHolderPool.destroy();
            }
            Surface surface = this.mOutputSurface;
            if (surface != null) {
                surface.release();
                this.mOutputSurface = null;
            }
            SurfaceTexture surfaceTexture = this.mSurfaceTexture;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.mSurfaceTexture = null;
            }
            GLTexturePool gLTexturePool = this.mGLTexturePool;
            if (gLTexturePool != null) {
                gLTexturePool.destroy();
                this.mGLTexturePool = null;
            }
            PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRenderer;
            if (pixelFrameRenderer != null) {
                pixelFrameRenderer.uninitialize();
                this.mPixelFrameRenderer = null;
            }
            OpenGlUtils.deleteTexture(this.mOESTextureId);
            this.mOESTextureId = -1;
            EGLCore.destroy(this.mEGLCore);
            this.mEGLCore = null;
        }
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    protected boolean configureMediaCodec(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        MediaCodecWrapper.configure(mediaCodec, mediaFormat, this.mOutputSurface, null, 0);
        LiteavLog.i(this.mTAG, "configure mediacodec with " + this.mOutputSurface);
        return true;
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    protected boolean handleOutputBuffer(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo, int i10) {
        mediaCodec.releaseOutputBuffer(i10, true);
        if ((bufferInfo.flags & 4) == 0) {
            return true;
        }
        LiteavLog.i(this.mTAG, "meet end of stream.");
        MediaCodecDecoder.MediaCodecDecoderListener mediaCodecDecoderListener = this.mListener;
        if (mediaCodecDecoderListener == null) {
            return false;
        }
        mediaCodecDecoderListener.onDecodeFrame(null, true);
        return false;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        runOnWorkThread(j.a(this, surfaceTexture));
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    public boolean start(Object obj) {
        return initializeGLComponents(obj);
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    public void stop() {
        super.stop();
        uninitializeGLComponents();
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    protected void updateOutputSurface(MediaCodec mediaCodec) {
        mediaCodec.setOutputSurface(this.mOutputSurface);
    }
}
