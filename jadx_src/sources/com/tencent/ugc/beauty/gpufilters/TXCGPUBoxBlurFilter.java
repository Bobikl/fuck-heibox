package com.tencent.ugc.beauty.gpufilters;

import android.opengl.GLES20;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUBoxBlurFilter extends TXCGPUImageFilter {
    static final String FragmentShader = "precision highp float;\n\nuniform sampler2D inputImageTexture;\nvarying highp vec2 textureCoordinate;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\nvec2 pos[9];\n\nvoid main()\n{\n    pos[0] = textureCoordinate + vec2(-texelWidthOffset, -texelHeightOffset);\n     pos[1] = textureCoordinate + vec2(-texelWidthOffset, 0.0);\n     pos[2] = textureCoordinate + vec2(-texelWidthOffset, texelHeightOffset);\n     pos[3] = textureCoordinate + vec2(0.0, -texelHeightOffset);\n     pos[4] = textureCoordinate + vec2(0.0, 0.0);\n     pos[5] = textureCoordinate + vec2(0.0, texelHeightOffset);\n     pos[6] = textureCoordinate + vec2(texelWidthOffset, -texelHeightOffset);\n     pos[7] = textureCoordinate + vec2(texelWidthOffset, 0.0);\n     pos[8] = textureCoordinate + vec2(texelWidthOffset, texelHeightOffset);\n     vec4 fragmentColor = texture2D(inputImageTexture, pos[0]);\n     fragmentColor += texture2D(inputImageTexture, pos[1]);\n     fragmentColor += texture2D(inputImageTexture, pos[2]);\n     fragmentColor += texture2D(inputImageTexture, pos[3]);\n     fragmentColor += texture2D(inputImageTexture, pos[4]);\n     fragmentColor += texture2D(inputImageTexture, pos[5]);\n     fragmentColor += texture2D(inputImageTexture, pos[6]);\n     fragmentColor += texture2D(inputImageTexture, pos[7]);\n     fragmentColor += texture2D(inputImageTexture, pos[8]);\n\n    gl_FragColor = fragmentColor / 9.0;\n}\n";
    private static final float TEXEL_SPACING = 2.0f;
    private int mHeightOffsetLocation;
    private int mWidthOffsetLocation;

    TXCGPUBoxBlurFilter() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, FragmentShader);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mWidthOffsetLocation = GLES20.glGetUniformLocation(getProgramId(), "texelWidthOffset");
        this.mHeightOffsetLocation = GLES20.glGetUniformLocation(getProgramId(), "texelHeightOffset");
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        setFloatOnDraw(this.mWidthOffsetLocation, TEXEL_SPACING / this.mOutputSize.width);
        setFloatOnDraw(this.mHeightOffsetLocation, TEXEL_SPACING / this.mOutputSize.height);
    }
}
