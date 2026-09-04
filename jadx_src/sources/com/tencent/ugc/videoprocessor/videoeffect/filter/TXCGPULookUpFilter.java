package com.tencent.ugc.videoprocessor.videoeffect.filter;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import bb.c;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.chain.TXCGPUImageMultipleInputFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.OpenGlUtils;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPULookUpFilter extends TXCGPUImageFilter {
    private static final String LookupFilterFragmentShader = "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2; // lookup texture\n \n \n uniform lowp float intensity;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     mediump float blueColor = textureColor.b * 63.0;\n     \n     mediump vec2 quad1;\n     quad1.y = floor(floor(blueColor) / 8.0);\n     quad1.x = floor(blueColor) - (quad1.y * 8.0);\n     \n     mediump vec2 quad2;\n     quad2.y = floor(ceil(blueColor) / 8.0);\n     quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n     \n     highp vec2 texPos1;\n     texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n     \n     highp vec2 texPos2;\n     texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n     \n     lowp vec4 newColor1 = texture2D(inputImageTexture2, texPos1);\n     lowp vec4 newColor2 = texture2D(inputImageTexture2, texPos2);\n     \n     lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n     gl_FragColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), intensity);\n }";
    protected float mIntensity;
    protected int mIntensityLocation;
    public int mLookupSourceTexture;
    public int mLookupTextureUniform;
    protected Bitmap m_bmp;

    public TXCGPULookUpFilter(Bitmap bitmap) {
        this(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, LookupFilterFragmentShader);
        this.m_bmp = bitmap;
    }

    public TXCGPULookUpFilter(String str, String str2) {
        super(str, str2);
        this.m_bmp = null;
        this.mLookupSourceTexture = -1;
        this.mIntensityLocation = -1;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void afterDrawArrays() {
        if (this.mLookupSourceTexture != -1) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(c.e.F, this.mLookupSourceTexture);
            GLES20.glUniform1i(this.mLookupTextureUniform, 3);
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void beforeDrawArrays(int i10) {
        if (this.mLookupSourceTexture != -1) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(c.e.F, 0);
            GLES20.glActiveTexture(33984);
        }
    }

    public void onDestroy() {
        GLES20.glDeleteTextures(1, new int[]{this.mLookupSourceTexture}, 0);
        this.mLookupSourceTexture = -1;
        super.uninitialize();
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        this.mLookupTextureUniform = GLES20.glGetUniformLocation(getProgramId(), TXCGPUImageMultipleInputFilter.SECOND_INPUT_SAMPLE2D_NAME);
        this.mIntensityLocation = GLES20.glGetUniformLocation(getProgramId(), "intensity");
        this.mIntensity = 0.5f;
        setBitmap(this.m_bmp);
        setIntensity(this.mIntensity);
    }

    public void setBitmap(final Bitmap bitmap) {
        runOnDraw(new Runnable() { // from class: com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPULookUpFilter.1
            @Override // java.lang.Runnable
            public final void run() {
                Bitmap bitmap2 = bitmap;
                if (bitmap2 != null) {
                    TXCGPULookUpFilter tXCGPULookUpFilter = TXCGPULookUpFilter.this;
                    tXCGPULookUpFilter.mLookupSourceTexture = OpenGlUtils.loadTexture(bitmap2, tXCGPULookUpFilter.mLookupSourceTexture, false);
                }
            }
        });
    }

    public void setIntensity(float f10) {
        this.mIntensity = f10;
        setFloatOnDraw(this.mIntensityLocation, f10);
    }
}
