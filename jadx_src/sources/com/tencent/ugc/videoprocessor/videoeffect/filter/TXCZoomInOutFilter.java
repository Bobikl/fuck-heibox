package com.tencent.ugc.videoprocessor.videoeffect.filter;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public class TXCZoomInOutFilter extends TXCGPUImageFilter {
    public static final String SPIRITOUT_FRAG = "precision highp float;\nvarying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\nuniform lowp float alphaLevel;\nuniform vec2 offsetR; \nuniform vec2 offsetG;\nuniform vec2 offsetB;\n\nvoid main()\n{\n   mediump vec4 fout;\n   fout.r = texture2D(inputImageTexture, textureCoordinate + offsetR).r; \n   fout.g = texture2D(inputImageTexture, textureCoordinate + offsetG).g; \n   fout.b = texture2D(inputImageTexture, textureCoordinate + offsetB).b; \n   fout.a = alphaLevel;\n\n    gl_FragColor = fout;\n}\n";
    public static final String SPIRITOUT_VERT = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nuniform mat4 textureTransform;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}";
    private static String TAG = "ZoomInOut";
    private float mAlphaLevel;
    private int mAlphaUniforLocation;
    private int mOffsetBLocation;
    private int mOffsetGLocation;
    private int mOffsetRLocation;
    private float[] mTextureTransformMatrix;
    private int mTextureTransformMatrixLocation;

    public TXCZoomInOutFilter() {
        super(SPIRITOUT_VERT, SPIRITOUT_FRAG);
        this.mTextureTransformMatrixLocation = -1;
        this.mOffsetRLocation = -1;
        this.mOffsetGLocation = -1;
        this.mOffsetBLocation = -1;
        this.mAlphaUniforLocation = -1;
        this.mAlphaLevel = 0.3f;
        this.mTextureTransformMatrix = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void beforeDrawArrays(int i10) {
        super.beforeDrawArrays(i10);
        GLES20.glUniformMatrix4fv(this.mTextureTransformMatrixLocation, 1, false, this.mTextureTransformMatrix, 0);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mTextureTransformMatrixLocation = GLES20.glGetUniformLocation(getProgramId(), "textureTransform");
        this.mAlphaUniforLocation = GLES20.glGetUniformLocation(getProgramId(), "alphaLevel");
        this.mOffsetRLocation = GLES20.glGetUniformLocation(getProgramId(), "offsetR");
        this.mOffsetGLocation = GLES20.glGetUniformLocation(getProgramId(), "offsetG");
        this.mOffsetBLocation = GLES20.glGetUniformLocation(getProgramId(), "offsetB");
        setAlphaLevel(this.mAlphaLevel);
    }

    public void setAlphaLevel(float f10) {
        this.mAlphaLevel = f10;
        setFloatOnDraw(this.mAlphaUniforLocation, f10);
    }

    public void setColorOffset(float[] fArr, float[] fArr2, float[] fArr3) {
        setFloatVec2OnDraw(this.mOffsetRLocation, fArr);
        setFloatVec2OnDraw(this.mOffsetGLocation, fArr2);
        setFloatVec2OnDraw(this.mOffsetBLocation, fArr3);
    }

    public void setZoomLevel(float f10, int i10) {
        Matrix.setIdentityM(this.mTextureTransformMatrix, 0);
        if (Math.abs(f10) <= 1.0E-5d) {
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            Matrix.scaleM(fArr, 0, f10, f10, 1.0f);
            float[] fArr2 = this.mTextureTransformMatrix;
            Matrix.multiplyMM(fArr2, 0, fArr, 0, fArr2, 0);
            Matrix.setIdentityM(fArr, 0);
            Matrix.translateM(fArr, 0, 0.02f, 0.02f, 1.0f);
            float[] fArr3 = this.mTextureTransformMatrix;
            Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr3, 0);
        }
    }
}
