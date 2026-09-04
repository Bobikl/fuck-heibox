package com.tencent.ugc.beauty.gpufilters.smooth;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.beauty.gpufilters.BeautyInterFace;
import com.tencent.ugc.videobase.chain.TXCGPUImageMultipleInputFilter;
import com.tencent.ugc.videobase.chain.TXCGPUImageTopoSortFilter;

/* JADX INFO: loaded from: classes4.dex */
public class BeautySmoothFilter extends TXCGPUImageTopoSortFilter implements BeautyInterFace {
    private static final String TAG = "BeautySmoothFilter";
    private final TXCBeautyBlend mBeautyBlendFilter;
    private final TXCTILSmoothHorizontalFilter mHorizontalFilter;
    private final TXCGPUSharpenAlphaFilter mSharpenFilter;
    private final TXCTILSmoothVerticalFilter mVerticalFilter;
    private float mSharpenLevel = 0.1f;
    private float mResampleRatio = 2.0f;
    private int mResampleWidth = 0;
    private int mResampleHeight = 0;

    public BeautySmoothFilter() {
        TXCBeautyBlend tXCBeautyBlend = new TXCBeautyBlend();
        this.mBeautyBlendFilter = tXCBeautyBlend;
        TXCTILSmoothHorizontalFilter tXCTILSmoothHorizontalFilter = new TXCTILSmoothHorizontalFilter();
        this.mHorizontalFilter = tXCTILSmoothHorizontalFilter;
        TXCTILSmoothVerticalFilter tXCTILSmoothVerticalFilter = new TXCTILSmoothVerticalFilter();
        this.mVerticalFilter = tXCTILSmoothVerticalFilter;
        TXCGPUSharpenAlphaFilter tXCGPUSharpenAlphaFilter = new TXCGPUSharpenAlphaFilter();
        this.mSharpenFilter = tXCGPUSharpenAlphaFilter;
        TXCGPUImageTopoSortFilter.Node initNode = getInitNode();
        TXCGPUImageTopoSortFilter.Node nodeCreateNodeFromFilter = createNodeFromFilter(tXCTILSmoothHorizontalFilter);
        nodeCreateNodeFromFilter.setInputForOnDraw(initNode);
        TXCGPUImageTopoSortFilter.Node nodeCreateNodeFromFilter2 = createNodeFromFilter(tXCTILSmoothVerticalFilter);
        nodeCreateNodeFromFilter2.setInputForOnDraw(nodeCreateNodeFromFilter);
        nodeCreateNodeFromFilter2.addExtraInput(TXCGPUImageMultipleInputFilter.SECOND_INPUT_SAMPLE2D_NAME, initNode);
        TXCGPUImageTopoSortFilter.Node nodeCreateNodeFromFilter3 = createNodeFromFilter(tXCGPUSharpenAlphaFilter);
        nodeCreateNodeFromFilter3.setInputForOnDraw(nodeCreateNodeFromFilter2);
        TXCGPUImageTopoSortFilter.Node nodeCreateNodeFromFilter4 = createNodeFromFilter(tXCBeautyBlend);
        nodeCreateNodeFromFilter4.setInputForOnDraw(nodeCreateNodeFromFilter3);
        nodeCreateNodeFromFilter4.addExtraInput(TXCGPUImageMultipleInputFilter.SECOND_INPUT_SAMPLE2D_NAME, initNode);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public boolean canBeSkipped() {
        return this.mVerticalFilter.canBeSkipped() && this.mBeautyBlendFilter.canBeSkipped() && this.mSharpenFilter.canBeSkipped();
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageTopoSortFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        this.mResampleWidth = i10;
        this.mResampleHeight = i11;
        if (Math.abs(this.mResampleRatio - 1.0f) > 1.0E-5d) {
            float f10 = this.mResampleWidth;
            float f11 = this.mResampleRatio;
            this.mResampleWidth = (int) (f10 / f11);
            this.mResampleHeight = (int) (this.mResampleHeight / f11);
        }
        LiteavLog.i(TAG, "mResampleRatio: %f, mResampleWidth: %d, mResampleHeight: %d", Float.valueOf(this.mResampleRatio), Integer.valueOf(this.mResampleWidth), Integer.valueOf(this.mResampleHeight));
        this.mHorizontalFilter.onOutputSizeChanged(this.mResampleWidth, this.mResampleHeight);
        this.mVerticalFilter.onOutputSizeChanged(this.mResampleWidth, this.mResampleHeight);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setBeautyLevel(float f10) {
        this.mVerticalFilter.setBeautyLevel(f10);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setRuddyLevel(float f10) {
        this.mBeautyBlendFilter.setRuddyLevel(f10);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setSharpenLevel(float f10) {
        LiteavLog.i(TAG, "setSharpenLevel ".concat(String.valueOf(f10)));
        this.mSharpenLevel = f10;
        this.mSharpenFilter.setSharpness(f10 / 1.2f);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setWhitenessLevel(float f10) {
        this.mBeautyBlendFilter.setWhitenessLevel(f10);
    }
}
