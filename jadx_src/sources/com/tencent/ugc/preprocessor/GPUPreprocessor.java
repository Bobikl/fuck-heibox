package com.tencent.ugc.preprocessor;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.beauty.gpufilters.TXCGPUGaussianBlurFilter;
import com.tencent.ugc.beauty.gpufilters.TXCGPUGreenScreenFilter;
import com.tencent.ugc.beauty.gpufilters.TXCGPULookupFilterGroup;
import com.tencent.ugc.beauty.gpufilters.TXCGPUWatermarkFilter;
import com.tencent.ugc.videobase.chain.GPUInterceptor;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilterChain;
import com.tencent.ugc.videobase.egl.EGLCore;
import com.tencent.ugc.videobase.egl.EGLException;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import com.tencent.ugc.videobase.utils.DelayQueue;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import com.tencent.ugc.videobase.videobase.ConvertParams;
import com.tencent.ugc.videobase.videobase.FrameConverter;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class GPUPreprocessor {
    private final Context mAppContext;
    private final BeautyProcessor mBeautyProcessor;
    private FrameConverter mBeforeWatermarkConverter;
    private Object mEGLContext;
    private EGLCore mEGLCore;
    private GLTexturePool mGLTexturePool;
    private PixelFrameRenderer mPixelFrameRenderer;
    private final String mTAG = "GPUPreprocessor_" + hashCode();
    private final TXCGPUImageFilter[] mGPUImageFilters = new TXCGPUImageFilter[b.values().length];
    private final DelayQueue mRunOnDrawQueue = new DelayQueue();
    private final TXCGPUImageFilterChain mGPUImageFilterChain = new TXCGPUImageFilterChain();
    private final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();
    private int mProcessWidth = 128;
    private int mProcessHeight = 128;
    private final FrameConverter mAfterWatermarkConverter = new FrameConverter();
    private final List<c> mNoNeedWatermarkListeners = new ArrayList();
    private final List<c> mNeedWatermarkListeners = new ArrayList();
    private final FloatBuffer mNormalCubeVerticesBuffer = OpenGlUtils.createNormalCubeVerticesBuffer();
    private final FloatBuffer mNormalTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(l.NORMAL, false, false);

    /* JADX INFO: renamed from: com.tencent.ugc.preprocessor.GPUPreprocessor$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f103751a;

        static {
            int[] iArr = new int[b.values().length];
            f103751a = iArr;
            try {
                iArr[b.WATERMARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103751a[b.GAUSSIAN_BLUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103751a[b.LOOK_UP_FILTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f103751a[b.GREEN_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class a extends GPUInterceptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FrameConverter f103752a;

        public a(FrameConverter frameConverter) {
            this.f103752a = frameConverter;
        }

        @Override // com.tencent.ugc.videobase.chain.GPUInterceptor
        public final GLTexture intercept(long j10, GLTexture gLTexture) {
            FrameConverter frameConverter = this.f103752a;
            if (frameConverter != null) {
                frameConverter.processFrame(j10, gLTexture);
            }
            return gLTexture;
        }
    }

    public enum b {
        MOTION_BASE,
        GAUSSIAN_BLUR,
        LOOK_UP_FILTER,
        GREEN_SCREEN,
        WATERMARK
    }

    public final class c implements FrameConverter.FrameConvertListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f103759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConvertParams f103760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public GLConstants.a f103761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public GLConstants.PixelFormatType f103762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public VideoPreprocessorListener f103763e;

        public c(int i10, ConvertParams convertParams, GLConstants.a aVar, GLConstants.PixelFormatType pixelFormatType, VideoPreprocessorListener videoPreprocessorListener) {
            this.f103759a = i10;
            this.f103760b = convertParams;
            this.f103762d = pixelFormatType;
            this.f103761c = aVar;
            this.f103763e = videoPreprocessorListener;
        }

        @Override // com.tencent.ugc.videobase.videobase.FrameConverter.FrameConvertListener
        public final void onFrameConverted(int i10, PixelFrame pixelFrame) {
            if (this.f103763e == null || GPUPreprocessor.this.mEGLCore == null) {
                return;
            }
            this.f103763e.didProcessFrame(i10, pixelFrame);
            GPUPreprocessor.this.makeCurrent();
        }
    }

    public GPUPreprocessor(Context context, BeautyProcessor beautyProcessor) {
        this.mAppContext = context.getApplicationContext();
        this.mBeautyProcessor = beautyProcessor;
    }

    private void addListenerToList(c cVar, List<c> list) {
        for (c cVar2 : list) {
            if (cVar2.f103759a == cVar.f103759a && cVar2.f103763e == cVar.f103763e) {
                return;
            }
        }
        list.add(cVar);
    }

    private TXCGPUImageFilter createFilter(b bVar) {
        int i10 = AnonymousClass1.f103751a[bVar.ordinal()];
        if (i10 == 1) {
            return new TXCGPUWatermarkFilter();
        }
        if (i10 == 2) {
            return new TXCGPUGaussianBlurFilter(0.8f);
        }
        if (i10 == 3) {
            return new TXCGPULookupFilterGroup();
        }
        if (i10 == 4) {
            return new TXCGPUGreenScreenFilter(this.mAppContext);
        }
        throw new RuntimeException("unknown filter type");
    }

    private void disableFilter(b bVar) {
        TXCGPUImageFilter tXCGPUImageFilter;
        if (this.mGPUImageFilters[bVar.ordinal()] == null || (tXCGPUImageFilter = this.mGPUImageFilters[bVar.ordinal()]) == null) {
            return;
        }
        this.mGPUImageFilters[bVar.ordinal()] = null;
        tXCGPUImageFilter.uninitialize();
        updateFilterChain();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.tencent.ugc.videobase.chain.TXCGPUImageFilter] */
    private <T> T enableFilter(b bVar) {
        if (this.mGPUImageFilters[bVar.ordinal()] != null) {
            return (T) this.mGPUImageFilters[bVar.ordinal()];
        }
        ?? r10 = (T) createFilter(bVar);
        r10.initialize(this.mGLTexturePool);
        r10.onOutputSizeChanged(this.mProcessWidth, this.mProcessHeight);
        this.mGPUImageFilters[bVar.ordinal()] = r10;
        updateFilterChain();
        return r10;
    }

    private <T> T getFilter(b bVar) {
        return (T) this.mGPUImageFilters[bVar.ordinal()];
    }

    private void initializeGLComponents(Object obj) throws EGLException {
        LiteavLog.i(this.mThrottlers.a("initGL"), this.mTAG, "initialize internal, eglContextFromPixelFrame: %s", obj);
        EGLCore eGLCore = new EGLCore();
        this.mEGLCore = eGLCore;
        eGLCore.initialize(obj, null, 128, 128);
        this.mEGLCore.makeCurrent();
        GLTexturePool gLTexturePool = new GLTexturePool();
        this.mGLTexturePool = gLTexturePool;
        this.mAfterWatermarkConverter.initialize(gLTexturePool);
        this.mBeautyProcessor.initialize(this.mGLTexturePool);
        updateFilterChain();
    }

    static /* synthetic */ void lambda$setFilterGroupImages$3(GPUPreprocessor gPUPreprocessor, Bitmap bitmap, Bitmap bitmap2, float f10, float f11, float f12) {
        if (bitmap == null && bitmap2 == null) {
            gPUPreprocessor.disableFilter(b.LOOK_UP_FILTER);
        } else {
            ((TXCGPULookupFilterGroup) gPUPreprocessor.enableFilter(b.LOOK_UP_FILTER)).setBitmap(f10, bitmap, f11, bitmap2, f12);
        }
    }

    static /* synthetic */ void lambda$setFilterMixLevel$2(GPUPreprocessor gPUPreprocessor, float f10) {
        TXCGPULookupFilterGroup tXCGPULookupFilterGroup = (TXCGPULookupFilterGroup) gPUPreprocessor.getFilter(b.LOOK_UP_FILTER);
        if (tXCGPULookupFilterGroup != null) {
            tXCGPULookupFilterGroup.setIntensity(f10);
        }
    }

    static /* synthetic */ void lambda$setGaussianBlurLevel$1(GPUPreprocessor gPUPreprocessor, float f10) {
        if (f10 < 0.0f) {
            gPUPreprocessor.disableFilter(b.GAUSSIAN_BLUR);
            return;
        }
        TXCGPUGaussianBlurFilter tXCGPUGaussianBlurFilter = (TXCGPUGaussianBlurFilter) gPUPreprocessor.enableFilter(b.GAUSSIAN_BLUR);
        if (tXCGPUGaussianBlurFilter != null) {
            tXCGPUGaussianBlurFilter.setBlurSize(f10);
        }
    }

    static /* synthetic */ void lambda$setWatermark$0(GPUPreprocessor gPUPreprocessor, Bitmap bitmap, float f10, float f11, float f12) {
        if (bitmap == null) {
            gPUPreprocessor.disableFilter(b.WATERMARK);
            return;
        }
        TXCGPUWatermarkFilter tXCGPUWatermarkFilter = (TXCGPUWatermarkFilter) gPUPreprocessor.enableFilter(b.WATERMARK);
        tXCGPUWatermarkFilter.enableWatermark(true);
        tXCGPUWatermarkFilter.setWatermark(bitmap, f10, f11, f12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean makeCurrent() {
        try {
            EGLCore eGLCore = this.mEGLCore;
            if (eGLCore != null) {
                eGLCore.makeCurrent();
                return true;
            }
        } catch (EGLException e10) {
            LiteavLog.e(this.mThrottlers.a("makeCurrent"), this.mTAG, "makeCurrent failed. ".concat(String.valueOf(e10)), new Object[0]);
        }
        return false;
    }

    private void registerListenersToRightConverter() {
        if (makeCurrent()) {
            if (this.mGPUImageFilters[b.WATERMARK.ordinal()] != null) {
                if (this.mBeforeWatermarkConverter == null) {
                    FrameConverter frameConverter = new FrameConverter();
                    this.mBeforeWatermarkConverter = frameConverter;
                    frameConverter.initialize(this.mGLTexturePool);
                }
                for (c cVar : this.mNoNeedWatermarkListeners) {
                    this.mAfterWatermarkConverter.removeListener(cVar.f103759a, cVar);
                    this.mBeforeWatermarkConverter.addListener(cVar.f103760b, cVar.f103761c, cVar.f103762d, cVar.f103759a, cVar);
                }
            } else {
                for (c cVar2 : this.mNoNeedWatermarkListeners) {
                    FrameConverter frameConverter2 = this.mBeforeWatermarkConverter;
                    if (frameConverter2 != null) {
                        frameConverter2.removeListener(cVar2.f103759a, cVar2);
                    }
                    this.mAfterWatermarkConverter.addListener(cVar2.f103760b, cVar2.f103761c, cVar2.f103762d, cVar2.f103759a, cVar2);
                }
                FrameConverter frameConverter3 = this.mBeforeWatermarkConverter;
                if (frameConverter3 != null) {
                    frameConverter3.uninitialize();
                    this.mBeforeWatermarkConverter = null;
                }
            }
            for (c cVar3 : this.mNeedWatermarkListeners) {
                this.mAfterWatermarkConverter.addListener(cVar3.f103760b, cVar3.f103761c, cVar3.f103762d, cVar3.f103759a, cVar3);
            }
        }
    }

    private c removeListenerFromList(int i10, VideoPreprocessorListener videoPreprocessorListener, List<c> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar = list.get(i11);
            if (cVar.f103759a == i10 && cVar.f103763e == videoPreprocessorListener) {
                list.remove(i11);
                return cVar;
            }
        }
        return null;
    }

    private void setGLContext(Object obj) {
        if (CommonUtil.equals(this.mEGLContext, obj)) {
            return;
        }
        this.mEGLContext = obj;
        uninitializeGLComponents();
        LiteavLog.i(this.mTAG, "set unique eglcore: %s", obj);
    }

    private void updateFilterChain() {
        this.mGPUImageFilterChain.removeAllFilterAndInterceptor();
        this.mGPUImageFilterChain.uninitialize();
        registerListenersToRightConverter();
        for (b bVar : b.values()) {
            if (bVar == b.WATERMARK) {
                this.mGPUImageFilterChain.addInterceptor(new a(this.mBeforeWatermarkConverter));
            }
            if (bVar == b.MOTION_BASE) {
                this.mGPUImageFilterChain.addFilter(this.mBeautyProcessor);
            } else {
                this.mGPUImageFilterChain.addFilter(this.mGPUImageFilters[bVar.ordinal()]);
            }
        }
        this.mGPUImageFilterChain.addInterceptor(new a(this.mAfterWatermarkConverter));
        this.mGPUImageFilterChain.initialize(this.mGLTexturePool);
        this.mGPUImageFilterChain.onOutputSizeChanged(this.mProcessWidth, this.mProcessHeight);
    }

    public BeautyProcessor getBeautyProcessor() {
        return this.mBeautyProcessor;
    }

    public void processFrame(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType) {
        PixelFrame pixelFrameWrap;
        pixelFrame.getGLContext();
        setGLContext(pixelFrame.getGLContext());
        try {
            if (this.mEGLCore == null) {
                initializeGLComponents(pixelFrame.getGLContext());
            }
            this.mEGLCore.makeCurrent();
            this.mRunOnDrawQueue.rerun();
            if (this.mPixelFrameRenderer == null) {
                this.mPixelFrameRenderer = new PixelFrameRenderer(this.mProcessWidth, this.mProcessHeight);
            }
            OpenGlUtils.glViewport(0, 0, this.mProcessWidth, this.mProcessHeight);
            if (pixelFrame.getHeight() == this.mProcessHeight && pixelFrame.getWidth() == this.mProcessWidth && pixelFrame.getRotation() == l.NORMAL && !pixelFrame.isMirrorVertical() && !pixelFrame.isMirrorHorizontal() && pixelFrame.getPixelBufferType() == GLConstants.a.TEXTURE_2D) {
                pixelFrame.retain();
                pixelFrameWrap = pixelFrame;
            } else {
                GLTexture gLTextureObtain = this.mGLTexturePool.obtain(this.mProcessWidth, this.mProcessHeight);
                gLTextureObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
                this.mPixelFrameRenderer.renderFrame(pixelFrame, gLScaleType, gLTextureObtain);
                pixelFrameWrap = gLTextureObtain.wrap(this.mEGLCore.getEglContext());
                gLTextureObtain.release();
            }
            this.mGPUImageFilterChain.setTimestamp(pixelFrame.getTimestamp());
            GLTexture gLTextureObtain2 = this.mGLTexturePool.obtain(this.mProcessWidth, this.mProcessHeight);
            gLTextureObtain2.setColorFormat(pixelFrameWrap.getColorRange(), pixelFrameWrap.getColorSpace());
            gLTextureObtain2.setMetaData(pixelFrame.getMetaData());
            this.mGPUImageFilterChain.setColorFormat(gLTextureObtain2.getColorRange(), gLTextureObtain2.getColorSpace());
            this.mGPUImageFilterChain.onDraw(pixelFrameWrap.getTextureId(), gLTextureObtain2, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
            pixelFrameWrap.release();
            gLTextureObtain2.release();
            while (true) {
                int iGlGetError = GLES20.glGetError();
                if (iGlGetError == 0) {
                    return;
                }
                LiteavLog.e(this.mThrottlers.a("processFrame"), this.mTAG, "GL error occurred when preprocess frame, error :" + GLUtils.getEGLErrorString(iGlGetError), new Object[0]);
            }
        } catch (EGLException e10) {
            LiteavLog.e(this.mThrottlers.a("make"), this.mTAG, "initializeEGL failed. " + e10.getMessage(), new Object[0]);
            uninitializeGLComponents();
        }
    }

    public void registerVideoProcessedListener(int i10, ConvertParams convertParams, GLConstants.a aVar, GLConstants.PixelFormatType pixelFormatType, boolean z10, VideoPreprocessorListener videoPreprocessorListener) {
        c cVar = new c(i10, convertParams, aVar, pixelFormatType, videoPreprocessorListener);
        if (z10) {
            addListenerToList(cVar, this.mNeedWatermarkListeners);
        } else {
            addListenerToList(cVar, this.mNoNeedWatermarkListeners);
        }
        registerListenersToRightConverter();
        LiteavLog.i(this.mTAG, "register listener, identity:%d, bufferType:%s, formatType:%s, withWatermark:%b, listener:%s", Integer.valueOf(i10), aVar, pixelFormatType, Boolean.valueOf(z10), videoPreprocessorListener);
    }

    public void setFilterGroupImages(float f10, Bitmap bitmap, float f11, Bitmap bitmap2, float f12) {
        this.mRunOnDrawQueue.add(h.a(this, bitmap, bitmap2, f10, f11, f12));
    }

    public void setFilterMixLevel(float f10) {
        this.mRunOnDrawQueue.add(g.a(this, f10));
    }

    public void setGaussianBlurLevel(float f10) {
        this.mRunOnDrawQueue.add(f.a(this, f10));
    }

    public void setProcessSize(int i10, int i11) {
        if (this.mProcessWidth == i10 && this.mProcessHeight == i11) {
            return;
        }
        this.mProcessWidth = i10;
        this.mProcessHeight = i11;
        LiteavLog.i(this.mTAG, "process size update to %dx%d", Integer.valueOf(i10), Integer.valueOf(i11));
        if (makeCurrent()) {
            PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRenderer;
            if (pixelFrameRenderer != null) {
                pixelFrameRenderer.uninitialize();
                this.mPixelFrameRenderer = null;
            }
            GLTexturePool gLTexturePool = this.mGLTexturePool;
            if (gLTexturePool != null) {
                gLTexturePool.evictAll();
            }
            this.mGPUImageFilterChain.onOutputSizeChanged(i10, i11);
        }
    }

    public void setWatermark(Bitmap bitmap, float f10, float f11, float f12) {
        LiteavLog.d(this.mTAG, "setWatermark xOffsetRatio: %.2f, yOffsetRatio: %.2f, widthRatio: %.2f", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12));
        this.mRunOnDrawQueue.add(e.a(this, bitmap, f10, f11, f12));
    }

    public void uninitialize() {
        uninitializeGLComponents();
        LiteavLog.i(this.mTAG, "destroy gpu preprocessor");
    }

    public void uninitializeGLComponents() {
        if (makeCurrent()) {
            this.mAfterWatermarkConverter.uninitialize();
            FrameConverter frameConverter = this.mBeforeWatermarkConverter;
            if (frameConverter != null) {
                frameConverter.uninitialize();
                this.mBeforeWatermarkConverter = null;
            }
            this.mBeautyProcessor.uninitialize();
            GLTexturePool gLTexturePool = this.mGLTexturePool;
            if (gLTexturePool != null) {
                gLTexturePool.evictAll();
                this.mGLTexturePool.destroy();
                this.mGLTexturePool = null;
            }
            PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRenderer;
            if (pixelFrameRenderer != null) {
                pixelFrameRenderer.uninitialize();
                this.mPixelFrameRenderer = null;
            }
            this.mGPUImageFilterChain.uninitialize();
            EGLCore.destroy(this.mEGLCore);
            this.mEGLCore = null;
            LiteavLog.i(this.mThrottlers.a("uninitGL"), this.mTAG, "uninitialize opengl components", new Object[0]);
        }
    }

    public void unregisterVideoProcessedListener(int i10, VideoPreprocessorListener videoPreprocessorListener) {
        c cVarRemoveListenerFromList = removeListenerFromList(i10, videoPreprocessorListener, this.mNoNeedWatermarkListeners);
        if (cVarRemoveListenerFromList == null && (cVarRemoveListenerFromList = removeListenerFromList(i10, videoPreprocessorListener, this.mNeedWatermarkListeners)) == null) {
            return;
        }
        this.mAfterWatermarkConverter.removeListener(i10, cVarRemoveListenerFromList);
        FrameConverter frameConverter = this.mBeforeWatermarkConverter;
        if (frameConverter != null) {
            frameConverter.removeListener(i10, cVarRemoveListenerFromList);
        }
        LiteavLog.i(this.mTAG, "unregister listener: identity: %d, listener: %s", Integer.valueOf(i10), videoPreprocessorListener);
    }
}
