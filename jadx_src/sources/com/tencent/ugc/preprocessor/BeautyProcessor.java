package com.tencent.ugc.preprocessor;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.beauty.gpufilters.BeautyBrightFilter;
import com.tencent.ugc.beauty.gpufilters.BeautyInterFace;
import com.tencent.ugc.beauty.gpufilters.TXCGPUMotionBase;
import com.tencent.ugc.beauty.gpufilters.pitu.BeautyPITUFilter;
import com.tencent.ugc.beauty.gpufilters.smooth.BeautySmoothFilter;
import com.tencent.ugc.beauty.gpufilters.vague.BeautyVagueFilter;
import com.tencent.ugc.common.TXCBuildsUtil;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilterChain;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.FloatUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class BeautyProcessor extends TXCGPUImageFilterChain {
    private static final String TAG = "TXCBeautyManager";
    private BeautyProcessorStatusListener mBeautyManagerStatusListener;
    private final boolean mIsEnterPriseProEnabled;
    private final TXCGPUMotionBase mMotionFilter;
    private TXCGPUImageFilter mCurrentBeautyFilter = null;
    private int mBeautyStyle = -1;
    private float mBeautyLevel = 0.0f;
    private float mWhitenessLevel = 0.0f;
    private float mRuddyLevel = 0.0f;
    private float mSharpnessLevel = 0.4f;
    private boolean mIsPerformanceMode = true;
    private float mUserSetSharpnessLevel = 0.0f;
    private final Map<String, String> mBeautyStats = new HashMap();
    private final SparseArray<TXCGPUImageFilter> mBeautyFilters = new SparseArray<>();

    public interface BeautyProcessorStatusListener {
        void onBeautyStatsChanged(String str);
    }

    public BeautyProcessor(Context context, boolean z10) {
        this.mIsEnterPriseProEnabled = z10;
        this.mMotionFilter = TXCBuildsUtil.createMotionFilter(context);
    }

    private boolean canBeSkipped(TXCGPUImageFilter tXCGPUImageFilter) {
        if (tXCGPUImageFilter == null) {
            return true;
        }
        return tXCGPUImageFilter.canBeSkipped();
    }

    private float getSharpnessLevel() {
        float f10 = this.mUserSetSharpnessLevel;
        if (f10 != 0.0f) {
            return f10;
        }
        if (!this.mIsPerformanceMode) {
            Size size = this.mOutputSize;
            if (Math.min(size.width, size.height) >= 540) {
                return 0.4f;
            }
        }
        return 0.0f;
    }

    static /* synthetic */ void lambda$setBeautyLevel$0(BeautyProcessor beautyProcessor, float f10) {
        beautyProcessor.updateBeautyInternal(beautyProcessor.mBeautyStyle, f10, beautyProcessor.mWhitenessLevel, beautyProcessor.mRuddyLevel, beautyProcessor.mSharpnessLevel);
        beautyProcessor.updateStatsInternal("beautyLevel", f10);
    }

    static /* synthetic */ void lambda$setPerformanceMode$3(BeautyProcessor beautyProcessor, boolean z10) {
        beautyProcessor.mIsPerformanceMode = z10;
        beautyProcessor.updateSharpenLevelInternal();
    }

    static /* synthetic */ void lambda$setWhitenessLevel$1(BeautyProcessor beautyProcessor, float f10) {
        beautyProcessor.updateBeautyInternal(beautyProcessor.mBeautyStyle, beautyProcessor.mBeautyLevel, f10, beautyProcessor.mRuddyLevel, beautyProcessor.mSharpnessLevel);
        beautyProcessor.updateStatsInternal("whiteLevel", f10);
    }

    private void updateBeautyInternal(int i10, float f10, float f11, float f12, float f13) {
        Size size = this.mOutputSize;
        if (size.width == -1 || size.height == -1) {
            return;
        }
        if (this.mBeautyStyle != i10) {
            updateStatsOnDraw("beautyStyle", i10);
        }
        TXCGPUImageFilter beautySmoothFilter = this.mBeautyFilters.get(i10);
        if (beautySmoothFilter == null) {
            if (i10 == 0) {
                beautySmoothFilter = new BeautySmoothFilter();
            } else if (i10 != 1) {
                beautySmoothFilter = i10 != 2 ? new BeautyBrightFilter() : new BeautyPITUFilter();
            } else {
                beautySmoothFilter = new BeautyVagueFilter();
            }
            beautySmoothFilter.initialize(this.mTexturePool);
            Size size2 = this.mOutputSize;
            beautySmoothFilter.onOutputSizeChanged(size2.width, size2.height);
            this.mBeautyFilters.put(i10, beautySmoothFilter);
        }
        BeautyInterFace beautyInterFace = (BeautyInterFace) beautySmoothFilter;
        beautyInterFace.setBeautyLevel(f10);
        beautyInterFace.setRuddyLevel(f12);
        beautyInterFace.setWhitenessLevel(f11);
        beautyInterFace.setSharpenLevel(f13);
        if (this.mBeautyStyle == i10 && FloatUtils.isEqual(this.mBeautyLevel, f10) && FloatUtils.isEqual(this.mWhitenessLevel, f11) && FloatUtils.isEqual(this.mRuddyLevel, f12) && FloatUtils.isEqual(this.mSharpnessLevel, f13)) {
            return;
        }
        this.mBeautyStyle = i10;
        this.mBeautyLevel = f10;
        this.mWhitenessLevel = f11;
        this.mRuddyLevel = f12;
        this.mSharpnessLevel = f13;
        removeAllFilterAndInterceptor();
        this.mCurrentBeautyFilter = null;
        if (!(isLessOrEqualZero(this.mBeautyLevel) && isLessOrEqualZero(this.mRuddyLevel) && isLessOrEqualZero(this.mWhitenessLevel))) {
            addFilter(beautySmoothFilter);
            this.mCurrentBeautyFilter = beautySmoothFilter;
        }
        addFilter(this.mMotionFilter);
    }

    private void updateSharpenLevelInternal() {
        float sharpnessLevel = getSharpnessLevel();
        LiteavLog.d(TAG, "sharpnessLevel: ".concat(String.valueOf(sharpnessLevel)));
        updateBeautyInternal(this.mBeautyStyle, this.mBeautyLevel, this.mWhitenessLevel, this.mRuddyLevel, sharpnessLevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateStatsInternal(String str, float f10) {
        this.mBeautyStats.put(str, String.valueOf(f10));
        if (this.mBeautyManagerStatusListener == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : this.mBeautyStats.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(":");
            sb2.append(entry.getValue());
            sb2.append(" ");
        }
        this.mBeautyManagerStatusListener.onBeautyStatsChanged("{" + ((Object) sb2) + z5.g.f141884d);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public boolean canBeSkipped() {
        return canBeSkipped(this.mCurrentBeautyFilter) && this.mMotionFilter.canBeSkipped();
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilterChain, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mMotionFilter.initialize(gLTexturePool);
        int i10 = this.mBeautyStyle;
        if (i10 == -1) {
            i10 = 0;
        }
        updateBeautyInternal(i10, this.mBeautyLevel, this.mWhitenessLevel, this.mRuddyLevel, this.mSharpnessLevel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilterChain, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        this.mMotionFilter.onOutputSizeChanged(i10, i11);
        float sharpnessLevel = getSharpnessLevel();
        for (int i12 = 0; i12 < this.mBeautyFilters.size(); i12++) {
            TXCGPUImageFilter tXCGPUImageFilterValueAt = this.mBeautyFilters.valueAt(i12);
            tXCGPUImageFilterValueAt.onOutputSizeChanged(i10, i11);
            if (tXCGPUImageFilterValueAt instanceof BeautyInterFace) {
                ((BeautyInterFace) tXCGPUImageFilterValueAt).setSharpenLevel(sharpnessLevel);
            }
        }
        int i13 = this.mBeautyStyle;
        updateBeautyInternal(i13 == -1 ? 0 : i13, this.mBeautyLevel, this.mWhitenessLevel, this.mRuddyLevel, sharpnessLevel);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilterChain, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        super.onUninit();
        this.mMotionFilter.uninitialize();
        for (int i10 = 0; i10 < this.mBeautyFilters.size(); i10++) {
            this.mBeautyFilters.valueAt(i10).uninitialize();
        }
    }

    public void setBeautyLevel(float f10) {
        float fA = com.tencent.liteav.base.util.h.a(f10, 0.0f);
        LiteavLog.d(TAG, "setBeautyLevel beautyLevel:".concat(String.valueOf(f10)));
        runOnDraw(a.a(this, fA));
    }

    public void setBeautyManagerStatusListener(BeautyProcessorStatusListener beautyProcessorStatusListener) {
        this.mBeautyManagerStatusListener = beautyProcessorStatusListener;
    }

    public void setHomeOrientation(int i10) {
        this.mMotionFilter.setHomeOrientation(i10);
    }

    public void setPerformanceMode(boolean z10) {
        LiteavLog.d(TAG, "setPerformanceMode: ".concat(String.valueOf(z10)));
        runOnDraw(d.a(this, z10));
    }

    public void setWhitenessLevel(float f10) {
        float fA = com.tencent.liteav.base.util.h.a(f10, 0.0f);
        LiteavLog.d(TAG, "setWhitenessLevel whitenessLevel:".concat(String.valueOf(f10)));
        runOnDraw(b.a(this, fA));
    }

    public void updateStatsOnDraw(String str, int i10) {
        runOnDraw(c.a(this, str, i10));
    }
}
