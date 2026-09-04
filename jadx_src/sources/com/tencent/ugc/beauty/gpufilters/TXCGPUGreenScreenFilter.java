package com.tencent.ugc.beauty.gpufilters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.beauty.decoder.VideoFrameReader;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUGreenScreenFilter extends TXCGPUImageFilter {
    private static final String TAG = "TXCGPUGreenScreenFilter";
    private TXCGPUColorScreenFilter mColorScreenFilter;
    private final Context mContext;
    private String mGreenScreenFile;
    private boolean mMirrorX;
    private PixelFrameRenderer mPixelFrameRenderer;
    private GLConstants.GLScaleType mScaleType;
    private VideoFrameReader mVideoFrameReader;
    private final PixelFrame mPixelFrame = new PixelFrame();
    private boolean mLoopVideo = false;
    private GreenScreenFilterEventListener mEventListener = null;
    private VideoFrameReader.VideoFrameReaderListener mVideoFrameReaderListener = new AnonymousClass1();

    /* JADX INFO: renamed from: com.tencent.ugc.beauty.gpufilters.TXCGPUGreenScreenFilter$1, reason: invalid class name */
    public final class AnonymousClass1 implements VideoFrameReader.VideoFrameReaderListener {
        AnonymousClass1() {
        }

        static /* synthetic */ void a(AnonymousClass1 anonymousClass1) {
            if (TXCGPUGreenScreenFilter.this.mVideoFrameReader != null) {
                TXCGPUGreenScreenFilter.this.mPixelFrame.setTextureId(-1);
                TXCGPUGreenScreenFilter.this.destroyPlayer();
            }
        }

        @Override // com.tencent.ugc.beauty.decoder.VideoFrameReader.VideoFrameReaderListener
        public final void onFrameAvailable(PixelFrame pixelFrame) {
            if (TXCGPUGreenScreenFilter.this.mPixelFrame.getMatrix() == null) {
                TXCGPUGreenScreenFilter.this.mPixelFrame.setMatrix(new float[16]);
            }
            TXCGPUGreenScreenFilter.this.mPixelFrame.setPixelBufferType(pixelFrame.getPixelBufferType());
            TXCGPUGreenScreenFilter.this.mPixelFrame.setPixelFormatType(pixelFrame.getPixelFormatType());
            System.arraycopy(pixelFrame.getMatrix(), 0, TXCGPUGreenScreenFilter.this.mPixelFrame.getMatrix(), 0, pixelFrame.getMatrix().length);
            TXCGPUGreenScreenFilter.this.mPixelFrame.setTimestamp(pixelFrame.getTimestamp());
            TXCGPUGreenScreenFilter.this.mPixelFrame.setTextureId(pixelFrame.getTextureId());
            TXCGPUGreenScreenFilter.this.mPixelFrame.setWidth(pixelFrame.getWidth());
            TXCGPUGreenScreenFilter.this.mPixelFrame.setHeight(pixelFrame.getHeight());
        }

        @Override // com.tencent.ugc.beauty.decoder.VideoFrameReader.VideoFrameReaderListener
        public final void onReadFinished() {
            TXCGPUGreenScreenFilter.this.runOnDrawAndWaitDone(c.a(this));
        }
    }

    public interface GreenScreenFilterEventListener {
        void onLoadFailed();
    }

    public TXCGPUGreenScreenFilter(Context context) {
        this.mContext = context;
    }

    private void deleteTextureInPixelFrame() {
        if (this.mPixelFrame.getPixelBufferType() == GLConstants.a.TEXTURE_2D) {
            OpenGlUtils.deleteTexture(this.mPixelFrame.getTextureId());
            this.mPixelFrame.setTextureId(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyPlayer() {
        VideoFrameReader videoFrameReader = this.mVideoFrameReader;
        if (videoFrameReader != null) {
            videoFrameReader.setVideoFrameReadListener(null);
            this.mVideoFrameReader.stop();
            this.mVideoFrameReader = null;
        }
    }

    private boolean initializeVideoPlayer() {
        VideoFrameReader videoFrameReader = new VideoFrameReader(this.mContext, OpenGlUtils.getCurrentContext(), this.mGreenScreenFile, this.mLoopVideo);
        this.mVideoFrameReader = videoFrameReader;
        videoFrameReader.setVideoFrameReadListener(this.mVideoFrameReaderListener);
        boolean zStart = this.mVideoFrameReader.start();
        if (zStart) {
            this.mPixelFrame.setWidth(-1);
            this.mPixelFrame.setHeight(-1);
            this.mPixelFrame.setPixelBufferType(GLConstants.a.TEXTURE_OES);
            this.mPixelFrame.setPixelFormatType(GLConstants.PixelFormatType.RGBA);
            this.mPixelFrame.setTextureId(-1);
        }
        return zStart;
    }

    static /* synthetic */ void lambda$setGreenScreenFile$0(TXCGPUGreenScreenFilter tXCGPUGreenScreenFilter, String str, boolean z10) throws Throwable {
        tXCGPUGreenScreenFilter.mGreenScreenFile = str;
        tXCGPUGreenScreenFilter.mLoopVideo = z10;
        tXCGPUGreenScreenFilter.loadGreenScreenFile();
    }

    private void loadGreenScreenFile() throws Throwable {
        boolean zLoadPictureToTexture;
        boolean z10;
        String str;
        String str2 = this.mGreenScreenFile;
        if (str2 == null || str2.isEmpty()) {
            LiteavLog.e(TAG, "green file is empty!");
            return;
        }
        String fileExtension = CommonUtil.getFileExtension(this.mGreenScreenFile);
        if (fileExtension == null) {
            destroyPlayer();
            z10 = true;
        } else {
            String lowerCase = fileExtension.toLowerCase();
            if ("jpg".equals(lowerCase) || "png".equals(lowerCase) || "bmp".equals(lowerCase)) {
                destroyPlayer();
                deleteTextureInPixelFrame();
                zLoadPictureToTexture = loadPictureToTexture(this.mGreenScreenFile);
            } else if ("mp4".equals(lowerCase)) {
                destroyPlayer();
                deleteTextureInPixelFrame();
                zLoadPictureToTexture = initializeVideoPlayer();
            } else {
                z10 = false;
            }
            z10 = !zLoadPictureToTexture;
        }
        if (!z10 || (str = this.mGreenScreenFile) == null || str.isEmpty()) {
            return;
        }
        GreenScreenFilterEventListener greenScreenFilterEventListener = this.mEventListener;
        if (greenScreenFilterEventListener != null) {
            greenScreenFilterEventListener.onLoadFailed();
        }
        LiteavLog.e(TAG, "Load GreenScreenFile: %s fail, and report EVENT_GREENFILE_DECODE_FAILED", this.mGreenScreenFile);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0020 A[EXC_TOP_SPLITTER, PHI: r2 r6
  0x0020: PHI (r2v4 android.graphics.Bitmap) = (r2v16 android.graphics.Bitmap), (r2v7 android.graphics.Bitmap) binds: [B:17:0x0030, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0020: PHI (r6v4 java.io.InputStream) = (r6v14 java.io.InputStream), (r6v15 java.io.InputStream) binds: [B:17:0x0030, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5 */
    private boolean loadPictureToTexture(String str) throws Throwable {
        InputStream inputStreamOpen;
        InputStream inputStream;
        ?? r10 = 0;
        bitmapDecodeStream = null;
        Bitmap bitmapDecodeStream = null;
        try {
            if (str.startsWith("/")) {
                bitmapDecodeStream = BitmapFactory.decodeFile(str);
            } else {
                try {
                    inputStreamOpen = this.mContext.getAssets().open(str);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                        str = inputStreamOpen;
                        inputStream = inputStreamOpen;
                        if (inputStreamOpen != null) {
                            try {
                                inputStream.close();
                                str = inputStream;
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException e10) {
                        e = e10;
                        LiteavLog.e(TAG, "open file failed.", e);
                        str = inputStreamOpen;
                        inputStream = inputStreamOpen;
                        if (inputStreamOpen != null) {
                            inputStream.close();
                            str = inputStream;
                        }
                    }
                } catch (IOException e11) {
                    e = e11;
                    inputStreamOpen = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (r10 != 0) {
                        try {
                            r10.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            }
            if (bitmapDecodeStream == null) {
                return false;
            }
            this.mPixelFrame.setWidth(bitmapDecodeStream.getWidth());
            this.mPixelFrame.setHeight(bitmapDecodeStream.getHeight());
            this.mPixelFrame.setPixelBufferType(GLConstants.a.TEXTURE_2D);
            this.mPixelFrame.setTextureId(OpenGlUtils.loadTexture(bitmapDecodeStream, -1, true));
            this.mPixelFrame.setPixelFormatType(GLConstants.PixelFormatType.RGBA);
            LiteavLog.i(TAG, "picture set GreenFile %dx%d", Integer.valueOf(this.mPixelFrame.getWidth()), Integer.valueOf(this.mPixelFrame.getHeight()));
            return true;
        } catch (Throwable th3) {
            th = th3;
            r10 = str;
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i10, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        int id2;
        if (isInitialized()) {
            runPendingOnDrawTasks();
            if (this.mPixelFrame.getTextureId() == -1) {
                super.onDraw(i10, gLTexture, floatBuffer, floatBuffer2);
                return;
            }
            GLTexturePool gLTexturePool = this.mTexturePool;
            Size size = this.mOutputSize;
            GLTexture gLTextureObtain = gLTexturePool.obtain(size.width, size.height);
            if (this.mPixelFrameRenderer == null) {
                Size size2 = this.mOutputSize;
                this.mPixelFrameRenderer = new PixelFrameRenderer(size2.width, size2.height);
            }
            if (!this.mPixelFrame.hasTransformParams() && this.mPixelFrame.getPixelBufferType() == GLConstants.a.TEXTURE_2D && this.mPixelFrame.getPixelFormatType() == GLConstants.PixelFormatType.RGBA) {
                id2 = this.mPixelFrame.getTextureId();
            } else {
                this.mPixelFrameRenderer.renderFrame(this.mPixelFrame, this.mScaleType, gLTextureObtain);
                id2 = gLTextureObtain.getId();
            }
            this.mColorScreenFilter.setScreenMirrorX(this.mMirrorX);
            this.mColorScreenFilter.setSecondInputTexture(i10);
            this.mColorScreenFilter.setThirdInputTexture(id2);
            this.mColorScreenFilter.onDraw(i10, gLTexture, floatBuffer, floatBuffer2);
            gLTextureObtain.release();
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        TXCGPUColorScreenFilter tXCGPUColorScreenFilter = new TXCGPUColorScreenFilter();
        this.mColorScreenFilter = tXCGPUColorScreenFilter;
        tXCGPUColorScreenFilter.initialize(gLTexturePool);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        this.mColorScreenFilter.onOutputSizeChanged(i10, i11);
        PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRenderer;
        if (pixelFrameRenderer != null) {
            pixelFrameRenderer.uninitialize();
            this.mPixelFrameRenderer = null;
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        destroyPlayer();
        TXCGPUColorScreenFilter tXCGPUColorScreenFilter = this.mColorScreenFilter;
        if (tXCGPUColorScreenFilter != null) {
            tXCGPUColorScreenFilter.uninitialize();
            this.mColorScreenFilter = null;
        }
        PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRenderer;
        if (pixelFrameRenderer != null) {
            pixelFrameRenderer.uninitialize();
            this.mPixelFrameRenderer = null;
        }
        super.onUninit();
    }

    public void setEventListener(GreenScreenFilterEventListener greenScreenFilterEventListener) {
        this.mEventListener = greenScreenFilterEventListener;
    }

    public void setGreenScreenFile(String str, boolean z10) {
        runOnDraw(b.a(this, str, z10));
    }

    public void setGreenScreenParam(GLConstants.GLScaleType gLScaleType, boolean z10) {
        this.mScaleType = gLScaleType;
        this.mMirrorX = z10;
    }
}
