package com.tencent.ugc.beauty.gpufilters.pitu;

import android.opengl.GLES20;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends TXCGPUImageFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f103353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f103354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f103355c;

    public a(boolean z10) {
        super(" attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n \n uniform float texelWidthOffset;\n uniform float texelHeightOffset;\n \n varying vec2 textureCoordinate;\n varying vec4 textureShift_1;\n varying vec4 textureShift_2;\n varying vec4 textureShift_3;\n varying vec4 textureShift_4;\n \n void main(void)\n {\n     gl_Position = position;\n     textureCoordinate = inputTextureCoordinate.xy;\n     \n     vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n     textureShift_1 = vec4(textureCoordinate - singleStepOffset,                           textureCoordinate + singleStepOffset);\n     textureShift_2 = vec4(textureCoordinate - 2.0 * singleStepOffset,                           textureCoordinate + 2.0 * singleStepOffset);\n     textureShift_3 = vec4(textureCoordinate - 3.0 * singleStepOffset,                           textureCoordinate + 3.0 * singleStepOffset);\n     textureShift_4 = vec4(textureCoordinate - 4.0 * singleStepOffset,                           textureCoordinate + 4.0 * singleStepOffset);\n }\n", "uniform sampler2D inputImageTexture;\n varying highp vec2 textureCoordinate;\n varying highp vec4 textureShift_1;\n varying highp vec4 textureShift_2;\n varying highp vec4 textureShift_3;\n varying highp vec4 textureShift_4;\n \n void main()\n {\n     mediump vec3 sum = texture2D(inputImageTexture, textureCoordinate).rgb;\n     sum += texture2D(inputImageTexture, textureShift_1.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_1.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_2.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_2.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_3.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_3.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_4.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_4.zw).rgb;\n     \n     gl_FragColor = vec4(sum * 0.1111, 1.0);\n }\n");
        this.f103354b = -1;
        this.f103355c = -1;
        this.f103353a = z10;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public final void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.f103354b = GLES20.glGetUniformLocation(getProgramId(), "texelWidthOffset");
        this.f103355c = GLES20.glGetUniformLocation(getProgramId(), "texelHeightOffset");
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public final void onOutputSizeChanged(int i10, int i11) {
        float fMin = Math.min(1.0f, 360.0f / Math.min(i10, i11));
        int iRound = Math.round(i10 * fMin);
        int iRound2 = Math.round(i11 * fMin);
        super.onOutputSizeChanged(iRound, iRound2);
        if (this.f103353a) {
            setFloatOnDraw(this.f103354b, 0.0f);
            setFloatOnDraw(this.f103355c, 1.5f / iRound2);
        } else {
            setFloatOnDraw(this.f103354b, 1.5f / iRound);
            setFloatOnDraw(this.f103355c, 0.0f);
        }
    }
}
