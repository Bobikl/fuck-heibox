package com.tencent.ugc.beauty.gpufilters.smooth;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUSharpenAlphaFilter extends TXCGPUImageFilter {
    private static final String SHARPEN_FRAGMENT_SHADER = "precision mediump float;\n\nuniform float sharpness;\nvarying mediump vec2 textureCoordinate;\nvarying mediump vec2 leftTextureCoordinate;\nvarying mediump vec2 rightTextureCoordinate; \nvarying mediump vec2 topTextureCoordinate;\nvarying mediump vec2 bottomTextureCoordinate;\n\nuniform sampler2D inputImageTexture;\nfloat centerMultiplier;\nfloat edgeMultiplier;\n\nvoid main()\n{\n    mediump vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    mediump vec3 leftTextureColor = texture2D(inputImageTexture, leftTextureCoordinate).rgb;\n    mediump vec3 rightTextureColor = texture2D(inputImageTexture, rightTextureCoordinate).rgb;\n    mediump vec3 topTextureColor = texture2D(inputImageTexture, topTextureCoordinate).rgb;\n    mediump vec3 bottomTextureColor = texture2D(inputImageTexture, bottomTextureCoordinate).rgb;\n\n    centerMultiplier = 1.0 + 4.0 * sharpness * (1.0 - textureColor.a);\n    edgeMultiplier = sharpness * (1.0 - textureColor.a);\n    gl_FragColor = vec4((textureColor.rgb * centerMultiplier - (leftTextureColor * edgeMultiplier + rightTextureColor * edgeMultiplier + topTextureColor * edgeMultiplier + bottomTextureColor * edgeMultiplier)), textureColor.a);    \n}\n";
    private static final String SHARPEN_VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nuniform float imageWidthFactor; \nuniform float imageHeightFactor; \n\nvarying vec2 textureCoordinate;\nvarying vec2 leftTextureCoordinate;\nvarying vec2 rightTextureCoordinate; \nvarying vec2 topTextureCoordinate;\nvarying vec2 bottomTextureCoordinate;\n\n\nvoid main()\n{\n    gl_Position = position;\n    \n    mediump vec2 widthStep = vec2(imageWidthFactor, 0.0);\n    mediump vec2 heightStep = vec2(0.0, imageHeightFactor);\n    \n    textureCoordinate = inputTextureCoordinate.xy;\n    leftTextureCoordinate = inputTextureCoordinate.xy - widthStep;\n    rightTextureCoordinate = inputTextureCoordinate.xy + widthStep;\n    topTextureCoordinate = inputTextureCoordinate.xy + heightStep;\n    bottomTextureCoordinate = inputTextureCoordinate.xy - heightStep;\n}\n";
    private static final float SHARPNESS_BASE_LEVEL = 0.7f;
    private static final String TAG = "GPUSharpen";
    private int mAlphaImageHeightFactorLocation;
    private int mAlphaImageWidthFactorLocation;
    private float mAlphaSharpness;
    private int mAlphaSharpnessLocation;

    public TXCGPUSharpenAlphaFilter() {
        this(0.0f);
    }

    public TXCGPUSharpenAlphaFilter(float f10) {
        super(SHARPEN_VERTEX_SHADER, SHARPEN_FRAGMENT_SHADER);
        this.mAlphaSharpness = f10;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public boolean canBeSkipped() {
        return isLessOrEqualZero(this.mAlphaSharpness);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mAlphaSharpnessLocation = GLES20.glGetUniformLocation(getProgramId(), "sharpness");
        this.mAlphaImageWidthFactorLocation = GLES20.glGetUniformLocation(getProgramId(), "imageWidthFactor");
        this.mAlphaImageHeightFactorLocation = GLES20.glGetUniformLocation(getProgramId(), "imageHeightFactor");
        setSharpness(this.mAlphaSharpness);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        setFloatOnDraw(this.mAlphaImageWidthFactorLocation, 1.0f / i10);
        setFloatOnDraw(this.mAlphaImageHeightFactorLocation, 1.0f / i11);
    }

    public void setSharpness(float f10) {
        LiteavLog.i(TAG, "setSharpness ".concat(String.valueOf(f10)));
        this.mAlphaSharpness = f10;
        setFloatOnDraw(this.mAlphaSharpnessLocation, f10 + 0.7f);
    }
}
