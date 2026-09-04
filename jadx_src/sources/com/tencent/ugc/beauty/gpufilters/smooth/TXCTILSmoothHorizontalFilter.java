package com.tencent.ugc.beauty.gpufilters.smooth;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.beauty.NativeLoad;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public class TXCTILSmoothHorizontalFilter extends TXCGPUImageFilter {
    private static final String TAG = "SmoothHorizontal";
    private int mTexelHeightOffsetLocation;
    private int mTexelWidthOffsetLocation;

    TXCTILSmoothHorizontalFilter() {
        super(null, null);
        this.mTexelWidthOffsetLocation = -1;
        this.mTexelHeightOffsetLocation = -1;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public int buildProgram() {
        return NativeLoad.nativeLoadGLProgram(13);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mTexelWidthOffsetLocation = GLES20.glGetUniformLocation(getProgramId(), "texelWidthOffset");
        this.mTexelHeightOffsetLocation = GLES20.glGetUniformLocation(getProgramId(), "texelHeightOffset");
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        float f10 = 2.0f;
        if (i10 <= i11 ? i10 >= 540 : i11 >= 540) {
            f10 = 4.0f;
        }
        LiteavLog.i(TAG, "m_textureRation ".concat(String.valueOf(f10)));
        setFloatOnDraw(this.mTexelWidthOffsetLocation, f10 / i10);
        setFloatOnDraw(this.mTexelHeightOffsetLocation, f10 / i11);
    }
}
