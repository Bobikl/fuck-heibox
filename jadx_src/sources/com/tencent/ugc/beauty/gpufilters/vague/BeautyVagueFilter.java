package com.tencent.ugc.beauty.gpufilters.vague;

import com.tencent.ugc.beauty.gpufilters.BeautyInterFace;
import com.tencent.ugc.beauty.gpufilters.TXCGPUSharpenFilter;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilterChain;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public class BeautyVagueFilter extends TXCGPUImageFilterChain implements BeautyInterFace {
    private final TXCGChannelBeautyFilter mGreenBeautyFilter;
    private final TXCGPUSharpenFilter mSharpnessFilter;
    private float mBeautyLevel = 0.0f;
    private float mWhiteLevel = 0.0f;
    private float mRuddyLevel = 0.0f;
    private float mSharpnessLevel = 0.0f;

    public BeautyVagueFilter() {
        TXCGChannelBeautyFilter tXCGChannelBeautyFilter = new TXCGChannelBeautyFilter();
        this.mGreenBeautyFilter = tXCGChannelBeautyFilter;
        TXCGPUSharpenFilter tXCGPUSharpenFilter = new TXCGPUSharpenFilter();
        this.mSharpnessFilter = tXCGPUSharpenFilter;
        addFilter(tXCGChannelBeautyFilter);
        addFilter(tXCGPUSharpenFilter);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public boolean canBeSkipped() {
        return this.mGreenBeautyFilter.canBeSkipped() && this.mSharpnessFilter.canBeSkipped();
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilterChain, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mGreenBeautyFilter.setBeautyLevel(this.mBeautyLevel);
        this.mGreenBeautyFilter.setWhitenessLevel(this.mWhiteLevel);
        this.mGreenBeautyFilter.setRuddyLevel(this.mRuddyLevel);
        this.mSharpnessFilter.setSharpness(this.mSharpnessLevel / 2.0f);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setBeautyLevel(float f10) {
        this.mBeautyLevel = f10;
        this.mGreenBeautyFilter.setBeautyLevel(f10);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setRuddyLevel(float f10) {
        this.mRuddyLevel = f10;
        this.mGreenBeautyFilter.setRuddyLevel(f10);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setSharpenLevel(float f10) {
        this.mSharpnessLevel = f10;
        this.mSharpnessFilter.setSharpness(f10 / 2.0f);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setWhitenessLevel(float f10) {
        this.mWhiteLevel = f10;
        this.mGreenBeautyFilter.setWhitenessLevel(f10);
    }
}
