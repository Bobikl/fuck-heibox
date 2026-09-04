package com.tencent.ugc.videobase.filter;

import android.opengl.GLES20;
import bb.c;
import com.tencent.liteav.base.util.l;
import com.tencent.ugc.videobase.chain.TXCGPUImageMultipleInputFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUTwoInputFilter extends TXCGPUImageMultipleInputFilter {
    public static final String TWOINPUT_VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}";
    private int mGLAttribTextureCoord2;
    private final FloatBuffer mSecondTextureCoordsBuffer;

    public TXCGPUTwoInputFilter(String str) {
        this(TWOINPUT_VERTEX_SHADER, str);
    }

    public TXCGPUTwoInputFilter(String str, String str2) {
        super(str, str2);
        this.mGLAttribTextureCoord2 = -1;
        this.mSecondTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(l.NORMAL, false, false);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageMultipleInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void afterDrawArrays() {
        super.afterDrawArrays();
        int i10 = this.mGLAttribTextureCoord2;
        if (i10 != -1) {
            GLES20.glDisableVertexAttribArray(i10);
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageMultipleInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void beforeDrawArrays(int i10) {
        super.beforeDrawArrays(i10);
        int i11 = this.mGLAttribTextureCoord2;
        if (i11 != -1) {
            GLES20.glVertexAttribPointer(i11, 2, c.f.f32240ed, false, 0, (Buffer) this.mSecondTextureCoordsBuffer);
            GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoord2);
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mGLAttribTextureCoord2 = GLES20.glGetAttribLocation(getProgramId(), "inputTextureCoordinate2");
    }

    public void setSecondInputTexture(int i10) {
        setInputTexture(TXCGPUImageMultipleInputFilter.SECOND_INPUT_SAMPLE2D_NAME, i10);
    }
}
