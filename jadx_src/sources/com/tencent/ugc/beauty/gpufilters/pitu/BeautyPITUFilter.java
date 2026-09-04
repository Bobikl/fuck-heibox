package com.tencent.ugc.beauty.gpufilters.pitu;

import com.tencent.ugc.beauty.gpufilters.BeautyInterFace;
import com.tencent.ugc.videobase.chain.TXCGPUImageMultipleInputFilter;
import com.tencent.ugc.videobase.chain.TXCGPUImageTopoSortFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public class BeautyPITUFilter extends TXCGPUImageTopoSortFilter implements BeautyInterFace {
    private static final String TAG = "BeautyPITUFilter";
    private final a mBorderBlurFilterHorizontal;
    private final a mBorderBlurFilterVertical;
    private final TXCYTBeautyBorderFilter mBorderFilter;
    private final a mSkinBlurFilterHorizontal;
    private final a mSkinBlurFilterVertical;
    private final TXCYTBeautySmoothFilter mSmoothFilter;
    private float mBeautyLevel = 0.2f;
    private float mWhiteLevel = 0.2f;
    private float mRuddyLevel = 0.2f;
    private float mSharpenLevel = 0.0f;

    public BeautyPITUFilter() {
        a aVar = new a(true);
        this.mSkinBlurFilterVertical = aVar;
        a aVar2 = new a(false);
        this.mSkinBlurFilterHorizontal = aVar2;
        TXCYTBeautyBorderFilter tXCYTBeautyBorderFilter = new TXCYTBeautyBorderFilter();
        this.mBorderFilter = tXCYTBeautyBorderFilter;
        TXCYTBeautySmoothFilter tXCYTBeautySmoothFilter = new TXCYTBeautySmoothFilter();
        this.mSmoothFilter = tXCYTBeautySmoothFilter;
        a aVar3 = new a(true);
        this.mBorderBlurFilterVertical = aVar3;
        a aVar4 = new a(false);
        this.mBorderBlurFilterHorizontal = aVar4;
        TXCGPUImageTopoSortFilter.Node initNode = getInitNode();
        TXCGPUImageTopoSortFilter.Node nodeCreateNodeFromFilter = createNodeFromFilter(aVar);
        nodeCreateNodeFromFilter.setInputForOnDraw(initNode);
        TXCGPUImageTopoSortFilter.Node nodeCreateNodeFromFilter2 = createNodeFromFilter(aVar2);
        nodeCreateNodeFromFilter2.setInputForOnDraw(nodeCreateNodeFromFilter);
        TXCGPUImageTopoSortFilter.Node nodeCreateNodeFromFilter3 = createNodeFromFilter(tXCYTBeautyBorderFilter);
        nodeCreateNodeFromFilter3.setInputForOnDraw(initNode);
        nodeCreateNodeFromFilter3.addExtraInput(TXCGPUImageMultipleInputFilter.SECOND_INPUT_SAMPLE2D_NAME, nodeCreateNodeFromFilter2);
        TXCGPUImageTopoSortFilter.Node nodeCreateNodeFromFilter4 = createNodeFromFilter(aVar3);
        nodeCreateNodeFromFilter4.setInputForOnDraw(nodeCreateNodeFromFilter3);
        TXCGPUImageTopoSortFilter.Node nodeCreateNodeFromFilter5 = createNodeFromFilter(aVar4);
        nodeCreateNodeFromFilter5.setInputForOnDraw(nodeCreateNodeFromFilter4);
        TXCGPUImageTopoSortFilter.Node nodeCreateNodeFromFilter6 = createNodeFromFilter(tXCYTBeautySmoothFilter);
        nodeCreateNodeFromFilter6.setInputForOnDraw(initNode);
        nodeCreateNodeFromFilter6.addExtraInput(TXCGPUImageMultipleInputFilter.SECOND_INPUT_SAMPLE2D_NAME, nodeCreateNodeFromFilter2);
        nodeCreateNodeFromFilter6.addExtraInput(TXCGPUImageMultipleInputFilter.THIRD_INPUT_SAMPLE2D_NAME, nodeCreateNodeFromFilter5);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public boolean canBeSkipped() {
        return this.mSmoothFilter.canBeSkipped();
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageTopoSortFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mSmoothFilter.setBlurStrength(this.mBeautyLevel);
        this.mSmoothFilter.setWhitenStrength(this.mWhiteLevel);
        this.mSmoothFilter.setRuddyStrength(this.mRuddyLevel);
        this.mSmoothFilter.setSharpenStrength(this.mSharpenLevel);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setBeautyLevel(float f10) {
        this.mBeautyLevel = f10;
        this.mSmoothFilter.setBlurStrength(f10);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setRuddyLevel(float f10) {
        this.mRuddyLevel = f10;
        this.mSmoothFilter.setRuddyStrength(f10);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setSharpenLevel(float f10) {
        this.mSharpenLevel = f10;
        this.mSmoothFilter.setSharpenStrength(f10);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setWhitenessLevel(float f10) {
        this.mWhiteLevel = f10;
        this.mSmoothFilter.setWhitenStrength(f10);
    }
}
