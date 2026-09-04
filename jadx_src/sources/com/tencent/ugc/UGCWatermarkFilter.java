package com.tencent.ugc;

import android.opengl.GLES20;
import com.tencent.ugc.beauty.gpufilters.TXCGPUWatermarkFilter;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public class UGCWatermarkFilter extends TXCGPUWatermarkFilter {
    private static final String WATERMARK_ALPHA_FRAG = "  varying highp vec2 textureCoordinate;\n  uniform sampler2D inputImageTexture;\n  uniform highp float alphaBlend;\n  \n  void main()\n  {\n      highp vec4 color = texture2D(inputImageTexture, textureCoordinate);\n      highp float alpha = color.a * alphaBlend;\n      gl_FragColor = vec4(color.rgb * alphaBlend,alpha);\n  }\n";
    private int mAlphaUniform;
    private float mWaterMarkAlpha;

    public UGCWatermarkFilter() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, WATERMARK_ALPHA_FRAG);
        this.mAlphaUniform = 1;
        this.mWaterMarkAlpha = 1.0f;
    }

    @Override // com.tencent.ugc.beauty.gpufilters.TXCGPUWatermarkFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void afterDrawArrays() {
        GLES20.glUniform1f(this.mAlphaUniform, this.mWaterMarkAlpha);
        super.afterDrawArrays();
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void beforeDrawArrays(int i10) {
        super.beforeDrawArrays(i10);
        GLES20.glUniform1f(this.mAlphaUniform, 1.0f);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.TXCGPUWatermarkFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        this.mAlphaUniform = GLES20.glGetUniformLocation(getProgramId(), "alphaBlend");
        this.mSrcBlendMode = 1;
    }

    public void setAlpha(float f10) {
        this.mWaterMarkAlpha = f10;
    }
}
