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
public class TXCGPUThreeInputFilter extends TXCGPUTwoInputFilter {
    public static final String VERTEX_THREE_INPUT_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nattribute vec4 inputTextureCoordinate3;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n    textureCoordinate3 = inputTextureCoordinate3.xy;\n}";
    private int mGLAttribTextureCoord3;
    private final FloatBuffer mThirdTextureCoordsBuffer;

    public TXCGPUThreeInputFilter(String str) {
        this(VERTEX_THREE_INPUT_SHADER, str);
    }

    public TXCGPUThreeInputFilter(String str, String str2) {
        super(str, str2);
        this.mThirdTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(l.NORMAL, false, false);
    }

    @Override // com.tencent.ugc.videobase.filter.TXCGPUTwoInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageMultipleInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void afterDrawArrays() {
        super.afterDrawArrays();
        int i10 = this.mGLAttribTextureCoord3;
        if (i10 != -1) {
            GLES20.glDisableVertexAttribArray(i10);
        }
    }

    @Override // com.tencent.ugc.videobase.filter.TXCGPUTwoInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageMultipleInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void beforeDrawArrays(int i10) {
        super.beforeDrawArrays(i10);
        int i11 = this.mGLAttribTextureCoord3;
        if (i11 != -1) {
            GLES20.glVertexAttribPointer(i11, 2, c.f.f32240ed, false, 0, (Buffer) this.mThirdTextureCoordsBuffer);
            GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoord3);
        }
    }

    @Override // com.tencent.ugc.videobase.filter.TXCGPUTwoInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(null);
        this.mGLAttribTextureCoord3 = GLES20.glGetAttribLocation(getProgramId(), "inputTextureCoordinate3");
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
    }

    public void setThirdInputTexture(int i10) {
        setInputTexture(TXCGPUImageMultipleInputFilter.THIRD_INPUT_SAMPLE2D_NAME, i10);
    }
}
