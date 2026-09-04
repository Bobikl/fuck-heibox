package com.tencent.ugc.videobase.filter;

import bb.c;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUImageRGBAInputFilter extends TXCGPUImageFilter {
    private int mTextureWidth = -1;
    private int mTextureHeight = -1;
    private int mTextureId = -1;

    private void checkTextureSize(int i10, int i11) {
        if (this.mTextureWidth == i10 && this.mTextureHeight == i11) {
            return;
        }
        this.mTextureWidth = i10;
        this.mTextureHeight = i11;
        OpenGlUtils.deleteTexture(this.mTextureId);
        this.mTextureId = -1;
    }

    public void loadRgbaData(Buffer buffer, int i10, int i11) {
        checkTextureSize(i10, i11);
        this.mTextureId = OpenGlUtils.loadTexture(c.f.OB, buffer, i10, i11, this.mTextureId);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i10, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        super.onDraw(this.mTextureId, gLTexture, floatBuffer, floatBuffer2);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        super.onUninit();
        OpenGlUtils.deleteTexture(this.mTextureId);
        this.mTextureId = -1;
    }
}
