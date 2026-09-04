package com.tencent.ugc.videobase.chain;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.l;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUImageFilterChain extends TXCGPUImageFilter {
    private static final String TAG = "TXCGPUImageFilterChain";
    private final List<TXCGPUImageFilter> mFilters = new ArrayList();
    private final Map<TXCGPUImageFilter, List<GPUInterceptor>> mInterceptorsBeforeFilter = new HashMap();
    private final List<GPUInterceptor> mLastInterceptors = new ArrayList();
    private long mTimestamp = 0;
    private final FloatBuffer mNormalCubeVerticesBuffer = OpenGlUtils.createNormalCubeVerticesBuffer();
    private final FloatBuffer mNormalTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(l.NORMAL, false, false);

    private GLTexture doIntercept(List<GPUInterceptor> list, GLTexture gLTexture) {
        if (list == null || list.isEmpty()) {
            return gLTexture;
        }
        GLTexture gLTexture2 = null;
        Iterator<GPUInterceptor> it = list.iterator();
        while (it.hasNext()) {
            GLTexture gLTextureIntercept = it.next().intercept(this.mTimestamp, gLTexture2 == null ? gLTexture : gLTexture2);
            if (gLTextureIntercept == null) {
                LiteavLog.e(TAG, "doIntercept return null value");
                break;
            }
            if (gLTexture2 != null && gLTextureIntercept != gLTexture2) {
                gLTexture2.release();
            }
            gLTexture2 = gLTextureIntercept;
        }
        return gLTexture2;
    }

    private GLTexture doLastIntercept(GLTexture gLTexture) {
        if (this.mLastInterceptors.isEmpty()) {
            return gLTexture;
        }
        if (gLTexture != null) {
            return doIntercept(this.mLastInterceptors, gLTexture);
        }
        LiteavLog.e(TAG, "last interceptors intecept on surface.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initFiltersAndInterceptors() {
        for (TXCGPUImageFilter tXCGPUImageFilter : this.mFilters) {
            if (!tXCGPUImageFilter.isInitialized()) {
                tXCGPUImageFilter.initialize(this.mTexturePool);
            }
        }
        for (List<GPUInterceptor> list : this.mInterceptorsBeforeFilter.values()) {
            if (list != null && !list.isEmpty()) {
                for (GPUInterceptor gPUInterceptor : list) {
                    if (!gPUInterceptor.isInitialized()) {
                        gPUInterceptor.initialize(this.mTexturePool);
                    }
                }
            }
        }
        for (GPUInterceptor gPUInterceptor2 : this.mLastInterceptors) {
            if (!gPUInterceptor2.isInitialized()) {
                gPUInterceptor2.initialize(this.mTexturePool);
            }
        }
    }

    private void initFiltersAndInterceptorsOnDraw() {
        runOnDraw(f.a(this));
    }

    public synchronized void addFilter(TXCGPUImageFilter tXCGPUImageFilter) {
        if (tXCGPUImageFilter == null) {
            return;
        }
        if (!this.mLastInterceptors.isEmpty()) {
            if (this.mFilters.size() == 0) {
                this.mFilters.add(new TXCGPUImageFilter());
                LiteavLog.w(TAG, "add COPY filter to filter chain.");
            }
            this.mInterceptorsBeforeFilter.put(tXCGPUImageFilter, new ArrayList(this.mLastInterceptors));
            this.mLastInterceptors.clear();
        }
        this.mFilters.add(tXCGPUImageFilter);
        initFiltersAndInterceptorsOnDraw();
    }

    public synchronized void addInterceptor(GPUInterceptor gPUInterceptor) {
        if (gPUInterceptor != null) {
            this.mLastInterceptors.add(gPUInterceptor);
            initFiltersAndInterceptorsOnDraw();
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i10, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLTexture gLTextureObtain;
        if (isInitialized()) {
            runPendingOnDrawTasks();
            if (i10 == -1) {
                return;
            }
            List<TXCGPUImageFilter> list = this.mFilters;
            int size = list.size();
            GLTexture gLTexture2 = null;
            int i11 = 0;
            while (i11 < size) {
                TXCGPUImageFilter tXCGPUImageFilter = list.get(i11);
                Size outputSize = tXCGPUImageFilter.getOutputSize();
                if (gLTexture2 != null) {
                    GLTexture gLTextureDoIntercept = doIntercept(this.mInterceptorsBeforeFilter.get(tXCGPUImageFilter), gLTexture2);
                    if (gLTextureDoIntercept != null && gLTextureDoIntercept != gLTexture2) {
                        gLTexture2.release();
                    }
                    if (gLTextureDoIntercept != null) {
                        gLTextureDoIntercept.setMetaData(gLTexture.getMetaData());
                    }
                    gLTexture2 = gLTextureDoIntercept;
                }
                boolean z10 = i11 < size + (-1);
                boolean z11 = z10 && !CollectionUtils.isEmpty(this.mInterceptorsBeforeFilter.get(list.get(i11 + 1)));
                if (z10 && outputSize.equals(this.mOutputSize) && tXCGPUImageFilter.canBeSkipped() && (gLTexture2 != null || !z11)) {
                    tXCGPUImageFilter.onFilterBeenSkipped();
                } else {
                    if (z10) {
                        gLTextureObtain = this.mTexturePool.obtain(outputSize.width, outputSize.height);
                        gLTextureObtain.setColorFormat(this.mColorRange, this.mColorSpace);
                    } else {
                        gLTextureObtain = gLTexture;
                    }
                    OpenGlUtils.glViewport(0, 0, outputSize.width, outputSize.height);
                    int id2 = gLTexture2 == null ? i10 : gLTexture2.getId();
                    if (i11 == 0) {
                        tXCGPUImageFilter.onDraw(id2, gLTextureObtain, floatBuffer, floatBuffer2);
                    } else {
                        tXCGPUImageFilter.onDraw(id2, gLTextureObtain, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
                    }
                    if (gLTexture2 != null) {
                        gLTexture2.release();
                    }
                    if (gLTextureObtain != null) {
                        gLTextureObtain.setMetaData(gLTexture.getMetaData());
                    }
                    gLTexture2 = gLTextureObtain;
                }
                i11++;
            }
            if (gLTexture2 != null && gLTexture2 != gLTexture) {
                gLTexture2.release();
            }
            GLTexture gLTextureDoLastIntercept = doLastIntercept(gLTexture);
            if (gLTextureDoLastIntercept == null || gLTextureDoLastIntercept == gLTexture) {
                return;
            }
            OpenGlUtils.glViewport(0, 0, gLTextureDoLastIntercept.getWidth(), gLTextureDoLastIntercept.getHeight());
            super.onDraw(gLTextureDoLastIntercept.getId(), gLTexture, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
            gLTextureDoLastIntercept.release();
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    protected void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        initFiltersAndInterceptors();
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        Iterator<TXCGPUImageFilter> it = this.mFilters.iterator();
        while (it.hasNext()) {
            it.next().onOutputSizeChanged(i10, i11);
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    protected void onUninit() {
        super.onUninit();
        Iterator<TXCGPUImageFilter> it = this.mFilters.iterator();
        while (it.hasNext()) {
            it.next().uninitialize();
        }
        for (List<GPUInterceptor> list : this.mInterceptorsBeforeFilter.values()) {
            if (list != null && !list.isEmpty()) {
                Iterator<GPUInterceptor> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().uninitialize();
                }
            }
        }
        Iterator<GPUInterceptor> it3 = this.mLastInterceptors.iterator();
        while (it3.hasNext()) {
            it3.next().uninitialize();
        }
    }

    public synchronized void removeAllFilterAndInterceptor() {
        this.mFilters.clear();
        this.mInterceptorsBeforeFilter.clear();
        this.mLastInterceptors.clear();
    }

    public void setTimestamp(long j10) {
        this.mTimestamp = j10;
    }
}
