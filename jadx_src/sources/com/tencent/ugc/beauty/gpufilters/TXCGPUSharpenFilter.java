package com.tencent.ugc.beauty.gpufilters;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUSharpenFilter extends TXCGPUImageFilter {
    private static final String SHARPEN_FRAGMENT_SHADER = "precision highp float;\n\nvarying highp vec2 textureCoordinate;\nvarying highp vec2 leftTextureCoordinate;\nvarying highp vec2 rightTextureCoordinate; \nvarying highp vec2 topTextureCoordinate;\nvarying highp vec2 bottomTextureCoordinate;\n\nvarying highp float centerMultiplier;\nvarying highp float edgeMultiplier;\n\nuniform sampler2D inputImageTexture;\n\nvoid main()\n{\n    mediump vec3 textureColor = texture2D(inputImageTexture, textureCoordinate).rgb;\n    mediump vec3 leftTextureColor = texture2D(inputImageTexture, leftTextureCoordinate).rgb;\n    mediump vec3 rightTextureColor = texture2D(inputImageTexture, rightTextureCoordinate).rgb;\n    mediump vec3 topTextureColor = texture2D(inputImageTexture, topTextureCoordinate).rgb;\n    mediump vec3 bottomTextureColor = texture2D(inputImageTexture, bottomTextureCoordinate).rgb;\n\n    gl_FragColor = vec4((textureColor * centerMultiplier - (leftTextureColor * edgeMultiplier + rightTextureColor * edgeMultiplier + topTextureColor * edgeMultiplier + bottomTextureColor * edgeMultiplier)), 1.0);\n}";
    private static final String SHARPEN_VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nuniform float imageWidthFactor; \nuniform float imageHeightFactor; \nuniform float sharpness;\n\nvarying vec2 textureCoordinate;\nvarying vec2 leftTextureCoordinate;\nvarying vec2 rightTextureCoordinate; \nvarying vec2 topTextureCoordinate;\nvarying vec2 bottomTextureCoordinate;\n\nvarying float centerMultiplier;\nvarying float edgeMultiplier;\n\nvoid main()\n{\n    gl_Position = position;\n\n    mediump vec2 widthStep = vec2(imageWidthFactor, 0.0);\n    mediump vec2 heightStep = vec2(0.0, imageHeightFactor);\n\n    textureCoordinate = inputTextureCoordinate.xy;\n    leftTextureCoordinate = inputTextureCoordinate.xy - widthStep;\n    rightTextureCoordinate = inputTextureCoordinate.xy + widthStep;\n    topTextureCoordinate = inputTextureCoordinate.xy + heightStep;\n    bottomTextureCoordinate = inputTextureCoordinate.xy - heightStep;\n\n    centerMultiplier = 1.0 + 4.0 * sharpness;\n    edgeMultiplier = sharpness;\n}";
    private static final String TAG = "GPUSharpen";
    private int mImageHeightFactorLocation;
    private int mImageWidthFactorLocation;
    private float mSharpness;
    private int mSharpnessLocation;

    public TXCGPUSharpenFilter() {
        this(0.0f);
    }

    public TXCGPUSharpenFilter(float f10) {
        super(SHARPEN_VERTEX_SHADER, SHARPEN_FRAGMENT_SHADER);
        this.mSharpness = f10;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public boolean canBeSkipped() {
        return isLessOrEqualZero(this.mSharpness);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mSharpnessLocation = GLES20.glGetUniformLocation(getProgramId(), "sharpness");
        this.mImageWidthFactorLocation = GLES20.glGetUniformLocation(getProgramId(), "imageWidthFactor");
        this.mImageHeightFactorLocation = GLES20.glGetUniformLocation(getProgramId(), "imageHeightFactor");
        setSharpness(this.mSharpness);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        setFloatOnDraw(this.mImageWidthFactorLocation, 1.0f / i10);
        setFloatOnDraw(this.mImageHeightFactorLocation, 1.0f / i11);
    }

    public void setSharpness(float f10) {
        this.mSharpness = f10;
        setFloatOnDraw(this.mSharpnessLocation, f10);
        LiteavLog.d(TAG, "set Sharpness ".concat(String.valueOf(f10)));
    }
}
