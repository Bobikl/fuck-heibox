package com.tencent.ugc.videobase.yuv;

import android.opengl.GLES20;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TXCGPUImageYUVInputFilter extends TXCGPUImageFilter {
    private static final int INDEX_FOR_UV = 1;
    private static final int INDEX_FOR_Y = 0;
    private int mTextureHeight;
    private final int[] mTextureIds;
    private int mTextureWidth;
    private int mUniformTextureUv;

    public TXCGPUImageYUVInputFilter(String str, String str2) {
        super(str, str2);
        int[] iArr = new int[2];
        this.mTextureIds = iArr;
        this.mTextureWidth = 0;
        this.mTextureHeight = 0;
        Arrays.fill(iArr, -1);
    }

    private void deleteTextures() {
        int i10 = 0;
        while (true) {
            int[] iArr = this.mTextureIds;
            if (i10 >= iArr.length) {
                return;
            }
            OpenGlUtils.deleteTexture(iArr[i10]);
            this.mTextureIds[i10] = -1;
            i10++;
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void beforeDrawArrays(int i10) {
        super.beforeDrawArrays(i10);
        GLES20.glActiveTexture(33985);
        OpenGlUtils.bindTexture(getTarget(), this.mTextureIds[1]);
        GLES20.glUniform1i(this.mUniformTextureUv, 1);
    }

    protected abstract int getUvFormat();

    public void loadYuvDataToTexture(ByteBuffer byteBuffer, int i10, int i11) {
        if (this.mTextureWidth != i10 || this.mTextureHeight != i11) {
            deleteTextures();
            this.mTextureWidth = i10;
            this.mTextureHeight = i11;
        }
        OpenGlUtils.loadYuv420DataToTextures(byteBuffer, getUvFormat(), i10, i11, this.mTextureIds);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i10, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        super.onDraw(this.mTextureIds[0], gLTexture, floatBuffer, floatBuffer2);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mUniformTextureUv = GLES20.glGetUniformLocation(getProgramId(), "uvTexture");
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        deleteTextures();
        super.onUninit();
    }
}
