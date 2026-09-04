package com.tencent.custom.customcapture.opengl;

import android.opengl.GLES20;
import androidx.constraintlayout.core.motion.utils.w;
import bb.c;
import com.tencent.custom.customcapture.utils.Size;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class GpuImageI420Filter extends GPUImageFilter {
    private static final String I420_RENDER_SHADE = "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform sampler2D uTexture;\nuniform mat3 convertMatrix;\nuniform vec3 offset;\n\nvoid main()\n{\n    highp vec3 yuvColor;\n    highp vec3 rgbColor;\n\n    // Get the YUV values\n    yuvColor.x = texture2D(inputImageTexture, textureCoordinate).r;\n    yuvColor.y = texture2D(uTexture, vec2(textureCoordinate.x * 0.5, textureCoordinate.y * 0.5)).r;\n    yuvColor.z = texture2D(uTexture, vec2(textureCoordinate.x * 0.5, textureCoordinate.y * 0.5 + 0.5)).r;\n\n    // Do the color transform   \n    yuvColor += offset;\n    rgbColor = convertMatrix * yuvColor; \n\n    gl_FragColor = vec4(rgbColor, 1.0);\n}\n";
    private int mConvertMatrixUniform;
    private int mConvertOffsetUniform;
    private int mGLUniformTextureUv;
    private Size mTextureSize;
    private byte[] mUvData;
    private int mUvTextureId;
    private byte[] mYData;
    private int mYTextureId;
    private static final float[] BT601_FULLRANGE_FFMPEG_OFFSET = {0.0f, -0.5019608f, -0.5019608f};
    private static final float[] BT601_FULLRAGE_FFMPEG_MATRIX = {1.0f, 1.0f, 1.0f, 0.0f, -0.3441f, 1.772f, 1.402f, -0.7141f, 0.0f};

    public GpuImageI420Filter() {
        super(GPUImageFilter.NO_FILTER_VERTEX_SHADER, I420_RENDER_SHADE);
        this.mYTextureId = -1;
        this.mUvTextureId = -1;
        this.mTextureSize = null;
    }

    @Override // com.tencent.custom.customcapture.opengl.GPUImageFilter
    protected void beforeDrawArrays(int i10) {
        super.beforeDrawArrays(i10);
        GLES20.glActiveTexture(33985);
        OpenGlUtils.bindTexture(getTarget(), this.mUvTextureId);
        GLES20.glUniform1i(this.mGLUniformTextureUv, 1);
        GLES20.glUniform3fv(this.mConvertOffsetUniform, 1, FloatBuffer.wrap(BT601_FULLRANGE_FFMPEG_OFFSET));
        GLES20.glUniformMatrix3fv(this.mConvertMatrixUniform, 1, false, BT601_FULLRAGE_FFMPEG_MATRIX, 0);
    }

    public void loadYuvDataToTexture(byte[] bArr, int i10, int i11) {
        Size size = this.mTextureSize;
        if (size == null || size.width != i10 || size.height != i11) {
            int i12 = i10 * i11;
            this.mYData = new byte[i12];
            OpenGlUtils.deleteTexture(this.mYTextureId);
            this.mYTextureId = -1;
            this.mUvData = new byte[i12 / 2];
            OpenGlUtils.deleteTexture(this.mUvTextureId);
            this.mUvTextureId = -1;
        }
        byte[] bArr2 = this.mYData;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        int length = this.mYData.length;
        byte[] bArr3 = this.mUvData;
        System.arraycopy(bArr, length, bArr3, 0, bArr3.length);
        this.mYTextureId = OpenGlUtils.loadTexture(c.f.PB, ByteBuffer.wrap(this.mYData), i10, i11, this.mYTextureId);
        this.mUvTextureId = OpenGlUtils.loadTexture(c.f.PB, ByteBuffer.wrap(this.mUvData), i10, i11 / 2, this.mUvTextureId);
    }

    @Override // com.tencent.custom.customcapture.opengl.GPUImageFilter
    public void onDraw(int i10, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        super.onDraw(this.mYTextureId, floatBuffer, floatBuffer2);
    }

    @Override // com.tencent.custom.customcapture.opengl.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.mGLUniformTextureUv = GLES20.glGetUniformLocation(this.mProgram.getProgramId(), "uTexture");
        this.mConvertMatrixUniform = GLES20.glGetUniformLocation(this.mProgram.getProgramId(), "convertMatrix");
        this.mConvertOffsetUniform = GLES20.glGetUniformLocation(this.mProgram.getProgramId(), w.c.R);
    }

    @Override // com.tencent.custom.customcapture.opengl.GPUImageFilter
    protected void onUninit() {
        OpenGlUtils.deleteTexture(this.mYTextureId);
        OpenGlUtils.deleteTexture(this.mUvTextureId);
        super.onUninit();
    }
}
