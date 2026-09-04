package com.tencent.ugc.beauty.gpufilters;

import android.opengl.GLES20;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUGammaFilter extends TXCGPUImageFilter {
    public static final String GAMMA_FRAGMENT_SHADER = "varying lowp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform lowp float gamma;\n\nvoid main()\n{\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n\n    gl_FragColor = vec4(pow(textureColor.rgb, vec3(gamma)), textureColor.w);\n}";
    private float mGamma;
    private int mGammaLocation;

    public TXCGPUGammaFilter() {
        this(1.2f);
    }

    public TXCGPUGammaFilter(float f10) {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, GAMMA_FRAGMENT_SHADER);
        this.mGamma = f10;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mGammaLocation = GLES20.glGetUniformLocation(getProgramId(), "gamma");
        setGamma(this.mGamma);
    }

    public void setGamma(float f10) {
        this.mGamma = f10;
        setFloatOnDraw(this.mGammaLocation, f10);
    }
}
