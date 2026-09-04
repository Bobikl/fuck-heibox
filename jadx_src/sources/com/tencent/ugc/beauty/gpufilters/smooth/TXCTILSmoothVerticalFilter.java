package com.tencent.ugc.beauty.gpufilters.smooth;

import android.opengl.GLES20;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.beauty.NativeLoad;
import com.tencent.ugc.videobase.filter.TXCGPUTwoInputFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public class TXCTILSmoothVerticalFilter extends TXCGPUTwoInputFilter {
    private static final String TAG = "SmoothVertical";
    private float mBeautyLevel;
    private int mSmoothDegreeUniform;
    private int mTexelHeightOffsetLocation;
    private int mTexelWidthOffsetLocation;

    TXCTILSmoothVerticalFilter() {
        super(null, null);
        this.mTexelWidthOffsetLocation = -1;
        this.mTexelHeightOffsetLocation = -1;
        this.mSmoothDegreeUniform = -1;
        this.mBeautyLevel = 0.0f;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public int buildProgram() {
        if (!LiteavSystemInfo.getBrand().equals("samsung") || !LiteavSystemInfo.getModel().equals("GT-I9500") || !LiteavSystemInfo.getSystemOSVersion().equals("4.3")) {
            return NativeLoad.nativeLoadGLProgram(5);
        }
        LiteavLog.d(TAG, "SAMSUNG_S4 GT-I9500 + Android 4.3; use diffrent shader!");
        return NativeLoad.nativeLoadGLProgram(15);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public boolean canBeSkipped() {
        return isLessOrEqualZero(this.mBeautyLevel);
    }

    @Override // com.tencent.ugc.videobase.filter.TXCGPUTwoInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mTexelWidthOffsetLocation = GLES20.glGetUniformLocation(getProgramId(), "texelWidthOffset");
        this.mTexelHeightOffsetLocation = GLES20.glGetUniformLocation(getProgramId(), "texelHeightOffset");
        this.mSmoothDegreeUniform = GLES20.glGetUniformLocation(getProgramId(), "smoothDegree");
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        float f10 = 2.0f;
        if (i10 <= i11 ? i10 >= 540 : i11 >= 540) {
            f10 = 4.0f;
        }
        LiteavLog.i(TAG, "mTextureRation ".concat(String.valueOf(f10)));
        setFloatOnDraw(this.mTexelWidthOffsetLocation, f10 / i10);
        setFloatOnDraw(this.mTexelHeightOffsetLocation, f10 / i11);
    }

    public void setBeautyLevel(float f10) {
        LiteavLog.i(TAG, "setBeautyLevel ".concat(String.valueOf(f10)));
        this.mBeautyLevel = f10;
        setFloatOnDraw(this.mSmoothDegreeUniform, f10);
    }
}
