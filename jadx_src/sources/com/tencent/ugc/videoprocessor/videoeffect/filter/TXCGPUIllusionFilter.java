package com.tencent.ugc.videoprocessor.videoeffect.filter;

import com.tencent.ugc.videobase.filter.TXCGPUTwoInputFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUIllusionFilter extends TXCGPUTwoInputFilter {
    private static final String FRAGMENT_SHADER = "precision mediump float;  \nvarying vec2 textureCoordinate;  \nuniform sampler2D inputImageTexture;  \nuniform sampler2D inputImageTexture2;  \nvoid main() {   \n\tgl_FragColor = vec4(mix(texture2D(inputImageTexture2, textureCoordinate).rgb,    texture2D(inputImageTexture, textureCoordinate).rgb, vec3(0.06,0.21,0.6)),1.0);   \n}  \n";
    private GLTexture mPreTextureBuf;

    public TXCGPUIllusionFilter() {
        super(FRAGMENT_SHADER);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i10, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLTexture gLTexture2 = this.mPreTextureBuf;
        if (gLTexture2 == null) {
            setSecondInputTexture(i10);
        } else {
            setSecondInputTexture(gLTexture2.getId());
        }
        super.onDraw(i10, gLTexture, floatBuffer, floatBuffer2);
        GLTexture gLTexture3 = this.mPreTextureBuf;
        if (gLTexture3 != null) {
            gLTexture3.release();
        }
        this.mPreTextureBuf = gLTexture;
        gLTexture.retain();
    }
}
