package com.tencent.ugc.beauty.decoder;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.egl.EGLCore;
import com.tencent.ugc.videobase.egl.EGLException;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.TextureHolderPool;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class VideoFrameReader implements SurfaceTexture.OnFrameAvailableListener {
    private static final int DEFAULT_FRAME_PROCESS_INTERVAL = 3;
    private static final String TAG = "VideoFrameReader";
    private final Context mContext;
    private EGLCore mEGLCore;
    private final boolean mIsLoop;
    private VideoFrameReaderListener mReadListener;
    private final Object mSharedGLContext;
    private SurfaceTexture mSurfaceTexture;
    private TextureHolderPool mTextureHolderPool;
    private Thread mThread;
    private Decoder mVideoDecoder;
    private final String mVideoPath;
    private final float[] mMatrix = new float[16];
    private int mOesTextureId = -1;
    private int mVideoWidth = 0;
    private int mVideoHeight = 0;
    private volatile boolean mNeedUpdateTexture = false;
    private volatile boolean mIsCancelled = false;
    private long mStartTimeMs = -1;

    public interface VideoFrameReaderListener {
        void onFrameAvailable(PixelFrame pixelFrame);

        void onReadFinished();
    }

    public VideoFrameReader(Context context, Object obj, String str, boolean z10) {
        this.mContext = context.getApplicationContext();
        this.mVideoPath = str;
        this.mIsLoop = z10;
        this.mSharedGLContext = obj;
    }

    private void setup() throws SetupException {
        Extractor extractor;
        EGLCore eGLCore = new EGLCore();
        this.mEGLCore = eGLCore;
        try {
            eGLCore.initialize(this.mSharedGLContext, null, 128, 128);
            this.mEGLCore.makeCurrent();
            this.mOesTextureId = OpenGlUtils.generateTextureOES();
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.mOesTextureId);
            this.mSurfaceTexture = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            this.mTextureHolderPool = new TextureHolderPool(1);
            RangeExtractorAdvancer rangeExtractorAdvancer = new RangeExtractorAdvancer();
            if (this.mVideoPath.startsWith("/")) {
                extractor = new Extractor(true, this.mVideoPath, (ExtractorAdvancer) rangeExtractorAdvancer);
            } else {
                try {
                    extractor = new Extractor(true, this.mContext.getAssets().openFd(this.mVideoPath), (ExtractorAdvancer) rangeExtractorAdvancer);
                } catch (IOException e10) {
                    throw new SetupException("open assets failed. " + this.mVideoPath, e10);
                }
            }
            Decoder decoder = new Decoder(extractor, this.mSurfaceTexture);
            this.mVideoDecoder = decoder;
            decoder.setLooping(this.mIsLoop);
            this.mVideoDecoder.setup();
            MediaFormat mediaFormat = extractor.getMediaFormat();
            int integer = mediaFormat.containsKey("rotation-degrees") ? mediaFormat.getInteger("rotation-degrees") : 0;
            if (integer == 90 || integer == 270) {
                this.mVideoWidth = mediaFormat.getInteger("height");
                this.mVideoHeight = mediaFormat.getInteger("width");
            } else {
                this.mVideoWidth = mediaFormat.getInteger("width");
                this.mVideoHeight = mediaFormat.getInteger("height");
            }
            LiteavLog.i(TAG, "setup finished");
        } catch (EGLException e11) {
            throw new SetupException("EGL create failed", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void threadLoop() {
        try {
            setup();
            while (!this.mIsCancelled) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                processFrame();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (jElapsedRealtime2 < 3) {
                    try {
                        Thread.sleep(3 - jElapsedRealtime2);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            release();
        } catch (Throwable th2) {
            try {
                LiteavLog.e(TAG, "process failed.", th2);
            } finally {
                release();
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.mNeedUpdateTexture = true;
    }

    protected void processFrame() throws ProcessException {
        TextureHolderPool.TextureHolder textureHolderObtain;
        if (this.mStartTimeMs == -1) {
            this.mStartTimeMs = SystemClock.elapsedRealtime();
        }
        if (this.mNeedUpdateTexture) {
            this.mNeedUpdateTexture = false;
            long timestamp = this.mSurfaceTexture.getTimestamp() / 1000000;
            try {
                textureHolderObtain = this.mTextureHolderPool.obtain();
            } catch (InterruptedException unused) {
                textureHolderObtain = null;
            }
            if (textureHolderObtain == null) {
                return;
            }
            this.mSurfaceTexture.updateTexImage();
            textureHolderObtain.updateTexture(36197, this.mOesTextureId, this.mVideoWidth, this.mVideoHeight);
            textureHolderObtain.setColorFormat(GLConstants.ColorRange.VIDEO_RANGE, GLConstants.ColorSpace.BT601);
            PixelFrame pixelFrameWrap = textureHolderObtain.wrap(this.mEGLCore.getEglContext());
            pixelFrameWrap.setTimestamp(timestamp);
            this.mSurfaceTexture.getTransformMatrix(this.mMatrix);
            pixelFrameWrap.setMatrix(this.mMatrix);
            pixelFrameWrap.setGLContext(this.mEGLCore.getEglContext());
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.mStartTimeMs;
            if (timestamp > jElapsedRealtime) {
                try {
                    Thread.sleep(timestamp - jElapsedRealtime);
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                }
            }
            VideoFrameReaderListener videoFrameReaderListener = this.mReadListener;
            if (videoFrameReaderListener != null) {
                videoFrameReaderListener.onFrameAvailable(pixelFrameWrap);
            }
            textureHolderObtain.release();
            pixelFrameWrap.release();
        }
        if (this.mVideoDecoder.isDone()) {
            VideoFrameReaderListener videoFrameReaderListener2 = this.mReadListener;
            if (videoFrameReaderListener2 != null) {
                LiteavLog.i(TAG, "notify read finished");
                videoFrameReaderListener2.onReadFinished();
            }
            this.mReadListener = null;
            return;
        }
        this.mVideoDecoder.processFrame();
        Frame frameDequeueOutputBuffer = this.mVideoDecoder.dequeueOutputBuffer();
        if (frameDequeueOutputBuffer != null) {
            this.mVideoDecoder.enqueueOutputBuffer(frameDequeueOutputBuffer);
        }
    }

    protected void release() {
        int i10 = this.mOesTextureId;
        if (i10 != -1) {
            OpenGlUtils.deleteTexture(i10);
            this.mOesTextureId = -1;
        }
        TextureHolderPool textureHolderPool = this.mTextureHolderPool;
        if (textureHolderPool != null) {
            textureHolderPool.destroy();
        }
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
        Decoder decoder = this.mVideoDecoder;
        if (decoder != null) {
            decoder.release();
            this.mVideoDecoder = null;
        }
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.mSurfaceTexture = null;
        }
        LiteavLog.i(TAG, "released");
    }

    public synchronized void setVideoFrameReadListener(VideoFrameReaderListener videoFrameReaderListener) {
        this.mReadListener = videoFrameReaderListener;
    }

    public synchronized boolean start() {
        if (this.mThread != null) {
            LiteavLog.i(TAG, "already started");
            return false;
        }
        Thread thread = new Thread(a.a(this), "videoframereader");
        this.mThread = thread;
        thread.start();
        return true;
    }

    public synchronized void stop() {
        this.mIsCancelled = true;
        Thread thread = this.mThread;
        if (thread != null) {
            thread.interrupt();
            this.mThread = null;
        }
    }
}
