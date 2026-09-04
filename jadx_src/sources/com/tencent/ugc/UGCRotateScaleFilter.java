package com.tencent.ugc;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes4.dex */
public class UGCRotateScaleFilter extends TXCGPUImageFilter {
    private static final String TRANSFORM_FRAG_SHADER = "precision mediump float;\nvarying mediump vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform float scale;\n uniform mediump float alpha;\n\nvoid main(void) {\n    gl_FragColor = vec4(texture2D(inputImageTexture, textureCoordinate).rgb, alpha); \n}\n";
    private static final String TRANSFORM_VERTEX_SHADER = "attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n \n uniform mat4 transformMatrix;\n uniform mat4 orthographicMatrix;\n \n varying vec2 textureCoordinate;\n void main()\n {\n     gl_Position = transformMatrix * vec4(position.xyz, 1.0) * orthographicMatrix;\n     textureCoordinate = inputTextureCoordinate.xy;\n }";
    private int mAlphaUniform;
    private float[] mTransform3D;
    private int mTransformMatrixUniform;

    public UGCRotateScaleFilter() {
        super(TRANSFORM_VERTEX_SHADER, TRANSFORM_FRAG_SHADER);
        this.mTransformMatrixUniform = -1;
        this.mAlphaUniform = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float[] setRotateInternal(float[] fArr, float f10) {
        if (fArr == null) {
            fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
        }
        Matrix.setRotateM(fArr, 0, f10, 0.0f, 0.0f, 1.0f);
        this.mTransform3D = fArr;
        GLES20.glUniformMatrix4fv(this.mTransformMatrixUniform, 1, false, fArr, 0);
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScaleInternal(float[] fArr, float f10) {
        if (fArr == null) {
            fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
        }
        Matrix.scaleM(fArr, 0, f10, f10, 1.0f);
        this.mTransform3D = fArr;
        GLES20.glUniformMatrix4fv(this.mTransformMatrixUniform, 1, false, fArr, 0);
    }

    private void setUniformMatrix4f(int i10, float[] fArr) {
        runOnDraw(fe.a(i10, fArr));
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mTransformMatrixUniform = GLES20.glGetUniformLocation(getProgramId(), "transformMatrix");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(getProgramId(), "orthographicMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(getProgramId(), "scale");
        this.mAlphaUniform = GLES20.glGetUniformLocation(getProgramId(), "alpha");
        float[] fArr = new float[16];
        Matrix.orthoM(fArr, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
        setUniformMatrix4f(iGlGetUniformLocation, fArr);
        float[] fArr2 = new float[16];
        this.mTransform3D = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        setUniformMatrix4f(this.mTransformMatrixUniform, this.mTransform3D);
        setFloatOnDraw(iGlGetUniformLocation2, 1.0f);
        setAlpha(1.0f);
    }

    public void setAlpha(float f10) {
        setFloatOnDraw(this.mAlphaUniform, f10);
    }

    public void setRotate(float f10) {
        runOnDraw(fc.a(this, f10));
    }

    public void setRotateAndScale(float f10, float f11) {
        runOnDraw(fd.a(this, f10, f11));
    }
}
