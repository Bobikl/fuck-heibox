package com.tencent.ugc.beauty.gpufilters.vague;

import android.opengl.GLES20;
import com.tencent.ugc.beauty.NativeLoad;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGChannelBeautyFilter extends TXCGPUImageFilter {
    private final float[] mBeautyParam;
    private int mBeautyParamsHandle;
    private int mSingleStepOffsetLoc;

    public TXCGChannelBeautyFilter() {
        super(null, null);
        this.mSingleStepOffsetLoc = -1;
        this.mBeautyParamsHandle = -1;
        this.mBeautyParam = new float[]{0.5f, 0.0f, 0.0f, 0.0f};
    }

    private void setBeautyParam(float[] fArr) {
        setFloatVec4OnDraw(this.mBeautyParamsHandle, fArr);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public int buildProgram() {
        return NativeLoad.nativeLoadGLProgram(14);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public boolean canBeSkipped() {
        return isLessOrEqualZero(this.mBeautyParam[0]) && isLessOrEqualZero(this.mBeautyParam[1]) && isLessOrEqualZero(this.mBeautyParam[2]);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mSingleStepOffsetLoc = GLES20.glGetUniformLocation(getProgramId(), "singleStepOffset");
        this.mBeautyParamsHandle = GLES20.glGetUniformLocation(getProgramId(), "beautyParams");
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        setTexSize(i10, i11);
    }

    public void setBeautyLevel(float f10) {
        float[] fArr = this.mBeautyParam;
        fArr[0] = f10;
        setBeautyParam(fArr);
    }

    public void setRuddyLevel(float f10) {
        float[] fArr = this.mBeautyParam;
        fArr[2] = f10;
        setBeautyParam(fArr);
    }

    public void setTexSize(int i10, int i11) {
        setFloatVec2OnDraw(this.mSingleStepOffsetLoc, new float[]{2.0f / i10, 2.0f / i11});
    }

    public void setWhitenessLevel(float f10) {
        float[] fArr = this.mBeautyParam;
        fArr[1] = f10;
        setBeautyParam(fArr);
    }
}
